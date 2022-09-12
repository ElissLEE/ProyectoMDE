/**
 */
package diagramaAbstracta.impl;

import diagramaAbstracta.*;

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
public class DiagramaAbstractaFactoryImpl extends EFactoryImpl implements DiagramaAbstractaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiagramaAbstractaFactory init() {
		try {
			DiagramaAbstractaFactory theDiagramaAbstractaFactory = (DiagramaAbstractaFactory)EPackage.Registry.INSTANCE.getEFactory(DiagramaAbstractaPackage.eNS_URI);
			if (theDiagramaAbstractaFactory != null) {
				return theDiagramaAbstractaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiagramaAbstractaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramaAbstractaFactoryImpl() {
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
			case DiagramaAbstractaPackage.MODEL_FACTORY: return createModelFactory();
			case DiagramaAbstractaPackage.MBS_PAQUETE: return createMBSPaquete();
			case DiagramaAbstractaPackage.MBS_CLASE: return createMBSClase();
			case DiagramaAbstractaPackage.MBS_METODO: return createMBSMetodo();
			case DiagramaAbstractaPackage.MBS_ATRIBUTO: return createMBSAtributo();
			case DiagramaAbstractaPackage.MBS_PARAMETRO: return createMBSParametro();
			case DiagramaAbstractaPackage.MBS_RELACION: return createMBSRelacion();
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
	public DiagramaAbstractaPackage getDiagramaAbstractaPackage() {
		return (DiagramaAbstractaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiagramaAbstractaPackage getPackage() {
		return DiagramaAbstractaPackage.eINSTANCE;
	}

} //DiagramaAbstractaFactoryImpl
