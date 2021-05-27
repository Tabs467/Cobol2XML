package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether COBOL constant declarations can be assembled correctly
// by checking whether the constant Cobol class variables have been set correctly.
public class ConstantValueAssemblerTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("88 base_2 value 2.");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		c = (Cobol) out.getTarget();
		
		//System.out.println(c.getConstantName());
		//System.out.println(c.getConstantValue());
		//System.out.println(c.getLineNumber());
		
		assertTrue(c.getConstantName().equals("base_2"));
		assertTrue(c.getConstantValue().equals(2.0));
		assertTrue(c.getLineNumber() == (88));
	}

}
