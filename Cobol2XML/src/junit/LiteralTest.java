package junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import parse.tokens.*;

// This test checks whether literals' random expansion method is working.
public class LiteralTest {

	@Test
	public void test() {
		String c = "int";
		Literal l = new Literal(c);
		
		// Create a collection with this literal's string representation of itself
		ArrayList<String> arrayList = l.randomExpansion(2, 3);
		
		//System.out.println(arrayList);
		
        assertFalse(arrayList.isEmpty());    
	}

}
