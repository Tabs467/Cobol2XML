package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether COBOL comment lines can be assembled correctly
// by checking whether the constant Cobol class variables have been set correctly.
public class CommentAssemblerTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("***---  convert from base to decimal system");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		c = (Cobol) out.getTarget();
		
		//System.out.println(c.getCommentLine());
		
		assertTrue(c.getCommentLine().equals("convert from base to decimal system"));
	}

}
