/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.MBSMetodo;
import abstracta.MBSParametro;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MBS Metodo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.MBSMetodoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.impl.MBSMetodoImpl#getModificadorAcceso <em>Modificador Acceso</em>}</li>
 *   <li>{@link abstracta.impl.MBSMetodoImpl#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link abstracta.impl.MBSMetodoImpl#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracta.impl.MBSMetodoImpl#getParametros <em>Parametros</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MBSMetodoImpl extends EObjectImpl implements MBSMetodo {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModificadorAcceso() <em>Modificador Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificadorAcceso()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFICADOR_ACCESO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModificadorAcceso() <em>Modificador Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificadorAcceso()
	 * @generated
	 * @ordered
	 */
	protected String modificadorAcceso = MODIFICADOR_ACCESO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoRetorno() <em>Tipo Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoRetorno()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_RETORNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoRetorno() <em>Tipo Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoRetorno()
	 * @generated
	 * @ordered
	 */
	protected String tipoRetorno = TIPO_RETORNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected static final String RUTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected String ruta = RUTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getParametros() <em>Parametros</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametros()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETROS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParametros() <em>Parametros</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametros()
	 * @generated
	 * @ordered
	 */
	protected String parametros = PARAMETROS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSMetodoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.MBS_METODO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_METODO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModificadorAcceso() {
		return modificadorAcceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificadorAcceso(String newModificadorAcceso) {
		String oldModificadorAcceso = modificadorAcceso;
		modificadorAcceso = newModificadorAcceso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_METODO__MODIFICADOR_ACCESO, oldModificadorAcceso, modificadorAcceso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoRetorno() {
		return tipoRetorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoRetorno(String newTipoRetorno) {
		String oldTipoRetorno = tipoRetorno;
		tipoRetorno = newTipoRetorno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_METODO__TIPO_RETORNO, oldTipoRetorno, tipoRetorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuta(String newRuta) {
		String oldRuta = ruta;
		ruta = newRuta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_METODO__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParametros() {
		return parametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametros(String newParametros) {
		String oldParametros = parametros;
		parametros = newParametros;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_METODO__PARAMETROS, oldParametros, parametros));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.MBS_METODO__NOMBRE:
				return getNombre();
			case AbstractaPackage.MBS_METODO__MODIFICADOR_ACCESO:
				return getModificadorAcceso();
			case AbstractaPackage.MBS_METODO__TIPO_RETORNO:
				return getTipoRetorno();
			case AbstractaPackage.MBS_METODO__RUTA:
				return getRuta();
			case AbstractaPackage.MBS_METODO__PARAMETROS:
				return getParametros();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbstractaPackage.MBS_METODO__NOMBRE:
				setNombre((String)newValue);
				return;
			case AbstractaPackage.MBS_METODO__MODIFICADOR_ACCESO:
				setModificadorAcceso((String)newValue);
				return;
			case AbstractaPackage.MBS_METODO__TIPO_RETORNO:
				setTipoRetorno((String)newValue);
				return;
			case AbstractaPackage.MBS_METODO__RUTA:
				setRuta((String)newValue);
				return;
			case AbstractaPackage.MBS_METODO__PARAMETROS:
				setParametros((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AbstractaPackage.MBS_METODO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AbstractaPackage.MBS_METODO__MODIFICADOR_ACCESO:
				setModificadorAcceso(MODIFICADOR_ACCESO_EDEFAULT);
				return;
			case AbstractaPackage.MBS_METODO__TIPO_RETORNO:
				setTipoRetorno(TIPO_RETORNO_EDEFAULT);
				return;
			case AbstractaPackage.MBS_METODO__RUTA:
				setRuta(RUTA_EDEFAULT);
				return;
			case AbstractaPackage.MBS_METODO__PARAMETROS:
				setParametros(PARAMETROS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AbstractaPackage.MBS_METODO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AbstractaPackage.MBS_METODO__MODIFICADOR_ACCESO:
				return MODIFICADOR_ACCESO_EDEFAULT == null ? modificadorAcceso != null : !MODIFICADOR_ACCESO_EDEFAULT.equals(modificadorAcceso);
			case AbstractaPackage.MBS_METODO__TIPO_RETORNO:
				return TIPO_RETORNO_EDEFAULT == null ? tipoRetorno != null : !TIPO_RETORNO_EDEFAULT.equals(tipoRetorno);
			case AbstractaPackage.MBS_METODO__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
			case AbstractaPackage.MBS_METODO__PARAMETROS:
				return PARAMETROS_EDEFAULT == null ? parametros != null : !PARAMETROS_EDEFAULT.equals(parametros);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", modificadorAcceso: ");
		result.append(modificadorAcceso);
		result.append(", tipoRetorno: ");
		result.append(tipoRetorno);
		result.append(", ruta: ");
		result.append(ruta);
		result.append(", parametros: ");
		result.append(parametros);
		result.append(')');
		return result.toString();
	}

} //MBSMetodoImpl
