/**
 */
package diagramaAbstracta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see diagramaAbstracta.DiagramaAbstractaFactory
 * @model kind="package"
 * @generated
 */
public interface DiagramaAbstractaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagramaAbstracta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "abstracta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstracta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramaAbstractaPackage eINSTANCE = diagramaAbstracta.impl.DiagramaAbstractaPackageImpl.init();

	/**
	 * The meta object id for the '{@link diagramaAbstracta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaAbstracta.impl.ModelFactoryImpl
	 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__RUTA = 1;

	/**
	 * The feature id for the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_PAQUETES = 2;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link diagramaAbstracta.impl.MBSPaqueteImpl <em>MBS Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaAbstracta.impl.MBSPaqueteImpl
	 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getMBSPaquete()
	 * @generated
	 */
	int MBS_PAQUETE = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_PAQUETE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_PAQUETE__RUTA = 1;

	/**
	 * The feature id for the '<em><b>Lista Clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_PAQUETE__LISTA_CLASES = 2;

	/**
	 * The feature id for the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_PAQUETE__LISTA_PAQUETES = 3;

	/**
	 * The number of structural features of the '<em>MBS Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_PAQUETE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link diagramaAbstracta.impl.MBSClaseImpl <em>MBS Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaAbstracta.impl.MBSClaseImpl
	 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getMBSClase()
	 * @generated
	 */
	int MBS_CLASE = 2;

	/**
	 * The feature id for the '<em><b>Id Clase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__ID_CLASE = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Estereotipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__ESTEREOTIPO = 2;

	/**
	 * The feature id for the '<em><b>Modificador Acceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__MODIFICADOR_ACCESO = 3;

	/**
	 * The feature id for the '<em><b>Abstracta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__ABSTRACTA = 4;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__DESCRIPCION = 5;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__ATRIBUTOS = 6;

	/**
	 * The feature id for the '<em><b>Metodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__METODOS = 7;

	/**
	 * The feature id for the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__LISTA_RELACIONES = 8;

	/**
	 * The number of structural features of the '<em>MBS Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link diagramaAbstracta.impl.MBSMetodoImpl <em>MBS Metodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaAbstracta.impl.MBSMetodoImpl
	 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getMBSMetodo()
	 * @generated
	 */
	int MBS_METODO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_METODO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Modificador Acceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_METODO__MODIFICADOR_ACCESO = 1;

	/**
	 * The feature id for the '<em><b>Tipo Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_METODO__TIPO_RETORNO = 2;

	/**
	 * The feature id for the '<em><b>Semantica</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_METODO__SEMANTICA = 3;

	/**
	 * The feature id for the '<em><b>Lista Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_METODO__LISTA_PARAMETROS = 4;

	/**
	 * The number of structural features of the '<em>MBS Metodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_METODO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link diagramaAbstracta.impl.MBSAtributoImpl <em>MBS Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaAbstracta.impl.MBSAtributoImpl
	 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getMBSAtributo()
	 * @generated
	 */
	int MBS_ATRIBUTO = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_ATRIBUTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_ATRIBUTO__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Modificador Acesso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_ATRIBUTO__MODIFICADOR_ACESSO = 2;

	/**
	 * The feature id for the '<em><b>Valor Defecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_ATRIBUTO__VALOR_DEFECTO = 3;

	/**
	 * The feature id for the '<em><b>Constante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_ATRIBUTO__CONSTANTE = 4;

	/**
	 * The number of structural features of the '<em>MBS Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_ATRIBUTO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link diagramaAbstracta.impl.MBSParametroImpl <em>MBS Parametro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaAbstracta.impl.MBSParametroImpl
	 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getMBSParametro()
	 * @generated
	 */
	int MBS_PARAMETRO = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_PARAMETRO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_PARAMETRO__TIPO = 1;

	/**
	 * The number of structural features of the '<em>MBS Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_PARAMETRO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link diagramaAbstracta.impl.MBSRelacionImpl <em>MBS Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagramaAbstracta.impl.MBSRelacionImpl
	 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getMBSRelacion()
	 * @generated
	 */
	int MBS_RELACION = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__TIPO = 3;

	/**
	 * The feature id for the '<em><b>Multiplicida A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__MULTIPLICIDA_A = 4;

	/**
	 * The feature id for the '<em><b>Multiplicidad B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__MULTIPLICIDAD_B = 5;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__ROL_A = 6;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__ROL_B = 7;

	/**
	 * The feature id for the '<em><b>Navegabilidad A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__NAVEGABILIDAD_A = 8;

	/**
	 * The feature id for the '<em><b>Navegabilidad B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__NAVEGABILIDAD_B = 9;

	/**
	 * The number of structural features of the '<em>MBS Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION_FEATURE_COUNT = 10;


	/**
	 * Returns the meta object for class '{@link diagramaAbstracta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see diagramaAbstracta.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.ModelFactory#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramaAbstracta.ModelFactory#getNombre()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.ModelFactory#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see diagramaAbstracta.ModelFactory#getRuta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaAbstracta.ModelFactory#getListaPaquetes <em>Lista Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Paquetes</em>'.
	 * @see diagramaAbstracta.ModelFactory#getListaPaquetes()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaPaquetes();

	/**
	 * Returns the meta object for class '{@link diagramaAbstracta.MBSPaquete <em>MBS Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBS Paquete</em>'.
	 * @see diagramaAbstracta.MBSPaquete
	 * @generated
	 */
	EClass getMBSPaquete();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSPaquete#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramaAbstracta.MBSPaquete#getNombre()
	 * @see #getMBSPaquete()
	 * @generated
	 */
	EAttribute getMBSPaquete_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSPaquete#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see diagramaAbstracta.MBSPaquete#getRuta()
	 * @see #getMBSPaquete()
	 * @generated
	 */
	EAttribute getMBSPaquete_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaAbstracta.MBSPaquete#getListaClases <em>Lista Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Clases</em>'.
	 * @see diagramaAbstracta.MBSPaquete#getListaClases()
	 * @see #getMBSPaquete()
	 * @generated
	 */
	EReference getMBSPaquete_ListaClases();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaAbstracta.MBSPaquete#getListaPaquetes <em>Lista Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Paquetes</em>'.
	 * @see diagramaAbstracta.MBSPaquete#getListaPaquetes()
	 * @see #getMBSPaquete()
	 * @generated
	 */
	EReference getMBSPaquete_ListaPaquetes();

	/**
	 * Returns the meta object for class '{@link diagramaAbstracta.MBSClase <em>MBS Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBS Clase</em>'.
	 * @see diagramaAbstracta.MBSClase
	 * @generated
	 */
	EClass getMBSClase();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSClase#getIdClase <em>Id Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Clase</em>'.
	 * @see diagramaAbstracta.MBSClase#getIdClase()
	 * @see #getMBSClase()
	 * @generated
	 */
	EAttribute getMBSClase_IdClase();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSClase#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramaAbstracta.MBSClase#getNombre()
	 * @see #getMBSClase()
	 * @generated
	 */
	EAttribute getMBSClase_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSClase#getEstereotipo <em>Estereotipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estereotipo</em>'.
	 * @see diagramaAbstracta.MBSClase#getEstereotipo()
	 * @see #getMBSClase()
	 * @generated
	 */
	EAttribute getMBSClase_Estereotipo();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSClase#getModificadorAcceso <em>Modificador Acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modificador Acceso</em>'.
	 * @see diagramaAbstracta.MBSClase#getModificadorAcceso()
	 * @see #getMBSClase()
	 * @generated
	 */
	EAttribute getMBSClase_ModificadorAcceso();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSClase#isAbstracta <em>Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstracta</em>'.
	 * @see diagramaAbstracta.MBSClase#isAbstracta()
	 * @see #getMBSClase()
	 * @generated
	 */
	EAttribute getMBSClase_Abstracta();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSClase#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see diagramaAbstracta.MBSClase#getDescripcion()
	 * @see #getMBSClase()
	 * @generated
	 */
	EAttribute getMBSClase_Descripcion();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaAbstracta.MBSClase#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see diagramaAbstracta.MBSClase#getAtributos()
	 * @see #getMBSClase()
	 * @generated
	 */
	EReference getMBSClase_Atributos();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaAbstracta.MBSClase#getMetodos <em>Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metodos</em>'.
	 * @see diagramaAbstracta.MBSClase#getMetodos()
	 * @see #getMBSClase()
	 * @generated
	 */
	EReference getMBSClase_Metodos();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaAbstracta.MBSClase#getListaRelaciones <em>Lista Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Relaciones</em>'.
	 * @see diagramaAbstracta.MBSClase#getListaRelaciones()
	 * @see #getMBSClase()
	 * @generated
	 */
	EReference getMBSClase_ListaRelaciones();

	/**
	 * Returns the meta object for class '{@link diagramaAbstracta.MBSMetodo <em>MBS Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBS Metodo</em>'.
	 * @see diagramaAbstracta.MBSMetodo
	 * @generated
	 */
	EClass getMBSMetodo();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSMetodo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramaAbstracta.MBSMetodo#getNombre()
	 * @see #getMBSMetodo()
	 * @generated
	 */
	EAttribute getMBSMetodo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSMetodo#getModificadorAcceso <em>Modificador Acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modificador Acceso</em>'.
	 * @see diagramaAbstracta.MBSMetodo#getModificadorAcceso()
	 * @see #getMBSMetodo()
	 * @generated
	 */
	EAttribute getMBSMetodo_ModificadorAcceso();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSMetodo#getTipoRetorno <em>Tipo Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Retorno</em>'.
	 * @see diagramaAbstracta.MBSMetodo#getTipoRetorno()
	 * @see #getMBSMetodo()
	 * @generated
	 */
	EAttribute getMBSMetodo_TipoRetorno();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSMetodo#getSemantica <em>Semantica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantica</em>'.
	 * @see diagramaAbstracta.MBSMetodo#getSemantica()
	 * @see #getMBSMetodo()
	 * @generated
	 */
	EAttribute getMBSMetodo_Semantica();

	/**
	 * Returns the meta object for the containment reference list '{@link diagramaAbstracta.MBSMetodo#getListaParametros <em>Lista Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Parametros</em>'.
	 * @see diagramaAbstracta.MBSMetodo#getListaParametros()
	 * @see #getMBSMetodo()
	 * @generated
	 */
	EReference getMBSMetodo_ListaParametros();

	/**
	 * Returns the meta object for class '{@link diagramaAbstracta.MBSAtributo <em>MBS Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBS Atributo</em>'.
	 * @see diagramaAbstracta.MBSAtributo
	 * @generated
	 */
	EClass getMBSAtributo();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSAtributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramaAbstracta.MBSAtributo#getNombre()
	 * @see #getMBSAtributo()
	 * @generated
	 */
	EAttribute getMBSAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSAtributo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see diagramaAbstracta.MBSAtributo#getTipo()
	 * @see #getMBSAtributo()
	 * @generated
	 */
	EAttribute getMBSAtributo_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSAtributo#getModificadorAcesso <em>Modificador Acesso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modificador Acesso</em>'.
	 * @see diagramaAbstracta.MBSAtributo#getModificadorAcesso()
	 * @see #getMBSAtributo()
	 * @generated
	 */
	EAttribute getMBSAtributo_ModificadorAcesso();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSAtributo#getValorDefecto <em>Valor Defecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Defecto</em>'.
	 * @see diagramaAbstracta.MBSAtributo#getValorDefecto()
	 * @see #getMBSAtributo()
	 * @generated
	 */
	EAttribute getMBSAtributo_ValorDefecto();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSAtributo#isConstante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constante</em>'.
	 * @see diagramaAbstracta.MBSAtributo#isConstante()
	 * @see #getMBSAtributo()
	 * @generated
	 */
	EAttribute getMBSAtributo_Constante();

	/**
	 * Returns the meta object for class '{@link diagramaAbstracta.MBSParametro <em>MBS Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBS Parametro</em>'.
	 * @see diagramaAbstracta.MBSParametro
	 * @generated
	 */
	EClass getMBSParametro();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSParametro#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramaAbstracta.MBSParametro#getNombre()
	 * @see #getMBSParametro()
	 * @generated
	 */
	EAttribute getMBSParametro_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSParametro#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see diagramaAbstracta.MBSParametro#getTipo()
	 * @see #getMBSParametro()
	 * @generated
	 */
	EAttribute getMBSParametro_Tipo();

	/**
	 * Returns the meta object for class '{@link diagramaAbstracta.MBSRelacion <em>MBS Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBS Relacion</em>'.
	 * @see diagramaAbstracta.MBSRelacion
	 * @generated
	 */
	EClass getMBSRelacion();

	/**
	 * Returns the meta object for the reference '{@link diagramaAbstracta.MBSRelacion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see diagramaAbstracta.MBSRelacion#getSource()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EReference getMBSRelacion_Source();

	/**
	 * Returns the meta object for the reference '{@link diagramaAbstracta.MBSRelacion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see diagramaAbstracta.MBSRelacion#getTarget()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EReference getMBSRelacion_Target();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSRelacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagramaAbstracta.MBSRelacion#getNombre()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSRelacion#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see diagramaAbstracta.MBSRelacion#getTipo()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSRelacion#getMultiplicidaA <em>Multiplicida A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicida A</em>'.
	 * @see diagramaAbstracta.MBSRelacion#getMultiplicidaA()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_MultiplicidaA();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSRelacion#getMultiplicidadB <em>Multiplicidad B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad B</em>'.
	 * @see diagramaAbstracta.MBSRelacion#getMultiplicidadB()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_MultiplicidadB();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSRelacion#getRolA <em>Rol A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol A</em>'.
	 * @see diagramaAbstracta.MBSRelacion#getRolA()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_RolA();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSRelacion#getRolB <em>Rol B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol B</em>'.
	 * @see diagramaAbstracta.MBSRelacion#getRolB()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_RolB();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSRelacion#getNavegabilidadA <em>Navegabilidad A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegabilidad A</em>'.
	 * @see diagramaAbstracta.MBSRelacion#getNavegabilidadA()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_NavegabilidadA();

	/**
	 * Returns the meta object for the attribute '{@link diagramaAbstracta.MBSRelacion#getNavegabilidadB <em>Navegabilidad B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegabilidad B</em>'.
	 * @see diagramaAbstracta.MBSRelacion#getNavegabilidadB()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_NavegabilidadB();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiagramaAbstractaFactory getDiagramaAbstractaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link diagramaAbstracta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaAbstracta.impl.ModelFactoryImpl
		 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY__NOMBRE = eINSTANCE.getModelFactory_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY__RUTA = eINSTANCE.getModelFactory_Ruta();

		/**
		 * The meta object literal for the '<em><b>Lista Paquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_PAQUETES = eINSTANCE.getModelFactory_ListaPaquetes();

		/**
		 * The meta object literal for the '{@link diagramaAbstracta.impl.MBSPaqueteImpl <em>MBS Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaAbstracta.impl.MBSPaqueteImpl
		 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getMBSPaquete()
		 * @generated
		 */
		EClass MBS_PAQUETE = eINSTANCE.getMBSPaquete();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_PAQUETE__NOMBRE = eINSTANCE.getMBSPaquete_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_PAQUETE__RUTA = eINSTANCE.getMBSPaquete_Ruta();

		/**
		 * The meta object literal for the '<em><b>Lista Clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBS_PAQUETE__LISTA_CLASES = eINSTANCE.getMBSPaquete_ListaClases();

		/**
		 * The meta object literal for the '<em><b>Lista Paquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBS_PAQUETE__LISTA_PAQUETES = eINSTANCE.getMBSPaquete_ListaPaquetes();

		/**
		 * The meta object literal for the '{@link diagramaAbstracta.impl.MBSClaseImpl <em>MBS Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaAbstracta.impl.MBSClaseImpl
		 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getMBSClase()
		 * @generated
		 */
		EClass MBS_CLASE = eINSTANCE.getMBSClase();

		/**
		 * The meta object literal for the '<em><b>Id Clase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_CLASE__ID_CLASE = eINSTANCE.getMBSClase_IdClase();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_CLASE__NOMBRE = eINSTANCE.getMBSClase_Nombre();

		/**
		 * The meta object literal for the '<em><b>Estereotipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_CLASE__ESTEREOTIPO = eINSTANCE.getMBSClase_Estereotipo();

		/**
		 * The meta object literal for the '<em><b>Modificador Acceso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_CLASE__MODIFICADOR_ACCESO = eINSTANCE.getMBSClase_ModificadorAcceso();

		/**
		 * The meta object literal for the '<em><b>Abstracta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_CLASE__ABSTRACTA = eINSTANCE.getMBSClase_Abstracta();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_CLASE__DESCRIPCION = eINSTANCE.getMBSClase_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBS_CLASE__ATRIBUTOS = eINSTANCE.getMBSClase_Atributos();

		/**
		 * The meta object literal for the '<em><b>Metodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBS_CLASE__METODOS = eINSTANCE.getMBSClase_Metodos();

		/**
		 * The meta object literal for the '<em><b>Lista Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBS_CLASE__LISTA_RELACIONES = eINSTANCE.getMBSClase_ListaRelaciones();

		/**
		 * The meta object literal for the '{@link diagramaAbstracta.impl.MBSMetodoImpl <em>MBS Metodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaAbstracta.impl.MBSMetodoImpl
		 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getMBSMetodo()
		 * @generated
		 */
		EClass MBS_METODO = eINSTANCE.getMBSMetodo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_METODO__NOMBRE = eINSTANCE.getMBSMetodo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Modificador Acceso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_METODO__MODIFICADOR_ACCESO = eINSTANCE.getMBSMetodo_ModificadorAcceso();

		/**
		 * The meta object literal for the '<em><b>Tipo Retorno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_METODO__TIPO_RETORNO = eINSTANCE.getMBSMetodo_TipoRetorno();

		/**
		 * The meta object literal for the '<em><b>Semantica</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_METODO__SEMANTICA = eINSTANCE.getMBSMetodo_Semantica();

		/**
		 * The meta object literal for the '<em><b>Lista Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBS_METODO__LISTA_PARAMETROS = eINSTANCE.getMBSMetodo_ListaParametros();

		/**
		 * The meta object literal for the '{@link diagramaAbstracta.impl.MBSAtributoImpl <em>MBS Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaAbstracta.impl.MBSAtributoImpl
		 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getMBSAtributo()
		 * @generated
		 */
		EClass MBS_ATRIBUTO = eINSTANCE.getMBSAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_ATRIBUTO__NOMBRE = eINSTANCE.getMBSAtributo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_ATRIBUTO__TIPO = eINSTANCE.getMBSAtributo_Tipo();

		/**
		 * The meta object literal for the '<em><b>Modificador Acesso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_ATRIBUTO__MODIFICADOR_ACESSO = eINSTANCE.getMBSAtributo_ModificadorAcesso();

		/**
		 * The meta object literal for the '<em><b>Valor Defecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_ATRIBUTO__VALOR_DEFECTO = eINSTANCE.getMBSAtributo_ValorDefecto();

		/**
		 * The meta object literal for the '<em><b>Constante</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_ATRIBUTO__CONSTANTE = eINSTANCE.getMBSAtributo_Constante();

		/**
		 * The meta object literal for the '{@link diagramaAbstracta.impl.MBSParametroImpl <em>MBS Parametro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaAbstracta.impl.MBSParametroImpl
		 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getMBSParametro()
		 * @generated
		 */
		EClass MBS_PARAMETRO = eINSTANCE.getMBSParametro();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_PARAMETRO__NOMBRE = eINSTANCE.getMBSParametro_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_PARAMETRO__TIPO = eINSTANCE.getMBSParametro_Tipo();

		/**
		 * The meta object literal for the '{@link diagramaAbstracta.impl.MBSRelacionImpl <em>MBS Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagramaAbstracta.impl.MBSRelacionImpl
		 * @see diagramaAbstracta.impl.DiagramaAbstractaPackageImpl#getMBSRelacion()
		 * @generated
		 */
		EClass MBS_RELACION = eINSTANCE.getMBSRelacion();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBS_RELACION__SOURCE = eINSTANCE.getMBSRelacion_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBS_RELACION__TARGET = eINSTANCE.getMBSRelacion_Target();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_RELACION__NOMBRE = eINSTANCE.getMBSRelacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_RELACION__TIPO = eINSTANCE.getMBSRelacion_Tipo();

		/**
		 * The meta object literal for the '<em><b>Multiplicida A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_RELACION__MULTIPLICIDA_A = eINSTANCE.getMBSRelacion_MultiplicidaA();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_RELACION__MULTIPLICIDAD_B = eINSTANCE.getMBSRelacion_MultiplicidadB();

		/**
		 * The meta object literal for the '<em><b>Rol A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_RELACION__ROL_A = eINSTANCE.getMBSRelacion_RolA();

		/**
		 * The meta object literal for the '<em><b>Rol B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_RELACION__ROL_B = eINSTANCE.getMBSRelacion_RolB();

		/**
		 * The meta object literal for the '<em><b>Navegabilidad A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_RELACION__NAVEGABILIDAD_A = eINSTANCE.getMBSRelacion_NavegabilidadA();

		/**
		 * The meta object literal for the '<em><b>Navegabilidad B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_RELACION__NAVEGABILIDAD_B = eINSTANCE.getMBSRelacion_NavegabilidadB();

	}

} //DiagramaAbstractaPackage
