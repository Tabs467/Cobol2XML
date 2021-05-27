package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.*;
import java.util.ArrayList;

// This test checks whether Nums' random expansion method is working.
public class NumTest {

	@Test
	public void test() {
		Num num = new Num();
		int maxDepth = 2;
		int depth = 1;
		
		// Create a set with one random number
		ArrayList<String> v = new ArrayList<String>();
		v = num.randomExpansion(maxDepth, depth);
		
		//System.out.println(v);
		
		assertFalse(v.isEmpty());
	}

}
