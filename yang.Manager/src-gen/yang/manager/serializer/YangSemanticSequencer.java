package yang.manager.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import yang.manager.services.YangGrammarAccess;
import yang.manager.yang.AnyxmlStatement;
import yang.manager.yang.ArgumentStatement;
import yang.manager.yang.AugmentStatement;
import yang.manager.yang.AugmentUsesStatement;
import yang.manager.yang.BaseStatement;
import yang.manager.yang.BelongsToStatement;
import yang.manager.yang.BitStatement;
import yang.manager.yang.BuiltInType;
import yang.manager.yang.CaseStatement;
import yang.manager.yang.ChoiceStatement;
import yang.manager.yang.ConfigStatement;
import yang.manager.yang.ContactStatement;
import yang.manager.yang.ContainerStatement;
import yang.manager.yang.DefaultStatement;
import yang.manager.yang.DescriptionStatement;
import yang.manager.yang.DeviateStatement;
import yang.manager.yang.DeviationStatement;
import yang.manager.yang.EnumStatement;
import yang.manager.yang.ErrorAppTagStatement;
import yang.manager.yang.ErrorMessageStatement;
import yang.manager.yang.ExtensionStatement;
import yang.manager.yang.FeatureStatement;
import yang.manager.yang.FractionDigitsStatement;
import yang.manager.yang.GroupingStatement;
import yang.manager.yang.IdentityStatement;
import yang.manager.yang.IfFeatureStatement;
import yang.manager.yang.ImportStatement;
import yang.manager.yang.IncludeStatement;
import yang.manager.yang.InputStatement;
import yang.manager.yang.KeyStatement;
import yang.manager.yang.LeafListStatement;
import yang.manager.yang.LeafStatement;
import yang.manager.yang.LengthStatement;
import yang.manager.yang.ListStatement;
import yang.manager.yang.MandatoryStatement;
import yang.manager.yang.MaxElementsStatement;
import yang.manager.yang.MinElementsStatement;
import yang.manager.yang.Module;
import yang.manager.yang.MustStatement;
import yang.manager.yang.NamespaceStatement;
import yang.manager.yang.NotificationStatement;
import yang.manager.yang.OrderedbyStatement;
import yang.manager.yang.OrganizationStatement;
import yang.manager.yang.OutputStatement;
import yang.manager.yang.PathStatement;
import yang.manager.yang.PatternStatement;
import yang.manager.yang.PositionStatement;
import yang.manager.yang.PrefixStatement;
import yang.manager.yang.PresenceStatement;
import yang.manager.yang.RangeStatement;
import yang.manager.yang.ReferenceStatement;
import yang.manager.yang.RefineStatement;
import yang.manager.yang.RequireInstanceStatement;
import yang.manager.yang.RevisionDateStatement;
import yang.manager.yang.RevisionStatement;
import yang.manager.yang.RpcStatement;
import yang.manager.yang.StatusStatement;
import yang.manager.yang.SubModule;
import yang.manager.yang.TypeStatement;
import yang.manager.yang.TypedefStatement;
import yang.manager.yang.UniqueStatement;
import yang.manager.yang.UnitsStatement;
import yang.manager.yang.UnknownStatement;
import yang.manager.yang.UnknownSubstatements;
import yang.manager.yang.UsesStatement;
import yang.manager.yang.ValueStatement;
import yang.manager.yang.WhenStatement;
import yang.manager.yang.YangPackage;
import yang.manager.yang.YangVersionStatement;
import yang.manager.yang.YinElementStatement;

