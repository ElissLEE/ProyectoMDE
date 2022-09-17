/**
 */
package concreta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBS Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.MBSRelacion#getSource <em>Source</em>}</li>
 *   <li>{@link concreta.MBSRelacion#getTarget <em>Target</em>}</li>
 *   <li>{@link concreta.MBSRelacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.MBSRelacion#getTipo <em>Tipo</em>}</li>
 *   <li>{@link concreta.MBSRelacion#getMultiplicidadA <em>Multiplicidad A</em>}</li>
 *   <li>{@link concreta.MBSRelacion#getMultiplicidadB <em>Multiplicidad B</em>}</li>
 *   <li>{@link concreta.MBSRelacion#getRolA <em>Rol A</em>}</li>
 *   <li>{@link concreta.MBSRelacion#getRolB <em>Rol B</em>}</li>
 *   <li>{@link concreta.MBSRelacion#getNavegabilidadA <em>Navegabilidad A</em>}</li>
 *   <li>{@link concreta.MBSRelacion#getNavegabilidadB <em>Navegabilidad B</em>}</li>
 *   <li>{@link concreta.MBSRelacion#getLabelName <em>Label Name</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMBSRelacion()
 * @model annotation="gmf.link source='source' target='target' style='solid' width='2' label='labelName'"
 * @generated
 */
public interface MBSRelacion extends EObject {
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
	 * @see concreta.ConcretaPackage#getMBSRelacion_Source()
	 * @model
	 * @generated
	 */
	MBSClase getSource();

	/**
	 * Sets the value of the '{@link concreta.MBSRelacion#getSource <em>Source</em>}' reference.
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
	 * @see concreta.ConcretaPackage#getMBSRelacion_Target()
	 * @model
	 * @generated
	 */
	MBSClase getTarget();

	/**
	 * Sets the value of the '{@link concreta.MBSRelacion#getTarget <em>Target</em>}' reference.
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
	 * @see concreta.ConcretaPackage#getMBSRelacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.MBSRelacion#getNombre <em>Nombre</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMBSRelacion_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link concreta.MBSRelacion#getTipo <em>Tipo</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMBSRelacion_MultiplicidadA()
	 * @model
	 * @generated
	 */
	String getMultiplicidadA();

	/**
	 * Sets the value of the '{@link concreta.MBSRelacion#getMultiplicidadA <em>Multiplicidad A</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMBSRelacion_MultiplicidadB()
	 * @model
	 * @generated
	 */
	String getMultiplicidadB();

	/**
	 * Sets the value of the '{@link concreta.MBSRelacion#getMultiplicidadB <em>Multiplicidad B</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMBSRelacion_RolA()
	 * @model
	 * @generated
	 */
	String getRolA();

	/**
	 * Sets the value of the '{@link concreta.MBSRelacion#getRolA <em>Rol A</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMBSRelacion_RolB()
	 * @model
	 * @generated
	 */
	String getRolB();

	/**
	 * Sets the value of the '{@link concreta.MBSRelacion#getRolB <em>Rol B</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMBSRelacion_NavegabilidadA()
	 * @model
	 * @generated
	 */
	String getNavegabilidadA();

	/**
	 * Sets the value of the '{@link concreta.MBSRelacion#getNavegabilidadA <em>Navegabilidad A</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMBSRelacion_NavegabilidadB()
	 * @model
	 * @generated
	 */
	String getNavegabilidadB();

	/**
	 * Sets the value of the '{@link concreta.MBSRelacion#getNavegabilidadB <em>Navegabilidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navegabilidad B</em>' attribute.
	 * @see #getNavegabilidadB()
	 * @generated
	 */
	void setNavegabilidadB(String value);

	/**
	 * Returns the value of the '<em><b>Label Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Name</em>' attribute.
	 * @see #setLabelName(String)
	 * @see concreta.ConcretaPackage#getMBSRelacion_LabelName()
	 * @model
	 * @generated
	 */
	String getLabelName();

	/**
	 * Sets the value of the '{@link concreta.MBSRelacion#getLabelName <em>Label Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Name</em>' attribute.
	 * @see #getLabelName()
	 * @generated
	 */
	void setLabelName(String value);

} // MBSRelacion
