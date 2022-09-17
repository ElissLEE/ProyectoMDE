/**
 */
package concreta;

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
 *   <li>{@link concreta.MBSMetodo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.MBSMetodo#getModificadorAcceso <em>Modificador Acceso</em>}</li>
 *   <li>{@link concreta.MBSMetodo#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link concreta.MBSMetodo#getRuta <em>Ruta</em>}</li>
 *   <li>{@link concreta.MBSMetodo#getListaParametros <em>Lista Parametros</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMBSMetodo()
 * @model annotation="gmf.node label='nombre' color='240,255,255' size='100,15' margin='0' border.color='255,255,255'"
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
	 * @see concreta.ConcretaPackage#getMBSMetodo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.MBSMetodo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

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
	 * @see concreta.ConcretaPackage#getMBSMetodo_ModificadorAcceso()
	 * @model
	 * @generated
	 */
	String getModificadorAcceso();

	/**
	 * Sets the value of the '{@link concreta.MBSMetodo#getModificadorAcceso <em>Modificador Acceso</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getMBSMetodo_TipoRetorno()
	 * @model
	 * @generated
	 */
	String getTipoRetorno();

	/**
	 * Sets the value of the '{@link concreta.MBSMetodo#getTipoRetorno <em>Tipo Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Retorno</em>' attribute.
	 * @see #getTipoRetorno()
	 * @generated
	 */
	void setTipoRetorno(String value);

	/**
	 * Returns the value of the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruta</em>' attribute.
	 * @see #setRuta(String)
	 * @see concreta.ConcretaPackage#getMBSMetodo_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link concreta.MBSMetodo#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * Returns the value of the '<em><b>Lista Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.MBSParametro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Parametros</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMBSMetodo_ListaParametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBSParametro> getListaParametros();

} // MBSMetodo
