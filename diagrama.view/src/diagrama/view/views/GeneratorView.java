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
		grpGeneracionDeModelo.setBounds(10, 10, 574, 132);
		
		Button btnGenerateMm = new Button(grpGeneracionDeModelo, SWT.NONE);
		btnGenerateMm.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.generarModelToModel();
			}
		});
		btnGenerateMm.setBounds(219, 55, 138, 25);
		btnGenerateMm.setText("Generate M2M");
		
		Group grpGeneracionDeModelo_2 = new Group(parent, SWT.NONE);
		grpGeneracionDeModelo_2.setText("Generacion de modelo a texto");
		grpGeneracionDeModelo_2.setBounds(10, 154, 574, 132);
		
		Button btnGenerateMt = new Button(grpGeneracionDeModelo_2, SWT.NONE);
		btnGenerateMt.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.generarModelToText();
			}
		});
		btnGenerateMt.setText("Generate M2T");
		btnGenerateMt.setBounds(219, 55, 138, 25);

	}

	@Override
	public void setFocus() {
		
	}
}
