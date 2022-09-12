/**
 */
package diagramaAbstracta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see diagramaAbstracta.DiagramaAbstractaPackage
 * @generated
 */
public interface DiagramaAbstractaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramaAbstractaFactory eINSTANCE = diagramaAbstracta.impl.DiagramaAbstractaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory</em>'.
	 * @generated
	 */
	ModelFactory createModelFactory();

	/**
	 * Returns a new object of class '<em>MBS Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MBS Paquete</em>'.
	 * @generated
	 */
	MBSPaquete createMBSPaquete();

	/**
	 * Returns a new object of class '<em>MBS Clase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MBS Clase</em>'.
	 * @generated
	 */
	MBSClase createMBSClase();

	/**
	 * Returns a new object of class '<em>MBS Metodo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MBS Metodo</em>'.
	 * @generated
	 */
	MBSMetodo createMBSMetodo();

	/**
	 * Returns a new object of class '<em>MBS Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MBS Atributo</em>'.
	 * @generated
	 */
	MBSAtributo createMBSAtributo();

	/**
	 * Returns a new object of class '<em>MBS Parametro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MBS Parametro</em>'.
	 * @generated
	 */
	MBSParametro createMBSParametro();

	/**
	 * Returns a new object of class '<em>MBS Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MBS Relacion</em>'.
	 * @generated
	 */
	MBSRelacion createMBSRelacion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiagramaAbstractaPackage getDiagramaAbstractaPackage();

} //DiagramaAbstractaFactory
