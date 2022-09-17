/**
 */
package concreta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBS Herencia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.MBSHerencia#getSource <em>Source</em>}</li>
 *   <li>{@link concreta.MBSHerencia#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMBSHerencia()
 * @model annotation="gmf.link source='source' target='target' style='dot' width='1' target.decoration='closedarrow'"
 * @generated
 */
public interface MBSHerencia extends EObject {
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
	 * @see concreta.ConcretaPackage#getMBSHerencia_Source()
	 * @model
	 * @generated
	 */
	MBSClase getSource();

	/**
	 * Sets the value of the '{@link concreta.MBSHerencia#getSource <em>Source</em>}' reference.
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
	 * @see concreta.ConcretaPackage#getMBSHerencia_Target()
	 * @model
	 * @generated
	 */
	MBSClase getTarget();

	/**
	 * Sets the value of the '{@link concreta.MBSHerencia#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MBSClase value);

} // MBSHerencia
