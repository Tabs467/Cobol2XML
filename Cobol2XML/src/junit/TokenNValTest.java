package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.*;
import java.util.ArrayList;

// This test checks whether Tokens' NVal method is working.
public class TokenNValTest {

	@Test
	public void test() {
		Token token = new Token(3);
		
		//System.out.println(token.nval());
		
		assertTrue(token.nval() == 3);
	}

}
