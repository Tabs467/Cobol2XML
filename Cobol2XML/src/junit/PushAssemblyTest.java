package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.Token;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether the push method of the TokenAssembly class is working.
public class PushAssemblyTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("");
		Assembly in = new TokenAssembly(t);
		
		in.push(new Token("wordToken"));
		
		//System.out.println(in.getStack());
		
		String stackToString = in.getStack().toString();
		
		assertTrue(stackToString.equals("[wordToken]"));
	}

}
