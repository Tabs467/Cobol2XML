package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether COBOL decimal variable declarations can be assembled correctly
// by checking whether the constant Cobol class variables have been set correctly.
public class DecimalVariableDeclarationAssemblerTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("01 w_number pic 9(16)");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		c = (Cobol) out.getTarget();
		
		//System.out.println(c.getDecimalVariableName());
		//System.out.println(c.getDecimalVariableWholeNumbers());
		
		assertTrue(c.getDecimalVariableName().equals("w_number"));
		assertTrue(c.getDecimalVariableWholeNumbers().equals(16.0));
	}

}
