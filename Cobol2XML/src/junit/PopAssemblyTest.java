package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.Token;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether the pop method of the TokenAssembly class is working.
public class PopAssemblyTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("");
		Assembly in = new TokenAssembly(t);
		
		in.push(new Token("wordToken"));
		
		Token poppedToken = (Token) in.pop();
		
		//System.out.println(poppedToken);
		
		assertTrue(poppedToken.sval().equals("wordToken"));
	}

}
