/*
* 
*/
package diagConcreta.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class DiagConcretaDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<diagConcreta.diagram.part.DiagConcretaNodeDescriptor> getSemanticChildren(View view) {
		switch (diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(view)) {
		case diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID:
			return getMBSDiagramaClases_1000SemanticChildren(view);
		case diagConcreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart.VISUAL_ID:
			return getMBSClaseMBSClaseAtributosCompartment_7001SemanticChildren(view);
		case diagConcreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart.VISUAL_ID:
			return getMBSClaseMBSClaseMetodosCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<diagConcreta.diagram.part.DiagConcretaNodeDescriptor> getMBSDiagramaClases_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		diagConcreta.MBSDiagramaClases modelElement = (diagConcreta.MBSDiagramaClases) view.getElement();
		LinkedList<diagConcreta.diagram.part.DiagConcretaNodeDescriptor> result = new LinkedList<diagConcreta.diagram.part.DiagConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaClases().iterator(); it.hasNext();) {
			diagConcreta.MBSClase childElement = (diagConcreta.MBSClase) it.next();
			int visualID = diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID) {
				result.add(new diagConcreta.diagram.part.DiagConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getListaPaquetes().iterator(); it.hasNext();) {
			diagConcreta.MBSPaquete childElement = (diagConcreta.MBSPaquete) it.next();
			int visualID = diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == diagConcreta.diagram.edit.parts.MBSPaqueteEditPart.VISUAL_ID) {
				result.add(new diagConcreta.diagram.part.DiagConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<diagConcreta.diagram.part.DiagConcretaNodeDescriptor> getMBSClaseMBSClaseAtributosCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		diagConcreta.MBSClase modelElement = (diagConcreta.MBSClase) containerView.getElement();
		LinkedList<diagConcreta.diagram.part.DiagConcretaNodeDescriptor> result = new LinkedList<diagConcreta.diagram.part.DiagConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it.hasNext();) {
			diagConcreta.MBSAtributo childElement = (diagConcreta.MBSAtributo) it.next();
			int visualID = diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == diagConcreta.diagram.edit.parts.MBSAtributoEditPart.VISUAL_ID) {
				result.add(new diagConcreta.diagram.part.DiagConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<diagConcreta.diagram.part.DiagConcretaNodeDescriptor> getMBSClaseMBSClaseMetodosCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		diagConcreta.MBSClase modelElement = (diagConcreta.MBSClase) containerView.getElement();
		LinkedList<diagConcreta.diagram.part.DiagConcretaNodeDescriptor> result = new LinkedList<diagConcreta.diagram.part.DiagConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMetodos().iterator(); it.hasNext();) {
			diagConcreta.MBSMetodo childElement = (diagConcreta.MBSMetodo) it.next();
			int visualID = diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == diagConcreta.diagram.edit.parts.MBSMetodoEditPart.VISUAL_ID) {
				result.add(new diagConcreta.diagram.part.DiagConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getContainedLinks(View view) {
		switch (diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(view)) {
		case diagConcreta.diagram.edit.parts.MBSDiagramaClasesEditPart.VISUAL_ID:
			return getMBSDiagramaClases_1000ContainedLinks(view);
		case diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID:
			return getMBSClase_2001ContainedLinks(view);
		case diagConcreta.diagram.edit.parts.MBSPaqueteEditPart.VISUAL_ID:
			return getMBSPaquete_2002ContainedLinks(view);
		case diagConcreta.diagram.edit.parts.MBSAtributoEditPart.VISUAL_ID:
			return getMBSAtributo_3001ContainedLinks(view);
		case diagConcreta.diagram.edit.parts.MBSMetodoEditPart.VISUAL_ID:
			return getMBSMetodo_3002ContainedLinks(view);
		case diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID:
			return getMBSRelacion_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getIncomingLinks(View view) {
		switch (diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(view)) {
		case diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID:
			return getMBSClase_2001IncomingLinks(view);
		case diagConcreta.diagram.edit.parts.MBSPaqueteEditPart.VISUAL_ID:
			return getMBSPaquete_2002IncomingLinks(view);
		case diagConcreta.diagram.edit.parts.MBSAtributoEditPart.VISUAL_ID:
			return getMBSAtributo_3001IncomingLinks(view);
		case diagConcreta.diagram.edit.parts.MBSMetodoEditPart.VISUAL_ID:
			return getMBSMetodo_3002IncomingLinks(view);
		case diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID:
			return getMBSRelacion_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getOutgoingLinks(View view) {
		switch (diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(view)) {
		case diagConcreta.diagram.edit.parts.MBSClaseEditPart.VISUAL_ID:
			return getMBSClase_2001OutgoingLinks(view);
		case diagConcreta.diagram.edit.parts.MBSPaqueteEditPart.VISUAL_ID:
			return getMBSPaquete_2002OutgoingLinks(view);
		case diagConcreta.diagram.edit.parts.MBSAtributoEditPart.VISUAL_ID:
			return getMBSAtributo_3001OutgoingLinks(view);
		case diagConcreta.diagram.edit.parts.MBSMetodoEditPart.VISUAL_ID:
			return getMBSMetodo_3002OutgoingLinks(view);
		case diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID:
			return getMBSRelacion_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSDiagramaClases_1000ContainedLinks(
			View view) {
		diagConcreta.MBSDiagramaClases modelElement = (diagConcreta.MBSDiagramaClases) view.getElement();
		LinkedList<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> result = new LinkedList<diagConcreta.diagram.part.DiagConcretaLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MBSRelacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSClase_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSPaquete_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSAtributo_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSMetodo_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSRelacion_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSClase_2001IncomingLinks(View view) {
		diagConcreta.MBSClase modelElement = (diagConcreta.MBSClase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> result = new LinkedList<diagConcreta.diagram.part.DiagConcretaLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MBSRelacion_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSPaquete_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSAtributo_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSMetodo_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSRelacion_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSClase_2001OutgoingLinks(View view) {
		diagConcreta.MBSClase modelElement = (diagConcreta.MBSClase) view.getElement();
		LinkedList<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> result = new LinkedList<diagConcreta.diagram.part.DiagConcretaLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MBSRelacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSPaquete_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSAtributo_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSMetodo_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getMBSRelacion_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getContainedTypeModelFacetLinks_MBSRelacion_4001(
			diagConcreta.MBSDiagramaClases container) {
		LinkedList<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> result = new LinkedList<diagConcreta.diagram.part.DiagConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagConcreta.MBSRelacion) {
				continue;
			}
			diagConcreta.MBSRelacion link = (diagConcreta.MBSRelacion) linkObject;
			if (diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID != diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagConcreta.MBSClase dst = link.getTarget();
			diagConcreta.MBSClase src = link.getSource();
			result.add(new diagConcreta.diagram.part.DiagConcretaLinkDescriptor(src, dst, link,
					diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSRelacion_4001,
					diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_MBSRelacion_4001(
			diagConcreta.MBSClase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> result = new LinkedList<diagConcreta.diagram.part.DiagConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSRelacion_Target()
					|| false == setting.getEObject() instanceof diagConcreta.MBSRelacion) {
				continue;
			}
			diagConcreta.MBSRelacion link = (diagConcreta.MBSRelacion) setting.getEObject();
			if (diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID != diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagConcreta.MBSClase src = link.getSource();
			result.add(new diagConcreta.diagram.part.DiagConcretaLinkDescriptor(src, target, link,
					diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSRelacion_4001,
					diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_MBSRelacion_4001(
			diagConcreta.MBSClase source) {
		diagConcreta.MBSDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof diagConcreta.MBSDiagramaClases) {
				container = (diagConcreta.MBSDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> result = new LinkedList<diagConcreta.diagram.part.DiagConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagConcreta.MBSRelacion) {
				continue;
			}
			diagConcreta.MBSRelacion link = (diagConcreta.MBSRelacion) linkObject;
			if (diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID != diagConcreta.diagram.part.DiagConcretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagConcreta.MBSClase dst = link.getTarget();
			diagConcreta.MBSClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new diagConcreta.diagram.part.DiagConcretaLinkDescriptor(src, dst, link,
					diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSRelacion_4001,
					diagConcreta.diagram.edit.parts.MBSRelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<diagConcreta.diagram.part.DiagConcretaNodeDescriptor> getSemanticChildren(View view) {
			return DiagConcretaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getContainedLinks(View view) {
			return DiagConcretaDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getIncomingLinks(View view) {
			return DiagConcretaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<diagConcreta.diagram.part.DiagConcretaLinkDescriptor> getOutgoingLinks(View view) {
			return DiagConcretaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
