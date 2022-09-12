
/*
 * 
 */
package diagConcreta.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class DiagConcretaPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(diagConcreta.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createMBSAtributo1CreationTool());
		paletteContainer.add(createMBSClase2CreationTool());
		paletteContainer.add(createMBSMetodo3CreationTool());
		paletteContainer.add(createMBSPaquete4CreationTool());
		paletteContainer.add(createMBSParametro5CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(diagConcreta.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createMBSRelacion1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createMBSAtributo1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				diagConcreta.diagram.part.Messages.MBSAtributo1CreationTool_title,
				diagConcreta.diagram.part.Messages.MBSAtributo1CreationTool_desc,
				Collections.singletonList(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSAtributo_3001));
		entry.setId("createMBSAtributo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagConcreta.diagram.providers.DiagConcretaElementTypes
				.getImageDescriptor(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSAtributo_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMBSClase2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				diagConcreta.diagram.part.Messages.MBSClase2CreationTool_title,
				diagConcreta.diagram.part.Messages.MBSClase2CreationTool_desc,
				Collections.singletonList(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSClase_2001));
		entry.setId("createMBSClase2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagConcreta.diagram.providers.DiagConcretaElementTypes
				.getImageDescriptor(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSClase_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMBSMetodo3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				diagConcreta.diagram.part.Messages.MBSMetodo3CreationTool_title,
				diagConcreta.diagram.part.Messages.MBSMetodo3CreationTool_desc,
				Collections.singletonList(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSMetodo_3002));
		entry.setId("createMBSMetodo3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagConcreta.diagram.providers.DiagConcretaElementTypes
				.getImageDescriptor(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSMetodo_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMBSPaquete4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				diagConcreta.diagram.part.Messages.MBSPaquete4CreationTool_title,
				diagConcreta.diagram.part.Messages.MBSPaquete4CreationTool_desc,
				Collections.singletonList(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSPaquete_2002));
		entry.setId("createMBSPaquete4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagConcreta.diagram.providers.DiagConcretaElementTypes
				.getImageDescriptor(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSPaquete_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMBSParametro5CreationTool() {
		ToolEntry entry = new ToolEntry(diagConcreta.diagram.part.Messages.MBSParametro5CreationTool_title,
				diagConcreta.diagram.part.Messages.MBSParametro5CreationTool_desc, null, null) {
		};
		entry.setId("createMBSParametro5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMBSRelacion1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				diagConcreta.diagram.part.Messages.MBSRelacion1CreationTool_title,
				diagConcreta.diagram.part.Messages.MBSRelacion1CreationTool_desc,
				Collections.singletonList(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSRelacion_4001));
		entry.setId("createMBSRelacion1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagConcreta.diagram.providers.DiagConcretaElementTypes
				.getImageDescriptor(diagConcreta.diagram.providers.DiagConcretaElementTypes.MBSRelacion_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
