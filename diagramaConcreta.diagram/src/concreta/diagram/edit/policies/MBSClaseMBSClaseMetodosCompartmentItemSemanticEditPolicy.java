/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.MBSMetodoCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class MBSClaseMBSClaseMetodosCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MBSClaseMBSClaseMetodosCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.MBSClase_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.MBSMetodo_3002 == req.getElementType()) {
			return getGEFWrapper(new MBSMetodoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
