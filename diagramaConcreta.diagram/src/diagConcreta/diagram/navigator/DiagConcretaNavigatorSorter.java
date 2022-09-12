/*
* 
*/
package diagConcreta.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class DiagConcretaNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7004;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof diagConcreta.diagram.navigator.DiagConcretaNavigatorItem) {
			diagConcreta.diagram.navigator.DiagConcretaNavigatorItem item = (diagConcreta.diagram.navigator.DiagConcretaNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
