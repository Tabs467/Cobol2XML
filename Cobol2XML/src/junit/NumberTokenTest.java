package junit;

import static org.junit.Assert.*;

import parse.tokens.*;

import org.junit.Test;

// This test checks whether Tokens created with a number are created as Number tokens.
public class NumberTokenTest {

	@Test
	public void test() {
		Token t = new Token(3);
		
		assertTrue(t.isNumber());
		assertFalse(t.isWord());
		assertFalse(t.isQuotedString());
		assertFalse(t.isSymbol());
	}

}
