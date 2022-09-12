/**
 */
package diagConcreta.impl;

import diagConcreta.DiagConcretaPackage;
import diagConcreta.MBSClase;
import diagConcreta.MBSRelacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MBS Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagConcreta.impl.MBSRelacionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSRelacionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSRelacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSRelacionImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSRelacionImpl#getMultiplicidaA <em>Multiplicida A</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSRelacionImpl#getMultiplicidadB <em>Multiplicidad B</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSRelacionImpl#getRolA <em>Rol A</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSRelacionImpl#getRolB <em>Rol B</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSRelacionImpl#getNavegabilidadA <em>Navegabilidad A</em>}</li>
 *   <li>{@link diagConcreta.impl.MBSRelacionImpl#getNavegabilidadB <em>Navegabilidad B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MBSRelacionImpl extends EObjectImpl implements MBSRelacion {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MBSClase source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected MBSClase target;

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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidaA() <em>Multiplicida A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidaA()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICIDA_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicidaA() <em>Multiplicida A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidaA()
	 * @generated
	 * @ordered
	 */
	protected String multiplicidaA = MULTIPLICIDA_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadB() <em>Multiplicidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadB()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICIDAD_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicidadB() <em>Multiplicidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadB()
	 * @generated
	 * @ordered
	 */
	protected String multiplicidadB = MULTIPLICIDAD_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getRolA() <em>Rol A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolA()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRolA() <em>Rol A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolA()
	 * @generated
	 * @ordered
	 */
	protected String rolA = ROL_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getRolB() <em>Rol B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolB()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRolB() <em>Rol B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolB()
	 * @generated
	 * @ordered
	 */
	protected String rolB = ROL_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavegabilidadA() <em>Navegabilidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegabilidadA()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVEGABILIDAD_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavegabilidadA() <em>Navegabilidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegabilidadA()
	 * @generated
	 * @ordered
	 */
	protected String navegabilidadA = NAVEGABILIDAD_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavegabilidadB() <em>Navegabilidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegabilidadB()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVEGABILIDAD_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavegabilidadB() <em>Navegabilidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegabilidadB()
	 * @generated
	 * @ordered
	 */
	protected String navegabilidadB = NAVEGABILIDAD_B_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSRelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagConcretaPackage.Literals.MBS_RELACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSClase getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (MBSClase)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagConcretaPackage.MBS_RELACION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSClase basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(MBSClase newSource) {
		MBSClase oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagConcretaPackage.MBS_RELACION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSClase getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (MBSClase)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagConcretaPackage.MBS_RELACION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSClase basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(MBSClase newTarget) {
		MBSClase oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagConcretaPackage.MBS_RELACION__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagConcretaPackage.MBS_RELACION__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagConcretaPackage.MBS_RELACION__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicidaA() {
		return multiplicidaA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidaA(String newMultiplicidaA) {
		String oldMultiplicidaA = multiplicidaA;
		multiplicidaA = newMultiplicidaA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagConcretaPackage.MBS_RELACION__MULTIPLICIDA_A, oldMultiplicidaA, multiplicidaA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicidadB() {
		return multiplicidadB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadB(String newMultiplicidadB) {
		String oldMultiplicidadB = multiplicidadB;
		multiplicidadB = newMultiplicidadB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagConcretaPackage.MBS_RELACION__MULTIPLICIDAD_B, oldMultiplicidadB, multiplicidadB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRolA() {
		return rolA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolA(String newRolA) {
		String oldRolA = rolA;
		rolA = newRolA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagConcretaPackage.MBS_RELACION__ROL_A, oldRolA, rolA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRolB() {
		return rolB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolB(String newRolB) {
		String oldRolB = rolB;
		rolB = newRolB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagConcretaPackage.MBS_RELACION__ROL_B, oldRolB, rolB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavegabilidadA() {
		return navegabilidadA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavegabilidadA(String newNavegabilidadA) {
		String oldNavegabilidadA = navegabilidadA;
		navegabilidadA = newNavegabilidadA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagConcretaPackage.MBS_RELACION__NAVEGABILIDAD_A, oldNavegabilidadA, navegabilidadA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavegabilidadB() {
		return navegabilidadB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavegabilidadB(String newNavegabilidadB) {
		String oldNavegabilidadB = navegabilidadB;
		navegabilidadB = newNavegabilidadB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagConcretaPackage.MBS_RELACION__NAVEGABILIDAD_B, oldNavegabilidadB, navegabilidadB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagConcretaPackage.MBS_RELACION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case DiagConcretaPackage.MBS_RELACION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case DiagConcretaPackage.MBS_RELACION__NOMBRE:
				return getNombre();
			case DiagConcretaPackage.MBS_RELACION__TIPO:
				return getTipo();
			case DiagConcretaPackage.MBS_RELACION__MULTIPLICIDA_A:
				return getMultiplicidaA();
			case DiagConcretaPackage.MBS_RELACION__MULTIPLICIDAD_B:
				return getMultiplicidadB();
			case DiagConcretaPackage.MBS_RELACION__ROL_A:
				return getRolA();
			case DiagConcretaPackage.MBS_RELACION__ROL_B:
				return getRolB();
			case DiagConcretaPackage.MBS_RELACION__NAVEGABILIDAD_A:
				return getNavegabilidadA();
			case DiagConcretaPackage.MBS_RELACION__NAVEGABILIDAD_B:
				return getNavegabilidadB();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagConcretaPackage.MBS_RELACION__SOURCE:
				setSource((MBSClase)newValue);
				return;
			case DiagConcretaPackage.MBS_RELACION__TARGET:
				setTarget((MBSClase)newValue);
				return;
			case DiagConcretaPackage.MBS_RELACION__NOMBRE:
				setNombre((String)newValue);
				return;
			case DiagConcretaPackage.MBS_RELACION__TIPO:
				setTipo((String)newValue);
				return;
			case DiagConcretaPackage.MBS_RELACION__MULTIPLICIDA_A:
				setMultiplicidaA((String)newValue);
				return;
			case DiagConcretaPackage.MBS_RELACION__MULTIPLICIDAD_B:
				setMultiplicidadB((String)newValue);
				return;
			case DiagConcretaPackage.MBS_RELACION__ROL_A:
				setRolA((String)newValue);
				return;
			case DiagConcretaPackage.MBS_RELACION__ROL_B:
				setRolB((String)newValue);
				return;
			case DiagConcretaPackage.MBS_RELACION__NAVEGABILIDAD_A:
				setNavegabilidadA((String)newValue);
				return;
			case DiagConcretaPackage.MBS_RELACION__NAVEGABILIDAD_B:
				setNavegabilidadB((String)newValue);
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
			case DiagConcretaPackage.MBS_RELACION__SOURCE:
				setSource((MBSClase)null);
				return;
			case DiagConcretaPackage.MBS_RELACION__TARGET:
				setTarget((MBSClase)null);
				return;
			case DiagConcretaPackage.MBS_RELACION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DiagConcretaPackage.MBS_RELACION__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case DiagConcretaPackage.MBS_RELACION__MULTIPLICIDA_A:
				setMultiplicidaA(MULTIPLICIDA_A_EDEFAULT);
				return;
			case DiagConcretaPackage.MBS_RELACION__MULTIPLICIDAD_B:
				setMultiplicidadB(MULTIPLICIDAD_B_EDEFAULT);
				return;
			case DiagConcretaPackage.MBS_RELACION__ROL_A:
				setRolA(ROL_A_EDEFAULT);
				return;
			case DiagConcretaPackage.MBS_RELACION__ROL_B:
				setRolB(ROL_B_EDEFAULT);
				return;
			case DiagConcretaPackage.MBS_RELACION__NAVEGABILIDAD_A:
				setNavegabilidadA(NAVEGABILIDAD_A_EDEFAULT);
				return;
			case DiagConcretaPackage.MBS_RELACION__NAVEGABILIDAD_B:
				setNavegabilidadB(NAVEGABILIDAD_B_EDEFAULT);
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
			case DiagConcretaPackage.MBS_RELACION__SOURCE:
				return source != null;
			case DiagConcretaPackage.MBS_RELACION__TARGET:
				return target != null;
			case DiagConcretaPackage.MBS_RELACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DiagConcretaPackage.MBS_RELACION__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case DiagConcretaPackage.MBS_RELACION__MULTIPLICIDA_A:
				return MULTIPLICIDA_A_EDEFAULT == null ? multiplicidaA != null : !MULTIPLICIDA_A_EDEFAULT.equals(multiplicidaA);
			case DiagConcretaPackage.MBS_RELACION__MULTIPLICIDAD_B:
				return MULTIPLICIDAD_B_EDEFAULT == null ? multiplicidadB != null : !MULTIPLICIDAD_B_EDEFAULT.equals(multiplicidadB);
			case DiagConcretaPackage.MBS_RELACION__ROL_A:
				return ROL_A_EDEFAULT == null ? rolA != null : !ROL_A_EDEFAULT.equals(rolA);
			case DiagConcretaPackage.MBS_RELACION__ROL_B:
				return ROL_B_EDEFAULT == null ? rolB != null : !ROL_B_EDEFAULT.equals(rolB);
			case DiagConcretaPackage.MBS_RELACION__NAVEGABILIDAD_A:
				return NAVEGABILIDAD_A_EDEFAULT == null ? navegabilidadA != null : !NAVEGABILIDAD_A_EDEFAULT.equals(navegabilidadA);
			case DiagConcretaPackage.MBS_RELACION__NAVEGABILIDAD_B:
				return NAVEGABILIDAD_B_EDEFAULT == null ? navegabilidadB != null : !NAVEGABILIDAD_B_EDEFAULT.equals(navegabilidadB);
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
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", multiplicidaA: ");
		result.append(multiplicidaA);
		result.append(", multiplicidadB: ");
		result.append(multiplicidadB);
		result.append(", rolA: ");
		result.append(rolA);
		result.append(", rolB: ");
		result.append(rolB);
		result.append(", navegabilidadA: ");
		result.append(navegabilidadA);
		result.append(", navegabilidadB: ");
		result.append(navegabilidadB);
		result.append(')');
		return result.toString();
	}

} //MBSRelacionImpl
