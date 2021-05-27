package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.*;
import java.util.ArrayList;

// This test checks whether Words' random expansion method is working.
public class WordTest {

	@Test
	public void test() {
		Word word = new Word();
		int maxDepth = 2;
		int depth = 1;
		
		// Create a set with one random word
		ArrayList<String> v = new ArrayList<String>();
		v = word.randomExpansion(maxDepth, depth);
		
		//System.out.println(v);
		
		assertFalse(v.isEmpty());
	}

}
