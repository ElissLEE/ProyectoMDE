/**
 */
package abstracta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBS Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.MBSContainment#getSource <em>Source</em>}</li>
 *   <li>{@link abstracta.MBSContainment#getTarget <em>Target</em>}</li>
 *   <li>{@link abstracta.MBSContainment#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.MBSContainment#getTipo <em>Tipo</em>}</li>
 *   <li>{@link abstracta.MBSContainment#getMultiplicidadA <em>Multiplicidad A</em>}</li>
 *   <li>{@link abstracta.MBSContainment#getMultiplicidadB <em>Multiplicidad B</em>}</li>
 *   <li>{@link abstracta.MBSContainment#getRolA <em>Rol A</em>}</li>
 *   <li>{@link abstracta.MBSContainment#getRolB <em>Rol B</em>}</li>
 *   <li>{@link abstracta.MBSContainment#getNavegabilidadA <em>Navegabilidad A</em>}</li>
 *   <li>{@link abstracta.MBSContainment#getNavegabilidadB <em>Navegabilidad B</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getMBSContainment()
 * @model
 * @generated
 */
public interface MBSContainment extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MBSClase)
	 * @see abstracta.AbstractaPackage#getMBSContainment_Source()
	 * @model
	 * @generated
	 */
	MBSClase getSource();

	/**
	 * Sets the value of the '{@link abstracta.MBSContainment#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MBSClase value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(MBSClase)
	 * @see abstracta.AbstractaPackage#getMBSContainment_Target()
	 * @model
	 * @generated
	 */
	MBSClase getTarget();

	/**
	 * Sets the value of the '{@link abstracta.MBSContainment#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MBSClase value);

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
	 * @see abstracta.AbstractaPackage#getMBSContainment_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.MBSContainment#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see abstracta.AbstractaPackage#getMBSContainment_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link abstracta.MBSContainment#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicidad A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad A</em>' attribute.
	 * @see #setMultiplicidadA(String)
	 * @see abstracta.AbstractaPackage#getMBSContainment_MultiplicidadA()
	 * @model
	 * @generated
	 */
	String getMultiplicidadA();

	/**
	 * Sets the value of the '{@link abstracta.MBSContainment#getMultiplicidadA <em>Multiplicidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad A</em>' attribute.
	 * @see #getMultiplicidadA()
	 * @generated
	 */
	void setMultiplicidadA(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicidad B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad B</em>' attribute.
	 * @see #setMultiplicidadB(String)
	 * @see abstracta.AbstractaPackage#getMBSContainment_MultiplicidadB()
	 * @model
	 * @generated
	 */
	String getMultiplicidadB();

	/**
	 * Sets the value of the '{@link abstracta.MBSContainment#getMultiplicidadB <em>Multiplicidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad B</em>' attribute.
	 * @see #getMultiplicidadB()
	 * @generated
	 */
	void setMultiplicidadB(String value);

	/**
	 * Returns the value of the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol A</em>' attribute.
	 * @see #setRolA(String)
	 * @see abstracta.AbstractaPackage#getMBSContainment_RolA()
	 * @model
	 * @generated
	 */
	String getRolA();

	/**
	 * Sets the value of the '{@link abstracta.MBSContainment#getRolA <em>Rol A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol A</em>' attribute.
	 * @see #getRolA()
	 * @generated
	 */
	void setRolA(String value);

	/**
	 * Returns the value of the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rol B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rol B</em>' attribute.
	 * @see #setRolB(String)
	 * @see abstracta.AbstractaPackage#getMBSContainment_RolB()
	 * @model
	 * @generated
	 */
	String getRolB();

	/**
	 * Sets the value of the '{@link abstracta.MBSContainment#getRolB <em>Rol B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rol B</em>' attribute.
	 * @see #getRolB()
	 * @generated
	 */
	void setRolB(String value);

	/**
	 * Returns the value of the '<em><b>Navegabilidad A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navegabilidad A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navegabilidad A</em>' attribute.
	 * @see #setNavegabilidadA(String)
	 * @see abstracta.AbstractaPackage#getMBSContainment_NavegabilidadA()
	 * @model
	 * @generated
	 */
	String getNavegabilidadA();

	/**
	 * Sets the value of the '{@link abstracta.MBSContainment#getNavegabilidadA <em>Navegabilidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navegabilidad A</em>' attribute.
	 * @see #getNavegabilidadA()
	 * @generated
	 */
	void setNavegabilidadA(String value);

	/**
	 * Returns the value of the '<em><b>Navegabilidad B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navegabilidad B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navegabilidad B</em>' attribute.
	 * @see #setNavegabilidadB(String)
	 * @see abstracta.AbstractaPackage#getMBSContainment_NavegabilidadB()
	 * @model
	 * @generated
	 */
	String getNavegabilidadB();

	/**
	 * Sets the value of the '{@link abstracta.MBSContainment#getNavegabilidadB <em>Navegabilidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navegabilidad B</em>' attribute.
	 * @see #getNavegabilidadB()
	 * @generated
	 */
	void setNavegabilidadB(String value);

} // MBSContainment
