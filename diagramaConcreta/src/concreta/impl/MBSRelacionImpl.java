/**
 */
package concreta.impl;

import concreta.ConcretaPackage;
import concreta.MBSClase;
import concreta.MBSRelacion;

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
 *   <li>{@link concreta.impl.MBSRelacionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link concreta.impl.MBSRelacionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link concreta.impl.MBSRelacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.impl.MBSRelacionImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link concreta.impl.MBSRelacionImpl#getMultiplicidadA <em>Multiplicidad A</em>}</li>
 *   <li>{@link concreta.impl.MBSRelacionImpl#getMultiplicidadB <em>Multiplicidad B</em>}</li>
 *   <li>{@link concreta.impl.MBSRelacionImpl#getRolA <em>Rol A</em>}</li>
 *   <li>{@link concreta.impl.MBSRelacionImpl#getRolB <em>Rol B</em>}</li>
 *   <li>{@link concreta.impl.MBSRelacionImpl#getNavegabilidadA <em>Navegabilidad A</em>}</li>
 *   <li>{@link concreta.impl.MBSRelacionImpl#getNavegabilidadB <em>Navegabilidad B</em>}</li>
 *   <li>{@link concreta.impl.MBSRelacionImpl#getLabelName <em>Label Name</em>}</li>
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
	 * The default value of the '{@link #getMultiplicidadA() <em>Multiplicidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadA()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICIDAD_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicidadA() <em>Multiplicidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadA()
	 * @generated
	 * @ordered
	 */
	protected String multiplicidadA = MULTIPLICIDAD_A_EDEFAULT;

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
	 * The default value of the '{@link #getLabelName() <em>Label Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelName()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelName() <em>Label Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelName()
	 * @generated
	 * @ordered
	 */
	protected String labelName = LABEL_NAME_EDEFAULT;

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
		return ConcretaPackage.Literals.MBS_RELACION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretaPackage.MBS_RELACION__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_RELACION__SOURCE, oldSource, source));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretaPackage.MBS_RELACION__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_RELACION__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_RELACION__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_RELACION__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicidadA() {
		return multiplicidadA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadA(String newMultiplicidadA) {
		String oldMultiplicidadA = multiplicidadA;
		multiplicidadA = newMultiplicidadA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_RELACION__MULTIPLICIDAD_A, oldMultiplicidadA, multiplicidadA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_RELACION__MULTIPLICIDAD_B, oldMultiplicidadB, multiplicidadB));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_RELACION__ROL_A, oldRolA, rolA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_RELACION__ROL_B, oldRolB, rolB));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_RELACION__NAVEGABILIDAD_A, oldNavegabilidadA, navegabilidadA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_RELACION__NAVEGABILIDAD_B, oldNavegabilidadB, navegabilidadB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelName() {
		return labelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelName(String newLabelName) {
		String oldLabelName = labelName;
		labelName = newLabelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_RELACION__LABEL_NAME, oldLabelName, labelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretaPackage.MBS_RELACION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ConcretaPackage.MBS_RELACION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ConcretaPackage.MBS_RELACION__NOMBRE:
				return getNombre();
			case ConcretaPackage.MBS_RELACION__TIPO:
				return getTipo();
			case ConcretaPackage.MBS_RELACION__MULTIPLICIDAD_A:
				return getMultiplicidadA();
			case ConcretaPackage.MBS_RELACION__MULTIPLICIDAD_B:
				return getMultiplicidadB();
			case ConcretaPackage.MBS_RELACION__ROL_A:
				return getRolA();
			case ConcretaPackage.MBS_RELACION__ROL_B:
				return getRolB();
			case ConcretaPackage.MBS_RELACION__NAVEGABILIDAD_A:
				return getNavegabilidadA();
			case ConcretaPackage.MBS_RELACION__NAVEGABILIDAD_B:
				return getNavegabilidadB();
			case ConcretaPackage.MBS_RELACION__LABEL_NAME:
				return getLabelName();
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
			case ConcretaPackage.MBS_RELACION__SOURCE:
				setSource((MBSClase)newValue);
				return;
			case ConcretaPackage.MBS_RELACION__TARGET:
				setTarget((MBSClase)newValue);
				return;
			case ConcretaPackage.MBS_RELACION__NOMBRE:
				setNombre((String)newValue);
				return;
			case ConcretaPackage.MBS_RELACION__TIPO:
				setTipo((String)newValue);
				return;
			case ConcretaPackage.MBS_RELACION__MULTIPLICIDAD_A:
				setMultiplicidadA((String)newValue);
				return;
			case ConcretaPackage.MBS_RELACION__MULTIPLICIDAD_B:
				setMultiplicidadB((String)newValue);
				return;
			case ConcretaPackage.MBS_RELACION__ROL_A:
				setRolA((String)newValue);
				return;
			case ConcretaPackage.MBS_RELACION__ROL_B:
				setRolB((String)newValue);
				return;
			case ConcretaPackage.MBS_RELACION__NAVEGABILIDAD_A:
				setNavegabilidadA((String)newValue);
				return;
			case ConcretaPackage.MBS_RELACION__NAVEGABILIDAD_B:
				setNavegabilidadB((String)newValue);
				return;
			case ConcretaPackage.MBS_RELACION__LABEL_NAME:
				setLabelName((String)newValue);
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
			case ConcretaPackage.MBS_RELACION__SOURCE:
				setSource((MBSClase)null);
				return;
			case ConcretaPackage.MBS_RELACION__TARGET:
				setTarget((MBSClase)null);
				return;
			case ConcretaPackage.MBS_RELACION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ConcretaPackage.MBS_RELACION__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case ConcretaPackage.MBS_RELACION__MULTIPLICIDAD_A:
				setMultiplicidadA(MULTIPLICIDAD_A_EDEFAULT);
				return;
			case ConcretaPackage.MBS_RELACION__MULTIPLICIDAD_B:
				setMultiplicidadB(MULTIPLICIDAD_B_EDEFAULT);
				return;
			case ConcretaPackage.MBS_RELACION__ROL_A:
				setRolA(ROL_A_EDEFAULT);
				return;
			case ConcretaPackage.MBS_RELACION__ROL_B:
				setRolB(ROL_B_EDEFAULT);
				return;
			case ConcretaPackage.MBS_RELACION__NAVEGABILIDAD_A:
				setNavegabilidadA(NAVEGABILIDAD_A_EDEFAULT);
				return;
			case ConcretaPackage.MBS_RELACION__NAVEGABILIDAD_B:
				setNavegabilidadB(NAVEGABILIDAD_B_EDEFAULT);
				return;
			case ConcretaPackage.MBS_RELACION__LABEL_NAME:
				setLabelName(LABEL_NAME_EDEFAULT);
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
			case ConcretaPackage.MBS_RELACION__SOURCE:
				return source != null;
			case ConcretaPackage.MBS_RELACION__TARGET:
				return target != null;
			case ConcretaPackage.MBS_RELACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ConcretaPackage.MBS_RELACION__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case ConcretaPackage.MBS_RELACION__MULTIPLICIDAD_A:
				return MULTIPLICIDAD_A_EDEFAULT == null ? multiplicidadA != null : !MULTIPLICIDAD_A_EDEFAULT.equals(multiplicidadA);
			case ConcretaPackage.MBS_RELACION__MULTIPLICIDAD_B:
				return MULTIPLICIDAD_B_EDEFAULT == null ? multiplicidadB != null : !MULTIPLICIDAD_B_EDEFAULT.equals(multiplicidadB);
			case ConcretaPackage.MBS_RELACION__ROL_A:
				return ROL_A_EDEFAULT == null ? rolA != null : !ROL_A_EDEFAULT.equals(rolA);
			case ConcretaPackage.MBS_RELACION__ROL_B:
				return ROL_B_EDEFAULT == null ? rolB != null : !ROL_B_EDEFAULT.equals(rolB);
			case ConcretaPackage.MBS_RELACION__NAVEGABILIDAD_A:
				return NAVEGABILIDAD_A_EDEFAULT == null ? navegabilidadA != null : !NAVEGABILIDAD_A_EDEFAULT.equals(navegabilidadA);
			case ConcretaPackage.MBS_RELACION__NAVEGABILIDAD_B:
				return NAVEGABILIDAD_B_EDEFAULT == null ? navegabilidadB != null : !NAVEGABILIDAD_B_EDEFAULT.equals(navegabilidadB);
			case ConcretaPackage.MBS_RELACION__LABEL_NAME:
				return LABEL_NAME_EDEFAULT == null ? labelName != null : !LABEL_NAME_EDEFAULT.equals(labelName);
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
		result.append(", multiplicidadA: ");
		result.append(multiplicidadA);
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
		result.append(", labelName: ");
		result.append(labelName);
		result.append(')');
		return result.toString();
	}

} //MBSRelacionImpl
