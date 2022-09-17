/**
 */
package concreta.impl;

import concreta.ConcretaPackage;
import concreta.MBSAtributo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MBS Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.MBSAtributoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.impl.MBSAtributoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link concreta.impl.MBSAtributoImpl#getModificadorAcesso <em>Modificador Acesso</em>}</li>
 *   <li>{@link concreta.impl.MBSAtributoImpl#getValorDefecto <em>Valor Defecto</em>}</li>
 *   <li>{@link concreta.impl.MBSAtributoImpl#isConstante <em>Constante</em>}</li>
 *   <li>{@link concreta.impl.MBSAtributoImpl#getRuta <em>Ruta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MBSAtributoImpl extends EObjectImpl implements MBSAtributo {
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
	 * The default value of the '{@link #getModificadorAcesso() <em>Modificador Acesso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificadorAcesso()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFICADOR_ACESSO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModificadorAcesso() <em>Modificador Acesso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificadorAcesso()
	 * @generated
	 * @ordered
	 */
	protected String modificadorAcesso = MODIFICADOR_ACESSO_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorDefecto() <em>Valor Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorDefecto()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_DEFECTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValorDefecto() <em>Valor Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorDefecto()
	 * @generated
	 * @ordered
	 */
	protected String valorDefecto = VALOR_DEFECTO_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstante() <em>Constante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstante()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstante() <em>Constante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstante()
	 * @generated
	 * @ordered
	 */
	protected boolean constante = CONSTANTE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSAtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.MBS_ATRIBUTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_ATRIBUTO__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_ATRIBUTO__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModificadorAcesso() {
		return modificadorAcesso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificadorAcesso(String newModificadorAcesso) {
		String oldModificadorAcesso = modificadorAcesso;
		modificadorAcesso = newModificadorAcesso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_ATRIBUTO__MODIFICADOR_ACESSO, oldModificadorAcesso, modificadorAcesso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValorDefecto() {
		return valorDefecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorDefecto(String newValorDefecto) {
		String oldValorDefecto = valorDefecto;
		valorDefecto = newValorDefecto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_ATRIBUTO__VALOR_DEFECTO, oldValorDefecto, valorDefecto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstante() {
		return constante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstante(boolean newConstante) {
		boolean oldConstante = constante;
		constante = newConstante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_ATRIBUTO__CONSTANTE, oldConstante, constante));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.MBS_ATRIBUTO__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretaPackage.MBS_ATRIBUTO__NOMBRE:
				return getNombre();
			case ConcretaPackage.MBS_ATRIBUTO__TIPO:
				return getTipo();
			case ConcretaPackage.MBS_ATRIBUTO__MODIFICADOR_ACESSO:
				return getModificadorAcesso();
			case ConcretaPackage.MBS_ATRIBUTO__VALOR_DEFECTO:
				return getValorDefecto();
			case ConcretaPackage.MBS_ATRIBUTO__CONSTANTE:
				return isConstante();
			case ConcretaPackage.MBS_ATRIBUTO__RUTA:
				return getRuta();
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
			case ConcretaPackage.MBS_ATRIBUTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ConcretaPackage.MBS_ATRIBUTO__TIPO:
				setTipo((String)newValue);
				return;
			case ConcretaPackage.MBS_ATRIBUTO__MODIFICADOR_ACESSO:
				setModificadorAcesso((String)newValue);
				return;
			case ConcretaPackage.MBS_ATRIBUTO__VALOR_DEFECTO:
				setValorDefecto((String)newValue);
				return;
			case ConcretaPackage.MBS_ATRIBUTO__CONSTANTE:
				setConstante((Boolean)newValue);
				return;
			case ConcretaPackage.MBS_ATRIBUTO__RUTA:
				setRuta((String)newValue);
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
			case ConcretaPackage.MBS_ATRIBUTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ConcretaPackage.MBS_ATRIBUTO__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case ConcretaPackage.MBS_ATRIBUTO__MODIFICADOR_ACESSO:
				setModificadorAcesso(MODIFICADOR_ACESSO_EDEFAULT);
				return;
			case ConcretaPackage.MBS_ATRIBUTO__VALOR_DEFECTO:
				setValorDefecto(VALOR_DEFECTO_EDEFAULT);
				return;
			case ConcretaPackage.MBS_ATRIBUTO__CONSTANTE:
				setConstante(CONSTANTE_EDEFAULT);
				return;
			case ConcretaPackage.MBS_ATRIBUTO__RUTA:
				setRuta(RUTA_EDEFAULT);
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
			case ConcretaPackage.MBS_ATRIBUTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ConcretaPackage.MBS_ATRIBUTO__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case ConcretaPackage.MBS_ATRIBUTO__MODIFICADOR_ACESSO:
				return MODIFICADOR_ACESSO_EDEFAULT == null ? modificadorAcesso != null : !MODIFICADOR_ACESSO_EDEFAULT.equals(modificadorAcesso);
			case ConcretaPackage.MBS_ATRIBUTO__VALOR_DEFECTO:
				return VALOR_DEFECTO_EDEFAULT == null ? valorDefecto != null : !VALOR_DEFECTO_EDEFAULT.equals(valorDefecto);
			case ConcretaPackage.MBS_ATRIBUTO__CONSTANTE:
				return constante != CONSTANTE_EDEFAULT;
			case ConcretaPackage.MBS_ATRIBUTO__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
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
		result.append(", modificadorAcesso: ");
		result.append(modificadorAcesso);
		result.append(", valorDefecto: ");
		result.append(valorDefecto);
		result.append(", constante: ");
		result.append(constante);
		result.append(", ruta: ");
		result.append(ruta);
		result.append(')');
		return result.toString();
	}

} //MBSAtributoImpl
