/**
 */
package diagConcreta.impl;

import diagConcreta.DiagConcretaPackage;
import diagConcreta.MBSClase;
import diagConcreta.MBSDiagramaClases;
import diagConcreta.MBSPaquete;
import diagConcreta.MBSRelacion;

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
 * An implementation of the model object '<em><b>MBS Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagConcreta.impl.MBSDiagramaClasesImpl#getIdClase <em>Id Clase</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSDiagramaClasesImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSDiagramaClasesImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSDiagramaClasesImpl#getListaClases <em>Lista Clases</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSDiagramaClasesImpl#getListaRelaciones <em>Lista Relaciones</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSDiagramaClasesImpl#getListaPaquetes <em>Lista Paquetes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MBSDiagramaClasesImpl extends EObjectImpl implements MBSDiagramaClases {
	/**
	 * The default value of the '{@link #getIdClase() <em>Id Clase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdClase()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_CLASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdClase() <em>Id Clase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdClase()
	 * @generated
	 * @ordered
	 */
	protected String idClase = ID_CLASE_EDEFAULT;

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
	 * The cached value of the '{@link #getListaClases() <em>Lista Clases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaClases()
	 * @generated
	 * @ordered
	 */
	protected EList<MBSClase> listaClases;

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
	 * The cached value of the '{@link #getListaPaquetes() <em>Lista Paquetes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaPaquetes()
	 * @generated
	 * @ordered
	 */
	protected EList<MBSPaquete> listaPaquetes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSDiagramaClasesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagConcretaPackage.Literals.MBS_DIAGRAMA_CLASES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdClase() {
		return idClase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdClase(String newIdClase) {
		String oldIdClase = idClase;
		idClase = newIdClase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagConcretaPackage.MBS_DIAGRAMA_CLASES__ID_CLASE, oldIdClase, idClase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagConcretaPackage.MBS_DIAGRAMA_CLASES__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagConcretaPackage.MBS_DIAGRAMA_CLASES__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MBSClase> getListaClases() {
		if (listaClases == null) {
			listaClases = new EObjectContainmentEList<MBSClase>(MBSClase.class, this, DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_CLASES);
		}
		return listaClases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MBSRelacion> getListaRelaciones() {
		if (listaRelaciones == null) {
			listaRelaciones = new EObjectContainmentEList<MBSRelacion>(MBSRelacion.class, this, DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_RELACIONES);
		}
		return listaRelaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MBSPaquete> getListaPaquetes() {
		if (listaPaquetes == null) {
			listaPaquetes = new EObjectContainmentEList<MBSPaquete>(MBSPaquete.class, this, DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_PAQUETES);
		}
		return listaPaquetes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_CLASES:
				return ((InternalEList<?>)getListaClases()).basicRemove(otherEnd, msgs);
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_RELACIONES:
				return ((InternalEList<?>)getListaRelaciones()).basicRemove(otherEnd, msgs);
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_PAQUETES:
				return ((InternalEList<?>)getListaPaquetes()).basicRemove(otherEnd, msgs);
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
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__ID_CLASE:
				return getIdClase();
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__NOMBRE:
				return getNombre();
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__DESCRIPCION:
				return getDescripcion();
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_CLASES:
				return getListaClases();
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_RELACIONES:
				return getListaRelaciones();
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_PAQUETES:
				return getListaPaquetes();
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
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__ID_CLASE:
				setIdClase((String)newValue);
				return;
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__NOMBRE:
				setNombre((String)newValue);
				return;
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_CLASES:
				getListaClases().clear();
				getListaClases().addAll((Collection<? extends MBSClase>)newValue);
				return;
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_RELACIONES:
				getListaRelaciones().clear();
				getListaRelaciones().addAll((Collection<? extends MBSRelacion>)newValue);
				return;
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_PAQUETES:
				getListaPaquetes().clear();
				getListaPaquetes().addAll((Collection<? extends MBSPaquete>)newValue);
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
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__ID_CLASE:
				setIdClase(ID_CLASE_EDEFAULT);
				return;
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_CLASES:
				getListaClases().clear();
				return;
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_RELACIONES:
				getListaRelaciones().clear();
				return;
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_PAQUETES:
				getListaPaquetes().clear();
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
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__ID_CLASE:
				return ID_CLASE_EDEFAULT == null ? idClase != null : !ID_CLASE_EDEFAULT.equals(idClase);
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_CLASES:
				return listaClases != null && !listaClases.isEmpty();
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_RELACIONES:
				return listaRelaciones != null && !listaRelaciones.isEmpty();
			case DiagConcretaPackage.MBS_DIAGRAMA_CLASES__LISTA_PAQUETES:
				return listaPaquetes != null && !listaPaquetes.isEmpty();
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
		result.append(" (idClase: ");
		result.append(idClase);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //MBSDiagramaClasesImpl
