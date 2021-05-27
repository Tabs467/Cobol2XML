package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether COBOL decimal variable declarations can be understood by the CobolParser.
public class DecimalVariableDeclarationParserTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("01 w_number pic 9(16)");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		//System.out.println(out.toString());
		//System.out.println(out.peek());
		//System.out.println(out.elementsRemaining());
		
		// If the Assembly's stack empty the input line has been fully understood by the Parser.
		assertTrue(out.elementsRemaining() == 0);
		assertTrue(out.stackIsEmpty());
	}

}