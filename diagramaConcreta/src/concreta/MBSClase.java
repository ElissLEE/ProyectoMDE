/**
 */
package concreta;

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
 *   <li>{@link concreta.MBSClase#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.MBSClase#getEstereotipo <em>Estereotipo</em>}</li>
 *   <li>{@link concreta.MBSClase#getModificadorAcceso <em>Modificador Acceso</em>}</li>
 *   <li>{@link concreta.MBSClase#isAbstracta <em>Abstracta</em>}</li>
 *   <li>{@link concreta.MBSClase#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link concreta.MBSClase#getRuta <em>Ruta</em>}</li>
 *   <li>{@link concreta.MBSClase#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link concreta.MBSClase#getMetodos <em>Metodos</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMBSClase()
 * @model annotation="gmf.node label='nombre' label.layout='center' size='150,150' color='240,255,255'"
 * @generated
 */
public interface MBSClase extends EObject {
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
	 * @see concreta.ConcretaPackage#getMBSClase_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.MBSClase#getNombre <em>Nombre</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMBSClase_Estereotipo()
	 * @model
	 * @generated
	 */
	String getEstereotipo();

	/**
	 * Sets the value of the '{@link concreta.MBSClase#getEstereotipo <em>Estereotipo</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMBSClase_ModificadorAcceso()
	 * @model
	 * @generated
	 */
	String getModificadorAcceso();

	/**
	 * Sets the value of the '{@link concreta.MBSClase#getModificadorAcceso <em>Modificador Acceso</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMBSClase_Abstracta()
	 * @model
	 * @generated
	 */
	boolean isAbstracta();

	/**
	 * Sets the value of the '{@link concreta.MBSClase#isAbstracta <em>Abstracta</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMBSClase_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link concreta.MBSClase#getDescripcion <em>Descripcion</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMBSClase_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link concreta.MBSClase#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MBSAtributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMBSClase_Atributos()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	EList<MBSAtributo> getAtributos();

	/**
	 * Returns the value of the '<em><b>Metodos</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MBSMetodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodos</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMBSClase_Metodos()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	EList<MBSMetodo> getMetodos();

} // MBSClase
