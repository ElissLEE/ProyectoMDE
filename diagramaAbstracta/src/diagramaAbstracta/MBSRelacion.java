/**
 */
package diagramaAbstracta;

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
 *   <li>{@link diagramaAbstracta.MBSRelacion#getSource <em>Source</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSRelacion#getTarget <em>Target</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSRelacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSRelacion#getTipo <em>Tipo</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSRelacion#getMultiplicidaA <em>Multiplicida A</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSRelacion#getMultiplicidadB <em>Multiplicidad B</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSRelacion#getRolA <em>Rol A</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSRelacion#getRolB <em>Rol B</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSRelacion#getNavegabilidadA <em>Navegabilidad A</em>}</li>
 *   <li>{@link diagramaAbstracta.MBSRelacion#getNavegabilidadB <em>Navegabilidad B</em>}</li>
 * </ul>
 *
 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSRelacion()
 * @model
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSRelacion_Source()
	 * @model
	 * @generated
	 */
	MBSClase getSource();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSRelacion#getSource <em>Source</em>}' reference.
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSRelacion_Target()
	 * @model
	 * @generated
	 */
	MBSClase getTarget();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSRelacion#getTarget <em>Target</em>}' reference.
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSRelacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSRelacion#getNombre <em>Nombre</em>}' attribute.
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSRelacion_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSRelacion#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicida A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicida A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicida A</em>' attribute.
	 * @see #setMultiplicidaA(String)
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSRelacion_MultiplicidaA()
	 * @model
	 * @generated
	 */
	String getMultiplicidaA();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSRelacion#getMultiplicidaA <em>Multiplicida A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicida A</em>' attribute.
	 * @see #getMultiplicidaA()
	 * @generated
	 */
	void setMultiplicidaA(String value);

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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSRelacion_MultiplicidadB()
	 * @model
	 * @generated
	 */
	String getMultiplicidadB();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSRelacion#getMultiplicidadB <em>Multiplicidad B</em>}' attribute.
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSRelacion_RolA()
	 * @model
	 * @generated
	 */
	String getRolA();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSRelacion#getRolA <em>Rol A</em>}' attribute.
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSRelacion_RolB()
	 * @model
	 * @generated
	 */
	String getRolB();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSRelacion#getRolB <em>Rol B</em>}' attribute.
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSRelacion_NavegabilidadA()
	 * @model
	 * @generated
	 */
	String getNavegabilidadA();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSRelacion#getNavegabilidadA <em>Navegabilidad A</em>}' attribute.
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
	 * @see diagramaAbstracta.DiagramaAbstractaPackage#getMBSRelacion_NavegabilidadB()
	 * @model
	 * @generated
	 */
	String getNavegabilidadB();

	/**
	 * Sets the value of the '{@link diagramaAbstracta.MBSRelacion#getNavegabilidadB <em>Navegabilidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navegabilidad B</em>' attribute.
	 * @see #getNavegabilidadB()
	 * @generated
	 */
	void setNavegabilidadB(String value);

} // MBSRelacion
