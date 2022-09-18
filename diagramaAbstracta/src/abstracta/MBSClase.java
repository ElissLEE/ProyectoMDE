/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBS Clase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.MBSClase#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.MBSClase#getIdClase <em>Id Clase</em>}</li>
 *   <li>{@link abstracta.MBSClase#getEstereotipo <em>Estereotipo</em>}</li>
 *   <li>{@link abstracta.MBSClase#getModificadorAcceso <em>Modificador Acceso</em>}</li>
 *   <li>{@link abstracta.MBSClase#isAbstracta <em>Abstracta</em>}</li>
 *   <li>{@link abstracta.MBSClase#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link abstracta.MBSClase#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracta.MBSClase#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link abstracta.MBSClase#getMetodos <em>Metodos</em>}</li>
 *   <li>{@link abstracta.MBSClase#getListaRelaciones <em>Lista Relaciones</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getMBSClase()
 * @model
 * @generated
 */
public interface MBSClase extends EObject {
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
	 * @see abstracta.AbstractaPackage#getMBSClase_IdClase()
	 * @model
	 * @generated
	 */
	String getIdClase();

	/**
	 * Sets the value of the '{@link abstracta.MBSClase#getIdClase <em>Id Clase</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getMBSClase_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.MBSClase#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Estereotipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estereotipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estereotipo</em>' attribute.
	 * @see #setEstereotipo(String)
	 * @see abstracta.AbstractaPackage#getMBSClase_Estereotipo()
	 * @model
	 * @generated
	 */
	String getEstereotipo();

	/**
	 * Sets the value of the '{@link abstracta.MBSClase#getEstereotipo <em>Estereotipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estereotipo</em>' attribute.
	 * @see #getEstereotipo()
	 * @generated
	 */
	void setEstereotipo(String value);

	/**
	 * Returns the value of the '<em><b>Modificador Acceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modificador Acceso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modificador Acceso</em>' attribute.
	 * @see #setModificadorAcceso(String)
	 * @see abstracta.AbstractaPackage#getMBSClase_ModificadorAcceso()
	 * @model
	 * @generated
	 */
	String getModificadorAcceso();

	/**
	 * Sets the value of the '{@link abstracta.MBSClase#getModificadorAcceso <em>Modificador Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modificador Acceso</em>' attribute.
	 * @see #getModificadorAcceso()
	 * @generated
	 */
	void setModificadorAcceso(String value);

	/**
	 * Returns the value of the '<em><b>Abstracta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstracta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstracta</em>' attribute.
	 * @see #setAbstracta(boolean)
	 * @see abstracta.AbstractaPackage#getMBSClase_Abstracta()
	 * @model
	 * @generated
	 */
	boolean isAbstracta();

	/**
	 * Sets the value of the '{@link abstracta.MBSClase#isAbstracta <em>Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstracta</em>' attribute.
	 * @see #isAbstracta()
	 * @generated
	 */
	void setAbstracta(boolean value);

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
	 * @see abstracta.AbstractaPackage#getMBSClase_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link abstracta.MBSClase#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

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
	 * @see abstracta.AbstractaPackage#getMBSClase_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link abstracta.MBSClase#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.MBSAtributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getMBSClase_Atributos()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBSAtributo> getAtributos();

	/**
	 * Returns the value of the '<em><b>Metodos</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.MBSMetodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodos</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getMBSClase_Metodos()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBSMetodo> getMetodos();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.MBSRelacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Relaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getMBSClase_ListaRelaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBSRelacion> getListaRelaciones();

} // MBSClase
