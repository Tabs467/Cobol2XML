package junit;

import static org.junit.Assert.*;

import parse.tokens.*;

import org.junit.Test;

// This test checks whether Tokens created with a single non-alpha-numeric symbol character are created as Symbol tokens.
public class SymbolTokenTest {

	@Test
	public void test() {
		char c = '*';
		Token t = new Token(c);
		
		assertFalse(t.isNumber());
		assertFalse(t.isWord());
		assertFalse(t.isQuotedString());
		assertTrue(t.isSymbol());
	}

}
