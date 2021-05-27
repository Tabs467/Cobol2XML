package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether the default delimiter method of the TokenAssembly class is working.
public class DefaultDelimiterAssemblyTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("string");
		Assembly in = new TokenAssembly(t);
		
		//System.out.println(in.defaultDelimiter());
		String s = "/";
		
		assertTrue(in.defaultDelimiter() == s);
	}

}
