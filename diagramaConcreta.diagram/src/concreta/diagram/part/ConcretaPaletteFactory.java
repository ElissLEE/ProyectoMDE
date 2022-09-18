
/*
 * 
 */
package concreta.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import concreta.diagram.providers.ConcretaElementTypes;

/**
 * @generated
 */
public class ConcretaPaletteFactory {

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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createMBSAtributo1CreationTool());
		paletteContainer.add(createMBSClase2CreationTool());
		paletteContainer.add(createMBSMetodo3CreationTool());
		paletteContainer.add(createMBSPaquete4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createMBSRelacion1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createMBSAtributo1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MBSAtributo1CreationTool_title,
				Messages.MBSAtributo1CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.MBSAtributo_3001));
		entry.setId("createMBSAtributo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MBSAtributo_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMBSClase2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MBSClase2CreationTool_title,
				Messages.MBSClase2CreationTool_desc, Collections.singletonList(ConcretaElementTypes.MBSClase_2001));
		entry.setId("createMBSClase2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MBSClase_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMBSMetodo3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MBSMetodo3CreationTool_title,
				Messages.MBSMetodo3CreationTool_desc, Collections.singletonList(ConcretaElementTypes.MBSMetodo_3002));
		entry.setId("createMBSMetodo3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MBSMetodo_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMBSPaquete4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MBSPaquete4CreationTool_title,
				Messages.MBSPaquete4CreationTool_desc, Collections.singletonList(ConcretaElementTypes.MBSPaquete_2002));
		entry.setId("createMBSPaquete4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MBSPaquete_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMBSRelacion1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.MBSRelacion1CreationTool_title,
				Messages.MBSRelacion1CreationTool_desc,
				Collections.singletonList(ConcretaElementTypes.MBSRelacion_4001));
		entry.setId("createMBSRelacion1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcretaElementTypes.getImageDescriptor(ConcretaElementTypes.MBSRelacion_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
