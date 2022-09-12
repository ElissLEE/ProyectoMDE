package diagrama.model;

import java.util.ArrayList;

import diagConcreta.DiagConcretaFactory;
import diagConcreta.DiagConcretaPackage;
import diagConcreta.MBSClase;
import diagConcreta.MBSDiagramaClases;
import diagConcreta.MBSPaquete;
import diagConcreta.MBSRelacion;
import diagConcreta.ModelFactory;

public class ModelFactoryModel {

	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder { 
		// El constructor de Singleton puede ser llamado desde aqu� al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// M�todo para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}
	//------------------------------  Singleton ------------------------------------------------
	ModelFactory modelFactory = DiagConcretaFactory.eINSTANCE.createModelFactory();
	ModelFactory modelFactoryConcreta;
	ModelFactory modelFactoryAbstracta;

	public ModelFactoryModel() {
		// TODO Auto-generated constructor stub

		ModelFactory tempModelFactory = modelFactory;

//		modelFactory = cargar();

		if ( modelFactory == null ){
			modelFactory = tempModelFactory;

		}
	}

	public ModelFactory cargarConcreta() {
		ModelFactory modelFactory = null;

		DiagConcretaPackage whoownmePackage =  DiagConcretaPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		//EXISTEN 3 FORMAS DE CARGAR EL RECURSO

		//1. CON LA SIGUIENTE RUTA (platform:/resource) SE CARGAR EL RECURSO CUANDO SE HACE UNA NUEVA INSTANCIA DE ECLIPSE, EN DONDE SE CREA UN PROYECTO(test)
		//QUE CONTIENE LAS PRODUCCIONES, DONDE SE ESPECIFICA QUE RECURSO CARGAR

		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test2/src/model/model.diagconcreta");

		//2.CON LA SIGUIENTE RUTA (platform:/plugin/) SE CARGAR EL RECURSO DE ALGUNOS DE LOS PLUGINS(whoownme.model) EN LOS QUE SE ESTA TRABJANDO EN EL WORKSPACE
		//org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/plugin/whoownme.model/resource/model.whoownme");

		//3. CON LA SIGUIENTE RUTA (file:\\E:\\) SE CARGA EL RECURSO INDICANDO UNA RUTA DESDE EL DIRECTORIO DE ARCHIVOS DE WIMDOWS
		//org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("file:\\E:\\varios\\td\\whoownme\\whoownme\\whoownme.model\\resource\\model.whoownme");

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (ModelFactory)resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		}
		catch (java.io.IOException e) {
			System.out.println("failed to read " + uri); 		
			System.out.println(e);
		}
		return modelFactory;
	}
	
	public diagramaAbstracta.ModelFactory cargarAbstracta() {
		
		ModelFactory modelFactory = null;

		DiagConcretaPackage whoownmePackage =  DiagConcretaPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		//EXISTEN 3 FORMAS DE CARGAR EL RECURSO

		//1. CON LA SIGUIENTE RUTA (platform:/resource) SE CARGAR EL RECURSO CUANDO SE HACE UNA NUEVA INSTANCIA DE ECLIPSE, EN DONDE SE CREA UN PROYECTO(test)
		//QUE CONTIENE LAS PRODUCCIONES, DONDE SE ESPECIFICA QUE RECURSO CARGAR

		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test2/src/model/model.diagramaabstracta");

		//2.CON LA SIGUIENTE RUTA (platform:/plugin/) SE CARGAR EL RECURSO DE ALGUNOS DE LOS PLUGINS(whoownme.model) EN LOS QUE SE ESTA TRABJANDO EN EL WORKSPACE
		//org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/plugin/whoownme.model/resource/model.whoownme");

		//3. CON LA SIGUIENTE RUTA (file:\\E:\\) SE CARGA EL RECURSO INDICANDO UNA RUTA DESDE EL DIRECTORIO DE ARCHIVOS DE WIMDOWS
		//org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("file:\\E:\\varios\\td\\whoownme\\whoownme\\whoownme.model\\resource\\model.whoownme");

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (ModelFactory)resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		}
		catch (java.io.IOException e) {
			System.out.println("failed to read " + uri); 		
			System.out.println(e);
		}
		return modelFactory;
	}
	
	public void generarModelToModel() {
		
		modelFactoryConcreta = cargarConcreta();
		modelFactoryAbstracta = cargarAbstracta();
		
		//Crear paquetes
		for (MBSDiagramaClases diagrama : modelFactoryConcreta.getListaDiagramas()) {
			
			for (MBSPaquete paquete : diagrama.getListaPaquetes()) {
				
				crearPaquete(paquete);
			}
		}
	}

	private void crearPaquete(MBSPaquete paquete) {
		
		String ruta = paquete.getRuta();
		
		String[] split=ruta.split("/");
		
		for(int i=0;i<split.length;i++) {
			String nombrePaquete = split[0];
			MBSPaquete paqueteAux = obtenerPaquete(nombrePaquete);
			if(paqueteAux != null) {
				//Crear paquete
			}
		}
		
	}

	private MBSPaquete obtenerPaquete(String nombrePaquete) {
		
		for (iterable_type iterable_element : iterable) {
			
		}
	}

	private ModelFactory cargarConcreta() {
		
		ModelFactory modelFactory = cargar("model.diagconcreta");
		return modelFactory;
	}
	
//	private ModelFactory cargarAbstracta() {
//		
//		ModelFactory modelFactory = cargar("model.diagramaabstracta");
//		return modelFactory;
//	}

//	public void generarModelToModel() {
//		ModelFactory modelFactory = cargar();
//		
//		//Imprimir las clases creadas por un usuario de todos los diagramas
//		
////		for (MBSDiagramaClases diagrama : modelFactory.getListaDiagramas()) {
////			 System.out.println("Diagrama de clases: " + diagrama.getNombre()+ "\n");
////			 
////			 for (MBSClase clase : diagrama.getListaClases()) {
////				 
////				System.out.println("clase: " + clase.getNombre() + "\n");
////			}
////			 
////		}
//		
//		//Buscar una clase por el id
//		
//		//Imprimir las relaciones salientes de una clase
//		
//		ArrayList<MBSRelacion>listaRelaciones = obtenerRelacionesSalientes("empresa");
//		
//		for(int i=0;i<listaRelaciones.size();i++) {
//			System.out.println("Relacion saliente con la clase empresa: "+listaRelaciones.get(i).getTarget().getNombre());
//		}
//		
//		//Imprimir las relaciones entrantes de una clase
//		
//		//Verificar si existe una relacion entre dos clases dados por sus id
//	
//		
//	}
//	
//	private MBSClase obtenerClase(String nombre){
//		
//		for (MBSDiagramaClases diagrama : modelFactory.getListaDiagramas()) {
//			 for (MBSClase clase : diagrama.getListaClases()) {
//				 
//				if(clase.getNombre().equals(nombre)) {
//					return clase;
//				}
//			}
//			 
//		}
//		
//		return null;
//	}
	
	private ArrayList<MBSRelacion>obtenerRelacionesSalientes(String nombreClase){
		
		ArrayList<MBSRelacion>listaRelaciones = new ArrayList<>();
		
		
		for (MBSDiagramaClases diagrama : modelFactory.getListaDiagramas()) {
			 for (MBSRelacion relacion : diagrama.getListaRelaciones()) {
				 
				if(relacion.getSource().getNombre().equals(nombreClase)) {
					listaRelaciones.add(relacion);
				}
			}
			 
		}
		
		return listaRelaciones;
	}


}