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

// This test checks whether COBOL Section Name elements can be written as XML correctly
// by checking whether the XMLWriter class writes it to a file correctly.
public class SectionNameXMLTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("working-storage section.");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		c = (Cobol) out.getTarget();

		XMLPayload xmlp = new XMLPayload();
		if(c != null) {
			xmlp.addElements(c);
		}

		String actualOutput = xmlp.returnXMLContents();

		String expectedXMLOutput = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><cobol>    <section>working-storage</section></cobol>";

		//System.out.println(actualOutput);
		//System.out.println(expectedXMLOutput);

		assertTrue(actualOutput.equals(expectedXMLOutput));
	}

}