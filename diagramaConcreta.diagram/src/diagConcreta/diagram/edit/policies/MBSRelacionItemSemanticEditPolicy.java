/*
* 
*/
package diagConcreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class MBSRelacionItemSemanticEditPolicy
		extends diagConcreta.diagram.edit.policies.DiagConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MBSRelacionItemSemanticEditPolicy() {
		super(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSRelacion_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}