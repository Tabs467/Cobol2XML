package junit;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;

import cobol.Cobol;
import cobol.CobolParser;
import parse.Assembly;
import parse.Parser;
import parse.tokens.TokenAssembly;
import parse.tokens.Tokenizer;
import xmlwriter.XMLPayload;

// This test checks whether COBOL display commands can be written as XML correctly
// by checking whether the XMLWriter class writes it to a file correctly.
public class DisplayXMLTest {

	@Test
	public void test() {
		Tokenizer t = CobolParser.tokenizer();
		Parser p = CobolParser.start();
		t.setString("display \"Base: \" current_base \" value: \" entry_char");
		Assembly in = new TokenAssembly(t);
		Assembly out = p.bestMatch(in);
		
		Cobol c = new Cobol();
		c = (Cobol) out.getTarget();
		
		XMLPayload xmlp = new XMLPayload();
		if(c != null) {
			xmlp.addElements(c);
		}
		
		String actualOutput = xmlp.returnXMLContents();
		
		String expectedXMLOutput = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><cobol>    <Display>\"Base: \" current_base \" value: \" entry_char</Display></cobol>";
		
		//System.out.println(actualOutput);
		//System.out.println(expectedXMLOutput);
		
		assertTrue(actualOutput.equals(expectedXMLOutput));
	}

}
