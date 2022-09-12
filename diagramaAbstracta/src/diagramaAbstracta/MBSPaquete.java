/**
 */
package diagramaAbstracta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBS Paquete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaAbstracta.MBSPaquete#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSPaquete#getRuta <em>Ruta</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSPaquete#getListaClases <em>Lista Clases</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSPaquete#getListaPaquetes <em>Lista Paquetes</em>}</li>
 * </ul>
 *
 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSPaquete()
 * @model
 * @generated
 */
public interface MBSPaquete extends EObject {
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSPaquete_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSPaquete#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruta</em>' attribute.
	 * @see #setRuta(String)
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSPaquete_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSPaquete#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * Returns the value of the '<em><b>Lista Clases</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaAbstracta.MBSClase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Clases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Clases</em>' containment reference list.
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSPaquete_ListaClases()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBSClase> getListaClases();

	/**
	 * Returns the value of the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaAbstracta.MBSPaquete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Paquetes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Paquetes</em>' containment reference list.
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSPaquete_ListaPaquetes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBSPaquete> getListaPaquetes();

} // MBSPaquete
