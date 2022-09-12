/*
* 
*/
package diagConcreta.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class DiagConcretaNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public DiagConcretaNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<diagConcreta.diagram.navigator.DiagConcretaNavigatorItem> result = new ArrayList<diagConcreta.diagram.navigator.DiagConcretaNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup) {
			diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup group = (diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof diagConcreta.diagram.navigator.DiagConcretaNavigatorItem) {
			diagConcreta.diagram.navigator.DiagConcretaNavigatorItem navigatorItem = (diagConcreta.diagram.navigator.DiagConcretaNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(view)) {

		case diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID: {
			LinkedList<diagConcreta.diagram.navigator.DiagConcretaAbstractNavigatorItem> result = new LinkedList<diagConcreta.diagram.navigator.DiagConcretaAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup links = new diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup(
					diagConcreta.diagram.part.Messages.NavigatorGroupName_MBSDiagramaClases_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
							.getType(diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
							.getType(diagConcreta.diagram.edit.parts.MBSPaqueteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
							.getType(diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID: {
			LinkedList<diagConcreta.diagram.navigator.DiagConcretaAbstractNavigatorItem> result = new LinkedList<diagConcreta.diagram.navigator.DiagConcretaAbstractNavigatorItem>();
			Node sv = (Node) view;
			diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup incominglinks = new diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup(
					diagConcreta.diagram.part.Messages.NavigatorGroupName_MBSClase_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup outgoinglinks = new diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup(
					diagConcreta.diagram.part.Messages.NavigatorGroupName_MBSClase_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getType(
							diagConcreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
					.getType(diagConcreta.diagram.edit.parts.MBSAtributoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getType(
							diagConcreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
					.getType(diagConcreta.diagram.edit.parts.MBSMetodoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
							.getType(diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
							.getType(diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID: {
			LinkedList<diagConcreta.diagram.navigator.DiagConcretaAbstractNavigatorItem> result = new LinkedList<diagConcreta.diagram.navigator.DiagConcretaAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup target = new diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup(
					diagConcreta.diagram.part.Messages.NavigatorGroupName_MBSRelacion_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup source = new diagConcreta.diagram.navigator.DiagConcretaNavigatorGroup(
					diagConcreta.diagram.part.Messages.NavigatorGroupName_MBSRelacion_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
							.getType(diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
							.getType(diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.MODEL_ID
				.equals(diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<diagConcreta.diagram.navigator.DiagConcretaNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<diagConcreta.diagram.navigator.DiagConcretaNavigatorItem> result = new ArrayList<diagConcreta.diagram.navigator.DiagConcretaNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new diagConcreta.diagram.navigator.DiagConcretaNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<diagConcreta.diagram.navigator.DiagConcretaNavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof diagConcreta.diagram.navigator.DiagConcretaAbstractNavigatorItem) {
			diagConcreta.diagram.navigator.DiagConcretaAbstractNavigatorItem abstractNavigatorItem = (diagConcreta.diagram.navigator.DiagConcretaAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
