/**
 */
package abstracta.provider;


import abstracta.AbstractaFactory;
import abstracta.AbstractaPackage;
import abstracta.MBSClase;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link abstracta.MBSClase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MBSClaseItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSClaseItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdClasePropertyDescriptor(object);
			addNombrePropertyDescriptor(object);
			addEstereotipoPropertyDescriptor(object);
			addModificadorAccesoPropertyDescriptor(object);
			addAbstractaPropertyDescriptor(object);
			addDescripcionPropertyDescriptor(object);
			addRutaPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id Clase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdClasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MBSClase_idClase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MBSClase_idClase_feature", "_UI_MBSClase_type"),
				 AbstractaPackage.Literals.MBS_CLASE__ID_CLASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MBSClase_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MBSClase_nombre_feature", "_UI_MBSClase_type"),
				 AbstractaPackage.Literals.MBS_CLASE__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Estereotipo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstereotipoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MBSClase_estereotipo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MBSClase_estereotipo_feature", "_UI_MBSClase_type"),
				 AbstractaPackage.Literals.MBS_CLASE__ESTEREOTIPO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modificador Acceso feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModificadorAccesoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MBSClase_modificadorAcceso_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MBSClase_modificadorAcceso_feature", "_UI_MBSClase_type"),
				 AbstractaPackage.Literals.MBS_CLASE__MODIFICADOR_ACCESO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstracta feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MBSClase_abstracta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MBSClase_abstracta_feature", "_UI_MBSClase_type"),
				 AbstractaPackage.Literals.MBS_CLASE__ABSTRACTA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Descripcion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescripcionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MBSClase_descripcion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MBSClase_descripcion_feature", "_UI_MBSClase_type"),
				 AbstractaPackage.Literals.MBS_CLASE__DESCRIPCION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ruta feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRutaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MBSClase_ruta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MBSClase_ruta_feature", "_UI_MBSClase_type"),
				 AbstractaPackage.Literals.MBS_CLASE__RUTA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AbstractaPackage.Literals.MBS_CLASE__ATRIBUTOS);
			childrenFeatures.add(AbstractaPackage.Literals.MBS_CLASE__METODOS);
			childrenFeatures.add(AbstractaPackage.Literals.MBS_CLASE__LISTA_RELACIONES);
			childrenFeatures.add(AbstractaPackage.Literals.MBS_CLASE__LISTA_RELACIONES_HERENCIA);
			childrenFeatures.add(AbstractaPackage.Literals.MBS_CLASE__LISTA_RELACIONES_CONTAINMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MBSClase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MBSClase"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MBSClase)object).getIdClase();
		return label == null || label.length() == 0 ?
			getString("_UI_MBSClase_type") :
			getString("_UI_MBSClase_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MBSClase.class)) {
			case AbstractaPackage.MBS_CLASE__ID_CLASE:
			case AbstractaPackage.MBS_CLASE__NOMBRE:
			case AbstractaPackage.MBS_CLASE__ESTEREOTIPO:
			case AbstractaPackage.MBS_CLASE__MODIFICADOR_ACCESO:
			case AbstractaPackage.MBS_CLASE__ABSTRACTA:
			case AbstractaPackage.MBS_CLASE__DESCRIPCION:
			case AbstractaPackage.MBS_CLASE__RUTA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AbstractaPackage.MBS_CLASE__ATRIBUTOS:
			case AbstractaPackage.MBS_CLASE__METODOS:
			case AbstractaPackage.MBS_CLASE__LISTA_RELACIONES:
			case AbstractaPackage.MBS_CLASE__LISTA_RELACIONES_HERENCIA:
			case AbstractaPackage.MBS_CLASE__LISTA_RELACIONES_CONTAINMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.MBS_CLASE__ATRIBUTOS,
				 AbstractaFactory.eINSTANCE.createMBSAtributo()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.MBS_CLASE__METODOS,
				 AbstractaFactory.eINSTANCE.createMBSMetodo()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.MBS_CLASE__LISTA_RELACIONES,
				 AbstractaFactory.eINSTANCE.createMBSRelacion()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.MBS_CLASE__LISTA_RELACIONES_HERENCIA,
				 AbstractaFactory.eINSTANCE.createMBSHerencia()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.MBS_CLASE__LISTA_RELACIONES_CONTAINMENT,
				 AbstractaFactory.eINSTANCE.createMBSContainment()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AbstractaEditPlugin.INSTANCE;
	}

}