/*
* 
*/
package concreta.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import concreta.ConcretaPackage;
import concreta.MBSDiagramaClases;
import concreta.diagram.edit.parts.MBSAtributoEditPart;
import concreta.diagram.edit.parts.MBSAtributoNombreEditPart;
import concreta.diagram.edit.parts.MBSClaseEditPart;
import concreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart;
import concreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart;
import concreta.diagram.edit.parts.MBSClaseNombreEditPart;
import concreta.diagram.edit.parts.MBSContainmentEditPart;
import concreta.diagram.edit.parts.MBSDiagramaClasesEditPart;
import concreta.diagram.edit.parts.MBSHerenciaEditPart;
import concreta.diagram.edit.parts.MBSMetodoEditPart;
import concreta.diagram.edit.parts.MBSMetodoNombreEditPart;
import concreta.diagram.edit.parts.MBSPaqueteEditPart;
import concreta.diagram.edit.parts.MBSPaqueteNombreEditPart;
import concreta.diagram.edit.parts.MBSRelacionEditPart;
import concreta.diagram.edit.parts.MBSRelacionLabelNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ConcretaVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "diagramaConcreta.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MBSDiagramaClasesEditPart.MODEL_ID.equals(view.getType())) {
				return MBSDiagramaClasesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(view.getType());
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
				ConcretaDiagramEditorPlugin.getInstance()
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
		if (ConcretaPackage.eINSTANCE.getMBSDiagramaClases().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((MBSDiagramaClases) domainElement)) {
			return MBSDiagramaClasesEditPart.VISUAL_ID;
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
		String containerModelID = concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(containerView);
		if (!MBSDiagramaClasesEditPart.MODEL_ID.equals(containerModelID) && !"concreta".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MBSDiagramaClasesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MBSDiagramaClasesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MBSDiagramaClasesEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getMBSClase().isSuperTypeOf(domainElement.eClass())) {
				return MBSClaseEditPart.VISUAL_ID;
			}
			if (ConcretaPackage.eINSTANCE.getMBSPaquete().isSuperTypeOf(domainElement.eClass())) {
				return MBSPaqueteEditPart.VISUAL_ID;
			}
			break;
		case MBSClaseMBSClaseAtributosCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getMBSAtributo().isSuperTypeOf(domainElement.eClass())) {
				return MBSAtributoEditPart.VISUAL_ID;
			}
			break;
		case MBSClaseMBSClaseMetodosCompartmentEditPart.VISUAL_ID:
			if (ConcretaPackage.eINSTANCE.getMBSMetodo().isSuperTypeOf(domainElement.eClass())) {
				return MBSMetodoEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(containerView);
		if (!MBSDiagramaClasesEditPart.MODEL_ID.equals(containerModelID) && !"concreta".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MBSDiagramaClasesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MBSDiagramaClasesEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MBSDiagramaClasesEditPart.VISUAL_ID:
			if (MBSClaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MBSPaqueteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MBSClaseEditPart.VISUAL_ID:
			if (MBSClaseNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MBSClaseMBSClaseAtributosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MBSClaseMBSClaseMetodosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MBSPaqueteEditPart.VISUAL_ID:
			if (MBSPaqueteNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MBSAtributoEditPart.VISUAL_ID:
			if (MBSAtributoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MBSMetodoEditPart.VISUAL_ID:
			if (MBSMetodoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MBSClaseMBSClaseAtributosCompartmentEditPart.VISUAL_ID:
			if (MBSAtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MBSClaseMBSClaseMetodosCompartmentEditPart.VISUAL_ID:
			if (MBSMetodoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MBSRelacionEditPart.VISUAL_ID:
			if (MBSRelacionLabelNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ConcretaPackage.eINSTANCE.getMBSRelacion().isSuperTypeOf(domainElement.eClass())) {
			return MBSRelacionEditPart.VISUAL_ID;
		}
		if (ConcretaPackage.eINSTANCE.getMBSHerencia().isSuperTypeOf(domainElement.eClass())) {
			return MBSHerenciaEditPart.VISUAL_ID;
		}
		if (ConcretaPackage.eINSTANCE.getMBSContainment().isSuperTypeOf(domainElement.eClass())) {
			return MBSContainmentEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(MBSDiagramaClases element) {
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
		case MBSClaseMBSClaseAtributosCompartmentEditPart.VISUAL_ID:
		case MBSClaseMBSClaseMetodosCompartmentEditPart.VISUAL_ID:
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
		case MBSDiagramaClasesEditPart.VISUAL_ID:
			return false;
		case MBSPaqueteEditPart.VISUAL_ID:
		case MBSAtributoEditPart.VISUAL_ID:
		case MBSMetodoEditPart.VISUAL_ID:
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
			return concreta.diagram.part.ConcretaVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return concreta.diagram.part.ConcretaVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
