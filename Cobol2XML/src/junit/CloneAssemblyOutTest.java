package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether the clone method of the TokenAssembly class is working on the out assembly.
public class CloneAssemblyOutTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("88 base_2 value 2.");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Assembly outClone = (Assembly) out.clone();
		
		//System.out.println(out.toString());
		//System.out.println(outClone.toString());
		
		assertTrue(out.toString().equals(outClone.toString()));
	}

}
