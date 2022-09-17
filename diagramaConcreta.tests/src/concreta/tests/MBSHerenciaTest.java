/**
 */
package concreta.tests;

import concreta.ConcretaFactory;
import concreta.MBSHerencia;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MBS Herencia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MBSHerenciaTest extends TestCase {

	/**
	 * The fixture for this MBS Herencia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSHerencia fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MBSHerenciaTest.class);
	}

	/**
	 * Constructs a new MBS Herencia test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSHerenciaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this MBS Herencia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MBSHerencia fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this MBS Herencia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSHerencia getFixture() {
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
		setFixture(ConcretaFactory.eINSTANCE.createMBSHerencia());
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

} //MBSHerenciaTest
