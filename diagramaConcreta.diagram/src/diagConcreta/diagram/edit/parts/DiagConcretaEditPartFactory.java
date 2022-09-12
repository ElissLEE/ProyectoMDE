/*
 * 
 */
package diagConcreta.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class DiagConcretaEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(view)) {

			case diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID:
				return new diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart(view);

			case diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID:
				return new diagConcreta.diagram.edit.parts.MBSClaseEditPart(view);

			case diagConcreta.diagram.edit.parts.MBSClaseNombreEditPart.VISUAL_ID:
				return new diagConcreta.diagram.edit.parts.MBSClaseNombreEditPart(view);

			case diagConcreta.diagram.edit.parts.MBSPaqueteEditPart.VISUAL_ID:
				return new diagConcreta.diagram.edit.parts.MBSPaqueteEditPart(view);

			case diagConcreta.diagram.edit.parts.MBSPaqueteNombreEditPart.VISUAL_ID:
				return new diagConcreta.diagram.edit.parts.MBSPaqueteNombreEditPart(view);

			case diagConcreta.diagram.edit.parts.MBSAtributoEditPart.VISUAL_ID:
				return new diagConcreta.diagram.edit.parts.MBSAtributoEditPart(view);

			case diagConcreta.diagram.edit.parts.MBSAtributoNombreEditPart.VISUAL_ID:
				return new diagConcreta.diagram.edit.parts.MBSAtributoNombreEditPart(view);

			case diagConcreta.diagram.edit.parts.MBSMetodoEditPart.VISUAL_ID:
				return new diagConcreta.diagram.edit.parts.MBSMetodoEditPart(view);

			case diagConcreta.diagram.edit.parts.MBSMetodoNombreEditPart.VISUAL_ID:
				return new diagConcreta.diagram.edit.parts.MBSMetodoNombreEditPart(view);

			case diagConcreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart.VISUAL_ID:
				return new diagConcreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart(view);

			case diagConcreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart.VISUAL_ID:
				return new diagConcreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart(view);

			case diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID:
				return new diagConcreta.diagram.edit.parts.MBSRelacionEditPart(view);

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
