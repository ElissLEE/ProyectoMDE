/*
 * 
 */
package concreta.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import concreta.diagram.part.ConcretaVisualIDRegistry;

/**
 * @generated
 */
public class ConcretaEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ConcretaVisualIDRegistry.getVisualID(view)) {

			case MBSDiagramaClasesEditPart.VISUAL_ID:
				return new MBSDiagramaClasesEditPart(view);

			case MBSClaseEditPart.VISUAL_ID:
				return new MBSClaseEditPart(view);

			case MBSClaseNombreEditPart.VISUAL_ID:
				return new MBSClaseNombreEditPart(view);

			case MBSPaqueteEditPart.VISUAL_ID:
				return new MBSPaqueteEditPart(view);

			case MBSPaqueteNombreEditPart.VISUAL_ID:
				return new MBSPaqueteNombreEditPart(view);

			case MBSAtributoEditPart.VISUAL_ID:
				return new MBSAtributoEditPart(view);

			case MBSAtributoNombreEditPart.VISUAL_ID:
				return new MBSAtributoNombreEditPart(view);

			case MBSMetodoEditPart.VISUAL_ID:
				return new MBSMetodoEditPart(view);

			case MBSMetodoNombreEditPart.VISUAL_ID:
				return new MBSMetodoNombreEditPart(view);

			case MBSClaseMBSClaseAtributosCompartmentEditPart.VISUAL_ID:
				return new MBSClaseMBSClaseAtributosCompartmentEditPart(view);

			case MBSClaseMBSClaseMetodosCompartmentEditPart.VISUAL_ID:
				return new MBSClaseMBSClaseMetodosCompartmentEditPart(view);

			case MBSRelacionEditPart.VISUAL_ID:
				return new MBSRelacionEditPart(view);

			case MBSRelacionLabelNameEditPart.VISUAL_ID:
				return new MBSRelacionLabelNameEditPart(view);

			case MBSHerenciaEditPart.VISUAL_ID:
				return new MBSHerenciaEditPart(view);

			case MBSContainmentEditPart.VISUAL_ID:
				return new MBSContainmentEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
