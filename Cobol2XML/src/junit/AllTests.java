package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CaselessLiteralTest.class, CharacterSymbolTest.class, CharacterTokenTest.class,
		CloneAssemblyInTest.class, CloneAssemblyOutTest.class, CommentAssemblerTest.class, CommentParserTest.class,
		CommentXMLTest.class, ConstantValueAssemblerTest.class, ConstantValueParserTest.class,
		ConstantValueXMLTest.class, ConsumedAssemblyTest.class, DateWrittenAssemblerTest.class,
		DateWrittenParserTest.class, DateWrittenXMLTest.class, DecimalVariableDeclarationAssemblerTest.class,
		DecimalVariableDeclarationParserTest.class, DecimalVariableDeclarationXMLTest.class,
		DefaultDelimiterAssemblyTest.class, DisplayAssemblerTest.class, DisplayParserTest.class, DisplayXMLTest.class,
		DivisionNameAssemblerTest.class, DivisionNameParserTest.class, DivisionNameXMLTest.class,
		ElementsConsumedAssemblyTest.class, ElementsRemainingAssemblyTest.class, EmptyCommentAssemblerTest.class,
		EmptyCommentParserTest.class, EmptyCommentXMLTest.class, GetStackAssemblyTest.class,
		HasMoreElementsAssemblyTest.class, LengthAssemblyTest.class, LiteralTest.class, NumberTokenTest.class,
		NumTest.class, PeekAssemblyTest.class, PopAssemblyTest.class, ProgramIDAssemblerTest.class,
		ProgramIDParserTest.class, ProgramIDXMLTest.class, PushAssemblyTest.class, QuotedStringTest.class,
		RemainderAssemblyTest.class, SectionNameAssemblerTest.class, SectionNameParserTest.class,
		SectionNameXMLTest.class, StackIsEmptyAssemblyTest.class, StringSymbolTest.class, StringTokenTest.class,
		StringVariableDeclarationAssemblerTest.class, StringVariableDeclarationParserTest.class,
		StringVariableDeclarationXMLTest.class, SymbolTokenTest.class, TokenEqualsTest.class, TokenNValTest.class,
		TokenSValTest.class, ToStringAssemblyTest.class, WordTest.class })
public class AllTests {

}
