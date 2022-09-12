/*
 * 
 */
package diagConcreta.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class MBSClaseEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2001;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public MBSClaseEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new diagConcreta.diagram.edit.policies.MBSClaseItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new diagConcreta.diagram.edit.policies.OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new MBSClaseFigure();
	}

	/**
	* @generated
	*/
	public MBSClaseFigure getPrimaryShape() {
		return (MBSClaseFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof diagConcreta.diagram.edit.parts.MBSClaseNombreEditPart) {
			((diagConcreta.diagram.edit.parts.MBSClaseNombreEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureMBSClaseLabelFigure());
			return true;
		}
		if (childEditPart instanceof diagConcreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getMBSClaseAtributosCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((diagConcreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof diagConcreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getMBSClaseMetodosCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((diagConcreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof diagConcreta.diagram.edit.parts.MBSClaseNombreEditPart) {
			return true;
		}
		if (childEditPart instanceof diagConcreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getMBSClaseAtributosCompartmentFigure();
			pane.remove(((diagConcreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof diagConcreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getMBSClaseMetodosCompartmentFigure();
			pane.remove(((diagConcreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof diagConcreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart) {
			return getPrimaryShape().getMBSClaseAtributosCompartmentFigure();
		}
		if (editPart instanceof diagConcreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart) {
			return getPrimaryShape().getMBSClaseMetodosCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
				.getType(diagConcreta.diagram.edit.parts.MBSClaseNombreEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class MBSClaseFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMBSClaseLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fMBSClaseAtributosCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fMBSClaseMetodosCompartmentFigure;

		/**
		 * @generated
		 */
		public MBSClaseFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMBSClaseLabelFigure = new WrappingLabel();

			fFigureMBSClaseLabelFigure.setText("MBSClase");
			fFigureMBSClaseLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureMBSClaseLabelFigure);

			fMBSClaseAtributosCompartmentFigure = new RectangleFigure();

			fMBSClaseAtributosCompartmentFigure.setOutline(false);

			this.add(fMBSClaseAtributosCompartmentFigure);

			fMBSClaseMetodosCompartmentFigure = new RectangleFigure();

			fMBSClaseMetodosCompartmentFigure.setOutline(false);

			this.add(fMBSClaseMetodosCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMBSClaseLabelFigure() {
			return fFigureMBSClaseLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getMBSClaseAtributosCompartmentFigure() {
			return fMBSClaseAtributosCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getMBSClaseMetodosCompartmentFigure() {
			return fMBSClaseMetodosCompartmentFigure;
		}

	}

	/**
	* @generated
	*/
	static final Color THIS_BACK = new Color(null, 240, 255, 255);

}
