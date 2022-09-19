package diagrama.model;

import abstracta.AbstractaFactory;
import concreta.MBSAtributo;
import concreta.MBSClase;
import concreta.MBSPaquete;
import concreta.MBSDiagramaClases;
import concreta.MBSMetodo;
import concreta.ModelFactory;

public class TransformacionM2M {

	private ModelFactory modelFactoryConcreta;
	private abstracta.ModelFactory modelFactoryAbstracta;
	
	
	public TransformacionM2M(ModelFactory modelFactoryConcreta, abstracta.ModelFactory modelFactoryAbstracta) {
		super();
		this.modelFactoryConcreta = modelFactoryConcreta;
		this.modelFactoryAbstracta = modelFactoryAbstracta;
	}
	
	public String transformarM2M() {
		String mensaje = "Se ha realizado la transformacion M2M";
		
		for (MBSDiagramaClases diagramaConcreta : modelFactoryConcreta.getListaDiagramas()){
			
			//crear los paquetes
			for(MBSPaquete paquete : diagramaConcreta.getListaPaquetes()){
				
				System.out.println("Paquete: "+paquete.getNombre());
				crearPaquete(paquete);
			}
			
		    //Crear clases
			for(MBSClase clase : diagramaConcreta.getListaClases()){
				
				System.out.println("Clase: "+clase.getNombre());
				crearClase(clase);
			}
			
			//Crear atributos
			for(MBSClase clase : diagramaConcreta.getListaClases()){
				
				if(!clase.getAtributos().isEmpty()) {
					
					for(MBSAtributo atributo : clase.getAtributos()) {
						
						System.out.println("Atributo: "+atributo.getNombre());
						crearAtributo(clase.getNombre(), clase.getRuta(), atributo);
					}
				}
			}
			
			//Crear metodos
			for(MBSClase clase : diagramaConcreta.getListaClases()){
				
				if(!clase.getMetodos().isEmpty()) {
					
					for(MBSMetodo metodo : clase.getMetodos()) {
						
						System.out.println("Metodo: "+metodo.getNombre());
						crearMetodo(clase.getNombre(), clase.getRuta(), metodo);
					}
				}
			}
			
	
		}
		
		return mensaje;
	}
	
	private void crearPaquete(MBSPaquete paquete) {
		
		String ruta = "";
		
		if(paquete.getRuta()==null){
			
			ruta = paquete.getNombre();
		}else {
			
			ruta = paquete.getRuta()+paquete.getNombre();
		}
		
		String[] split = ruta.split("/");
		abstracta.MBSPaquete paqueteParent = null;
		
		String nuevaRuta="";
		
		for(int i=0;i<split.length;i++){
			
			String nombrePaquete = split[i];
			paqueteParent = obtenerPaqueteAbstracta(nombrePaquete, nuevaRuta, paqueteParent);
			nuevaRuta += split[i]+"/";
		}
		
	}
	
	private void crearClase(MBSClase clase){
		
		String ruta = clase.getRuta();
		abstracta.MBSPaquete paqueteAbstracta = buscarPaqueteClase(ruta);
		abstracta.MBSClase claseAbstracta = obtenerClaseAbstracta(ruta, clase.getNombre(), paqueteAbstracta);
		
		if(claseAbstracta==null) {
			
			abstracta.MBSClase nuevaClase = AbstractaFactory.eINSTANCE.createMBSClase();
			nuevaClase.setNombre(clase.getNombre());
			nuevaClase.setEstereotipo(clase.getEstereotipo());
			nuevaClase.setModificadorAcceso(clase.getModificadorAcceso());
			nuevaClase.setDescripcion(clase.getDescripcion());
			nuevaClase.setRuta(clase.getRuta());
			paqueteAbstracta.getListaClases().add(nuevaClase);
		}
		
	}
	
	private void crearAtributo(String nombreClase, String rutaClase, MBSAtributo atributo) {
		
		abstracta.MBSPaquete paqueteAbstracta = buscarPaqueteClase(rutaClase);
		abstracta.MBSClase claseAbstracta = obtenerClaseAbstracta(rutaClase, nombreClase, paqueteAbstracta);
		
		if(claseAbstracta != null){
			
			abstracta.MBSAtributo atributoAbstracta = obtenerAtributoAbstracta(atributo.getRuta(), atributo.getNombre(), claseAbstracta);
			
			if(atributoAbstracta == null) {
				
				abstracta.MBSAtributo atributoNuevo = AbstractaFactory.eINSTANCE.createMBSAtributo();
				atributoNuevo.setNombre(atributo.getNombre());
				atributoNuevo.setModificadorAcesso(atributo.getModificadorAcesso());
				atributoNuevo.setRuta(atributo.getRuta());
				atributoNuevo.setTipo(atributo.getTipo());
				atributoNuevo.setValorDefecto(atributo.getValorDefecto());
				claseAbstracta.getAtributos().add(atributoNuevo);
			}
		}
	}
	
