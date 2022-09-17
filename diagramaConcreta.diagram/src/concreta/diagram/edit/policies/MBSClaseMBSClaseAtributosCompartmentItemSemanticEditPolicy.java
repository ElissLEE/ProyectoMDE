/*
* 
*/
package concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concreta.diagram.edit.commands.MBSAtributoCreateCommand;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class MBSClaseMBSClaseAtributosCompartmentItemSemanticEditPolicy extends ConcretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MBSClaseMBSClaseAtributosCompartmentItemSemanticEditPolicy() {
		super(ConcretaElementTypes.MBSClase_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcretaElementTypes.MBSAtributo_3001 == req.getElementType()) {
			return getGEFWrapper(new MBSAtributoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
