/*
 * 
 */
package diagConcreta.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class MBSRelacionReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public MBSRelacionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof diagConcreta.MBSRelacion) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof diagConcreta.MBSClase && newEnd instanceof diagConcreta.MBSClase)) {
			return false;
		}
		diagConcreta.MBSClase target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof diagConcreta.MBSDiagramaClases)) {
			return false;
		}
		diagConcreta.MBSDiagramaClases container = (diagConcreta.MBSDiagramaClases) getLink().eContainer();
		return diagConcreta.diagram.edit.policies.DiagConcretaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistMBSRelacion_4001(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof diagConcreta.MBSClase && newEnd instanceof diagConcreta.MBSClase)) {
			return false;
		}
		diagConcreta.MBSClase source = getLink().getSource();
		if (!(getLink().eContainer() instanceof diagConcreta.MBSDiagramaClases)) {
			return false;
		}
		diagConcreta.MBSDiagramaClases container = (diagConcreta.MBSDiagramaClases) getLink().eContainer();
		return diagConcreta.diagram.edit.policies.DiagConcretaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistMBSRelacion_4001(container, getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected diagConcreta.MBSRelacion getLink() {
		return (diagConcreta.MBSRelacion) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected diagConcreta.MBSClase getOldSource() {
		return (diagConcreta.MBSClase) oldEnd;
	}

	/**
	* @generated
	*/
	protected diagConcreta.MBSClase getNewSource() {
		return (diagConcreta.MBSClase) newEnd;
	}

	/**
	* @generated
	*/
	protected diagConcreta.MBSClase getOldTarget() {
		return (diagConcreta.MBSClase) oldEnd;
	}

	/**
	* @generated
	*/
	protected diagConcreta.MBSClase getNewTarget() {
		return (diagConcreta.MBSClase) newEnd;
	}
}
