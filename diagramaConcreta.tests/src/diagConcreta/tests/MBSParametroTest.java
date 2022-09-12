/**
 */
package diagConcreta.tests;

import diagConcreta.DiagConcretaFactory;
import diagConcreta.MBSParametro;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MBS Parametro</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MBSParametroTest extends TestCase {

	/**
	 * The fixture for this MBS Parametro test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSParametro fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MBSParametroTest.class);
	}

	/**
	 * Constructs a new MBS Parametro test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSParametroTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this MBS Parametro test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MBSParametro fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this MBS Parametro test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSParametro getFixture() {
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
		setFixture(DiagConcretaFactory.eINSTANCE.createMBSParametro());
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

} //MBSParametroTest
