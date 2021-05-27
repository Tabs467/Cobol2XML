package cobol;
import parse.*;
import parse.tokens.*;

public class DecimalVariableDeclarationAssembler extends Assembler {
	/**
	* 
	* This Decimal Variable Assembler removes the COBOL comment syntax and takes the variables name and size out so it is ready to
	* be displayed in XML.
	*
	* @param Assembly the assembly to work on
	*/
	public void workOn(Assembly a) {
		Cobol c = new Cobol();
		
		// Discard Symbol ")"
		a.pop();
		
		
		// How many whole numbers the variable can store.
		Token t = (Token) a.pop();
		Double wholeNumbers = t.nval();
		c.setDecimalVariableWholeNumbers(wholeNumbers);
		
		
		// Discard Symbol "("
		a.pop();
		
		
		// Discard Number "9"
		t = (Token) a.pop();
		
		
		// Discard Literal "pic"
		a.pop();
		
		
		// The name of the variable
		t = (Token) a.pop();
		c.setDecimalVariableName(t.sval().trim());
		
		
		// Discard "01"
		a.pop();
		
		
		// The Assembly's target to the Cobol class.
		a.setTarget(c);
	}
}