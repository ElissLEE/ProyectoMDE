package diagrama.model;

import java.io.File;
import java.io.FileWriter;

import abstracta.MBSRelacion;
import concreta.MBSClase;
import concreta.MBSDiagramaClases;
import concreta.MBSPaquete;
import concreta.ModelFactory;

public class TransformacionM2T {
	
	private abstracta.ModelFactory modelFactoryAbstracta;
	

	public TransformacionM2T(abstracta.ModelFactory modelFactoryAbstracta) {
		super();
		this.modelFactoryAbstracta = modelFactoryAbstracta;
	}
	
	public String transformarM2T() {
		
		String mensaje = "";
		StringBuilder textoCodigo = new StringBuilder();
		
		for (abstracta.MBSClase clase : modelFactoryAbstracta.getListaTodasLasClases()){
			
			generarClase(clase, textoCodigo);
			
		}
		
		return "Se ha generado el codigo de su proyecto";
	}

	private void generarClase(abstracta.MBSClase clase, StringBuilder textoCodigo) {
		
		//Agregar la declaracion del paquete
		textoCodigo.append("package "+clase.getRuta()+"\n\n");
		
		agregarEncabezado(clase, textoCodigo);
		agregarAtributos(clase, textoCodigo);
		agregarConstructor(clase, textoCodigo);
		agregarSetyGet(clase, textoCodigo);
		agregarMetodos(clase, textoCodigo);
		
	}

	private void agregarMetodos(abstracta.MBSClase clase, StringBuilder textoCodigo) {
		// TODO Auto-generated method stub
		
	}

	private void agregarSetyGet(abstracta.MBSClase clase, StringBuilder textoCodigo) {
		// TODO Auto-generated method stub
		
	}

	private void agregarConstructor(abstracta.MBSClase clase, StringBuilder textoCodigo) {
		
		boolean flagHerencia = false;
		
		for (abstracta.MBSRelacion relacion : clase.getListaRelaciones()) {
			
			if(relacion.getTipo().equals("herencia") && relacion.getNavegabilidadA()==true) {
				
				abstracta.MBSClase claseTarget = relacion.getTarget();
				textoCodigo.append("constructor(");
				
				for(int i=0;i<claseTarget.getAtributos().size();i++) {
					
					textoCodigo.append(claseTarget.getAtributos().get(i).getNombre()+": "+claseTarget.getAtributos().get(i).getTipo());
					
					if(i!=claseTarget.getAtributos().size()-1) {
						textoCodigo.append(", ");
					}
				}
				
				for(int i=0;i<clase.getAtributos().size();i++) {
					
					textoCodigo.append(clase.getAtributos().get(i).getNombre()+": "+clase.getAtributos().get(i).getTipo());
					
					if(i!=clase.getAtributos().size()-1) {
						textoCodigo.append(", ");
					}
				}
				
				textoCodigo.append("){\n");
				textoCodigo.append("super(");
				
				for(int i=0;i<claseTarget.getAtributos().size();i++) {
					
					textoCodigo.append(claseTarget.getAtributos().get(i).getNombre());
					
					if(i!=claseTarget.getAtributos().size()-1) {
						textoCodigo.append(", ");
					}
					
					if(i==claseTarget.getAtributos().size()-1) {
						textoCodigo.append(")\n");
					}
				}
				
				for(int i=0;i<clase.getAtributos().size();i++) {
					
					textoCodigo.append("this."+clase.getAtributos().get(i).getNombre()+" = "+clase.getAtributos().get(i).getNombre()+"\n");
				}
			
				textoCodigo.append("}\n");
				flagHerencia = true;
				
			}
		}
		
		if(flagHerencia==false) {
			
			textoCodigo.append("constructor(");
			
			for(int i=0;i<clase.getAtributos().size();i++) {
				
				textoCodigo.append(clase.getAtributos().get(i).getNombre()+": "+clase.getAtributos().get(i).getTipo());
				
				if(i!=clase.getAtributos().size()-1) {
					textoCodigo.append(", ");
				}
			}
			
			for(int i=0;i<clase.getListaRelaciones().size();i++) {
				
				if(!clase.getListaRelaciones().get(i).getTipo().equals("herencia") && clase.getListaRelaciones().get(i).getMultiplicidadB().equals("*")) {
					textoCodigo.append(clase.getListaRelaciones().get(i).getRolB()+": List<"+clase.getListaRelaciones().get(i).getTarget().getNombre()+">\n");
				}else {
					textoCodigo.append(clase.getListaRelaciones().get(i).getRolB()+": "+clase.getListaRelaciones().get(i).getTarget().getNombre()+"\n");
				}
				
				if(i!=clase.getListaRelaciones().size()-1) {
					textoCodigo.append(", ");
				}
			}
			
			textoCodigo.append("){\n");
			textoCodigo.append("super()\n");
			
			for(int i=0;i<clase.getAtributos().size();i++) {
				
				textoCodigo.append("this."+clase.getAtributos().get(i).getNombre()+" = "+clase.getAtributos().get(i).getNombre()+"\n");
			}
			
			for(int i=0;i<clase.getListaRelaciones().size();i++) {
				
				if(!clase.getListaRelaciones().get(i).getTipo().equals("herencia")) {
					textoCodigo.append("this."+clase.getListaRelaciones().get(i).getRolB()+" = "+clase.getListaRelaciones().get(i).getRolB()+"\n");
				}
			}
		
			textoCodigo.append("}\n\n");
		}
		
	}

