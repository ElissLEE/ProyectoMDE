package diagrama.view.views;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;

import diagrama.model.ModelFactoryModel;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import javax.inject.Inject;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class GeneratorView extends ViewPart {
	public GeneratorView() {
	}

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "diagrama.view.views.GeneratorView";




	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(null);
		
		Group grpGeneracionDeModelo = new Group(parent, SWT.NONE);
		grpGeneracionDeModelo.setText("Generacion de modelo a modelo");
		grpGeneracionDeModelo.setBounds(38, 31, 500, 119);
		
		Button btnGenerateMm = new Button(grpGeneracionDeModelo, SWT.NONE);
		btnGenerateMm.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.generarModelToModel();
			}
		});
		btnGenerateMm.setBounds(205, 47, 104, 25);
		btnGenerateMm.setText("Generate M2M");
		
		Group grpGeneracionDeModelo_2 = new Group(parent, SWT.NONE);
		grpGeneracionDeModelo_2.setText("Generacion de modelo a texto");
		grpGeneracionDeModelo_2.setBounds(38, 182, 500, 119);
		
		Button btnGenerateMt = new Button(grpGeneracionDeModelo_2, SWT.NONE);
		btnGenerateMt.setText("Generate M2T");
		btnGenerateMt.setBounds(205, 47, 104, 25);

	}



	@Override
	public void setFocus() {
		
	}
}