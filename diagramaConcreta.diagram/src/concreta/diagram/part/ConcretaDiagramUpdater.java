/*
* 
*/
package concreta.diagram.part;

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

import concreta.ConcretaPackage;
import concreta.MBSAtributo;
import concreta.MBSClase;
import concreta.MBSContainment;
import concreta.MBSDiagramaClases;
import concreta.MBSHerencia;
import concreta.MBSMetodo;
import concreta.MBSPaquete;
import concreta.MBSRelacion;
import concreta.diagram.edit.parts.MBSAtributoEditPart;
import concreta.diagram.edit.parts.MBSClaseEditPart;
import concreta.diagram.edit.parts.MBSClaseMBSClaseAtributosCompartmentEditPart;
import concreta.diagram.edit.parts.MBSClaseMBSClaseMetodosCompartmentEditPart;
import concreta.diagram.edit.parts.MBSContainmentEditPart;
import concreta.diagram.edit.parts.MBSDiagramaClasesEditPart;
import concreta.diagram.edit.parts.MBSHerenciaEditPart;
import concreta.diagram.edit.parts.MBSMetodoEditPart;
import concreta.diagram.edit.parts.MBSPaqueteEditPart;
import concreta.diagram.edit.parts.MBSRelacionEditPart;
import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class ConcretaDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getSemanticChildren(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case MBSDiagramaClasesEditPart.VISUAL_ID:
			return getMBSDiagramaClases_1000SemanticChildren(view);
		case MBSClaseMBSClaseAtributosCompartmentEditPart.VISUAL_ID:
			return getMBSClaseMBSClaseAtributosCompartment_7001SemanticChildren(view);
		case MBSClaseMBSClaseMetodosCompartmentEditPart.VISUAL_ID:
			return getMBSClaseMBSClaseMetodosCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getMBSDiagramaClases_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MBSDiagramaClases modelElement = (MBSDiagramaClases) view.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaClases().iterator(); it.hasNext();) {
			MBSClase childElement = (MBSClase) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MBSClaseEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getListaPaquetes().iterator(); it.hasNext();) {
			MBSPaquete childElement = (MBSPaquete) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MBSPaqueteEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getMBSClaseMBSClaseAtributosCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MBSClase modelElement = (MBSClase) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it.hasNext();) {
			MBSAtributo childElement = (MBSAtributo) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MBSAtributoEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaNodeDescriptor> getMBSClaseMBSClaseMetodosCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MBSClase modelElement = (MBSClase) containerView.getElement();
		LinkedList<ConcretaNodeDescriptor> result = new LinkedList<ConcretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMetodos().iterator(); it.hasNext();) {
			MBSMetodo childElement = (MBSMetodo) it.next();
			int visualID = ConcretaVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MBSMetodoEditPart.VISUAL_ID) {
				result.add(new ConcretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getContainedLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case MBSDiagramaClasesEditPart.VISUAL_ID:
			return getMBSDiagramaClases_1000ContainedLinks(view);
		case MBSClaseEditPart.VISUAL_ID:
			return getMBSClase_2001ContainedLinks(view);
		case MBSPaqueteEditPart.VISUAL_ID:
			return getMBSPaquete_2002ContainedLinks(view);
		case MBSAtributoEditPart.VISUAL_ID:
			return getMBSAtributo_3001ContainedLinks(view);
		case MBSMetodoEditPart.VISUAL_ID:
			return getMBSMetodo_3002ContainedLinks(view);
		case MBSRelacionEditPart.VISUAL_ID:
			return getMBSRelacion_4001ContainedLinks(view);
		case MBSHerenciaEditPart.VISUAL_ID:
			return getMBSHerencia_4002ContainedLinks(view);
		case MBSContainmentEditPart.VISUAL_ID:
			return getMBSContainment_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getIncomingLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case MBSClaseEditPart.VISUAL_ID:
			return getMBSClase_2001IncomingLinks(view);
		case MBSPaqueteEditPart.VISUAL_ID:
			return getMBSPaquete_2002IncomingLinks(view);
		case MBSAtributoEditPart.VISUAL_ID:
			return getMBSAtributo_3001IncomingLinks(view);
		case MBSMetodoEditPart.VISUAL_ID:
			return getMBSMetodo_3002IncomingLinks(view);
		case MBSRelacionEditPart.VISUAL_ID:
			return getMBSRelacion_4001IncomingLinks(view);
		case MBSHerenciaEditPart.VISUAL_ID:
			return getMBSHerencia_4002IncomingLinks(view);
		case MBSContainmentEditPart.VISUAL_ID:
			return getMBSContainment_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcretaLinkDescriptor> getOutgoingLinks(View view) {
		switch (ConcretaVisualIDRegistry.getVisualID(view)) {
		case MBSClaseEditPart.VISUAL_ID:
			return getMBSClase_2001OutgoingLinks(view);
		case MBSPaqueteEditPart.VISUAL_ID:
			return getMBSPaquete_2002OutgoingLinks(view);
		case MBSAtributoEditPart.VISUAL_ID:
			return getMBSAtributo_3001OutgoingLinks(view);
		case MBSMetodoEditPart.VISUAL_ID:
			return getMBSMetodo_3002OutgoingLinks(view);
		case MBSRelacionEditPart.VISUAL_ID:
			return getMBSRelacion_4001OutgoingLinks(view);
		case MBSHerenciaEditPart.VISUAL_ID:
			return getMBSHerencia_4002OutgoingLinks(view);
		case MBSContainmentEditPart.VISUAL_ID:
			return getMBSContainment_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSDiagramaClases_1000ContainedLinks(View view) {
		MBSDiagramaClases modelElement = (MBSDiagramaClases) view.getElement();
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MBSRelacion_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MBSHerencia_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MBSContainment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSClase_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSPaquete_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSAtributo_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSMetodo_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSRelacion_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSHerencia_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSContainment_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSClase_2001IncomingLinks(View view) {
		MBSClase modelElement = (MBSClase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MBSRelacion_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MBSHerencia_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MBSContainment_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSPaquete_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSAtributo_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSMetodo_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSRelacion_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSHerencia_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSContainment_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSClase_2001OutgoingLinks(View view) {
		MBSClase modelElement = (MBSClase) view.getElement();
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MBSRelacion_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MBSHerencia_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MBSContainment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSPaquete_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSAtributo_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSMetodo_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSRelacion_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSHerencia_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcretaLinkDescriptor> getMBSContainment_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_MBSRelacion_4001(
			MBSDiagramaClases container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MBSRelacion) {
				continue;
			}
			MBSRelacion link = (MBSRelacion) linkObject;
			if (MBSRelacionEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MBSClase dst = link.getTarget();
			MBSClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MBSRelacion_4001,
					MBSRelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_MBSHerencia_4002(
			MBSDiagramaClases container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelacionesHerencia().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MBSHerencia) {
				continue;
			}
			MBSHerencia link = (MBSHerencia) linkObject;
			if (MBSHerenciaEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MBSClase dst = link.getTarget();
			MBSClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MBSHerencia_4002,
					MBSHerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getContainedTypeModelFacetLinks_MBSContainment_4003(
			MBSDiagramaClases container) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelacionesContainment().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MBSContainment) {
				continue;
			}
			MBSContainment link = (MBSContainment) linkObject;
			if (MBSContainmentEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MBSClase dst = link.getTarget();
			MBSClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MBSContainment_4003,
					MBSContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_MBSRelacion_4001(MBSClase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getMBSRelacion_Target()
					|| false == setting.getEObject() instanceof MBSRelacion) {
				continue;
			}
			MBSRelacion link = (MBSRelacion) setting.getEObject();
			if (MBSRelacionEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MBSClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.MBSRelacion_4001,
					MBSRelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_MBSHerencia_4002(MBSClase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getMBSHerencia_Target()
					|| false == setting.getEObject() instanceof MBSHerencia) {
				continue;
			}
			MBSHerencia link = (MBSHerencia) setting.getEObject();
			if (MBSHerenciaEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MBSClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.MBSHerencia_4002,
					MBSHerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcretaLinkDescriptor> getIncomingTypeModelFacetLinks_MBSContainment_4003(
			MBSClase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretaPackage.eINSTANCE.getMBSContainment_Target()
					|| false == setting.getEObject() instanceof MBSContainment) {
				continue;
			}
			MBSContainment link = (MBSContainment) setting.getEObject();
			if (MBSContainmentEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MBSClase src = link.getSource();
			result.add(new ConcretaLinkDescriptor(src, target, link, ConcretaElementTypes.MBSContainment_4003,
					MBSContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_MBSRelacion_4001(MBSClase source) {
		MBSDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof MBSDiagramaClases) {
				container = (MBSDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MBSRelacion) {
				continue;
			}
			MBSRelacion link = (MBSRelacion) linkObject;
			if (MBSRelacionEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MBSClase dst = link.getTarget();
			MBSClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MBSRelacion_4001,
					MBSRelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_MBSHerencia_4002(MBSClase source) {
		MBSDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof MBSDiagramaClases) {
				container = (MBSDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelacionesHerencia().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MBSHerencia) {
				continue;
			}
			MBSHerencia link = (MBSHerencia) linkObject;
			if (MBSHerenciaEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MBSClase dst = link.getTarget();
			MBSClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MBSHerencia_4002,
					MBSHerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcretaLinkDescriptor> getOutgoingTypeModelFacetLinks_MBSContainment_4003(
			MBSClase source) {
		MBSDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof MBSDiagramaClases) {
				container = (MBSDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcretaLinkDescriptor> result = new LinkedList<ConcretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelacionesContainment().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MBSContainment) {
				continue;
			}
			MBSContainment link = (MBSContainment) linkObject;
			if (MBSContainmentEditPart.VISUAL_ID != ConcretaVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MBSClase dst = link.getTarget();
			MBSClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcretaLinkDescriptor(src, dst, link, ConcretaElementTypes.MBSContainment_4003,
					MBSContainmentEditPart.VISUAL_ID));
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

		public List<ConcretaNodeDescriptor> getSemanticChildren(View view) {
			return ConcretaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getContainedLinks(View view) {
			return ConcretaDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getIncomingLinks(View view) {
			return ConcretaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcretaLinkDescriptor> getOutgoingLinks(View view) {
			return ConcretaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
