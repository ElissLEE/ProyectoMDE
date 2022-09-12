/**
 */
package diagConcreta.tests;

import diagConcreta.DiagConcretaFactory;
import diagConcreta.MBSMetodo;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MBS Metodo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MBSMetodoTest extends TestCase {

	/**
	 * The fixture for this MBS Metodo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSMetodo fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MBSMetodoTest.class);
	}

	/**
	 * Constructs a new MBS Metodo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSMetodoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this MBS Metodo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MBSMetodo fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this MBS Metodo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSMetodo getFixture() {
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
		setFixture(DiagConcretaFactory.eINSTANCE.createMBSMetodo());
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

} //MBSMetodoTest
