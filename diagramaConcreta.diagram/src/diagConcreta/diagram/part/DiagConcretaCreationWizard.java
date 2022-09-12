/*
 * 
 */
package diagConcreta.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class DiagConcretaCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected diagConcreta.diagram.part.DiagConcretaCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected diagConcreta.diagram.part.DiagConcretaCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(diagConcreta.diagram.part.Messages.DiagConcretaCreationWizardTitle);
		setDefaultPageImageDescriptor(diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewDiagConcretaWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new diagConcreta.diagram.part.DiagConcretaCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "diagconcreta_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(diagConcreta.diagram.part.Messages.DiagConcretaCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				diagConcreta.diagram.part.Messages.DiagConcretaCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new diagConcreta.diagram.part.DiagConcretaCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "diagconcreta") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".diagconcreta_diagram".length()); //$NON-NLS-1$
					setFileName(diagConcreta.diagram.part.DiagConcretaDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "diagconcreta")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(diagConcreta.diagram.part.Messages.DiagConcretaCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				diagConcreta.diagram.part.Messages.DiagConcretaCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = diagConcreta.diagram.part.DiagConcretaDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						diagConcreta.diagram.part.DiagConcretaDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								diagConcreta.diagram.part.Messages.DiagConcretaCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						diagConcreta.diagram.part.Messages.DiagConcretaCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
