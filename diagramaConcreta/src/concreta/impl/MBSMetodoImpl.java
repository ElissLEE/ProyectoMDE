/**
 */
package concreta.impl;

import concreta.ConcretaPackage;
import concreta.MBSMetodo;
import concreta.MBSParametro;

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
 *   <li>{@link concreta.impl.MBSMetodoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.impl.MBSMetodoImpl#getModificadorAcceso <em>Modificador Acceso</em>}</li>
 *   <li>{@link concreta.impl.MBSMetodoImpl#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link concreta.impl.MBSMetodoImpl#getRuta <em>Ruta</em>}</li>
 *   <li>{@link concreta.impl.MBSMetodoImpl#getListaParametros <em>Lista Parametros</em>}</li>
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
	 * The cached value of the '{@link #getListaParametros() <em>Lista Parametros</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaParametros()
	 * @generated
	 * @ordered
	 */
	protected EList<MBSParametro> listaParametros;

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
		return ConcretaPackage.Literals.MBS_METODO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_METODO__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_METODO__MODIFICADOR_ACCESO, oldModificadorAcceso, modificadorAcceso));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_METODO__TIPO_RETORNO, oldTipoRetorno, tipoRetorno));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_METODO__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MBSParametro> getListaParametros() {
		if (listaParametros == null) {
			listaParametros = new EObjectContainmentEList<MBSParametro>(MBSParametro.class, this, ConcretaPackage.MBS_METODO__LISTA_PARAMETROS);
		}
		return listaParametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretaPackage.MBS_METODO__LISTA_PARAMETROS:
				return ((InternalEList<?>)getListaParametros()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretaPackage.MBS_METODO__NOMBRE:
				return getNombre();
			case ConcretaPackage.MBS_METODO__MODIFICADOR_ACCESO:
				return getModificadorAcceso();
			case ConcretaPackage.MBS_METODO__TIPO_RETORNO:
				return getTipoRetorno();
			case ConcretaPackage.MBS_METODO__RUTA:
				return getRuta();
			case ConcretaPackage.MBS_METODO__LISTA_PARAMETROS:
				return getListaParametros();
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
			case ConcretaPackage.MBS_METODO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ConcretaPackage.MBS_METODO__MODIFICADOR_ACCESO:
				setModificadorAcceso((String)newValue);
				return;
			case ConcretaPackage.MBS_METODO__TIPO_RETORNO:
				setTipoRetorno((String)newValue);
				return;
			case ConcretaPackage.MBS_METODO__RUTA:
				setRuta((String)newValue);
				return;
			case ConcretaPackage.MBS_METODO__LISTA_PARAMETROS:
				getListaParametros().clear();
				getListaParametros().addAll((Collection<? extends MBSParametro>)newValue);
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
			case ConcretaPackage.MBS_METODO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ConcretaPackage.MBS_METODO__MODIFICADOR_ACCESO:
				setModificadorAcceso(MODIFICADOR_ACCESO_EDEFAULT);
				return;
			case ConcretaPackage.MBS_METODO__TIPO_RETORNO:
				setTipoRetorno(TIPO_RETORNO_EDEFAULT);
				return;
			case ConcretaPackage.MBS_METODO__RUTA:
				setRuta(RUTA_EDEFAULT);
				return;
			case ConcretaPackage.MBS_METODO__LISTA_PARAMETROS:
				getListaParametros().clear();
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
			case ConcretaPackage.MBS_METODO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ConcretaPackage.MBS_METODO__MODIFICADOR_ACCESO:
				return MODIFICADOR_ACCESO_EDEFAULT == null ? modificadorAcceso != null : !MODIFICADOR_ACCESO_EDEFAULT.equals(modificadorAcceso);
			case ConcretaPackage.MBS_METODO__TIPO_RETORNO:
				return TIPO_RETORNO_EDEFAULT == null ? tipoRetorno != null : !TIPO_RETORNO_EDEFAULT.equals(tipoRetorno);
			case ConcretaPackage.MBS_METODO__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
			case ConcretaPackage.MBS_METODO__LISTA_PARAMETROS:
				return listaParametros != null && !listaParametros.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //MBSMetodoImpl
