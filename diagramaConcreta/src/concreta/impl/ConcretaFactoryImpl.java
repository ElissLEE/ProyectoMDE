/**
 */
package concreta.impl;

import concreta.*;

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
public class ConcretaFactoryImpl extends EFactoryImpl implements ConcretaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcretaFactory init() {
		try {
			ConcretaFactory theConcretaFactory = (ConcretaFactory)EPackage.Registry.INSTANCE.getEFactory(ConcretaPackage.eNS_URI);
			if (theConcretaFactory != null) {
				return theConcretaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConcretaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretaFactoryImpl() {
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
			case ConcretaPackage.MODEL_FACTORY: return createModelFactory();
			case ConcretaPackage.MBS_DIAGRAMA_CLASES: return createMBSDiagramaClases();
			case ConcretaPackage.MBS_PAQUETE: return createMBSPaquete();
			case ConcretaPackage.MBS_CLASE: return createMBSClase();
			case ConcretaPackage.MBS_METODO: return createMBSMetodo();
			case ConcretaPackage.MBS_ATRIBUTO: return createMBSAtributo();
			case ConcretaPackage.MBS_RELACION: return createMBSRelacion();
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
	public MBSRelacion createMBSRelacion() {
		MBSRelacionImpl mbsRelacion = new MBSRelacionImpl();
		return mbsRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretaPackage getConcretaPackage() {
		return (ConcretaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConcretaPackage getPackage() {
		return ConcretaPackage.eINSTANCE;
	}

} //ConcretaFactoryImpl
