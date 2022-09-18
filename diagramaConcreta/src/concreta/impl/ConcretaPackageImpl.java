/**
 */
package concreta.impl;

import concreta.ConcretaFactory;
import concreta.ConcretaPackage;
import concreta.MBSAtributo;
import concreta.MBSClase;
import concreta.MBSContainment;
import concreta.MBSDiagramaClases;
import concreta.MBSHerencia;
import concreta.MBSMetodo;
import concreta.MBSPaquete;
import concreta.MBSParametro;
import concreta.MBSRelacion;
import concreta.ModelFactory;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcretaPackageImpl extends EPackageImpl implements ConcretaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mbsDiagramaClasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mbsPaqueteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mbsClaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mbsMetodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mbsAtributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mbsRelacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mbsHerenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mbsContainmentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see concreta.ConcretaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConcretaPackageImpl() {
		super(eNS_URI, ConcretaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConcretaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConcretaPackage init() {
		if (isInited) return (ConcretaPackage)EPackage.Registry.INSTANCE.getEPackage(ConcretaPackage.eNS_URI);

		// Obtain or create and register package
		ConcretaPackageImpl theConcretaPackage = (ConcretaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConcretaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConcretaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConcretaPackage.createPackageContents();

		// Initialize created meta-data
		theConcretaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcretaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConcretaPackage.eNS_URI, theConcretaPackage);
		return theConcretaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactory() {
		return modelFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactory_Nombre() {
		return (EAttribute)modelFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactory_Ruta() {
		return (EAttribute)modelFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_ListaDiagramas() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMBSDiagramaClases() {
		return mbsDiagramaClasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSDiagramaClases_IdClase() {
		return (EAttribute)mbsDiagramaClasesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSDiagramaClases_Nombre() {
		return (EAttribute)mbsDiagramaClasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSDiagramaClases_Descripcion() {
		return (EAttribute)mbsDiagramaClasesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSDiagramaClases_ListaClases() {
		return (EReference)mbsDiagramaClasesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSDiagramaClases_ListaRelaciones() {
		return (EReference)mbsDiagramaClasesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSDiagramaClases_ListaRelacionesHerencia() {
		return (EReference)mbsDiagramaClasesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSDiagramaClases_ListaRelacionesContainment() {
		return (EReference)mbsDiagramaClasesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSDiagramaClases_ListaPaquetes() {
		return (EReference)mbsDiagramaClasesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMBSPaquete() {
		return mbsPaqueteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSPaquete_Nombre() {
		return (EAttribute)mbsPaqueteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSPaquete_Ruta() {
		return (EAttribute)mbsPaqueteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMBSClase() {
		return mbsClaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSClase_Nombre() {
		return (EAttribute)mbsClaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSClase_Estereotipo() {
		return (EAttribute)mbsClaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSClase_ModificadorAcceso() {
		return (EAttribute)mbsClaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSClase_Abstracta() {
		return (EAttribute)mbsClaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSClase_Descripcion() {
		return (EAttribute)mbsClaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSClase_Ruta() {
		return (EAttribute)mbsClaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSClase_Atributos() {
		return (EReference)mbsClaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSClase_Metodos() {
		return (EReference)mbsClaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMBSMetodo() {
		return mbsMetodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSMetodo_Nombre() {
		return (EAttribute)mbsMetodoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSMetodo_ModificadorAcceso() {
		return (EAttribute)mbsMetodoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSMetodo_TipoRetorno() {
		return (EAttribute)mbsMetodoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSMetodo_Ruta() {
		return (EAttribute)mbsMetodoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSMetodo_Parametros() {
		return (EAttribute)mbsMetodoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMBSAtributo() {
		return mbsAtributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSAtributo_Nombre() {
		return (EAttribute)mbsAtributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSAtributo_Tipo() {
		return (EAttribute)mbsAtributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSAtributo_ModificadorAcesso() {
		return (EAttribute)mbsAtributoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSAtributo_ValorDefecto() {
		return (EAttribute)mbsAtributoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSAtributo_Constante() {
		return (EAttribute)mbsAtributoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSAtributo_Ruta() {
		return (EAttribute)mbsAtributoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMBSRelacion() {
		return mbsRelacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSRelacion_Source() {
		return (EReference)mbsRelacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSRelacion_Target() {
		return (EReference)mbsRelacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSRelacion_Nombre() {
		return (EAttribute)mbsRelacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSRelacion_Tipo() {
		return (EAttribute)mbsRelacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSRelacion_MultiplicidadA() {
		return (EAttribute)mbsRelacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSRelacion_MultiplicidadB() {
		return (EAttribute)mbsRelacionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSRelacion_RolA() {
		return (EAttribute)mbsRelacionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSRelacion_RolB() {
		return (EAttribute)mbsRelacionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSRelacion_NavegabilidadA() {
		return (EAttribute)mbsRelacionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSRelacion_NavegabilidadB() {
		return (EAttribute)mbsRelacionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSRelacion_LabelName() {
		return (EAttribute)mbsRelacionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMBSHerencia() {
		return mbsHerenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSHerencia_Source() {
		return (EReference)mbsHerenciaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSHerencia_Target() {
		return (EReference)mbsHerenciaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMBSContainment() {
		return mbsContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSContainment_Source() {
		return (EReference)mbsContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSContainment_Target() {
		return (EReference)mbsContainmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSContainment_Nombre() {
		return (EAttribute)mbsContainmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSContainment_Tipo() {
		return (EAttribute)mbsContainmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSContainment_MultiplicidadA() {
		return (EAttribute)mbsContainmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSContainment_MultiplicidadB() {
		return (EAttribute)mbsContainmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSContainment_RolA() {
		return (EAttribute)mbsContainmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSContainment_RolB() {
		return (EAttribute)mbsContainmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSContainment_NavegabilidadA() {
		return (EAttribute)mbsContainmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSContainment_NavegabilidadB() {
		return (EAttribute)mbsContainmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretaFactory getConcretaFactory() {
		return (ConcretaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryEClass = createEClass(MODEL_FACTORY);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__NOMBRE);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__RUTA);
		createEReference(modelFactoryEClass, MODEL_FACTORY__LISTA_DIAGRAMAS);

		mbsDiagramaClasesEClass = createEClass(MBS_DIAGRAMA_CLASES);
		createEAttribute(mbsDiagramaClasesEClass, MBS_DIAGRAMA_CLASES__NOMBRE);
		createEAttribute(mbsDiagramaClasesEClass, MBS_DIAGRAMA_CLASES__ID_CLASE);
		createEAttribute(mbsDiagramaClasesEClass, MBS_DIAGRAMA_CLASES__DESCRIPCION);
		createEReference(mbsDiagramaClasesEClass, MBS_DIAGRAMA_CLASES__LISTA_CLASES);
		createEReference(mbsDiagramaClasesEClass, MBS_DIAGRAMA_CLASES__LISTA_RELACIONES);
		createEReference(mbsDiagramaClasesEClass, MBS_DIAGRAMA_CLASES__LISTA_RELACIONES_HERENCIA);
		createEReference(mbsDiagramaClasesEClass, MBS_DIAGRAMA_CLASES__LISTA_RELACIONES_CONTAINMENT);
		createEReference(mbsDiagramaClasesEClass, MBS_DIAGRAMA_CLASES__LISTA_PAQUETES);

		mbsPaqueteEClass = createEClass(MBS_PAQUETE);
		createEAttribute(mbsPaqueteEClass, MBS_PAQUETE__NOMBRE);
		createEAttribute(mbsPaqueteEClass, MBS_PAQUETE__RUTA);

		mbsClaseEClass = createEClass(MBS_CLASE);
		createEAttribute(mbsClaseEClass, MBS_CLASE__NOMBRE);
		createEAttribute(mbsClaseEClass, MBS_CLASE__ESTEREOTIPO);
		createEAttribute(mbsClaseEClass, MBS_CLASE__MODIFICADOR_ACCESO);
		createEAttribute(mbsClaseEClass, MBS_CLASE__ABSTRACTA);
		createEAttribute(mbsClaseEClass, MBS_CLASE__DESCRIPCION);
		createEAttribute(mbsClaseEClass, MBS_CLASE__RUTA);
		createEReference(mbsClaseEClass, MBS_CLASE__ATRIBUTOS);
		createEReference(mbsClaseEClass, MBS_CLASE__METODOS);

		mbsMetodoEClass = createEClass(MBS_METODO);
		createEAttribute(mbsMetodoEClass, MBS_METODO__NOMBRE);
		createEAttribute(mbsMetodoEClass, MBS_METODO__MODIFICADOR_ACCESO);
		createEAttribute(mbsMetodoEClass, MBS_METODO__TIPO_RETORNO);
		createEAttribute(mbsMetodoEClass, MBS_METODO__RUTA);
		createEAttribute(mbsMetodoEClass, MBS_METODO__PARAMETROS);

		mbsAtributoEClass = createEClass(MBS_ATRIBUTO);
		createEAttribute(mbsAtributoEClass, MBS_ATRIBUTO__NOMBRE);
		createEAttribute(mbsAtributoEClass, MBS_ATRIBUTO__TIPO);
		createEAttribute(mbsAtributoEClass, MBS_ATRIBUTO__MODIFICADOR_ACESSO);
		createEAttribute(mbsAtributoEClass, MBS_ATRIBUTO__VALOR_DEFECTO);
		createEAttribute(mbsAtributoEClass, MBS_ATRIBUTO__CONSTANTE);
		createEAttribute(mbsAtributoEClass, MBS_ATRIBUTO__RUTA);

		mbsRelacionEClass = createEClass(MBS_RELACION);
		createEReference(mbsRelacionEClass, MBS_RELACION__SOURCE);
		createEReference(mbsRelacionEClass, MBS_RELACION__TARGET);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__NOMBRE);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__TIPO);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__MULTIPLICIDAD_A);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__MULTIPLICIDAD_B);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__ROL_A);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__ROL_B);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__NAVEGABILIDAD_A);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__NAVEGABILIDAD_B);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__LABEL_NAME);

		mbsHerenciaEClass = createEClass(MBS_HERENCIA);
		createEReference(mbsHerenciaEClass, MBS_HERENCIA__SOURCE);
		createEReference(mbsHerenciaEClass, MBS_HERENCIA__TARGET);

		mbsContainmentEClass = createEClass(MBS_CONTAINMENT);
		createEReference(mbsContainmentEClass, MBS_CONTAINMENT__SOURCE);
		createEReference(mbsContainmentEClass, MBS_CONTAINMENT__TARGET);
		createEAttribute(mbsContainmentEClass, MBS_CONTAINMENT__NOMBRE);
		createEAttribute(mbsContainmentEClass, MBS_CONTAINMENT__TIPO);
		createEAttribute(mbsContainmentEClass, MBS_CONTAINMENT__MULTIPLICIDAD_A);
		createEAttribute(mbsContainmentEClass, MBS_CONTAINMENT__MULTIPLICIDAD_B);
		createEAttribute(mbsContainmentEClass, MBS_CONTAINMENT__ROL_A);
		createEAttribute(mbsContainmentEClass, MBS_CONTAINMENT__ROL_B);
		createEAttribute(mbsContainmentEClass, MBS_CONTAINMENT__NAVEGABILIDAD_A);
		createEAttribute(mbsContainmentEClass, MBS_CONTAINMENT__NAVEGABILIDAD_B);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelFactory_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelFactory_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_ListaDiagramas(), this.getMBSDiagramaClases(), null, "listaDiagramas", null, 0, -1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsDiagramaClasesEClass, MBSDiagramaClases.class, "MBSDiagramaClases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMBSDiagramaClases_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MBSDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSDiagramaClases_IdClase(), ecorePackage.getEString(), "idClase", null, 0, 1, MBSDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSDiagramaClases_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, MBSDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSDiagramaClases_ListaClases(), this.getMBSClase(), null, "listaClases", null, 0, -1, MBSDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSDiagramaClases_ListaRelaciones(), this.getMBSRelacion(), null, "listaRelaciones", null, 0, -1, MBSDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSDiagramaClases_ListaRelacionesHerencia(), this.getMBSHerencia(), null, "listaRelacionesHerencia", null, 0, -1, MBSDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSDiagramaClases_ListaRelacionesContainment(), this.getMBSContainment(), null, "listaRelacionesContainment", null, 0, -1, MBSDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSDiagramaClases_ListaPaquetes(), this.getMBSPaquete(), null, "listaPaquetes", null, 0, -1, MBSDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsPaqueteEClass, MBSPaquete.class, "MBSPaquete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMBSPaquete_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MBSPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSPaquete_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, MBSPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsClaseEClass, MBSClase.class, "MBSClase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMBSClase_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSClase_Estereotipo(), ecorePackage.getEString(), "estereotipo", null, 0, 1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSClase_ModificadorAcceso(), ecorePackage.getEString(), "modificadorAcceso", null, 0, 1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSClase_Abstracta(), ecorePackage.getEBoolean(), "abstracta", null, 0, 1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSClase_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSClase_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSClase_Atributos(), this.getMBSAtributo(), null, "atributos", null, 0, -1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSClase_Metodos(), this.getMBSMetodo(), null, "metodos", null, 0, -1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsMetodoEClass, MBSMetodo.class, "MBSMetodo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMBSMetodo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MBSMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSMetodo_ModificadorAcceso(), ecorePackage.getEString(), "modificadorAcceso", null, 0, 1, MBSMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSMetodo_TipoRetorno(), ecorePackage.getEString(), "tipoRetorno", null, 0, 1, MBSMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSMetodo_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, MBSMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSMetodo_Parametros(), ecorePackage.getEString(), "parametros", null, 0, 1, MBSMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsAtributoEClass, MBSAtributo.class, "MBSAtributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMBSAtributo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MBSAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSAtributo_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, MBSAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSAtributo_ModificadorAcesso(), ecorePackage.getEString(), "modificadorAcesso", null, 0, 1, MBSAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSAtributo_ValorDefecto(), ecorePackage.getEString(), "valorDefecto", null, 0, 1, MBSAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSAtributo_Constante(), ecorePackage.getEBoolean(), "constante", null, 0, 1, MBSAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSAtributo_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, MBSAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsRelacionEClass, MBSRelacion.class, "MBSRelacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMBSRelacion_Source(), this.getMBSClase(), null, "source", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSRelacion_Target(), this.getMBSClase(), null, "target", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_MultiplicidadA(), ecorePackage.getEString(), "multiplicidadA", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_MultiplicidadB(), ecorePackage.getEString(), "multiplicidadB", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_RolA(), ecorePackage.getEString(), "rolA", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_RolB(), ecorePackage.getEString(), "rolB", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_NavegabilidadA(), ecorePackage.getEString(), "navegabilidadA", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_NavegabilidadB(), ecorePackage.getEString(), "navegabilidadB", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_LabelName(), ecorePackage.getEString(), "labelName", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsHerenciaEClass, MBSHerencia.class, "MBSHerencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMBSHerencia_Source(), this.getMBSClase(), null, "source", null, 0, 1, MBSHerencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSHerencia_Target(), this.getMBSClase(), null, "target", null, 0, 1, MBSHerencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsContainmentEClass, MBSContainment.class, "MBSContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMBSContainment_Source(), this.getMBSClase(), null, "source", null, 0, 1, MBSContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSContainment_Target(), this.getMBSClase(), null, "target", null, 0, 1, MBSContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSContainment_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MBSContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSContainment_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, MBSContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSContainment_MultiplicidadA(), ecorePackage.getEString(), "multiplicidadA", null, 0, 1, MBSContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSContainment_MultiplicidadB(), ecorePackage.getEString(), "multiplicidadB", null, 0, 1, MBSContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSContainment_RolA(), ecorePackage.getEString(), "rolA", null, 0, 1, MBSContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSContainment_RolB(), ecorePackage.getEString(), "rolB", null, 0, 1, MBSContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSContainment_NavegabilidadA(), ecorePackage.getEString(), "navegabilidadA", null, 0, 1, MBSContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSContainment_NavegabilidadB(), ecorePackage.getEString(), "navegabilidadB", null, 0, 1, MBSContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (mbsDiagramaClasesEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (mbsPaqueteEClass, 
		   source, 
		   new String[] {
			 "label", "nombre"
		   });	
		addAnnotation
		  (mbsClaseEClass, 
		   source, 
		   new String[] {
			 "label", "nombre",
			 "label.layout", "center",
			 "size", "150,150",
			 "color", "240,255,255"
		   });	
		addAnnotation
		  (mbsMetodoEClass, 
		   source, 
		   new String[] {
			 "label", "nombre",
			 "color", "240,255,255",
			 "size", "100,15",
			 "margin", "0",
			 "border.color", "255,255,255"
		   });	
		addAnnotation
		  (mbsAtributoEClass, 
		   source, 
		   new String[] {
			 "label", "nombre",
			 "color", "240,255,255",
			 "size", "100,15",
			 "margin", "0",
			 "border.color", "255,255,255"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getMBSClase_Atributos(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getMBSClase_Metodos(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (mbsRelacionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "2",
			 "label", "labelName"
		   });	
		addAnnotation
		  (mbsHerenciaEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "1",
			 "target.decoration", "closedarrow"
		   });	
		addAnnotation
		  (mbsContainmentEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "source.decoration", "filledrhomb",
			 "target", "target",
			 "style", "solid",
			 "width", "2"
		   });
	}

} //ConcretaPackageImpl
