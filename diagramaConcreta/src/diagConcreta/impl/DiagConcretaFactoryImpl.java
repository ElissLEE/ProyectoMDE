/**
 */
package diagConcreta.impl;

import diagConcreta.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagConcretaFactoryImpl extends EFactoryImpl implements DiagConcretaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiagConcretaFactory init() {
		try {
			DiagConcretaFactory theDiagConcretaFactory = (DiagConcretaFactory)EPackage.Registry.INSTANCE.getEFactory(DiagConcretaPackage.eNS_URI);
			if (theDiagConcretaFactory != null) {
				return theDiagConcretaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiagConcretaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagConcretaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DiagConcretaPackage.MODEL_FACTORY: return createModelFactory();
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES: return createMBSDiagramaClases();
			case DiagConcretaPackage.MBS_PAQUETE: return createMBSPaquete();
			case DiagConcretaPackage.MBS_CLASE: return createMBSClase();
			case DiagConcretaPackage.MBS_METODO: return createMBSMetodo();
			case DiagConcretaPackage.MBS_ATRIBUTO: return createMBSAtributo();
			case DiagConcretaPackage.MBS_PARAMETRO: return createMBSParametro();
			case DiagConcretaPackage.MBS_RELACION: return createMBSRelacion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSDiagramaClases createMBSDiagramaClases() {
		MBSDiagramaClasesImpl mbsDiagramaClases = new MBSDiagramaClasesImpl();
		return mbsDiagramaClases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSPaquete createMBSPaquete() {
		MBSPaqueteImpl mbsPaquete = new MBSPaqueteImpl();
		return mbsPaquete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSClase createMBSClase() {
		MBSClaseImpl mbsClase = new MBSClaseImpl();
		return mbsClase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSMetodo createMBSMetodo() {
		MBSMetodoImpl mbsMetodo = new MBSMetodoImpl();
		return mbsMetodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSAtributo createMBSAtributo() {
		MBSAtributoImpl mbsAtributo = new MBSAtributoImpl();
		return mbsAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSParametro createMBSParametro() {
		MBSParametroImpl mbsParametro = new MBSParametroImpl();
		return mbsParametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSRelacion createMBSRelacion() {
		MBSRelacionImpl mbsRelacion = new MBSRelacionImpl();
		return mbsRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagConcretaPackage getDiagConcretaPackage() {
		return (DiagConcretaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiagConcretaPackage getPackage() {
		return DiagConcretaPackage.eINSTANCE;
	}

} //DiagConcretaFactoryImpl
