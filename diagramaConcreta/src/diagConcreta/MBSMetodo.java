/**
 */
package diagConcreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBS Metodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagConcreta.MBSMetodo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagConcreta.MBSMetodo#isStatic <em>Static</em>}</li>
 *   <li>{@link diagConcreta.MBSMetodo#getModificadorAcceso <em>Modificador Acceso</em>}</li>
 *   <li>{@link diagConcreta.MBSMetodo#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link diagConcreta.MBSMetodo#getSemantica <em>Semantica</em>}</li>
 *   <li>{@link diagConcreta.MBSMetodo#getListaParametros <em>Lista Parametros</em>}</li>
 * </ul>
 *
 * @see diagConcreta.DiagConcretaPackage#getMBSMetodo()
 * @model annotation="gmf.node label='nombre' color='240,255,255' size='150,15' margin='0' border.color='255,255,255'"
 * @generated
 */
public interface MBSMetodo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see diagConcreta.DiagConcretaPackage#getMBSMetodo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagConcreta.MBSMetodo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see diagConcreta.DiagConcretaPackage#getMBSMetodo_Static()
	 * @model
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link diagConcreta.MBSMetodo#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Modificador Acceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modificador Acceso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modificador Acceso</em>' attribute.
	 * @see #setModificadorAcceso(String)
	 * @see diagConcreta.DiagConcretaPackage#getMBSMetodo_ModificadorAcceso()
	 * @model
	 * @generated
	 */
	String getModificadorAcceso();

	/**
	 * Sets the value of the '{@link diagConcreta.MBSMetodo#getModificadorAcceso <em>Modificador Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modificador Acceso</em>' attribute.
	 * @see #getModificadorAcceso()
	 * @generated
	 */
	void setModificadorAcceso(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Retorno</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Retorno</em>' attribute.
	 * @see #setTipoRetorno(String)
	 * @see diagConcreta.DiagConcretaPackage#getMBSMetodo_TipoRetorno()
	 * @model
	 * @generated
	 */
	String getTipoRetorno();

	/**
	 * Sets the value of the '{@link diagConcreta.MBSMetodo#getTipoRetorno <em>Tipo Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Retorno</em>' attribute.
	 * @see #getTipoRetorno()
	 * @generated
	 */
	void setTipoRetorno(String value);

	/**
	 * Returns the value of the '<em><b>Semantica</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantica</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantica</em>' attribute.
	 * @see #setSemantica(String)
	 * @see diagConcreta.DiagConcretaPackage#getMBSMetodo_Semantica()
	 * @model
	 * @generated
	 */
	String getSemantica();

	/**
	 * Sets the value of the '{@link diagConcreta.MBSMetodo#getSemantica <em>Semantica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantica</em>' attribute.
	 * @see #getSemantica()
	 * @generated
	 */
	void setSemantica(String value);

	/**
	 * Returns the value of the '<em><b>Lista Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link diagConcreta.MBSParametro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Parametros</em>' containment reference list.
	 * @see diagConcreta.DiagConcretaPackage#getMBSMetodo_ListaParametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBSParametro> getListaParametros();

} // MBSMetodo