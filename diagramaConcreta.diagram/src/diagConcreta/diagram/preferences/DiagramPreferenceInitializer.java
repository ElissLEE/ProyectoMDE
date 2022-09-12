/*
 * 
 */
package diagConcreta.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		diagConcreta.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		diagConcreta.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		diagConcreta.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		diagConcreta.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		diagConcreta.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
