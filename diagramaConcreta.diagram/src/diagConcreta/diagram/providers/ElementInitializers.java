/*
 * 
 */
package diagConcreta.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
