/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.MBSAtributo;
import abstracta.MBSClase;
import abstracta.MBSContainment;
import abstracta.MBSHerencia;
import abstracta.MBSMetodo;
import abstracta.MBSRelacion;

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
 * An implementation of the model object '<em><b>MBS Clase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.MBSClaseImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.impl.MBSClaseImpl#getEstereotipo <em>Estereotipo</em>}</li>
 *   <li>{@link abstracta.impl.MBSClaseImpl#getModificadorAcceso <em>Modificador Acceso</em>}</li>
 *   <li>{@link abstracta.impl.MBSClaseImpl#isAbstracta <em>Abstracta</em>}</li>
 *   <li>{@link abstracta.impl.MBSClaseImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link abstracta.impl.MBSClaseImpl#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracta.impl.MBSClaseImpl#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link abstracta.impl.MBSClaseImpl#getMetodos <em>Metodos</em>}</li>
 *   <li>{@link abstracta.impl.MBSClaseImpl#getListaRelaciones <em>Lista Relaciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MBSClaseImpl extends EObjectImpl implements MBSClase {
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
	 * The default value of the '{@link #getEstereotipo() <em>Estereotipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstereotipo()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTEREOTIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstereotipo() <em>Estereotipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstereotipo()
	 * @generated
	 * @ordered
	 */
	protected String estereotipo = ESTEREOTIPO_EDEFAULT;

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
	 * The default value of the '{@link #isAbstracta() <em>Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstracta()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACTA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstracta() <em>Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstracta()
	 * @generated
	 * @ordered
	 */
	protected boolean abstracta = ABSTRACTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

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
	 * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<MBSAtributo> atributos;

	/**
	 * The cached value of the '{@link #getMetodos() <em>Metodos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetodos()
	 * @generated
	 * @ordered
	 */
	protected EList<MBSMetodo> metodos;

	/**
	 * The cached value of the '{@link #getListaRelaciones() <em>Lista Relaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaRelaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<MBSRelacion> listaRelaciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSClaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.MBS_CLASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_CLASE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstereotipo() {
		return estereotipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstereotipo(String newEstereotipo) {
		String oldEstereotipo = estereotipo;
		estereotipo = newEstereotipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_CLASE__ESTEREOTIPO, oldEstereotipo, estereotipo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_CLASE__MODIFICADOR_ACCESO, oldModificadorAcceso, modificadorAcceso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstracta() {
		return abstracta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstracta(boolean newAbstracta) {
		boolean oldAbstracta = abstracta;
		abstracta = newAbstracta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_CLASE__ABSTRACTA, oldAbstracta, abstracta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_CLASE__DESCRIPCION, oldDescripcion, descripcion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MBS_CLASE__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MBSAtributo> getAtributos() {
		if (atributos == null) {
			atributos = new EObjectContainmentEList<MBSAtributo>(MBSAtributo.class, this, AbstractaPackage.MBS_CLASE__ATRIBUTOS);
		}
		return atributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MBSMetodo> getMetodos() {
		if (metodos == null) {
			metodos = new EObjectContainmentEList<MBSMetodo>(MBSMetodo.class, this, AbstractaPackage.MBS_CLASE__METODOS);
		}
		return metodos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MBSRelacion> getListaRelaciones() {
		if (listaRelaciones == null) {
			listaRelaciones = new EObjectContainmentEList<MBSRelacion>(MBSRelacion.class, this, AbstractaPackage.MBS_CLASE__LISTA_RELACIONES);
		}
		return listaRelaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.MBS_CLASE__ATRIBUTOS:
				return ((InternalEList<?>)getAtributos()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.MBS_CLASE__METODOS:
				return ((InternalEList<?>)getMetodos()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.MBS_CLASE__LISTA_RELACIONES:
				return ((InternalEList<?>)getListaRelaciones()).basicRemove(otherEnd, msgs);
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
			case AbstractaPackage.MBS_CLASE__NOMBRE:
				return getNombre();
			case AbstractaPackage.MBS_CLASE__ESTEREOTIPO:
				return getEstereotipo();
			case AbstractaPackage.MBS_CLASE__MODIFICADOR_ACCESO:
				return getModificadorAcceso();
			case AbstractaPackage.MBS_CLASE__ABSTRACTA:
				return isAbstracta();
			case AbstractaPackage.MBS_CLASE__DESCRIPCION:
				return getDescripcion();
			case AbstractaPackage.MBS_CLASE__RUTA:
				return getRuta();
			case AbstractaPackage.MBS_CLASE__ATRIBUTOS:
				return getAtributos();
			case AbstractaPackage.MBS_CLASE__METODOS:
				return getMetodos();
			case AbstractaPackage.MBS_CLASE__LISTA_RELACIONES:
				return getListaRelaciones();
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
			case AbstractaPackage.MBS_CLASE__NOMBRE:
				setNombre((String)newValue);
				return;
			case AbstractaPackage.MBS_CLASE__ESTEREOTIPO:
				setEstereotipo((String)newValue);
				return;
			case AbstractaPackage.MBS_CLASE__MODIFICADOR_ACCESO:
				setModificadorAcceso((String)newValue);
				return;
			case AbstractaPackage.MBS_CLASE__ABSTRACTA:
				setAbstracta((Boolean)newValue);
				return;
			case AbstractaPackage.MBS_CLASE__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case AbstractaPackage.MBS_CLASE__RUTA:
				setRuta((String)newValue);
				return;
			case AbstractaPackage.MBS_CLASE__ATRIBUTOS:
				getAtributos().clear();
				getAtributos().addAll((Collection<? extends MBSAtributo>)newValue);
				return;
			case AbstractaPackage.MBS_CLASE__METODOS:
				getMetodos().clear();
				getMetodos().addAll((Collection<? extends MBSMetodo>)newValue);
				return;
			case AbstractaPackage.MBS_CLASE__LISTA_RELACIONES:
				getListaRelaciones().clear();
				getListaRelaciones().addAll((Collection<? extends MBSRelacion>)newValue);
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
			case AbstractaPackage.MBS_CLASE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AbstractaPackage.MBS_CLASE__ESTEREOTIPO:
				setEstereotipo(ESTEREOTIPO_EDEFAULT);
				return;
			case AbstractaPackage.MBS_CLASE__MODIFICADOR_ACCESO:
				setModificadorAcceso(MODIFICADOR_ACCESO_EDEFAULT);
				return;
			case AbstractaPackage.MBS_CLASE__ABSTRACTA:
				setAbstracta(ABSTRACTA_EDEFAULT);
				return;
			case AbstractaPackage.MBS_CLASE__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case AbstractaPackage.MBS_CLASE__RUTA:
				setRuta(RUTA_EDEFAULT);
				return;
			case AbstractaPackage.MBS_CLASE__ATRIBUTOS:
				getAtributos().clear();
				return;
			case AbstractaPackage.MBS_CLASE__METODOS:
				getMetodos().clear();
				return;
			case AbstractaPackage.MBS_CLASE__LISTA_RELACIONES:
				getListaRelaciones().clear();
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
			case AbstractaPackage.MBS_CLASE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AbstractaPackage.MBS_CLASE__ESTEREOTIPO:
				return ESTEREOTIPO_EDEFAULT == null ? estereotipo != null : !ESTEREOTIPO_EDEFAULT.equals(estereotipo);
			case AbstractaPackage.MBS_CLASE__MODIFICADOR_ACCESO:
				return MODIFICADOR_ACCESO_EDEFAULT == null ? modificadorAcceso != null : !MODIFICADOR_ACCESO_EDEFAULT.equals(modificadorAcceso);
			case AbstractaPackage.MBS_CLASE__ABSTRACTA:
				return abstracta != ABSTRACTA_EDEFAULT;
			case AbstractaPackage.MBS_CLASE__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case AbstractaPackage.MBS_CLASE__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
			case AbstractaPackage.MBS_CLASE__ATRIBUTOS:
				return atributos != null && !atributos.isEmpty();
			case AbstractaPackage.MBS_CLASE__METODOS:
				return metodos != null && !metodos.isEmpty();
			case AbstractaPackage.MBS_CLASE__LISTA_RELACIONES:
				return listaRelaciones != null && !listaRelaciones.isEmpty();
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
		result.append(", estereotipo: ");
		result.append(estereotipo);
		result.append(", modificadorAcceso: ");
		result.append(modificadorAcceso);
		result.append(", abstracta: ");
		result.append(abstracta);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", ruta: ");
		result.append(ruta);
		result.append(')');
		return result.toString();
	}

} //MBSClaseImpl
