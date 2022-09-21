/**
 */
package concreta;

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
 * @see concreta.ConcretaFactory
 * @model kind="package"
 * @generated
 */
public interface ConcretaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concreta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "concreta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "concreta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcretaPackage eINSTANCE = concreta.impl.ConcretaPackageImpl.init();

	/**
	 * The meta object id for the '{@link concreta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.ModelFactoryImpl
	 * @see concreta.impl.ConcretaPackageImpl#getModelFactory()
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
	 * The feature id for the '<em><b>Lista Diagramas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_DIAGRAMAS = 2;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link concreta.impl.MBSDiagramaClasesImpl <em>MBS Diagrama Clases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MBSDiagramaClasesImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMBSDiagramaClases()
	 * @generated
	 */
	int MBS_DIAGRAMA_CLASES = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_DIAGRAMA_CLASES__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_DIAGRAMA_CLASES__DESCRIPCION = 1;

	/**
	 * The feature id for the '<em><b>Lista Clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_DIAGRAMA_CLASES__LISTA_CLASES = 2;

	/**
	 * The feature id for the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_DIAGRAMA_CLASES__LISTA_RELACIONES = 3;

	/**
	 * The feature id for the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_DIAGRAMA_CLASES__LISTA_PAQUETES = 4;

	/**
	 * The number of structural features of the '<em>MBS Diagrama Clases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_DIAGRAMA_CLASES_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link concreta.impl.MBSPaqueteImpl <em>MBS Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MBSPaqueteImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMBSPaquete()
	 * @generated
	 */
	int MBS_PAQUETE = 2;

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
	 * The number of structural features of the '<em>MBS Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_PAQUETE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link concreta.impl.MBSClaseImpl <em>MBS Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MBSClaseImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMBSClase()
	 * @generated
	 */
	int MBS_CLASE = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Estereotipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__ESTEREOTIPO = 1;

	/**
	 * The feature id for the '<em><b>Modificador Acceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__MODIFICADOR_ACCESO = 2;

	/**
	 * The feature id for the '<em><b>Abstracta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__ABSTRACTA = 3;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__DESCRIPCION = 4;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE__RUTA = 5;

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
	 * The number of structural features of the '<em>MBS Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_CLASE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link concreta.impl.MBSMetodoImpl <em>MBS Metodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MBSMetodoImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMBSMetodo()
	 * @generated
	 */
	int MBS_METODO = 4;

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
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_METODO__RUTA = 3;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_METODO__PARAMETROS = 4;

	/**
	 * The number of structural features of the '<em>MBS Metodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_METODO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link concreta.impl.MBSAtributoImpl <em>MBS Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MBSAtributoImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMBSAtributo()
	 * @generated
	 */
	int MBS_ATRIBUTO = 5;

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
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_ATRIBUTO__RUTA = 5;

	/**
	 * The number of structural features of the '<em>MBS Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_ATRIBUTO_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link concreta.impl.MBSRelacionImpl <em>MBS Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concreta.impl.MBSRelacionImpl
	 * @see concreta.impl.ConcretaPackageImpl#getMBSRelacion()
	 * @generated
	 */
	int MBS_RELACION = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__MULTIPLICIDAD_A = 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__MULTIPLICIDAD_B = 3;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__ROL_A = 4;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__ROL_B = 5;

	/**
	 * The feature id for the '<em><b>Navegabilidad A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__NAVEGABILIDAD_A = 6;

	/**
	 * The feature id for the '<em><b>Navegabilidad B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__NAVEGABILIDAD_B = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__SOURCE = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION__TARGET = 9;

	/**
	 * The number of structural features of the '<em>MBS Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBS_RELACION_FEATURE_COUNT = 10;


	/**
	 * Returns the meta object for class '{@link concreta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see concreta.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link concreta.ModelFactory#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.ModelFactory#getNombre()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link concreta.ModelFactory#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see concreta.ModelFactory#getRuta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.ModelFactory#getListaDiagramas <em>Lista Diagramas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Diagramas</em>'.
	 * @see concreta.ModelFactory#getListaDiagramas()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaDiagramas();

	/**
	 * Returns the meta object for class '{@link concreta.MBSDiagramaClases <em>MBS Diagrama Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBS Diagrama Clases</em>'.
	 * @see concreta.MBSDiagramaClases
	 * @generated
	 */
	EClass getMBSDiagramaClases();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSDiagramaClases#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.MBSDiagramaClases#getNombre()
	 * @see #getMBSDiagramaClases()
	 * @generated
	 */
	EAttribute getMBSDiagramaClases_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSDiagramaClases#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see concreta.MBSDiagramaClases#getDescripcion()
	 * @see #getMBSDiagramaClases()
	 * @generated
	 */
	EAttribute getMBSDiagramaClases_Descripcion();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MBSDiagramaClases#getListaClases <em>Lista Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Clases</em>'.
	 * @see concreta.MBSDiagramaClases#getListaClases()
	 * @see #getMBSDiagramaClases()
	 * @generated
	 */
	EReference getMBSDiagramaClases_ListaClases();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MBSDiagramaClases#getListaRelaciones <em>Lista Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Relaciones</em>'.
	 * @see concreta.MBSDiagramaClases#getListaRelaciones()
	 * @see #getMBSDiagramaClases()
	 * @generated
	 */
	EReference getMBSDiagramaClases_ListaRelaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MBSDiagramaClases#getListaPaquetes <em>Lista Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Paquetes</em>'.
	 * @see concreta.MBSDiagramaClases#getListaPaquetes()
	 * @see #getMBSDiagramaClases()
	 * @generated
	 */
	EReference getMBSDiagramaClases_ListaPaquetes();

	/**
	 * Returns the meta object for class '{@link concreta.MBSPaquete <em>MBS Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBS Paquete</em>'.
	 * @see concreta.MBSPaquete
	 * @generated
	 */
	EClass getMBSPaquete();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSPaquete#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.MBSPaquete#getNombre()
	 * @see #getMBSPaquete()
	 * @generated
	 */
	EAttribute getMBSPaquete_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSPaquete#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see concreta.MBSPaquete#getRuta()
	 * @see #getMBSPaquete()
	 * @generated
	 */
	EAttribute getMBSPaquete_Ruta();

	/**
	 * Returns the meta object for class '{@link concreta.MBSClase <em>MBS Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBS Clase</em>'.
	 * @see concreta.MBSClase
	 * @generated
	 */
	EClass getMBSClase();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSClase#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.MBSClase#getNombre()
	 * @see #getMBSClase()
	 * @generated
	 */
	EAttribute getMBSClase_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSClase#getEstereotipo <em>Estereotipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estereotipo</em>'.
	 * @see concreta.MBSClase#getEstereotipo()
	 * @see #getMBSClase()
	 * @generated
	 */
	EAttribute getMBSClase_Estereotipo();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSClase#getModificadorAcceso <em>Modificador Acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modificador Acceso</em>'.
	 * @see concreta.MBSClase#getModificadorAcceso()
	 * @see #getMBSClase()
	 * @generated
	 */
	EAttribute getMBSClase_ModificadorAcceso();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSClase#isAbstracta <em>Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstracta</em>'.
	 * @see concreta.MBSClase#isAbstracta()
	 * @see #getMBSClase()
	 * @generated
	 */
	EAttribute getMBSClase_Abstracta();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSClase#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see concreta.MBSClase#getDescripcion()
	 * @see #getMBSClase()
	 * @generated
	 */
	EAttribute getMBSClase_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSClase#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see concreta.MBSClase#getRuta()
	 * @see #getMBSClase()
	 * @generated
	 */
	EAttribute getMBSClase_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MBSClase#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see concreta.MBSClase#getAtributos()
	 * @see #getMBSClase()
	 * @generated
	 */
	EReference getMBSClase_Atributos();

	/**
	 * Returns the meta object for the containment reference list '{@link concreta.MBSClase#getMetodos <em>Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metodos</em>'.
	 * @see concreta.MBSClase#getMetodos()
	 * @see #getMBSClase()
	 * @generated
	 */
	EReference getMBSClase_Metodos();

	/**
	 * Returns the meta object for class '{@link concreta.MBSMetodo <em>MBS Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBS Metodo</em>'.
	 * @see concreta.MBSMetodo
	 * @generated
	 */
	EClass getMBSMetodo();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSMetodo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.MBSMetodo#getNombre()
	 * @see #getMBSMetodo()
	 * @generated
	 */
	EAttribute getMBSMetodo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSMetodo#getModificadorAcceso <em>Modificador Acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modificador Acceso</em>'.
	 * @see concreta.MBSMetodo#getModificadorAcceso()
	 * @see #getMBSMetodo()
	 * @generated
	 */
	EAttribute getMBSMetodo_ModificadorAcceso();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSMetodo#getTipoRetorno <em>Tipo Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Retorno</em>'.
	 * @see concreta.MBSMetodo#getTipoRetorno()
	 * @see #getMBSMetodo()
	 * @generated
	 */
	EAttribute getMBSMetodo_TipoRetorno();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSMetodo#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see concreta.MBSMetodo#getRuta()
	 * @see #getMBSMetodo()
	 * @generated
	 */
	EAttribute getMBSMetodo_Ruta();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSMetodo#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parametros</em>'.
	 * @see concreta.MBSMetodo#getParametros()
	 * @see #getMBSMetodo()
	 * @generated
	 */
	EAttribute getMBSMetodo_Parametros();

	/**
	 * Returns the meta object for class '{@link concreta.MBSAtributo <em>MBS Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBS Atributo</em>'.
	 * @see concreta.MBSAtributo
	 * @generated
	 */
	EClass getMBSAtributo();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSAtributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.MBSAtributo#getNombre()
	 * @see #getMBSAtributo()
	 * @generated
	 */
	EAttribute getMBSAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSAtributo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see concreta.MBSAtributo#getTipo()
	 * @see #getMBSAtributo()
	 * @generated
	 */
	EAttribute getMBSAtributo_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSAtributo#getModificadorAcesso <em>Modificador Acesso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modificador Acesso</em>'.
	 * @see concreta.MBSAtributo#getModificadorAcesso()
	 * @see #getMBSAtributo()
	 * @generated
	 */
	EAttribute getMBSAtributo_ModificadorAcesso();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSAtributo#getValorDefecto <em>Valor Defecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Defecto</em>'.
	 * @see concreta.MBSAtributo#getValorDefecto()
	 * @see #getMBSAtributo()
	 * @generated
	 */
	EAttribute getMBSAtributo_ValorDefecto();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSAtributo#isConstante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constante</em>'.
	 * @see concreta.MBSAtributo#isConstante()
	 * @see #getMBSAtributo()
	 * @generated
	 */
	EAttribute getMBSAtributo_Constante();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSAtributo#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see concreta.MBSAtributo#getRuta()
	 * @see #getMBSAtributo()
	 * @generated
	 */
	EAttribute getMBSAtributo_Ruta();

	/**
	 * Returns the meta object for class '{@link concreta.MBSRelacion <em>MBS Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBS Relacion</em>'.
	 * @see concreta.MBSRelacion
	 * @generated
	 */
	EClass getMBSRelacion();

	/**
	 * Returns the meta object for the reference '{@link concreta.MBSRelacion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see concreta.MBSRelacion#getSource()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EReference getMBSRelacion_Source();

	/**
	 * Returns the meta object for the reference '{@link concreta.MBSRelacion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see concreta.MBSRelacion#getTarget()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EReference getMBSRelacion_Target();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSRelacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concreta.MBSRelacion#getNombre()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSRelacion#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see concreta.MBSRelacion#getTipo()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSRelacion#getMultiplicidadA <em>Multiplicidad A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad A</em>'.
	 * @see concreta.MBSRelacion#getMultiplicidadA()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_MultiplicidadA();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSRelacion#getMultiplicidadB <em>Multiplicidad B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad B</em>'.
	 * @see concreta.MBSRelacion#getMultiplicidadB()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_MultiplicidadB();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSRelacion#getRolA <em>Rol A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol A</em>'.
	 * @see concreta.MBSRelacion#getRolA()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_RolA();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSRelacion#getRolB <em>Rol B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol B</em>'.
	 * @see concreta.MBSRelacion#getRolB()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_RolB();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSRelacion#getNavegabilidadA <em>Navegabilidad A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegabilidad A</em>'.
	 * @see concreta.MBSRelacion#getNavegabilidadA()
	 * @see #getMBSRelacion()
	 * @generated
	 */
	EAttribute getMBSRelacion_NavegabilidadA();

	/**
	 * Returns the meta object for the attribute '{@link concreta.MBSRelacion#getNavegabilidadB <em>Navegabilidad B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegabilidad B</em>'.
	 * @see concreta.MBSRelacion#getNavegabilidadB()
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
	ConcretaFactory getConcretaFactory();

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
		 * The meta object literal for the '{@link concreta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.ModelFactoryImpl
		 * @see concreta.impl.ConcretaPackageImpl#getModelFactory()
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
		 * The meta object literal for the '<em><b>Lista Diagramas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_DIAGRAMAS = eINSTANCE.getModelFactory_ListaDiagramas();

		/**
		 * The meta object literal for the '{@link concreta.impl.MBSDiagramaClasesImpl <em>MBS Diagrama Clases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MBSDiagramaClasesImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMBSDiagramaClases()
		 * @generated
		 */
		EClass MBS_DIAGRAMA_CLASES = eINSTANCE.getMBSDiagramaClases();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_DIAGRAMA_CLASES__NOMBRE = eINSTANCE.getMBSDiagramaClases_Nombre();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_DIAGRAMA_CLASES__DESCRIPCION = eINSTANCE.getMBSDiagramaClases_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Lista Clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBS_DIAGRAMA_CLASES__LISTA_CLASES = eINSTANCE.getMBSDiagramaClases_ListaClases();

		/**
		 * The meta object literal for the '<em><b>Lista Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBS_DIAGRAMA_CLASES__LISTA_RELACIONES = eINSTANCE.getMBSDiagramaClases_ListaRelaciones();

		/**
		 * The meta object literal for the '<em><b>Lista Paquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBS_DIAGRAMA_CLASES__LISTA_PAQUETES = eINSTANCE.getMBSDiagramaClases_ListaPaquetes();

		/**
		 * The meta object literal for the '{@link concreta.impl.MBSPaqueteImpl <em>MBS Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MBSPaqueteImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMBSPaquete()
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
		 * The meta object literal for the '{@link concreta.impl.MBSClaseImpl <em>MBS Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MBSClaseImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMBSClase()
		 * @generated
		 */
		EClass MBS_CLASE = eINSTANCE.getMBSClase();

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
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_CLASE__RUTA = eINSTANCE.getMBSClase_Ruta();

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
		 * The meta object literal for the '{@link concreta.impl.MBSMetodoImpl <em>MBS Metodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MBSMetodoImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMBSMetodo()
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
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_METODO__RUTA = eINSTANCE.getMBSMetodo_Ruta();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_METODO__PARAMETROS = eINSTANCE.getMBSMetodo_Parametros();

		/**
		 * The meta object literal for the '{@link concreta.impl.MBSAtributoImpl <em>MBS Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MBSAtributoImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMBSAtributo()
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
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_ATRIBUTO__RUTA = eINSTANCE.getMBSAtributo_Ruta();

		/**
		 * The meta object literal for the '{@link concreta.impl.MBSRelacionImpl <em>MBS Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concreta.impl.MBSRelacionImpl
		 * @see concreta.impl.ConcretaPackageImpl#getMBSRelacion()
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
		 * The meta object literal for the '<em><b>Multiplicidad A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MBS_RELACION__MULTIPLICIDAD_A = eINSTANCE.getMBSRelacion_MultiplicidadA();

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

} //ConcretaPackage
