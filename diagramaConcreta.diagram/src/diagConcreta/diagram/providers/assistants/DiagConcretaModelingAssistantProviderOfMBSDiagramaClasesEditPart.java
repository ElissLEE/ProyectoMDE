/*
 * 
 */
package diagConcreta.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DiagConcretaModelingAssistantProviderOfMBSDiagramaClasesEditPart
		extends diagConcreta.diagram.providers.DiagConcretaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSClase_2001);
		types.add(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSPaquete_2002);
		return types;
	}

}
