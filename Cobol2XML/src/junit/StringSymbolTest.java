package junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import parse.tokens.*;

// This test checks whether Symbols made from strings' random expansion method is working.
public class StringSymbolTest {

	@Test
	public void test() {
		Literal l = new Literal("**");
		
		// Create a collection with this symbol's string representation of itself
		ArrayList<String> arrayList = l.randomExpansion(2, 3);
		
		//System.out.println(arrayList);
		
        assertFalse(arrayList.isEmpty());    
	}

}
