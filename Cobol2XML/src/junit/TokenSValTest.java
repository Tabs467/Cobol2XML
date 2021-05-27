package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.*;
import java.util.ArrayList;

// This test checks whether Tokens' SVal method is working.
public class TokenSValTest {

	@Test
	public void test() {
		Token token = new Token("string");
		
		//System.out.println(token.sval());
		
		assertTrue(token.sval() == "string");
	}

}
