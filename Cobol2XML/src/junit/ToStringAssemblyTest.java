package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether the toString method is working in the TokenAssembly class.
public class ToStringAssemblyTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("88 base_2 value 2.");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		//System.out.println(out.toString());
		
		assertTrue(out.toString().equals("[]88.0/base_2/value/2.0^"));
	}

}
