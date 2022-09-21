/*
* 
*/
package concreta.diagram.navigator;

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

import concreta.MBSDiagramaClases;
import concreta.MBSRelacion;
import concreta.diagram.edit.parts.MBSAtributoEditPart;
import concreta.diagram.edit.parts.MBSAtributoNombreEditPart;
import concreta.diagram.edit.parts.MBSClaseEditPart;
import concreta.diagram.edit.parts.MBSClaseNombreEditPart;
import concreta.diagram.edit.parts.MBSDiagramaClasesEditPart;
import concreta.diagram.edit.parts.MBSMetodoEditPart;
import concreta.diagram.edit.parts.MBSMetodoNombreEditPart;
import concreta.diagram.edit.parts.MBSPaqueteEditPart;
import concreta.diagram.edit.parts.MBSPaqueteNombreEditPart;
import concreta.diagram.edit.parts.MBSRelacionEditPart;
import concreta.diagram.part.ConcretaDiagramEditorPlugin;
import concreta.diagram.part.ConcretaVisualIDRegistry;
import concreta.diagram.providers.ConcretaElementTypes;
import concreta.diagram.providers.ConcretaParserProvider;

/**
 * @generated
 */
public class ConcretaNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ConcretaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ConcretaDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ConcretaNavigatorItem && !isOwnView(((ConcretaNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ConcretaNavigatorGroup) {
			ConcretaNavigatorGroup group = (ConcretaNavigatorGroup) element;
			return ConcretaDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ConcretaNavigatorItem) {
			ConcretaNavigatorItem navigatorItem = (ConcretaNavigatorItem) element;
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
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case MBSDiagramaClasesEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?concreta?MBSDiagramaClases", //$NON-NLS-1$
					ConcretaElementTypes.MBSDiagramaClases_1000);
		case MBSClaseEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?concreta?MBSClase", ConcretaElementTypes.MBSClase_2001); //$NON-NLS-1$
		case MBSPaqueteEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?concreta?MBSPaquete", ConcretaElementTypes.MBSPaquete_2002); //$NON-NLS-1$
		case MBSAtributoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concreta?MBSAtributo", ConcretaElementTypes.MBSAtributo_3001); //$NON-NLS-1$
		case MBSMetodoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concreta?MBSMetodo", ConcretaElementTypes.MBSMetodo_3002); //$NON-NLS-1$
		case MBSRelacionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concreta?MBSRelacion", ConcretaElementTypes.MBSRelacion_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ConcretaDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ConcretaElementTypes.isKnownElementType(elementType)) {
			image = ConcretaElementTypes.getImage(elementType);
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
		if (element instanceof ConcretaNavigatorGroup) {
			ConcretaNavigatorGroup group = (ConcretaNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ConcretaNavigatorItem) {
			ConcretaNavigatorItem navigatorItem = (ConcretaNavigatorItem) element;
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
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case MBSDiagramaClasesEditPart.VISUAL_ID:
			return getMBSDiagramaClases_1000Text(view);
		case MBSClaseEditPart.VISUAL_ID:
			return getMBSClase_2001Text(view);
		case MBSPaqueteEditPart.VISUAL_ID:
			return getMBSPaquete_2002Text(view);
		case MBSAtributoEditPart.VISUAL_ID:
			return getMBSAtributo_3001Text(view);
		case MBSMetodoEditPart.VISUAL_ID:
			return getMBSMetodo_3002Text(view);
		case MBSRelacionEditPart.VISUAL_ID:
			return getMBSRelacion_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getMBSDiagramaClases_1000Text(View view) {
		MBSDiagramaClases domainModelElement = (MBSDiagramaClases) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMBSClase_2001Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.MBSClase_2001,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(MBSClaseNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMBSPaquete_2002Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.MBSPaquete_2002,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(MBSPaqueteNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMBSAtributo_3001Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.MBSAtributo_3001,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(MBSAtributoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMBSMetodo_3002Text(View view) {
		IParser parser = ConcretaParserProvider.getParser(ConcretaElementTypes.MBSMetodo_3002,
				view.getElement() != null ? view.getElement() : view,
				ConcretaVisualIDRegistry.getType(MBSMetodoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMBSRelacion_4001Text(View view) {
		MBSRelacion domainModelElement = (MBSRelacion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			ConcretaDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
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
		return MBSDiagramaClasesEditPart.MODEL_ID.equals(ConcretaVisualIDRegistry.getModelID(view));
	}

}
