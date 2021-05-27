package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether COBOL dates can be understood by the CobolParser.
public class DateWrittenParserTest {
	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("date-written.  07-mar-1995 - mb.");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		//System.out.println(out.toString());
		//System.out.println(out.peek());
		//System.out.println(out.elementsRemaining());
		
		// If the Assembly's stack empty the input line has been fully understood by the Parser.
		assertTrue(out.elementsRemaining() == 0);
		assertFalse(out.stackIsEmpty());
	}

}
