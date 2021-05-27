package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether the Cobol section names can be parsed by the CobolParser.
public class SectionNameParserTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("working-storage section.");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		//System.out.println(out.toString());
		//System.out.println(out.peek());
		
		assertTrue(out.elementsRemaining() == 0);
		assertFalse(out.stackIsEmpty());
	}

}
