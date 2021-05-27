package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.*;
import java.util.ArrayList;

// This test checks whether QuotedStrings' random expansion method is working.
public class QuotedStringTest {

	@Test
	public void test() {
		QuotedString quotedString = new QuotedString();
		int maxDepth = 2;
		int depth = 1;
		
		// Create a set with one random quoted string
		ArrayList<String> v = new ArrayList<String>();
		v = quotedString.randomExpansion(maxDepth, depth);
		
		//System.out.println(v);
		
		assertFalse(v.isEmpty());
	}

}
