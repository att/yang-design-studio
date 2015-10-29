package yang.manager.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import yang.manager.services.YangGrammarAccess;

@SuppressWarnings("all")
public class YangSyntacticSequencer extends AbstractSyntacticSequencer {

	protected YangGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AnyxmlStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_ArgumentStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_AugmentStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_AugmentUsesStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_BaseStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_BitStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_CaseStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_ChoiceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_ConfigStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_ContactStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_ContainerStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_DefaultStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_DescriptionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_DeviateStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_DeviationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_EnumStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_ErrorAppTagStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_ErrorMessageStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_ExtensionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_FeatureStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_FractionDigitsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_GroupingStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_IdentityStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_IfFeatureStatement_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__;
	protected AbstractElementAlias match_ImportStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_IncludeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_KeyStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_LeafListStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_LeafStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_LengthStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_ListStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_MandatoryStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_MaxElementsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_MinElementsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_MustStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_NamespaceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_NotificationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_OrderedbyStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_OrganizationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_PathStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_PatternStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_PositionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_PrefixStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_PresenceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_RangeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_ReferenceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_RefineStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_RequireInstanceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_RevisionDateStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_RevisionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_StatusStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_TypeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_UniqueStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_UnitsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_UnknownStatement_SemicolonKeyword_4_0_or___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_2__;
	protected AbstractElementAlias match_UnknownSubstatements_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__;
	protected AbstractElementAlias match_UsesStatement_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__;
	protected AbstractElementAlias match_ValueStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_WhenStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_YangVersionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	protected AbstractElementAlias match_YinElementStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (YangGrammarAccess) access;
		match_AnyxmlStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getAnyxmlStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAnyxmlStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getAnyxmlStatementAccess().getSemicolonKeyword_2_0()));
		match_ArgumentStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getArgumentStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getArgumentStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getArgumentStatementAccess().getSemicolonKeyword_2_0()));
		match_AugmentStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getAugmentStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAugmentStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getAugmentStatementAccess().getSemicolonKeyword_2_0()));
		match_AugmentUsesStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getAugmentUsesStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAugmentUsesStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getAugmentUsesStatementAccess().getSemicolonKeyword_2_0()));
		match_BaseStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getBaseStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getBaseStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getBaseStatementAccess().getSemicolonKeyword_2_0()));
		match_BitStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getBitStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getBitStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getBitStatementAccess().getSemicolonKeyword_2_0()));
		match_CaseStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCaseStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getCaseStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getCaseStatementAccess().getSemicolonKeyword_2_0()));
		match_ChoiceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getChoiceStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getChoiceStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getChoiceStatementAccess().getSemicolonKeyword_2_0()));
		match_ConfigStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getConfigStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getConfigStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getConfigStatementAccess().getSemicolonKeyword_2_0()));
		match_ContactStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getContactStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getContactStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getContactStatementAccess().getSemicolonKeyword_2_0()));
		match_ContainerStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getContainerStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getContainerStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getContainerStatementAccess().getSemicolonKeyword_2_0()));
		match_DefaultStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefaultStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getDefaultStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getDefaultStatementAccess().getSemicolonKeyword_2_0()));
		match_DescriptionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDescriptionStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getDescriptionStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getDescriptionStatementAccess().getSemicolonKeyword_2_0()));
		match_DeviateStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeviateStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getDeviateStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getDeviateStatementAccess().getSemicolonKeyword_2_0()));
		match_DeviationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeviationStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getDeviationStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getDeviationStatementAccess().getSemicolonKeyword_2_0()));
		match_EnumStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEnumStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getEnumStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getEnumStatementAccess().getSemicolonKeyword_2_0()));
		match_ErrorAppTagStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getErrorAppTagStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getErrorAppTagStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getErrorAppTagStatementAccess().getSemicolonKeyword_2_0()));
		match_ErrorMessageStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getErrorMessageStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getErrorMessageStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getErrorMessageStatementAccess().getSemicolonKeyword_2_0()));
		match_ExtensionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getExtensionStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getExtensionStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getExtensionStatementAccess().getSemicolonKeyword_2_0()));
		match_FeatureStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFeatureStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getFeatureStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getFeatureStatementAccess().getSemicolonKeyword_2_0()));
		match_FractionDigitsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFractionDigitsStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getFractionDigitsStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getFractionDigitsStatementAccess().getSemicolonKeyword_2_0()));
		match_GroupingStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getGroupingStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getGroupingStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getGroupingStatementAccess().getSemicolonKeyword_2_0()));
		match_IdentityStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIdentityStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getIdentityStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getIdentityStatementAccess().getSemicolonKeyword_2_0()));
		match_IfFeatureStatement_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIfFeatureStatementAccess().getLeftCurlyBracketKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getIfFeatureStatementAccess().getRightCurlyBracketKeyword_3_1_2())), new TokenAlias(false, false, grammarAccess.getIfFeatureStatementAccess().getSemicolonKeyword_3_0()));
		match_ImportStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getImportStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getImportStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getImportStatementAccess().getSemicolonKeyword_2_0()));
		match_IncludeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getIncludeStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getIncludeStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getIncludeStatementAccess().getSemicolonKeyword_2_0()));
		match_KeyStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getKeyStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getKeyStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getKeyStatementAccess().getSemicolonKeyword_2_0()));
		match_LeafListStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLeafListStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getLeafListStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getLeafListStatementAccess().getSemicolonKeyword_2_0()));
		match_LeafStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLeafStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getLeafStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getLeafStatementAccess().getSemicolonKeyword_2_0()));
		match_LengthStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLengthStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getLengthStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getLengthStatementAccess().getSemicolonKeyword_2_0()));
		match_ListStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getListStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getListStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getListStatementAccess().getSemicolonKeyword_2_0()));
		match_MandatoryStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMandatoryStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getMandatoryStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getMandatoryStatementAccess().getSemicolonKeyword_2_0()));
		match_MaxElementsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMaxElementsStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getMaxElementsStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getMaxElementsStatementAccess().getSemicolonKeyword_2_0()));
		match_MinElementsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMinElementsStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getMinElementsStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getMinElementsStatementAccess().getSemicolonKeyword_2_0()));
		match_MustStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMustStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getMustStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getMustStatementAccess().getSemicolonKeyword_2_0()));
		match_NamespaceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getNamespaceStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getNamespaceStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getNamespaceStatementAccess().getSemicolonKeyword_2_0()));
		match_NotificationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getNotificationStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getNotificationStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getNotificationStatementAccess().getSemicolonKeyword_2_0()));
		match_OrderedbyStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getOrderedbyStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getOrderedbyStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getOrderedbyStatementAccess().getSemicolonKeyword_2_0()));
		match_OrganizationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getOrganizationStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getOrganizationStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getOrganizationStatementAccess().getSemicolonKeyword_2_0()));
		match_PathStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPathStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getPathStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getPathStatementAccess().getSemicolonKeyword_2_0()));
		match_PatternStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getPatternStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getPatternStatementAccess().getSemicolonKeyword_2_0()));
		match_PositionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPositionStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getPositionStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getPositionStatementAccess().getSemicolonKeyword_2_0()));
		match_PrefixStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrefixStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getPrefixStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getPrefixStatementAccess().getSemicolonKeyword_2_0()));
		match_PresenceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPresenceStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getPresenceStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getPresenceStatementAccess().getSemicolonKeyword_2_0()));
		match_RangeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getRangeStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getRangeStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getRangeStatementAccess().getSemicolonKeyword_2_0()));
		match_ReferenceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getReferenceStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getReferenceStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getReferenceStatementAccess().getSemicolonKeyword_2_0()));
		match_RefineStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getRefineStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getRefineStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getRefineStatementAccess().getSemicolonKeyword_2_0()));
		match_RequireInstanceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getRequireInstanceStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getRequireInstanceStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getRequireInstanceStatementAccess().getSemicolonKeyword_2_0()));
		match_RevisionDateStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getRevisionDateStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getRevisionDateStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getRevisionDateStatementAccess().getSemicolonKeyword_2_0()));
		match_RevisionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getRevisionStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getRevisionStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getRevisionStatementAccess().getSemicolonKeyword_2_0()));
		match_StatusStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatusStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getStatusStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getStatusStatementAccess().getSemicolonKeyword_2_0()));
		match_TypeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTypeStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getTypeStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getTypeStatementAccess().getSemicolonKeyword_2_0()));
		match_UniqueStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getUniqueStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getUniqueStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getUniqueStatementAccess().getSemicolonKeyword_2_0()));
		match_UnitsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getUnitsStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getUnitsStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getUnitsStatementAccess().getSemicolonKeyword_2_0()));
		match_UnknownStatement_SemicolonKeyword_4_0_or___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getUnknownStatementAccess().getLeftCurlyBracketKeyword_4_1_0()), new TokenAlias(false, false, grammarAccess.getUnknownStatementAccess().getRightCurlyBracketKeyword_4_1_2())), new TokenAlias(false, false, grammarAccess.getUnknownStatementAccess().getSemicolonKeyword_4_0()));
		match_UnknownSubstatements_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getUnknownSubstatementsAccess().getLeftCurlyBracketKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getUnknownSubstatementsAccess().getRightCurlyBracketKeyword_3_1_2())), new TokenAlias(false, false, grammarAccess.getUnknownSubstatementsAccess().getSemicolonKeyword_3_0()));
		match_UsesStatement_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getUsesStatementAccess().getLeftCurlyBracketKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getUsesStatementAccess().getRightCurlyBracketKeyword_3_1_2())), new TokenAlias(false, false, grammarAccess.getUsesStatementAccess().getSemicolonKeyword_3_0()));
		match_ValueStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getValueStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getValueStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getValueStatementAccess().getSemicolonKeyword_2_0()));
		match_WhenStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getWhenStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getWhenStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getWhenStatementAccess().getSemicolonKeyword_2_0()));
		match_YangVersionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getYangVersionStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getYangVersionStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getYangVersionStatementAccess().getSemicolonKeyword_2_0()));
		match_YinElementStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getYinElementStatementAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getYinElementStatementAccess().getRightCurlyBracketKeyword_2_1_2())), new TokenAlias(false, false, grammarAccess.getYinElementStatementAccess().getSemicolonKeyword_2_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AnyxmlStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_AnyxmlStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArgumentStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_ArgumentStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AugmentStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_AugmentStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AugmentUsesStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_AugmentUsesStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BaseStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_BaseStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BitStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_BitStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CaseStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_CaseStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ChoiceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_ChoiceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConfigStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_ConfigStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ContactStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_ContactStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ContainerStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_ContainerStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DefaultStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_DefaultStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DescriptionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_DescriptionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DeviateStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_DeviateStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DeviationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_DeviationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_EnumStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ErrorAppTagStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_ErrorAppTagStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ErrorMessageStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_ErrorMessageStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExtensionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_ExtensionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FeatureStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_FeatureStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FractionDigitsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_FractionDigitsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GroupingStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_GroupingStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IdentityStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_IdentityStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfFeatureStatement_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__.equals(syntax))
				emit_IfFeatureStatement_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImportStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_ImportStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IncludeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_IncludeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_KeyStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_KeyStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LeafListStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_LeafListStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LeafStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_LeafStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LengthStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_LengthStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ListStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_ListStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MandatoryStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_MandatoryStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MaxElementsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_MaxElementsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MinElementsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_MinElementsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MustStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_MustStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NamespaceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_NamespaceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NotificationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_NotificationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OrderedbyStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_OrderedbyStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OrganizationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_OrganizationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PathStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_PathStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PatternStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_PatternStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PositionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_PositionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PrefixStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_PrefixStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PresenceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_PresenceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RangeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_RangeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReferenceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_ReferenceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RefineStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_RefineStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RequireInstanceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_RequireInstanceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RevisionDateStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_RevisionDateStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RevisionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_RevisionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StatusStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_StatusStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_TypeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UniqueStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_UniqueStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UnitsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_UnitsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UnknownStatement_SemicolonKeyword_4_0_or___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_2__.equals(syntax))
				emit_UnknownStatement_SemicolonKeyword_4_0_or___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UnknownSubstatements_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__.equals(syntax))
				emit_UnknownSubstatements_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UsesStatement_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__.equals(syntax))
				emit_UsesStatement_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ValueStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_ValueStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WhenStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_WhenStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_YangVersionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_YangVersionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_YinElementStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__.equals(syntax))
				emit_YinElementStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_AnyxmlStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_ArgumentStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_AugmentStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_AugmentUsesStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_BaseStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_BitStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_CaseStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_ChoiceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_ConfigStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_ContactStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_ContainerStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_DefaultStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_DescriptionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_DeviateStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_DeviationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_EnumStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_ErrorAppTagStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_ErrorMessageStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_ExtensionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_FeatureStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_FractionDigitsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_GroupingStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_IdentityStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_IfFeatureStatement_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_ImportStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_IncludeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_KeyStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_LeafListStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_LeafStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_LengthStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_ListStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_MandatoryStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_MaxElementsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_MinElementsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_MustStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_NamespaceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_NotificationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_OrderedbyStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_OrganizationStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_PathStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_PatternStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_PositionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_PrefixStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_PresenceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_RangeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_ReferenceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_RefineStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_RequireInstanceStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_RevisionDateStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_RevisionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_StatusStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_TypeStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_UniqueStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_UnitsStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_UnknownStatement_SemicolonKeyword_4_0_or___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_UnknownSubstatements_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_UsesStatement_SemicolonKeyword_3_0_or___LeftCurlyBracketKeyword_3_1_0_RightCurlyBracketKeyword_3_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_ValueStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_WhenStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_YangVersionStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_YinElementStatement_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
