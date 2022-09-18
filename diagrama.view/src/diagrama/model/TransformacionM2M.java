package diagrama.model;

import abstracta.AbstractaFactory;
import concreta.MBSClase;
import concreta.MBSPaquete;
import concreta.MBSDiagramaClases;
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
	
	
}
