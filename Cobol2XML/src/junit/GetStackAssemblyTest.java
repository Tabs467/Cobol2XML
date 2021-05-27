package junit;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.Token;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether the getStack method of the TokenAssembly class is working.
public class GetStackAssemblyTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("program-id. JB-base");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		//System.out.println(out.getStack());
		//System.out.println(out.getStack().get(0));
		
		Token firstElementOfStack = (Token) out.getStack().get(0);
		
		//System.out.println(firstElementOfStack);
		
		Token programIDToken = new Token("program-id");
		
		assertTrue(firstElementOfStack.equals(programIDToken));
	}

}
