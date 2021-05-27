package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.*;
import java.util.ArrayList;

// This test checks whether Tokens' equals method is working.
public class TokenEqualsTest {

	@Test
	public void test() {
		Token tokenOne = new Token("same string");
		Token tokenTwo = new Token("same string");
		Token tokenThree = new Token("different string");
		Token tokenFour = new Token(3);
		
		assertTrue(tokenOne.equals(tokenTwo));
		assertFalse(tokenOne.equals(tokenThree));
		assertFalse(tokenOne.equals(tokenFour));
	}

}
