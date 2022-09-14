/*
* 
*/
package diagConcreta.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class DiagConcretaNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof diagConcreta.diagram.navigator.DiagConcretaNavigatorItem
				&& !isOwnView(((diagConcreta.diagram.navigator.DiagConcretaNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup) {
			diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup group = (diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup) element;
			return diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof diagConcreta.diagram.navigator.DiagConcretaNavigatorItem) {
			diagConcreta.diagram.navigator.DiagConcretaNavigatorItem navigatorItem = (diagConcreta.diagram.navigator.DiagConcretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(view)) {
		case diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?diagConcreta?MBSDiagramaClases", //$NON-NLS-1$
					diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSDiagramaClases_1000);
		case diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?diagConcreta?MBSClase", //$NON-NLS-1$
					diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSClase_2001);
		case diagConcreta.diagram.edit.parts.MBSPaqueteEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?diagConcreta?MBSPaquete", //$NON-NLS-1$
					diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSPaquete_2002);
		case diagConcreta.diagram.edit.parts.MBSAtributoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?diagConcreta?MBSAtributo", //$NON-NLS-1$
					diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSAtributo_3001);
		case diagConcreta.diagram.edit.parts.MBSMetodoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?diagConcreta?MBSMetodo", //$NON-NLS-1$
					diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSMetodo_3002);
		case diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?diagConcreta?MBSRelacion", //$NON-NLS-1$
					diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSRelacion_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& diagConcreta.diagram.providers.DiagConcretaElementTypes.isKnownElementType(elementType)) {
			image = diagConcreta.diagram.providers.DiagConcretaElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup) {
			diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup group = (diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof diagConcreta.diagram.navigator.DiagConcretaNavigatorItem) {
			diagConcreta.diagram.navigator.DiagConcretaNavigatorItem navigatorItem = (diagConcreta.diagram.navigator.DiagConcretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(view)) {
		case diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID:
			return getMBSDiagramaClases_1000Text(view);
		case diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID:
			return getMBSClase_2001Text(view);
		case diagConcreta.diagram.edit.parts.MBSPaqueteEditPart.VISUAL_ID:
			return getMBSPaquete_2002Text(view);
		case diagConcreta.diagram.edit.parts.MBSAtributoEditPart.VISUAL_ID:
			return getMBSAtributo_3001Text(view);
		case diagConcreta.diagram.edit.parts.MBSMetodoEditPart.VISUAL_ID:
			return getMBSMetodo_3002Text(view);
		case diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID:
			return getMBSRelacion_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getMBSDiagramaClases_1000Text(View view) {
		diagConcreta.MBSDiagramaClases domainModelElement = (diagConcreta.MBSDiagramaClases) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getIdClase();
		} else {
			diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMBSClase_2001Text(View view) {
		IParser parser = diagConcreta.diagram.providers.DiagConcretaParserProvider.getParser(
				diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSClase_2001,
				view.getElement() != null ? view.getElement() : view,
				diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
						.getType(diagConcreta.diagram.edit.parts.MBSClaseNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMBSPaquete_2002Text(View view) {
		IParser parser = diagConcreta.diagram.providers.DiagConcretaParserProvider.getParser(
				diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSPaquete_2002,
				view.getElement() != null ? view.getElement() : view,
				diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
						.getType(diagConcreta.diagram.edit.parts.MBSPaqueteNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMBSAtributo_3001Text(View view) {
		IParser parser = diagConcreta.diagram.providers.DiagConcretaParserProvider.getParser(
				diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSAtributo_3001,
				view.getElement() != null ? view.getElement() : view,
				diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
						.getType(diagConcreta.diagram.edit.parts.MBSAtributoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMBSMetodo_3002Text(View view) {
		IParser parser = diagConcreta.diagram.providers.DiagConcretaParserProvider.getParser(
				diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSMetodo_3002,
				view.getElement() != null ? view.getElement() : view,
				diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
						.getType(diagConcreta.diagram.edit.parts.MBSMetodoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMBSRelacion_4001Text(View view) {
		IParser parser = diagConcreta.diagram.providers.DiagConcretaParserProvider.getParser(
				diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSRelacion_4001,
				view.getElement() != null ? view.getElement() : view,
				diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
						.getType(diagConcreta.diagram.edit.parts.MBSRelacionLabelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.MODEL_ID
				.equals(diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getModelID(view));
	}

}