	private void crearMetodo(String nombreClase, String rutaClase, MBSMetodo metodo) {
		
		abstracta.MBSPaquete paqueteAbstracta = buscarPaqueteClase(rutaClase);
		abstracta.MBSClase claseAbstracta = obtenerClaseAbstracta(rutaClase, nombreClase, paqueteAbstracta);
		
		if(claseAbstracta != null) {
			
			abstracta.MBSMetodo metodoAbstracta = obtenerMetodoAbstracta(metodo.getRuta(), metodo.getNombre(), claseAbstracta);
			
			if(metodoAbstracta == null) {
				
				abstracta.MBSMetodo metodoNuevo = AbstractaFactory.eINSTANCE.createMBSMetodo();
				metodoNuevo.setNombre(metodo.getNombre());
				metodoNuevo.setRuta(metodo.getRuta());
				metodoNuevo.setModificadorAcceso(metodo.getModificadorAcceso());
				metodoNuevo.setParametros(metodo.getParametros());
				metodoNuevo.setTipoRetorno(metodo.getTipoRetorno());
				claseAbstracta.getMetodos().add(metodoNuevo);
			}
		}
	}
	
	private abstracta.MBSPaquete buscarPaqueteClase(String ruta){
		
		abstracta.MBSPaquete MBSPaquete = null;
		
		for(abstracta.MBSPaquete paquete : modelFactoryAbstracta.getListaPaquetes()) {
			
			if(paquete.getNombre().equals(ruta)){
				
				return paquete;
			}else {
				
				MBSPaquete = buscarPaquete(ruta, paquete);
			}
			
			if(MBSPaquete!=null){
				
				return MBSPaquete;
			}
			
		}
		return null;
	}
	
	private abstracta.MBSPaquete buscarPaquete(String ruta, abstracta.MBSPaquete paquetePadre){
		
		for (abstracta.MBSPaquete p : paquetePadre.getListaPaquetes()){
			
			if((p.getRuta()+p.getNombre()).equals(ruta)){
				
				return p;
			}
			
			if(!p.getListaPaquetes().isEmpty()){
				
				abstracta.MBSPaquete paquete = buscarPaquete(ruta, p);
				
				if(paquete!=null) {
					return paquete;
				}
			}
		}
		
		return null;
	}

	private abstracta.MBSPaquete obtenerPaqueteAbstracta(String nombrePaquete, String nuevaRuta,
			abstracta.MBSPaquete paqueteParent) {
		
		if(paqueteParent == null) {
			
			for (int i = 0; i < modelFactoryAbstracta.getListaPaquetes().size(); i++) {
				
				if(modelFactoryAbstracta.getListaPaquetes().get(i).getNombre().equals(nombrePaquete)) {
					
					return modelFactoryAbstracta.getListaPaquetes().get(i);
				}
			}
			
			abstracta.MBSPaquete nuevoPackage = AbstractaFactory.eINSTANCE.createMBSPaquete();
			nuevoPackage.setNombre(nombrePaquete);
			nuevoPackage.setRuta(nuevaRuta);
			modelFactoryAbstracta.getListaPaquetes().add(nuevoPackage);
			return nuevoPackage;

		}else{
			
			for(int i = 0; i < paqueteParent.getListaPaquetes().size(); i++){
				
				if(paqueteParent.getListaPaquetes().get(i).getNombre().equals(nombrePaquete)) {
					
					if(paqueteParent.getListaPaquetes().get(i).getRuta().equals(nuevaRuta)){
						
						return paqueteParent.getListaPaquetes().get(i);
					}
				}
			}
		}
		
		abstracta.MBSPaquete nuevoPackage = AbstractaFactory.eINSTANCE.createMBSPaquete();
		nuevoPackage.setNombre(nombrePaquete);
		nuevoPackage.setRuta(nuevaRuta);
		paqueteParent.getListaPaquetes().add(nuevoPackage);
		
		return nuevoPackage;
	}
	
	private abstracta.MBSClase obtenerClaseAbstracta(String ruta, String nombre, abstracta.MBSPaquete MBSPaquete) {
		
		if(MBSPaquete != null) {
			
			for(abstracta.MBSClase c : MBSPaquete.getListaClases()) {
				
				if(c.getNombre().equals(nombre) && c.getRuta().equals(ruta)) {
					
					return c;
				}
			}
		}
		
		return null;
	}
	
	private abstracta.MBSAtributo obtenerAtributoAbstracta(String ruta, String nombre, abstracta.MBSClase MBSClase){
		
		if(MBSClase != null) {
			
			for(abstracta.MBSAtributo a : MBSClase.getAtributos()) {
				
				if(a.getNombre().equals(nombre) && a.getRuta().equals(ruta)) {
					
					return a;
				}
			}
		}
		
		return null;	
	}
	
	private abstracta.MBSMetodo obtenerMetodoAbstracta(String ruta, String nombre, abstracta.MBSClase MBSClase){
		
		if(MBSClase != null) {
			
			for(abstracta.MBSMetodo m : MBSClase.getMetodos()) {
				
				if(m.getNombre().equals(nombre) && m.getRuta().equals(nombre)) {
					
					return m;
				}
			}
		}
		
		return null;
	}
	
	
}
