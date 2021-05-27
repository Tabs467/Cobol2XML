package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;
import xmlwriter.XMLPayload;

//This test checks whether COBOL date written elements can be written as XML correctly
//by checking whether the XMLWriter class writes it to a file correctly.
public class DateWrittenXMLTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("date-written.  07-mar-1995 - mb.");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		c = (Cobol) out.getTarget();

		XMLPayload xmlp = new XMLPayload();
		if(c != null) {
			xmlp.addElements(c);
		}

		String actualOutput = xmlp.returnXMLContents();

		String expectedXMLOutput = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><cobol>    <day-date-written>7</day-date-written>    <month-date-written>mar</month-date-written>    <year-date-written>1995</year-date-written></cobol>";

		//System.out.println(actualOutput);
		//System.out.println(expectedXMLOutput);

		assertTrue(actualOutput.equals(expectedXMLOutput));
	}

}