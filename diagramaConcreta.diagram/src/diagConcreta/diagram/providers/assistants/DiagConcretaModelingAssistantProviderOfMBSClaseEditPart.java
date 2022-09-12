/*
 * 
 */
package diagConcreta.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DiagConcretaModelingAssistantProviderOfMBSClaseEditPart
		extends diagConcreta.diagram.providers.DiagConcretaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((diagConcreta.diagram.edit.parts.MBSClaseEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(diagConcreta.diagram.edit.parts.MBSClaseEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSRelacion_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((diagConcreta.diagram.edit.parts.MBSClaseEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(diagConcreta.diagram.edit.parts.MBSClaseEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof diagConcreta.diagram.edit.parts.MBSClaseEditPart) {
			types.add(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSRelacion_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((diagConcreta.diagram.edit.parts.MBSClaseEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(diagConcreta.diagram.edit.parts.MBSClaseEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSRelacion_4001) {
			types.add(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSClase_2001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((diagConcreta.diagram.edit.parts.MBSClaseEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(diagConcreta.diagram.edit.parts.MBSClaseEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSRelacion_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((diagConcreta.diagram.edit.parts.MBSClaseEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(diagConcreta.diagram.edit.parts.MBSClaseEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSRelacion_4001) {
			types.add(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSClase_2001);
		}
		return types;
	}

}