@SuppressWarnings("all")
public class YangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private YangGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == YangPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case YangPackage.ANYXML_STATEMENT:
				if(context == grammarAccess.getAnyxmlStatementRule() ||
				   context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getCaseSubstatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getDatadefStatementRule() ||
				   context == grammarAccess.getGroupingSubstatementRule() ||
				   context == grammarAccess.getInputSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getOutputSubstatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_AnyxmlStatement(context, (AnyxmlStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.ARGUMENT_STATEMENT:
				if(context == grammarAccess.getArgumentStatementRule() ||
				   context == grammarAccess.getExtensionSubstatementRule()) {
					sequence_ArgumentStatement(context, (ArgumentStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.AUGMENT_STATEMENT:
				if(context == grammarAccess.getAugmentStatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_AugmentStatement(context, (AugmentStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.AUGMENT_USES_STATEMENT:
				if(context == grammarAccess.getAugmentUsesStatementRule() ||
				   context == grammarAccess.getUsesSubstatementRule()) {
					sequence_AugmentUsesStatement(context, (AugmentUsesStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.BASE_STATEMENT:
				if(context == grammarAccess.getBaseStatementRule() ||
				   context == grammarAccess.getIdentitySubstatementRule() ||
				   context == grammarAccess.getTypeSubStatementRule()) {
					sequence_BaseStatement(context, (BaseStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.BELONGS_TO_STATEMENT:
				if(context == grammarAccess.getBelongsToStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_BelongsToStatement(context, (BelongsToStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.BIT_STATEMENT:
				if(context == grammarAccess.getBitStatementRule() ||
				   context == grammarAccess.getTypeSubStatementRule()) {
					sequence_BitStatement(context, (BitStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.BUILT_IN_TYPE:
				if(context == grammarAccess.getBuiltInTypeRule()) {
					sequence_BuiltInType(context, (BuiltInType) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.CASE_STATEMENT:
				if(context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getCaseStatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule()) {
					sequence_CaseStatement(context, (CaseStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.CHOICE_STATEMENT:
				if(context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getCaseSubstatementRule() ||
				   context == grammarAccess.getChoiceStatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getDatadefStatementRule() ||
				   context == grammarAccess.getGroupingSubstatementRule() ||
				   context == grammarAccess.getInputSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getOutputSubstatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_ChoiceStatement(context, (ChoiceStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.CONFIG_STATEMENT:
				if(context == grammarAccess.getAnyxmlSubstatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getConfigStatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getDeviateSubstatementRule() ||
				   context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getLeafSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getRefineSubstatementRule()) {
					sequence_ConfigStatement(context, (ConfigStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.CONTACT_STATEMENT:
				if(context == grammarAccess.getContactStatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_ContactStatement(context, (ContactStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.CONTAINER_STATEMENT:
				if(context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getCaseSubstatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getContainerStatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getDatadefStatementRule() ||
				   context == grammarAccess.getGroupingSubstatementRule() ||
				   context == grammarAccess.getInputSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getOutputSubstatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_ContainerStatement(context, (ContainerStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.DEFAULT_STATEMENT:
				if(context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getDefaultStatementRule() ||
				   context == grammarAccess.getDeviateSubstatementRule() ||
				   context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getLeafSubstatementRule() ||
				   context == grammarAccess.getRefineSubstatementRule() ||
				   context == grammarAccess.getTypeSubStatementRule() ||
				   context == grammarAccess.getTypedefSubstatementRule()) {
					sequence_DefaultStatement(context, (DefaultStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.DESCRIPTION_STATEMENT:
				if(context == grammarAccess.getAnyxmlSubstatementRule() ||
				   context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getBitSubstatementRule() ||
				   context == grammarAccess.getCaseSubstatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getDescriptionStatementRule() ||
				   context == grammarAccess.getDeviationSubstatementRule() ||
				   context == grammarAccess.getEnumSubstatementRule() ||
				   context == grammarAccess.getExtensionSubstatementRule() ||
				   context == grammarAccess.getFeatureSubstatementRule() ||
				   context == grammarAccess.getGroupingSubstatementRule() ||
				   context == grammarAccess.getIdentitySubstatementRule() ||
				   context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getLeafSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getMultipleSubstatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getRefineSubstatementRule() ||
				   context == grammarAccess.getRevisionSubstatementsRule() ||
				   context == grammarAccess.getRpcSubstatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule() ||
				   context == grammarAccess.getTypedefSubstatementRule() ||
				   context == grammarAccess.getUsesSubstatementRule() ||
				   context == grammarAccess.getWhenSubstatementsRule()) {
					sequence_DescriptionStatement(context, (DescriptionStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.DEVIATE_STATEMENT:
				if(context == grammarAccess.getDeviateStatementRule() ||
				   context == grammarAccess.getDeviationSubstatementRule()) {
					sequence_DeviateStatement(context, (DeviateStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.DEVIATION_STATEMENT:
				if(context == grammarAccess.getDeviationStatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_DeviationStatement(context, (DeviationStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.ENUM_STATEMENT:
				if(context == grammarAccess.getEnumStatementRule() ||
				   context == grammarAccess.getTypeSubStatementRule()) {
					sequence_EnumStatement(context, (EnumStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.ERROR_APP_TAG_STATEMENT:
				if(context == grammarAccess.getErrorAppTagStatementRule() ||
				   context == grammarAccess.getMultipleSubstatementRule()) {
					sequence_ErrorAppTagStatement(context, (ErrorAppTagStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.ERROR_MESSAGE_STATEMENT:
				if(context == grammarAccess.getErrorMessageStatementRule() ||
				   context == grammarAccess.getMultipleSubstatementRule()) {
					sequence_ErrorMessageStatement(context, (ErrorMessageStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.EXTENSION_STATEMENT:
				if(context == grammarAccess.getExtensionStatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_ExtensionStatement(context, (ExtensionStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.FEATURE_STATEMENT:
				if(context == grammarAccess.getFeatureStatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_FeatureStatement(context, (FeatureStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.FRACTION_DIGITS_STATEMENT:
				if(context == grammarAccess.getFractionDigitsStatementRule() ||
				   context == grammarAccess.getTypeSubStatementRule()) {
					sequence_FractionDigitsStatement(context, (FractionDigitsStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.GROUPING_STATEMENT:
				if(context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getGroupingStatementRule() ||
				   context == grammarAccess.getGroupingSubstatementRule() ||
				   context == grammarAccess.getInputSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getOutputSubstatementRule() ||
				   context == grammarAccess.getRpcSubstatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_GroupingStatement(context, (GroupingStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.IDENTITY_STATEMENT:
				if(context == grammarAccess.getIdentityStatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_IdentityStatement(context, (IdentityStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.IF_FEATURE_STATEMENT:
				if(context == grammarAccess.getAnyxmlSubstatementRule() ||
				   context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getCaseSubstatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getFeatureSubstatementRule() ||
				   context == grammarAccess.getIfFeatureStatementRule() ||
				   context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getLeafSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getRpcSubstatementRule() ||
				   context == grammarAccess.getUsesSubstatementRule()) {
					sequence_IfFeatureStatement(context, (IfFeatureStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.IMPORT_STATEMENT:
				if(context == grammarAccess.getImportStatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_ImportStatement(context, (ImportStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.INCLUDE_STATEMENT:
				if(context == grammarAccess.getIncludeStatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_IncludeStatement(context, (IncludeStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.INPUT_STATEMENT:
				if(context == grammarAccess.getInputStatementRule() ||
				   context == grammarAccess.getRpcSubstatementRule()) {
					sequence_InputStatement(context, (InputStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.KEY_STATEMENT:
				if(context == grammarAccess.getKeyStatementRule() ||
				   context == grammarAccess.getListSubstatementRule()) {
					sequence_KeyStatement(context, (KeyStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.LEAF_LIST_STATEMENT:
				if(context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getCaseSubstatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getDatadefStatementRule() ||
				   context == grammarAccess.getGroupingSubstatementRule() ||
				   context == grammarAccess.getInputSubstatementRule() ||
				   context == grammarAccess.getLeafListStatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getOutputSubstatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_LeafListStatement(context, (LeafListStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.LEAF_STATEMENT:
				if(context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getCaseSubstatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getDatadefStatementRule() ||
				   context == grammarAccess.getGroupingSubstatementRule() ||
				   context == grammarAccess.getInputSubstatementRule() ||
				   context == grammarAccess.getLeafStatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getOutputSubstatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_LeafStatement(context, (LeafStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.LENGTH_STATEMENT:
				if(context == grammarAccess.getLengthStatementRule() ||
				   context == grammarAccess.getTypeSubStatementRule()) {
					sequence_LengthStatement(context, (LengthStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.LIST_STATEMENT:
				if(context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getCaseSubstatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getDatadefStatementRule() ||
				   context == grammarAccess.getGroupingSubstatementRule() ||
				   context == grammarAccess.getInputSubstatementRule() ||
				   context == grammarAccess.getListStatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getOutputSubstatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_ListStatement(context, (ListStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.MANDATORY_STATEMENT:
				if(context == grammarAccess.getAnyxmlSubstatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getDeviateSubstatementRule() ||
				   context == grammarAccess.getLeafSubstatementRule() ||
				   context == grammarAccess.getMandatoryStatementRule() ||
				   context == grammarAccess.getRefineSubstatementRule()) {
					sequence_MandatoryStatement(context, (MandatoryStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.MAX_ELEMENTS_STATEMENT:
				if(context == grammarAccess.getDeviateSubstatementRule() ||
				   context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getMaxElementsStatementRule() ||
				   context == grammarAccess.getRefineSubstatementRule()) {
					sequence_MaxElementsStatement(context, (MaxElementsStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.MIN_ELEMENTS_STATEMENT:
				if(context == grammarAccess.getDeviateSubstatementRule() ||
				   context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getMinElementsStatementRule() ||
				   context == grammarAccess.getRefineSubstatementRule()) {
					sequence_MinElementsStatement(context, (MinElementsStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.MODULE:
				if(context == grammarAccess.getModuleRule() ||
				   context == grammarAccess.getYangFileRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.MUST_STATEMENT:
				if(context == grammarAccess.getAnyxmlSubstatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getDeviateSubstatementRule() ||
				   context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getLeafSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getMustStatementRule() ||
				   context == grammarAccess.getRefineSubstatementRule()) {
					sequence_MustStatement(context, (MustStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.NAMESPACE_STATEMENT:
				if(context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getNamespaceStatementRule()) {
					sequence_NamespaceStatement(context, (NamespaceStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.NOTIFICATION_STATEMENT:
				if(context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getNotificationStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_NotificationStatement(context, (NotificationStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.ORDEREDBY_STATEMENT:
				if(context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getOrderedbyStatementRule()) {
					sequence_OrderedbyStatement(context, (OrderedbyStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.ORGANIZATION_STATEMENT:
				if(context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getOrganizationStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_OrganizationStatement(context, (OrganizationStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.OUTPUT_STATEMENT:
				if(context == grammarAccess.getOutputStatementRule() ||
				   context == grammarAccess.getRpcSubstatementRule()) {
					sequence_OutputStatement(context, (OutputStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.PATH_STATEMENT:
				if(context == grammarAccess.getPathStatementRule() ||
				   context == grammarAccess.getTypeSubStatementRule()) {
					sequence_PathStatement(context, (PathStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.PATTERN_STATEMENT:
				if(context == grammarAccess.getPatternStatementRule() ||
				   context == grammarAccess.getTypeSubStatementRule()) {
					sequence_PatternStatement(context, (PatternStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.POSITION_STATEMENT:
				if(context == grammarAccess.getBitSubstatementRule() ||
				   context == grammarAccess.getPositionStatementRule()) {
					sequence_PositionStatement(context, (PositionStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.PREFIX_STATEMENT:
				if(context == grammarAccess.getBelongsToSubstatementRule() ||
				   context == grammarAccess.getImportSubstatementsRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getPrefixStatementRule()) {
					sequence_PrefixStatement(context, (PrefixStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.PRESENCE_STATEMENT:
				if(context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getPresenceStatementRule() ||
				   context == grammarAccess.getRefineSubstatementRule()) {
					sequence_PresenceStatement(context, (PresenceStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.RANGE_STATEMENT:
				if(context == grammarAccess.getRangeStatementRule() ||
				   context == grammarAccess.getTypeSubStatementRule()) {
					sequence_RangeStatement(context, (RangeStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.REFERENCE_STATEMENT:
				if(context == grammarAccess.getAnyxmlSubstatementRule() ||
				   context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getBitSubstatementRule() ||
				   context == grammarAccess.getCaseSubstatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getDeviationSubstatementRule() ||
				   context == grammarAccess.getEnumSubstatementRule() ||
				   context == grammarAccess.getExtensionSubstatementRule() ||
				   context == grammarAccess.getFeatureSubstatementRule() ||
				   context == grammarAccess.getGroupingSubstatementRule() ||
				   context == grammarAccess.getIdentitySubstatementRule() ||
				   context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getLeafSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getMultipleSubstatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getReferenceStatementRule() ||
				   context == grammarAccess.getRefineSubstatementRule() ||
				   context == grammarAccess.getRevisionSubstatementsRule() ||
				   context == grammarAccess.getRpcSubstatementRule() ||
				   context == grammarAccess.getTypedefSubstatementRule() ||
				   context == grammarAccess.getUsesSubstatementRule() ||
				   context == grammarAccess.getWhenSubstatementsRule()) {
					sequence_ReferenceStatement(context, (ReferenceStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.REFINE_STATEMENT:
				if(context == grammarAccess.getRefineStatementRule() ||
				   context == grammarAccess.getUsesSubstatementRule()) {
					sequence_RefineStatement(context, (RefineStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.REQUIRE_INSTANCE_STATEMENT:
				if(context == grammarAccess.getRequireInstanceStatementRule() ||
				   context == grammarAccess.getTypeSubStatementRule()) {
					sequence_RequireInstanceStatement(context, (RequireInstanceStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.REVISION_DATE_STATEMENT:
				if(context == grammarAccess.getImportSubstatementsRule() ||
				   context == grammarAccess.getIncludeSubstatementsRule() ||
				   context == grammarAccess.getRevisionDateStatementRule()) {
					sequence_RevisionDateStatement(context, (RevisionDateStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.REVISION_STATEMENT:
				if(context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getRevisionStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_RevisionStatement(context, (RevisionStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.RPC_STATEMENT:
				if(context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getRpcStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule()) {
					sequence_RpcStatement(context, (RpcStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.STATUS_STATEMENT:
				if(context == grammarAccess.getAnyxmlSubstatementRule() ||
				   context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getBitSubstatementRule() ||
				   context == grammarAccess.getCaseSubstatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getEnumSubstatementRule() ||
				   context == grammarAccess.getExtensionSubstatementRule() ||
				   context == grammarAccess.getFeatureSubstatementRule() ||
				   context == grammarAccess.getGroupingSubstatementRule() ||
				   context == grammarAccess.getIdentitySubstatementRule() ||
				   context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getLeafSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getRpcSubstatementRule() ||
				   context == grammarAccess.getStatusStatementRule() ||
				   context == grammarAccess.getTypedefSubstatementRule() ||
				   context == grammarAccess.getUsesSubstatementRule()) {
					sequence_StatusStatement(context, (StatusStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.SUB_MODULE:
				if(context == grammarAccess.getSubModuleRule() ||
				   context == grammarAccess.getYangFileRule()) {
					sequence_SubModule(context, (SubModule) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.TYPE_STATEMENT:
				if(context == grammarAccess.getImportSubstatementsRule() ||
				   context == grammarAccess.getIncludeSubstatementsRule() ||
				   context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getLeafSubstatementRule() ||
				   context == grammarAccess.getTypeStatementRule() ||
				   context == grammarAccess.getTypeSubStatementRule() ||
				   context == grammarAccess.getTypedefSubstatementRule()) {
					sequence_TypeStatement(context, (TypeStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.TYPEDEF_STATEMENT:
				if(context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getGroupingSubstatementRule() ||
				   context == grammarAccess.getInputSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getOutputSubstatementRule() ||
				   context == grammarAccess.getRpcSubstatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule() ||
				   context == grammarAccess.getTypedefStatementRule()) {
					sequence_TypedefStatement(context, (TypedefStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.UNIQUE_STATEMENT:
				if(context == grammarAccess.getDeviateSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getUniqueStatementRule()) {
					sequence_UniqueStatement(context, (UniqueStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.UNITS_STATEMENT:
				if(context == grammarAccess.getDeviateSubstatementRule() ||
				   context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getLeafSubstatementRule() ||
				   context == grammarAccess.getTypedefSubstatementRule() ||
				   context == grammarAccess.getUnitsStatementRule()) {
					sequence_UnitsStatement(context, (UnitsStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.UNKNOWN_STATEMENT:
				if(context == grammarAccess.getAnyxmlSubstatementRule() ||
				   context == grammarAccess.getArgumentSubstatementRule() ||
				   context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getBelongsToSubstatementRule() ||
				   context == grammarAccess.getBitSubstatementRule() ||
				   context == grammarAccess.getCaseSubstatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getDeviateSubstatementRule() ||
				   context == grammarAccess.getDeviationSubstatementRule() ||
				   context == grammarAccess.getEnumSubstatementRule() ||
				   context == grammarAccess.getExtensionSubstatementRule() ||
				   context == grammarAccess.getFeatureSubstatementRule() ||
				   context == grammarAccess.getGroupingSubstatementRule() ||
				   context == grammarAccess.getIdentitySubstatementRule() ||
				   context == grammarAccess.getImportSubstatementsRule() ||
				   context == grammarAccess.getIncludeSubstatementsRule() ||
				   context == grammarAccess.getInputSubstatementRule() ||
				   context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getLeafSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getMultipleSubstatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getOutputSubstatementRule() ||
				   context == grammarAccess.getRefineSubstatementRule() ||
				   context == grammarAccess.getRevisionSubstatementsRule() ||
				   context == grammarAccess.getRpcSubstatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule() ||
				   context == grammarAccess.getTypeSubStatementRule() ||
				   context == grammarAccess.getTypedefSubstatementRule() ||
				   context == grammarAccess.getUnknownStatementRule() ||
				   context == grammarAccess.getUsesSubstatementRule() ||
				   context == grammarAccess.getWhenSubstatementsRule()) {
					sequence_UnknownStatement(context, (UnknownStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.UNKNOWN_SUBSTATEMENTS:
				if(context == grammarAccess.getUnknownSubstatementsRule()) {
					sequence_UnknownSubstatements(context, (UnknownSubstatements) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.USES_STATEMENT:
				if(context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getCaseSubstatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getDatadefStatementRule() ||
				   context == grammarAccess.getGroupingSubstatementRule() ||
				   context == grammarAccess.getInputSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getNotificationSubstatementRule() ||
				   context == grammarAccess.getOutputSubstatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule() ||
				   context == grammarAccess.getUsesStatementRule()) {
					sequence_UsesStatement(context, (UsesStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.VALUE_STATEMENT:
				if(context == grammarAccess.getEnumSubstatementRule() ||
				   context == grammarAccess.getValueStatementRule()) {
					sequence_ValueStatement(context, (ValueStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.WHEN_STATEMENT:
				if(context == grammarAccess.getAnyxmlSubstatementRule() ||
				   context == grammarAccess.getAugmentSubstatementRule() ||
				   context == grammarAccess.getCaseSubstatementRule() ||
				   context == grammarAccess.getChoiceSubstatementRule() ||
				   context == grammarAccess.getContainerSubstatementRule() ||
				   context == grammarAccess.getLeafListSubstatementRule() ||
				   context == grammarAccess.getLeafSubstatementRule() ||
				   context == grammarAccess.getListSubstatementRule() ||
				   context == grammarAccess.getUsesSubstatementRule() ||
				   context == grammarAccess.getWhenStatementRule()) {
					sequence_WhenStatement(context, (WhenStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.YANG_VERSION_STATEMENT:
				if(context == grammarAccess.getModuleStatementRule() ||
				   context == grammarAccess.getSubmoduleStatementRule() ||
				   context == grammarAccess.getYangVersionStatementRule()) {
					sequence_YangVersionStatement(context, (YangVersionStatement) semanticObject); 
					return; 
				}
				else break;
			case YangPackage.YIN_ELEMENT_STATEMENT:
				if(context == grammarAccess.getArgumentSubstatementRule() ||
				   context == grammarAccess.getYinElementStatementRule()) {
					sequence_YinElementStatement(context, (YinElementStatement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((arg=STRINGARG | arg=KEY_IDENTIFIER) anyxmlsubstatements+=AnyxmlSubstatement*)
	 */
	protected void sequence_AnyxmlStatement(EObject context, AnyxmlStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((arg=STRINGARG | arg=KEY_IDENTIFIER) argumentsubstatements+=ArgumentSubstatement*)
	 */
	protected void sequence_ArgumentStatement(EObject context, ArgumentStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((arg=STRINGARG | arg=STRINGARG4) augmentsubstatements+=AugmentSubstatement*)
	 */
	protected void sequence_AugmentStatement(EObject context, AugmentStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG augmentsubstatements+=AugmentSubstatement*)
	 */
	protected void sequence_AugmentUsesStatement(EObject context, AugmentUsesStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((base=STRINGARG | base=STRINGARG2) baseunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_BaseStatement(EObject context, BaseStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRINGARG belongstosubstatement+=BelongsToSubstatement*)
	 */
	protected void sequence_BelongsToStatement(EObject context, BelongsToStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRINGARG bitsubstatements+=BitSubstatement*)
	 */
	protected void sequence_BitStatement(EObject context, BitStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         btype='binary' | 
	 *         btype='bits' | 
	 *         btype='boolean' | 
	 *         btype='decimal64' | 
	 *         btype='empty' | 
	 *         btype='enumeration' | 
	 *         btype='identityref' | 
	 *         btype='instance-identifier' | 
	 *         btype='int8' | 
	 *         btype='int16' | 
	 *         btype='int32' | 
	 *         btype='int64' | 
	 *         btype='leafref' | 
	 *         btype='string' | 
	 *         btype='uint8' | 
	 *         btype='uint16' | 
	 *         btype='uint32' | 
	 *         btype='uint64' | 
	 *         btype='union'
	 *     )
	 */
	protected void sequence_BuiltInType(EObject context, BuiltInType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=STRINGARG | name=KEY_IDENTIFIER) casesubstatements+=CaseSubstatement*)
	 */
	protected void sequence_CaseStatement(EObject context, CaseStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=STRINGARG | name=KEY_IDENTIFIER) choicesubstatements+=ChoiceSubstatement*)
	 */
	protected void sequence_ChoiceStatement(EObject context, ChoiceStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (boolarg=STRINGARG configunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_ConfigStatement(EObject context, ConfigStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (contact=STRINGARG contactunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_ContactStatement(EObject context, ContactStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRINGARG containersubstatements+=ContainerSubstatement*)
	 */
	protected void sequence_ContainerStatement(EObject context, ContainerStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG defaultunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_DefaultStatement(EObject context, DefaultStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=STRINGARG descriptionunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_DescriptionStatement(EObject context, DescriptionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG deviatesubstatements+=DeviateSubstatement*)
	 */
	protected void sequence_DeviateStatement(EObject context, DeviateStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG deviationsubstatements+=DeviationSubstatement*)
	 */
	protected void sequence_DeviationStatement(EObject context, DeviationStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=STRINGARG | name=KEY_IDENTIFIER) enumsubstatements+=EnumSubstatement*)
	 */
	protected void sequence_EnumStatement(EObject context, EnumStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG erroraunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_ErrorAppTagStatement(EObject context, ErrorAppTagStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG errormunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_ErrorMessageStatement(EObject context, ErrorMessageStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((arg=STRINGARG | arg=KEY_IDENTIFIER) extensionsubstatements+=ExtensionSubstatement*)
	 */
	protected void sequence_ExtensionStatement(EObject context, ExtensionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRINGARG featuresubstatements+=FeatureSubstatement*)
	 */
	protected void sequence_FeatureStatement(EObject context, FeatureStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG fractiondigitsunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_FractionDigitsStatement(EObject context, FractionDigitsStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRINGARG groupingsubstatements+=GroupingSubstatement*)
	 */
	protected void sequence_GroupingStatement(EObject context, GroupingStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRINGARG identitysubstatements+=IdentitySubstatement*)
	 */
	protected void sequence_IdentityStatement(EObject context, IdentityStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pref=STRINGARG? ident=[FeatureStatement|ID] iffeatureunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_IfFeatureStatement(EObject context, IfFeatureStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (importURI=STRINGARG importsubstatements+=ImportSubstatements*)
	 */
	protected void sequence_ImportStatement(EObject context, ImportStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (importURI=STRINGARG includesubstatements+=IncludeSubstatements*)
	 */
	protected void sequence_IncludeStatement(EObject context, IncludeStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     inputsubstatements+=InputSubstatement+
	 */
	protected void sequence_InputStatement(EObject context, InputStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((arg=STRINGARG | arg=STRINGARG2) keyunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_KeyStatement(EObject context, KeyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG leaflistsubstatements+=LeafListSubstatement*)
	 */
	protected void sequence_LeafListStatement(EObject context, LeafListStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=STRINGARG | name=KEY_IDENTIFIER) leafsubstatements+=LeafSubstatement*)
	 */
	protected void sequence_LeafStatement(EObject context, LeafStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (length=STRINGARG lengthsubstatements+=MultipleSubstatement*)
	 */
	protected void sequence_LengthStatement(EObject context, LengthStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=STRINGARG | name=KEY_IDENTIFIER) listsubstatements+=ListSubstatement*)
	 */
	protected void sequence_ListStatement(EObject context, ListStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (boolarg=STRINGARG mandatoryunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_MandatoryStatement(EObject context, MandatoryStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG maxelementsunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_MaxElementsStatement(EObject context, MaxElementsStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG minelementsunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_MinElementsStatement(EObject context, MinElementsStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRINGARG statements+=ModuleStatement*)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG mustsubstatements+=MultipleSubstatement*)
	 */
	protected void sequence_MustStatement(EObject context, MustStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((uri=STRINGARG | uri=STRINGARG4) namespaceunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_NamespaceStatement(EObject context, NamespaceStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRINGARG notificationsubstatements+=NotificationSubstatement*)
	 */
	protected void sequence_NotificationStatement(EObject context, NotificationStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG orderedbyunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_OrderedbyStatement(EObject context, OrderedbyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (organization=STRINGARG organizationunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_OrganizationStatement(EObject context, OrganizationStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     outputsubstatements+=OutputSubstatement+
	 */
	protected void sequence_OutputStatement(EObject context, OutputStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (path=STRINGARG pathunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_PathStatement(EObject context, PathStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRINGARG patternsubstatements+=MultipleSubstatement*)
	 */
	protected void sequence_PatternStatement(EObject context, PatternStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (intarg=STRINGARG positionunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_PositionStatement(EObject context, PositionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRINGARG prefixunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_PrefixStatement(EObject context, PrefixStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG presenceunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_PresenceStatement(EObject context, PresenceStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((range=STRINGARG | range=STRINGARG3) rangesubstatements+=MultipleSubstatement*)
	 */
	protected void sequence_RangeStatement(EObject context, RangeStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=STRINGARG referenceunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_ReferenceStatement(EObject context, ReferenceStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG refinesubstatements+=RefineSubstatement*)
	 */
	protected void sequence_RefineStatement(EObject context, RefineStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (require=STRINGARG requireunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_RequireInstanceStatement(EObject context, RequireInstanceStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (date=STRINGARG revisiondateunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_RevisionDateStatement(EObject context, RevisionDateStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (date=STRINGARG revisionsubstatements+=RevisionSubstatements*)
	 */
	protected void sequence_RevisionStatement(EObject context, RevisionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRINGARG rpcsubstatements+=RpcSubstatement*)
	 */
	protected void sequence_RpcStatement(EObject context, RpcStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (status=STRINGARG statusunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_StatusStatement(EObject context, StatusStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRINGARG statements+=SubmoduleStatement*)
	 */
	protected void sequence_SubModule(EObject context, SubModule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type=BuiltInType | (pre=STRINGARG? importtype=[TypedefStatement|ID])) typesubstatements+=TypeSubStatement*)
	 */
	protected void sequence_TypeStatement(EObject context, TypeStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=STRINGARG | name=KEY_IDENTIFIER) typedefsubstatemnet+=TypedefSubstatement*)
	 */
	protected void sequence_TypedefStatement(EObject context, TypedefStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG uniqueunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_UniqueStatement(EObject context, UniqueStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG unitsunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_UnitsStatement(EObject context, UnitsStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pref=STRINGARG namestat=STRINGARG argument=STRINGARG? unknownsubstatements+=UnknownSubstatements*)
	 */
	protected void sequence_UnknownStatement(EObject context, UnknownStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pref=STRINGARG? namestat=STRINGARG argument=STRINGARG? unknownsubstatements+=UnknownSubstatements*)
	 */
	protected void sequence_UnknownSubstatements(EObject context, UnknownSubstatements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pre=STRINGARG? arg=[GroupingStatement|ID] usessubstatements+=UsesSubstatement*)
	 */
	protected void sequence_UsesStatement(EObject context, UsesStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (intarg=STRINGARG valueunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_ValueStatement(EObject context, ValueStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=STRINGARG whensubstatements+=WhenSubstatements*)
	 */
	protected void sequence_WhenStatement(EObject context, WhenStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (version=STRINGARG yangversionunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_YangVersionStatement(EObject context, YangVersionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (boolarg=STRINGARG yinelementunknownstatements+=UnknownStatement*)
	 */
	protected void sequence_YinElementStatement(EObject context, YinElementStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
