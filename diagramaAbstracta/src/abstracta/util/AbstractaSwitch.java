/**
 */
package abstracta.util;

import abstracta.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaPackage
 * @generated
 */
public class AbstractaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaSwitch() {
		if (modelPackage == null) {
			modelPackage = AbstractaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AbstractaPackage.MODEL_FACTORY: {
				ModelFactory modelFactory = (ModelFactory)theEObject;
				T result = caseModelFactory(modelFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.MBS_PAQUETE: {
				MBSPaquete mbsPaquete = (MBSPaquete)theEObject;
				T result = caseMBSPaquete(mbsPaquete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.MBS_CLASE: {
				MBSClase mbsClase = (MBSClase)theEObject;
				T result = caseMBSClase(mbsClase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.MBS_METODO: {
				MBSMetodo mbsMetodo = (MBSMetodo)theEObject;
				T result = caseMBSMetodo(mbsMetodo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.MBS_ATRIBUTO: {
				MBSAtributo mbsAtributo = (MBSAtributo)theEObject;
				T result = caseMBSAtributo(mbsAtributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.MBS_PARAMETRO: {
				MBSParametro mbsParametro = (MBSParametro)theEObject;
				T result = caseMBSParametro(mbsParametro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.MBS_RELACION: {
				MBSRelacion mbsRelacion = (MBSRelacion)theEObject;
				T result = caseMBSRelacion(mbsRelacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.MBS_HERENCIA: {
				MBSHerencia mbsHerencia = (MBSHerencia)theEObject;
				T result = caseMBSHerencia(mbsHerencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.MBS_CONTAINMENT: {
				MBSContainment mbsContainment = (MBSContainment)theEObject;
				T result = caseMBSContainment(mbsContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFactory(ModelFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBS Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBS Paquete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBSPaquete(MBSPaquete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBS Clase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBS Clase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBSClase(MBSClase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBS Metodo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBS Metodo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBSMetodo(MBSMetodo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBS Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBS Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBSAtributo(MBSAtributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBS Parametro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBS Parametro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBSParametro(MBSParametro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBS Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBS Relacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBSRelacion(MBSRelacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBS Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBS Herencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBSHerencia(MBSHerencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBS Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBS Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBSContainment(MBSContainment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AbstractaSwitch
