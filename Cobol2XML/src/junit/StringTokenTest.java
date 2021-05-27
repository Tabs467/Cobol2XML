package junit;

import static org.junit.Assert.*;

import parse.tokens.*;

import org.junit.Test;

// This test checks whether Tokens created with a string are created as Word tokens.
public class StringTokenTest {

	@Test
	public void test() {
		String s = "abc";
		Token t = new Token(s);
		
		assertFalse(t.isNumber());
		assertTrue(t.isWord());
		assertFalse(t.isQuotedString());
		assertFalse(t.isSymbol());
	}

}
