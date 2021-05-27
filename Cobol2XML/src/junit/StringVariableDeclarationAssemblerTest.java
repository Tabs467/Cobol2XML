package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

//This test checks whether COBOL string variable declarations can be assembled correctly
//by checking whether the constant Cobol class variables have been set correctly.
public class StringVariableDeclarationAssemblerTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("01  hex_dec_data pic x(48) value \"10B11C12D13E14F15\"");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		c = (Cobol) out.getTarget();
		
		//System.out.println(c.getStringVariableName());
		//System.out.println(c.getStringVariableSize());
		//System.out.println(c.getStringVariableValue());
		
		assertTrue(c.getStringVariableName().equals("hex_dec_data"));
		assertTrue(c.getStringVariableSize().equals(48.0));
		assertTrue(c.getStringVariableValue().equals("10B11C12D13E14F15"));
		
	}

}
