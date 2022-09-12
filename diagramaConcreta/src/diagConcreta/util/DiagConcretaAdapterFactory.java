/**
 */
package diagConcreta.util;

import diagConcreta.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see diagConcreta.DiagConcretaPackage
 * @generated
 */
public class DiagConcretaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagConcretaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagConcretaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DiagConcretaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagConcretaSwitch<Adapter> modelSwitch =
		new DiagConcretaSwitch<Adapter>() {
			@Override
			public Adapter caseModelFactory(ModelFactory object) {
				return createModelFactoryAdapter();
			}
			@Override
			public Adapter caseMBSDiagramaClases(MBSDiagramaClases object) {
				return createMBSDiagramaClasesAdapter();
			}
			@Override
			public Adapter caseMBSPaquete(MBSPaquete object) {
				return createMBSPaqueteAdapter();
			}
			@Override
			public Adapter caseMBSClase(MBSClase object) {
				return createMBSClaseAdapter();
			}
			@Override
			public Adapter caseMBSMetodo(MBSMetodo object) {
				return createMBSMetodoAdapter();
			}
			@Override
			public Adapter caseMBSAtributo(MBSAtributo object) {
				return createMBSAtributoAdapter();
			}
			@Override
			public Adapter caseMBSParametro(MBSParametro object) {
				return createMBSParametroAdapter();
			}
			@Override
			public Adapter caseMBSRelacion(MBSRelacion object) {
				return createMBSRelacionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link diagConcreta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagConcreta.ModelFactory
	 * @generated
	 */
	public Adapter createModelFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagConcreta.MBSDiagramaClases <em>MBS Diagrama Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagConcreta.MBSDiagramaClases
	 * @generated
	 */
	public Adapter createMBSDiagramaClasesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagConcreta.MBSPaquete <em>MBS Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagConcreta.MBSPaquete
	 * @generated
	 */
	public Adapter createMBSPaqueteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagConcreta.MBSClase <em>MBS Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagConcreta.MBSClase
	 * @generated
	 */
	public Adapter createMBSClaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagConcreta.MBSMetodo <em>MBS Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagConcreta.MBSMetodo
	 * @generated
	 */
	public Adapter createMBSMetodoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagConcreta.MBSAtributo <em>MBS Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagConcreta.MBSAtributo
	 * @generated
	 */
	public Adapter createMBSAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagConcreta.MBSParametro <em>MBS Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagConcreta.MBSParametro
	 * @generated
	 */
	public Adapter createMBSParametroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagConcreta.MBSRelacion <em>MBS Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagConcreta.MBSRelacion
	 * @generated
	 */
	public Adapter createMBSRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DiagConcretaAdapterFactory
