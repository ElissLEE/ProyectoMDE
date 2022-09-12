/*
* 
*/
package diagConcreta.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DiagConcretaVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "diagramaConcreta.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.MODEL_ID.equals(view.getType())) {
				return diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				diagConcreta.diagram.part.DiagConcretaDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSDiagramaClases().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((diagConcreta.MBSDiagramaClases) domainElement)) {
			return diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getModelID(containerView);
		if (!diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.MODEL_ID.equals(containerModelID)
				&& !"diagConcreta".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID:
			if (diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSClase().isSuperTypeOf(domainElement.eClass())) {
				return diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID;
			}
			if (diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSPaquete().isSuperTypeOf(domainElement.eClass())) {
				return diagConcreta.diagram.edit.parts.MBSPaqueteEditPart.VISUAL_ID;
			}
			break;
		case diagConcreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart.VISUAL_ID:
			if (diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSAtributo().isSuperTypeOf(domainElement.eClass())) {
				return diagConcreta.diagram.edit.parts.MBSAtributoEditPart.VISUAL_ID;
			}
			break;
		case diagConcreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart.VISUAL_ID:
			if (diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSMetodo().isSuperTypeOf(domainElement.eClass())) {
				return diagConcreta.diagram.edit.parts.MBSMetodoEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getModelID(containerView);
		if (!diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.MODEL_ID.equals(containerModelID)
				&& !"diagConcreta".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID:
			if (diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (diagConcreta.diagram.edit.parts.MBSPaqueteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID:
			if (diagConcreta.diagram.edit.parts.MBSClaseNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (diagConcreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (diagConcreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case diagConcreta.diagram.edit.parts.MBSPaqueteEditPart.VISUAL_ID:
			if (diagConcreta.diagram.edit.parts.MBSPaqueteNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case diagConcreta.diagram.edit.parts.MBSAtributoEditPart.VISUAL_ID:
			if (diagConcreta.diagram.edit.parts.MBSAtributoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case diagConcreta.diagram.edit.parts.MBSMetodoEditPart.VISUAL_ID:
			if (diagConcreta.diagram.edit.parts.MBSMetodoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case diagConcreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart.VISUAL_ID:
			if (diagConcreta.diagram.edit.parts.MBSAtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case diagConcreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart.VISUAL_ID:
			if (diagConcreta.diagram.edit.parts.MBSMetodoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSRelacion().isSuperTypeOf(domainElement.eClass())) {
			return diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(diagConcreta.MBSDiagramaClases element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case diagConcreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart.VISUAL_ID:
		case diagConcreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID:
			return false;
		case diagConcreta.diagram.edit.parts.MBSPaqueteEditPart.VISUAL_ID:
		case diagConcreta.diagram.edit.parts.MBSAtributoEditPart.VISUAL_ID:
		case diagConcreta.diagram.edit.parts.MBSMetodoEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
