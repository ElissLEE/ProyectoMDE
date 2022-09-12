/*
* 
*/
package diagConcreta.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class MBSDiagramaClasesItemSemanticEditPolicy
		extends diagConcreta.diagram.edit.policies.DiagConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MBSDiagramaClasesItemSemanticEditPolicy() {
		super(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSDiagramaClases_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSClase_2001 == req.getElementType()) {
			return getGEFWrapper(new diagConcreta.diagram.edit.commands.MBSClaseCreateCommand(req));
		}
		if (diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSPaquete_2002 == req.getElementType()) {
			return getGEFWrapper(new diagConcreta.diagram.edit.commands.MBSPaqueteCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
