/**
 */
package diagramaAbstracta.impl;

import diagramaAbstracta.DiagramaAbstractaFactory;
import diagramaAbstracta.DiagramaAbstractaPackage;
import diagramaAbstracta.MBSAtributo;
import diagramaAbstracta.MBSClase;
import diagramaAbstracta.MBSMetodo;
import diagramaAbstracta.MBSPaquete;
import diagramaAbstracta.MBSParametro;
import diagramaAbstracta.MBSRelacion;
import diagramaAbstracta.ModelFactory;

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
public class DiagramaAbstractaPackageImpl extends EPackageImpl implements DiagramaAbstractaPackage {
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
	private EClass mbsParametroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mbsRelacionEClass = null;

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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiagramaAbstractaPackageImpl() {
		super(eNS_URI, DiagramaAbstractaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DiagramaAbstractaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiagramaAbstractaPackage init() {
		if (isInited) return (DiagramaAbstractaPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramaAbstractaPackage.eNS_URI);

		// Obtain or create and register package
		DiagramaAbstractaPackageImpl theDiagramaAbstractaPackage = (DiagramaAbstractaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiagramaAbstractaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiagramaAbstractaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDiagramaAbstractaPackage.createPackageContents();

		// Initialize created meta-data
		theDiagramaAbstractaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiagramaAbstractaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiagramaAbstractaPackage.eNS_URI, theDiagramaAbstractaPackage);
		return theDiagramaAbstractaPackage;
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
	public EReference getModelFactory_ListaPaquetes() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(2);
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
	public EReference getMBSPaquete_ListaClases() {
		return (EReference)mbsPaqueteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSPaquete_ListaPaquetes() {
		return (EReference)mbsPaqueteEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getMBSClase_IdClase() {
		return (EAttribute)mbsClaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSClase_Nombre() {
		return (EAttribute)mbsClaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSClase_Estereotipo() {
		return (EAttribute)mbsClaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSClase_ModificadorAcceso() {
		return (EAttribute)mbsClaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSClase_Abstracta() {
		return (EAttribute)mbsClaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSClase_Descripcion() {
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
	public EReference getMBSClase_ListaRelaciones() {
		return (EReference)mbsClaseEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getMBSMetodo_Semantica() {
		return (EAttribute)mbsMetodoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMBSMetodo_ListaParametros() {
		return (EReference)mbsMetodoEClass.getEStructuralFeatures().get(4);
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
	public EClass getMBSParametro() {
		return mbsParametroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSParametro_Nombre() {
		return (EAttribute)mbsParametroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMBSParametro_Tipo() {
		return (EAttribute)mbsParametroEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getMBSRelacion_MultiplicidaA() {
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
	public DiagramaAbstractaFactory getDiagramaAbstractaFactory() {
		return (DiagramaAbstractaFactory)getEFactoryInstance();
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
		createEReference(modelFactoryEClass, MODEL_FACTORY__LISTA_PAQUETES);

		mbsPaqueteEClass = createEClass(MBS_PAQUETE);
		createEAttribute(mbsPaqueteEClass, MBS_PAQUETE__NOMBRE);
		createEAttribute(mbsPaqueteEClass, MBS_PAQUETE__RUTA);
		createEReference(mbsPaqueteEClass, MBS_PAQUETE__LISTA_CLASES);
		createEReference(mbsPaqueteEClass, MBS_PAQUETE__LISTA_PAQUETES);

		mbsClaseEClass = createEClass(MBS_CLASE);
		createEAttribute(mbsClaseEClass, MBS_CLASE__ID_CLASE);
		createEAttribute(mbsClaseEClass, MBS_CLASE__NOMBRE);
		createEAttribute(mbsClaseEClass, MBS_CLASE__ESTEREOTIPO);
		createEAttribute(mbsClaseEClass, MBS_CLASE__MODIFICADOR_ACCESO);
		createEAttribute(mbsClaseEClass, MBS_CLASE__ABSTRACTA);
		createEAttribute(mbsClaseEClass, MBS_CLASE__DESCRIPCION);
		createEReference(mbsClaseEClass, MBS_CLASE__ATRIBUTOS);
		createEReference(mbsClaseEClass, MBS_CLASE__METODOS);
		createEReference(mbsClaseEClass, MBS_CLASE__LISTA_RELACIONES);

		mbsMetodoEClass = createEClass(MBS_METODO);
		createEAttribute(mbsMetodoEClass, MBS_METODO__NOMBRE);
		createEAttribute(mbsMetodoEClass, MBS_METODO__MODIFICADOR_ACCESO);
		createEAttribute(mbsMetodoEClass, MBS_METODO__TIPO_RETORNO);
		createEAttribute(mbsMetodoEClass, MBS_METODO__SEMANTICA);
		createEReference(mbsMetodoEClass, MBS_METODO__LISTA_PARAMETROS);

		mbsAtributoEClass = createEClass(MBS_ATRIBUTO);
		createEAttribute(mbsAtributoEClass, MBS_ATRIBUTO__NOMBRE);
		createEAttribute(mbsAtributoEClass, MBS_ATRIBUTO__TIPO);
		createEAttribute(mbsAtributoEClass, MBS_ATRIBUTO__MODIFICADOR_ACESSO);
		createEAttribute(mbsAtributoEClass, MBS_ATRIBUTO__VALOR_DEFECTO);
		createEAttribute(mbsAtributoEClass, MBS_ATRIBUTO__CONSTANTE);

		mbsParametroEClass = createEClass(MBS_PARAMETRO);
		createEAttribute(mbsParametroEClass, MBS_PARAMETRO__NOMBRE);
		createEAttribute(mbsParametroEClass, MBS_PARAMETRO__TIPO);

		mbsRelacionEClass = createEClass(MBS_RELACION);
		createEReference(mbsRelacionEClass, MBS_RELACION__SOURCE);
		createEReference(mbsRelacionEClass, MBS_RELACION__TARGET);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__NOMBRE);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__TIPO);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__MULTIPLICIDA_A);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__MULTIPLICIDAD_B);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__ROL_A);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__ROL_B);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__NAVEGABILIDAD_A);
		createEAttribute(mbsRelacionEClass, MBS_RELACION__NAVEGABILIDAD_B);
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
		initEReference(getModelFactory_ListaPaquetes(), this.getMBSPaquete(), null, "listaPaquetes", null, 0, -1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsPaqueteEClass, MBSPaquete.class, "MBSPaquete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMBSPaquete_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MBSPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSPaquete_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, MBSPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSPaquete_ListaClases(), this.getMBSClase(), null, "listaClases", null, 0, -1, MBSPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSPaquete_ListaPaquetes(), this.getMBSPaquete(), null, "listaPaquetes", null, 0, -1, MBSPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsClaseEClass, MBSClase.class, "MBSClase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMBSClase_IdClase(), ecorePackage.getEString(), "idClase", null, 0, 1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSClase_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSClase_Estereotipo(), ecorePackage.getEString(), "estereotipo", null, 0, 1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSClase_ModificadorAcceso(), ecorePackage.getEString(), "modificadorAcceso", null, 0, 1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSClase_Abstracta(), ecorePackage.getEBoolean(), "abstracta", null, 0, 1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSClase_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSClase_Atributos(), this.getMBSAtributo(), null, "atributos", null, 0, -1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSClase_Metodos(), this.getMBSMetodo(), null, "metodos", null, 0, -1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSClase_ListaRelaciones(), this.getMBSRelacion(), null, "listaRelaciones", null, 0, -1, MBSClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsMetodoEClass, MBSMetodo.class, "MBSMetodo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMBSMetodo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MBSMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSMetodo_ModificadorAcceso(), ecorePackage.getEString(), "modificadorAcceso", null, 0, 1, MBSMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSMetodo_TipoRetorno(), ecorePackage.getEString(), "tipoRetorno", null, 0, 1, MBSMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSMetodo_Semantica(), ecorePackage.getEString(), "semantica", null, 0, 1, MBSMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSMetodo_ListaParametros(), this.getMBSParametro(), null, "listaParametros", null, 0, -1, MBSMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsAtributoEClass, MBSAtributo.class, "MBSAtributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMBSAtributo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MBSAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSAtributo_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, MBSAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSAtributo_ModificadorAcesso(), ecorePackage.getEString(), "modificadorAcesso", null, 0, 1, MBSAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSAtributo_ValorDefecto(), ecorePackage.getEString(), "ValorDefecto", null, 0, 1, MBSAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSAtributo_Constante(), ecorePackage.getEBoolean(), "constante", null, 0, 1, MBSAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsParametroEClass, MBSParametro.class, "MBSParametro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMBSParametro_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MBSParametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSParametro_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, MBSParametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mbsRelacionEClass, MBSRelacion.class, "MBSRelacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMBSRelacion_Source(), this.getMBSClase(), null, "source", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBSRelacion_Target(), this.getMBSClase(), null, "target", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_MultiplicidaA(), ecorePackage.getEString(), "multiplicidaA", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_MultiplicidadB(), ecorePackage.getEString(), "multiplicidadB", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_RolA(), ecorePackage.getEString(), "rolA", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_RolB(), ecorePackage.getEString(), "rolB", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_NavegabilidadA(), ecorePackage.getEString(), "navegabilidadA", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMBSRelacion_NavegabilidadB(), ecorePackage.getEString(), "navegabilidadB", null, 0, 1, MBSRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
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

} //DiagramaAbstractaPackageImpl
