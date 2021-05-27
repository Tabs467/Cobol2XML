package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;

// This test checks whether COBOL dates can be assembled correctly
// by checking whether the constant Cobol class variables have been set correctly.
public class DateWrittenAssemblerTest {
	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("date-written.  07-mar-1995 - mb.");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		c = (Cobol) out.getTarget();
		
		//System.out.println(c.getDayDateWritten());
		//System.out.println(c.getMonthDateWritten());
		//System.out.println(c.getYearDateWritten());
		
		assertTrue(c.getDayDateWritten() == 7);
		assertTrue(c.getMonthDateWritten().equals("mar"));
		assertTrue(c.getYearDateWritten() == 1995);
	}

}
