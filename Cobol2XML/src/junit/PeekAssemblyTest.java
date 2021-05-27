package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.Token;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether the peek method of the TokenAssembly class is working.
public class PeekAssemblyTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("88 base_2 value 2 extraToken");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		//System.out.println(((Token) in.peek()).nval());
		//System.out.println(((Token) out.peek()).sval());
		
		assertTrue(((Token) in.peek()).nval() == 88.0);
		assertTrue(((Token) out.peek()).sval().equals("extraToken"));
	}

}
