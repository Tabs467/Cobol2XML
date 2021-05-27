package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.Token;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether the StackIsEmpty method is working in the TokenAssembly class.
public class StackIsEmptyAssemblyTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("88 base_2 value 2.");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		//System.out.println(out.toString());
		//System.out.println(out.peek());
		//System.out.println(out.elementsRemaining());
		
		assertTrue(out.stackIsEmpty());
		
		
		t.setString("");
		in = new TokenAssembly(t);
		in.push(new Token("word"));
		in.pop();
		
		//System.out.println(out.toString());
		//System.out.println(out.peek());
		//System.out.println(out.elementsRemaining());
		
		assertTrue(out.stackIsEmpty());
	}

}

