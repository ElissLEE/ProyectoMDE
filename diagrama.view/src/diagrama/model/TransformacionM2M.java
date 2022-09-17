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
		
		for (MBSDiagramaClases diagramaConcreta : modelFactoryConcreta.getListaDiagramas()) {
			//crear los paquetes
			for (MBSPaquete paquete : diagramaConcreta.getListaPaquetes()) {
				crearPaquete(paquete);
			}
			
			//Crear clases
//			for (MBSClase clase : diagramaConcreta.getListaClases()) {
//				crearClase(clase);
//			}

			
		}
		
		return mensaje;
	}
	
	
	private void crearClase(MBSClase clase) {
		String ruta = clase.getRuta();
		String name = clase.getNombre();
		
		abstracta.MBSClase claseAbstracta = obtenerClaseAbstracta(name,ruta);
		
		if(claseAbstracta == null) {
			abstracta.MBSClase mbsClase = AbstractaFactory.eINSTANCE.createMBSClase();
			mbsClase.setNombre(clase.getNombre());
			
//			abstracta.MBSPaquete paquetePadre = obtenerPaquete(ruta);
//			paquetePadre.getListaClases().add(mbsClase);
		}
		
	}

	private abstracta.MBSClase obtenerClaseAbstracta(String name, String ruta) {
		
		abstracta.MBSPaquete mbsPaquete = modelFactoryAbstracta.getListaPaquetes().get(0);
		
		for (abstracta.MBSClase mbsClase : mbsPaquete.getListaClases()) {
			if(mbsClase.getNombre().equals(name) ) {
				return mbsClase;
			}
		}
		for (abstracta.MBSPaquete mbsPaquete2 : mbsPaquete.getListaPaquetes()) {
			abstracta.MBSClase mbsClase = obtenerClasePaquete(mbsPaquete2,name,ruta);
			if(mbsClase != null) {
				return mbsClase;
			}
		}

		return null;
	}

	private abstracta.MBSClase obtenerClasePaquete(abstracta.MBSPaquete mbsPaquete, String name, String ruta) {
		
		for (abstracta.MBSClase mbsClase : mbsPaquete.getListaClases()) {
			if(mbsClase.getNombre().equals(name) ) {
				return mbsClase;
			}
		}
		for (abstracta.MBSPaquete mbsPaquete2 : mbsPaquete.getListaPaquetes()) {
			abstracta.MBSClase mbsClase = obtenerClasePaquete(mbsPaquete2,name,ruta);
			if(mbsClase != null) {
				return mbsClase;
			}
		}
		
		return null;
	}

	private void crearPaquete(MBSPaquete paquete) {
//		String ruta = paquete.getRuta()+paquete.getNombre();//a
//		String[] split = ruta.split("/");
//		abstracta.MBSPaquete paqueteParent = null;
//		
//		//[root, empresa,domain,a]
//		String nuevaRuta = "";
//		for (int i = 0; i < split.length; i++) {
//			String rutaNombrePaquete = split[i];
//			paqueteParent = obtenerPaqueteAbstracta(rutaNombrePaquete,nuevaRuta,paqueteParent);
//			nuevaRuta += split[i]+"/";
//		}
		
		String ruta = "";
		if(paquete.getRuta()==null) {
			ruta = paquete.getNombre();
		}else {
			ruta = paquete.getRuta()+paquete.getNombre();
		}
		String[] split = ruta.split("/");
		abstracta.MBSPaquete paqueteParent = null;
		
		String nuevaRuta="";
		for(int i=0;i<split.length;i++) {
			String nombrePaquete = split[i];
			paqueteParent = obtenerPaqueteAbstracta(nombrePaquete, nuevaRuta, paqueteParent);
			nuevaRuta += split[i]+"/";
			
		}
		
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

		}else {
			for (int i = 0; i < paqueteParent.getListaPaquetes().size(); i++) {
				if(paqueteParent.getListaPaquetes().get(i).getNombre().equals(nombrePaquete)) {
					if(paqueteParent.getListaPaquetes().get(i).getRuta().equals(nuevaRuta))
					{
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
	
	
}
