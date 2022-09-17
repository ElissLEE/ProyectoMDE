/**
 */
package concreta.tests;

import concreta.ConcretaFactory;
import concreta.MBSPaquete;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MBS Paquete</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MBSPaqueteTest extends TestCase {

	/**
	 * The fixture for this MBS Paquete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSPaquete fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MBSPaqueteTest.class);
	}

	/**
	 * Constructs a new MBS Paquete test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSPaqueteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this MBS Paquete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MBSPaquete fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this MBS Paquete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSPaquete getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConcretaFactory.eINSTANCE.createMBSPaquete());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MBSPaqueteTest