	private void agregarAtributos(abstracta.MBSClase clase, StringBuilder textoCodigo) {
		
		for (abstracta.MBSAtributo atributo : clase.getAtributos()) {
			textoCodigo.append(atributo.getModificadorAcesso()+" val "+atributo.getNombre()+": "+atributo.getTipo() +"\n");
		}
		
		for (abstracta.MBSRelacion relacion : clase.getListaRelaciones()) {
			if(!relacion.getTipo().equals("herencia") && relacion.getMultiplicidadB().equals("*")) {
				textoCodigo.append("private val "+relacion.getRolB()+": List<"+relacion.getTarget().getNombre()+">"+"\n");
			}else {
				textoCodigo.append("private val "+relacion.getRolB()+": "+relacion.getTarget().getNombre()+"\n");
			}
		}
		
		textoCodigo.append("\n");
		
	}

	private void agregarEncabezado(abstracta.MBSClase clase, StringBuilder textoCodigo) {
		
		boolean flagHerencia = false;
		
		if(clase.getListaRelaciones().size()>0) {
			
			for (abstracta.MBSRelacion relacion : clase.getListaRelaciones()) {
				
				if(relacion.getTipo().equals("herencia") && relacion.getNavegabilidadA() == true) {
					
					textoCodigo.append(clase.getModificadorAcceso()+" class "+clase.getNombre()+" : "+relacion.getTarget().getNombre()+" {\n\n");
					flagHerencia = true;
				}
			}
		}
		
		if(flagHerencia==false) {
			
			textoCodigo.append(clase.getModificadorAcceso()+" class "+clase.getNombre()+" {\n\n");
		}
		
	}
	
	private void guardarArchivo(String cadena, String ruta ,String nombre) {
		try
		{
			//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
			
			File archivo=new File(ruta);
			System.out.println("");
			if(archivo.exists() == false) {
				archivo.mkdirs();
			}
			//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
			FileWriter escribir=new FileWriter(archivo+"/"+nombre,true);
			//Escribimos en el archivo con el metodo write 
			escribir.write(cadena);

			//Cerramos la conexion
			escribir.close();
		}

		//Si existe un problema al escribir cae aqui
		catch(Exception e)
		{
			System.out.println("Error al Guardar");
		}

	}


}
