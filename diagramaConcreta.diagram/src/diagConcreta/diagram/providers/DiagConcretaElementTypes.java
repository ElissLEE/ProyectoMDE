/*
 * 
 */
package diagConcreta.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class DiagConcretaElementTypes {

	/**
	* @generated
	*/
	private DiagConcretaElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType MBSDiagramaClases_1000 = getElementType(
			"diagramaConcreta.diagram.MBSDiagramaClases_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MBSClase_2001 = getElementType("diagramaConcreta.diagram.MBSClase_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MBSPaquete_2002 = getElementType("diagramaConcreta.diagram.MBSPaquete_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MBSAtributo_3001 = getElementType("diagramaConcreta.diagram.MBSAtributo_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MBSMetodo_3002 = getElementType("diagramaConcreta.diagram.MBSMetodo_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MBSRelacion_4001 = getElementType("diagramaConcreta.diagram.MBSRelacion_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(MBSDiagramaClases_1000, diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSDiagramaClases());

			elements.put(MBSClase_2001, diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSClase());

			elements.put(MBSPaquete_2002, diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSPaquete());

			elements.put(MBSAtributo_3001, diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSAtributo());

			elements.put(MBSMetodo_3002, diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSMetodo());

			elements.put(MBSRelacion_4001, diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSRelacion());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(MBSDiagramaClases_1000);
			KNOWN_ELEMENT_TYPES.add(MBSClase_2001);
			KNOWN_ELEMENT_TYPES.add(MBSPaquete_2002);
			KNOWN_ELEMENT_TYPES.add(MBSAtributo_3001);
			KNOWN_ELEMENT_TYPES.add(MBSMetodo_3002);
			KNOWN_ELEMENT_TYPES.add(MBSRelacion_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID:
			return MBSDiagramaClases_1000;
		case diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID:
			return MBSClase_2001;
		case diagConcreta.diagram.edit.parts.MBSPaqueteEditPart.VISUAL_ID:
			return MBSPaquete_2002;
		case diagConcreta.diagram.edit.parts.MBSAtributoEditPart.VISUAL_ID:
			return MBSAtributo_3001;
		case diagConcreta.diagram.edit.parts.MBSMetodoEditPart.VISUAL_ID:
			return MBSMetodo_3002;
		case diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID:
			return MBSRelacion_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return diagConcreta.diagram.providers.DiagConcretaElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return diagConcreta.diagram.providers.DiagConcretaElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return diagConcreta.diagram.providers.DiagConcretaElementTypes.getElement(elementTypeAdapter);
		}
	};

}
