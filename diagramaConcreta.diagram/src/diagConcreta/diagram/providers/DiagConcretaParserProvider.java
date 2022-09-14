/*
 * 
 */
package diagConcreta.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DiagConcretaParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser mBSClaseNombre_5003Parser;

	/**
	* @generated
	*/
	private IParser getMBSClaseNombre_5003Parser() {
		if (mBSClaseNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSClase_Nombre() };
			diagConcreta.diagram.parsers.MessageFormatParser parser = new diagConcreta.diagram.parsers.MessageFormatParser(
					features);
			mBSClaseNombre_5003Parser = parser;
		}
		return mBSClaseNombre_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser mBSPaqueteNombre_5004Parser;

	/**
	* @generated
	*/
	private IParser getMBSPaqueteNombre_5004Parser() {
		if (mBSPaqueteNombre_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSPaquete_Nombre() };
			diagConcreta.diagram.parsers.MessageFormatParser parser = new diagConcreta.diagram.parsers.MessageFormatParser(
					features);
			mBSPaqueteNombre_5004Parser = parser;
		}
		return mBSPaqueteNombre_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser mBSAtributoNombre_5001Parser;

	/**
	* @generated
	*/
	private IParser getMBSAtributoNombre_5001Parser() {
		if (mBSAtributoNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSAtributo_Nombre() };
			diagConcreta.diagram.parsers.MessageFormatParser parser = new diagConcreta.diagram.parsers.MessageFormatParser(
					features);
			mBSAtributoNombre_5001Parser = parser;
		}
		return mBSAtributoNombre_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser mBSMetodoNombre_5002Parser;

	/**
	* @generated
	*/
	private IParser getMBSMetodoNombre_5002Parser() {
		if (mBSMetodoNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSMetodo_Nombre() };
			diagConcreta.diagram.parsers.MessageFormatParser parser = new diagConcreta.diagram.parsers.MessageFormatParser(
					features);
			mBSMetodoNombre_5002Parser = parser;
		}
		return mBSMetodoNombre_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser mBSRelacionLabelName_6001Parser;

	/**
	* @generated
	*/
	private IParser getMBSRelacionLabelName_6001Parser() {
		if (mBSRelacionLabelName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagConcreta.DiagConcretaPackage.eINSTANCE.getMBSRelacion_LabelName() };
			diagConcreta.diagram.parsers.MessageFormatParser parser = new diagConcreta.diagram.parsers.MessageFormatParser(
					features);
			mBSRelacionLabelName_6001Parser = parser;
		}
		return mBSRelacionLabelName_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case diagConcreta.diagram.edit.parts.MBSClaseNombreEditPart.VISUAL_ID:
			return getMBSClaseNombre_5003Parser();
		case diagConcreta.diagram.edit.parts.MBSPaqueteNombreEditPart.VISUAL_ID:
			return getMBSPaqueteNombre_5004Parser();
		case diagConcreta.diagram.edit.parts.MBSAtributoNombreEditPart.VISUAL_ID:
			return getMBSAtributoNombre_5001Parser();
		case diagConcreta.diagram.edit.parts.MBSMetodoNombreEditPart.VISUAL_ID:
			return getMBSMetodoNombre_5002Parser();
		case diagConcreta.diagram.edit.parts.MBSRelacionLabelNameEditPart.VISUAL_ID:
			return getMBSRelacionLabelName_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(diagConcreta.diagram.part.DiagConcretaVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (diagConcreta.diagram.providers.DiagConcretaElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
