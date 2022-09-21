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
		
		//Agregar el encabezado de la clase
		agregarEncabezado(clase, textoCodigo);
		
		//Agregar los atributos de la clase
		agregarAtributos(clase, textoCodigo);
		
		//Agregar el constructor de la clase
		agregarConstructor(clase, textoCodigo);
		
		//Agregar los set y get de los atributos
		agregarSetyGet(clase, textoCodigo);
		
		//Agregar los metodos de la clase
		agregarMetodos(clase, textoCodigo);
		
		textoCodigo.append("}");
		
	}

	private void agregarMetodos(abstracta.MBSClase clase, StringBuilder textoCodigo) {
		
		for (abstracta.MBSMetodo metodo : clase.getMetodos()) {
			
			if(metodo.getTipoRetorno().equals("") || metodo.getTipoRetorno().equals("void")) {
				
				textoCodigo.append(metodo.getModificadorAcceso()+" fun "+metodo.getNombre()+"("+metodo.getParametros()+"){\n");
				textoCodigo.append("\t"+"// TODO: Autogenerado");
				textoCodigo.append("}\n");
			}else {
				
				textoCodigo.append(metodo.getModificadorAcceso()+" fun "+metodo.getNombre()+"("+metodo.getParametros()+")"+": "+metodo.getTipoRetorno()+" {\n");
				
				if(metodo.getTipoRetorno().equals("String")) {
					
					textoCodigo.append("\t"+"// TODO: Autogenerado\n");
					textoCodigo.append("\t"+"return "+"\"\"");
				}else if(metodo.getTipoRetorno().equals("Int")) {
					
					textoCodigo.append("\t"+"// TODO: Autogenerado\n");
					textoCodigo.append("\t"+"return 0");
				}else if(metodo.getTipoRetorno().equals("Float") || metodo.getTipoRetorno().equals("Double")) {
					
					textoCodigo.append("\t"+"// TODO: Autogenerado\n");
					textoCodigo.append("\t"+"return 0.0");
				}else if(metodo.getTipoRetorno().equals("Char")) {
					
					textoCodigo.append("\t"+"// TODO: Autogenerado\n");
					textoCodigo.append("\t"+"return "+"\'\'");
				}else if(metodo.getTipoRetorno().equals("Boolean")) {
					
					textoCodigo.append("\t"+"// TODO: Autogenerado\n");
					textoCodigo.append("\t"+"return True");
				}
				
				textoCodigo.append("}\n");
			}
			
		}
		
	}

	private void agregarSetyGet(abstracta.MBSClase clase, StringBuilder textoCodigo) {
		
		for (abstracta.MBSAtributo atributo : clase.getAtributos()) {
			
			textoCodigo.append("public fun "+"get"+atributo.getNombre()+"(): "+atributo.getTipo()+"{\n");
			textoCodigo.append("\t"+"return "+atributo.getNombre()+"\n");
			textoCodigo.append("}\n\n");
			
			textoCodigo.append("public fun "+"set"+atributo.getNombre()+"("+atributo.getNombre()+": "+atributo.getTipo()+"){\n");
			textoCodigo.append("\t"+"this."+atributo.getNombre()+" = "+atributo.getNombre()+"\n");
			textoCodigo.append("}\n\n");
		}
		
		for(abstracta.MBSRelacion relacion : clase.getListaRelaciones()) {
			
			if(!relacion.getTipo().equals("herencia")) {
				
				if(relacion.getMultiplicidadB().equals("*")) {
					textoCodigo.append("\t"+"public fun "+"get"+relacion.getRolB()+"():"+" List<"+relacion.getTarget().getNombre()+">"+"{\n");
					textoCodigo.append("\t"+"return "+relacion.getRolB()+"\n");
					textoCodigo.append("}\n\n");
					
					textoCodigo.append("\t"+"public fun "+"set"+relacion.getRolB()+"("+relacion.getRolB()+": List<"+relacion.getTarget().getNombre()+">"+")"+"{\n");
					textoCodigo.append("\t"+"this."+relacion.getRolB()+" = "+relacion.getRolB()+"\n");
					textoCodigo.append("}\n\n");
				}else {
					textoCodigo.append("\t"+"public fun "+"get"+relacion.getRolB()+"(): "+relacion.getTarget().getNombre()+"{\n");
					textoCodigo.append("\t"+"return "+relacion.getRolB()+"\n");
					textoCodigo.append("}\n\n");
					
					textoCodigo.append("\t"+"public fun "+"set"+relacion.getRolB()+"("+relacion.getRolB()+": "+relacion.getTarget().getNombre()+")"+"{\n");
					textoCodigo.append("\t"+"this."+relacion.getRolB()+" = "+relacion.getRolB()+"\n");
					textoCodigo.append("}\n\n");
				}
			}
		}
		
	}

	private void agregarConstructor(abstracta.MBSClase clase, StringBuilder textoCodigo) {
		
		abstracta.MBSRelacion herencia=obtenerHerencia(clase);
		
		textoCodigo.append("\t"+"constructor(");
		
		if(herencia!=null) {
			
			abstracta.MBSClase claseTarget = herencia.getTarget();
			
			for(int i=0;i<claseTarget.getAtributos().size();i++) {
				
				textoCodigo.append(claseTarget.getAtributos().get(i).getNombre()+": "+claseTarget.getAtributos().get(i).getTipo()+", ");
			}
			
			for(int i=0;i<clase.getListaRelaciones().size();i++) {
				
				if(!clase.getListaRelaciones().get(i).getTipo().equals("herencia")) {
					
					if(clase.getListaRelaciones().get(i).getMultiplicidadB().equals("*")) {
						
						textoCodigo.append(clase.getListaRelaciones().get(i).getRolB()+": List<"+clase.getListaRelaciones().get(i).getTarget().getNombre()+">, ");
						
					}else {
						
						textoCodigo.append(clase.getListaRelaciones().get(i).getRolB()+": "+clase.getListaRelaciones().get(i).getTarget().getNombre()+", ");
					}
				}
			}
			
			for(int i=0;i<clase.getAtributos().size();i++) {
				
				textoCodigo.append(clase.getAtributos().get(i).getNombre()+": "+clase.getAtributos().get(i).getTipo());
				
				if(i!=clase.getAtributos().size()-1) {
					textoCodigo.append(", ");
				}
			}
			
			textoCodigo.append("){\n");
			textoCodigo.append("\t\t"+"super(");
			
			for(int i=0;i<claseTarget.getAtributos().size();i++) {
				
				textoCodigo.append(claseTarget.getAtributos().get(i).getNombre());
				
				if(i!=claseTarget.getAtributos().size()-1) {
					textoCodigo.append(", ");
				}
				
				if(i==claseTarget.getAtributos().size()-1) {
					textoCodigo.append(")\n");
				}
			}
			
			for(int i=0;i<clase.getListaRelaciones().size();i++) {
				
				if(!clase.getListaRelaciones().get(i).getTipo().equals("herencia")) {
					
					textoCodigo.append("\t\t"+"this."+clase.getListaRelaciones().get(i).getRolB()+" = "+clase.getListaRelaciones().get(i).getRolB()+"\n");
				}
			}
			
			for(int i=0;i<clase.getAtributos().size();i++) {
				
				textoCodigo.append("\t\t"+"this."+clase.getAtributos().get(i).getNombre()+" = "+clase.getAtributos().get(i).getNombre()+"\n");
			}
			
			textoCodigo.append("\t"+"}\n\n");
			
		}else {
			
			for(int i=0;i<clase.getListaRelaciones().size();i++) {
				
				if(!clase.getListaRelaciones().get(i).getTipo().equals("herencia")) {
					
					if(clase.getListaRelaciones().get(i).getMultiplicidadB().equals("*")) {
						
						textoCodigo.append(clase.getListaRelaciones().get(i).getRolB()+": List<"+clase.getListaRelaciones().get(i).getTarget().getNombre()+">, ");
						
					}else {
						
						textoCodigo.append(clase.getListaRelaciones().get(i).getRolB()+": "+clase.getListaRelaciones().get(i).getTarget().getNombre()+", ");
					}
				}
			}
			
			for(int i=0;i<clase.getAtributos().size();i++) {
				
				textoCodigo.append(clase.getAtributos().get(i).getNombre()+": "+clase.getAtributos().get(i).getTipo());
				
				if(i!=clase.getAtributos().size()-1) {
					textoCodigo.append(", ");
				}
			}
			
			textoCodigo.append("){\n");
			textoCodigo.append("\t\t"+"super()\n");
			
			for(int i=0;i<clase.getListaRelaciones().size();i++) {
				
				if(!clase.getListaRelaciones().get(i).getTipo().equals("herencia")) {
					
					textoCodigo.append("\t\t"+"this."+clase.getListaRelaciones().get(i).getRolB()+" = "+clase.getListaRelaciones().get(i).getRolB()+"\n");
				}
			}
			
			for(int i=0;i<clase.getAtributos().size();i++) {
				
				textoCodigo.append("\t\t"+"this."+clase.getAtributos().get(i).getNombre()+" = "+clase.getAtributos().get(i).getNombre()+"\n");
			}
			
			textoCodigo.append("\t"+"}\n\n");
		}
		
	}

	private void agregarAtributos(abstracta.MBSClase clase, StringBuilder textoCodigo) {
		
		for (abstracta.MBSAtributo atributo : clase.getAtributos()) {
			textoCodigo.append("\t"+atributo.getModificadorAcesso()+" val "+atributo.getNombre()+": "+atributo.getTipo() +"\n");
		}
		
		for (abstracta.MBSRelacion relacion : clase.getListaRelaciones()) {
			if(!relacion.getTipo().equals("herencia") && relacion.getMultiplicidadB().equals("*")) {
				textoCodigo.append("\t"+"private val "+relacion.getRolB()+": List<"+relacion.getTarget().getNombre()+">"+"\n");
			}else {
				textoCodigo.append("\t"+"private val "+relacion.getRolB()+": "+relacion.getTarget().getNombre()+"\n");
			}
		}
		
		textoCodigo.append("\n");
		
	}

	private void agregarEncabezado(abstracta.MBSClase clase, StringBuilder textoCodigo) {
		
		if(clase.getListaRelaciones().size()>0) {
			
			abstracta.MBSRelacion herencia = obtenerHerencia(clase);
			
			if(herencia!=null) {
				
				abstracta.MBSClase claseTarget = herencia.getTarget();
				textoCodigo.append(clase.getModificadorAcceso()+" class "+clase.getNombre()+" : "+claseTarget.getNombre()+" {\n\n");
				
			}else {
				
				textoCodigo.append(clase.getModificadorAcceso()+" class "+clase.getNombre()+" {\n\n");
			}
			
		}
		
	}
	
	private abstracta.MBSRelacion obtenerHerencia(abstracta.MBSClase clase){
		
		for (abstracta.MBSRelacion relacion : clase.getListaRelaciones()) {
			
			if(relacion.getTipo()=="herencia") {
				
				return relacion;
			}
		}
		
		return null;
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
