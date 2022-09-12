/*
* 
*/
package diagConcreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MBSClaseMBSClaseMetodosCompartmentItemSemanticEditPolicy
		extends diagConcreta.diagram.edit.policies.DiagConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MBSClaseMBSClaseMetodosCompartmentItemSemanticEditPolicy() {
		super(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSClase_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSMetodo_3002 == req.getElementType()) {
			return getGEFWrapper(new diagConcreta.diagram.edit.commands.MBSMetodoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
