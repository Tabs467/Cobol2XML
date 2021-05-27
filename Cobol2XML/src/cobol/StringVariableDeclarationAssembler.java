package cobol;
import java.util.ArrayList;

import parse.*;
import parse.tokens.*;

public class StringVariableDeclarationAssembler extends Assembler {
	/**
	* 
	* This String Variable Assembler removes the COBOL comment syntax and takes the variables name, size and value out so it is ready to
	* be displayed in XML.
	*
	* @param Assembly the assembly to work on
	*/
	public void workOn(Assembly a) {
		Cobol c = new Cobol();
		
		// Value of string variable
		Token t = (Token) a.pop();
		// Remove '&quot;' characters
		String quotedString = t.sval();
		quotedString = quotedString.replace("\"", "");
		
		c.setStringVariableValue(quotedString);
		
		
		
		// Discard Literal "value"
		a.pop();
		
		
		// Discard Character ")"
		a.pop();
		
		
		// Number of bytes String variable can hold
		t = (Token) a.pop();
		c.setStringVariableSize(t.nval());
		
		
		// Discard Symbol "("
		a.pop();
		
		// Discard Literal "x"
		a.pop();
				
		// Discard Literal "pic"
		a.pop();
		
		
		// String Variable's name
		t = (Token) a.pop();
		c.setStringVariableName(t.sval());
		
		
		// Discard "01"
		a.pop();
		
		
		// The Assembly's target to the Cobol class.
		a.setTarget(c);
	}
}