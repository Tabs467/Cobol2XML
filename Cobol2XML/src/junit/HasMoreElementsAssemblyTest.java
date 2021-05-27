package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether the has more elements method of the TokenAssembly class is working.
public class HasMoreElementsAssemblyTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("88 base_2 value 2 extraToken");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		// hasMoreElements() returns: elementsConsumed() < length()
		
		//System.out.println(out.hasMoreElements());
		
		assertTrue(out.hasMoreElements());
		
		
		t.setString("88 base_2 value 2");
		in = new TokenAssembly(t);
		out = p.bestMatch(in);
		
		//System.out.println(out.hasMoreElements());
		
		assertFalse(out.hasMoreElements());
	}

}
