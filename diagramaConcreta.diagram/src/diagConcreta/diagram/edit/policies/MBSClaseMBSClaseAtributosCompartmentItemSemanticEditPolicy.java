/*
* 
*/
package diagConcreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MBSClaseMBSClaseAtributosCompartmentItemSemanticEditPolicy
		extends diagConcreta.diagram.edit.policies.DiagConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MBSClaseMBSClaseAtributosCompartmentItemSemanticEditPolicy() {
		super(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSClase_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSAtributo_3001 == req.getElementType()) {
			return getGEFWrapper(new diagConcreta.diagram.edit.commands.MBSAtributoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
