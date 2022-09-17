/**
 */
package concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBS Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.MBSDiagramaClases#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.MBSDiagramaClases#getIdClase <em>Id Clase</em>}</li>
 *   <li>{@link concreta.MBSDiagramaClases#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link concreta.MBSDiagramaClases#getListaClases <em>Lista Clases</em>}</li>
 *   <li>{@link concreta.MBSDiagramaClases#getListaRelaciones <em>Lista Relaciones</em>}</li>
 *   <li>{@link concreta.MBSDiagramaClases#getListaRelacionesHerencia <em>Lista Relaciones Herencia</em>}</li>
 *   <li>{@link concreta.MBSDiagramaClases#getListaRelacionesContainment <em>Lista Relaciones Containment</em>}</li>
 *   <li>{@link concreta.MBSDiagramaClases#getListaPaquetes <em>Lista Paquetes</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMBSDiagramaClases()
 * @model
 * @generated
 */
public interface MBSDiagramaClases extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Clase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Clase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Clase</em>' attribute.
	 * @see #setIdClase(String)
	 * @see concreta.ConcretaPackage#getMBSDiagramaClases_IdClase()
	 * @model
	 * @generated
	 */
	String getIdClase();

	/**
	 * Sets the value of the '{@link concreta.MBSDiagramaClases#getIdClase <em>Id Clase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Clase</em>' attribute.
	 * @see #getIdClase()
	 * @generated
	 */
	void setIdClase(String value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see concreta.ConcretaPackage#getMBSDiagramaClases_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.MBSDiagramaClases#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see concreta.ConcretaPackage#getMBSDiagramaClases_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link concreta.MBSDiagramaClases#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Lista Clases</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MBSClase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Clases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Clases</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMBSDiagramaClases_ListaClases()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBSClase> getListaClases();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MBSRelacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Relaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMBSDiagramaClases_ListaRelaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBSRelacion> getListaRelaciones();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones Herencia</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MBSHerencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Relaciones Herencia</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones Herencia</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMBSDiagramaClases_ListaRelacionesHerencia()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBSHerencia> getListaRelacionesHerencia();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones Containment</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MBSContainment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Relaciones Containment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones Containment</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMBSDiagramaClases_ListaRelacionesContainment()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBSContainment> getListaRelacionesContainment();

	/**
	 * Returns the value of the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MBSPaquete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Paquetes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Paquetes</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMBSDiagramaClases_ListaPaquetes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBSPaquete> getListaPaquetes();

} // MBSDiagramaClases