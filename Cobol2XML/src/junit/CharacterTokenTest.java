package junit;

import static org.junit.Assert.*;

import parse.tokens.*;

import org.junit.Test;

// This test checks whether Tokens created with a single alpha-numeric character are created as Symbol tokens.
public class CharacterTokenTest {

	@Test
	public void test() {
		char c = 'a';
		Token t = new Token(c);
		
		assertFalse(t.isNumber());
		assertFalse(t.isWord());
		assertFalse(t.isQuotedString());
		assertTrue(t.isSymbol());
	}

}
