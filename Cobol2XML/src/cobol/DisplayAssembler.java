package cobol;
import java.util.Stack;

import parse.*;
import parse.tokens.*;

public class DisplayAssembler extends Assembler {
	/**
	* This Display Assembler removes the COBOL display syntax and takes the text to display so it is ready to
	* be displayed in XML.
	*
	* @param Assembly the assembly to work on
	*/
	public void workOn(Assembly a) {
		Cobol c = new Cobol();
		
		Stack assemblyStack = a.getStack();
		
		// Reverse the order of the words and quoted strings so they are in the correct order
		// By reversing the stack
		// (Since they will be in the reverse order if popped from the stack)
		Stack reversedStack = new Stack();
					
		while (assemblyStack.empty() == false) {
			Token poppedToken = (Token) assemblyStack.pop();
			reversedStack.push(poppedToken);
		}
		
		
		
		String display = "";
		
		// If the text after the display command is not empty.
		while (reversedStack.empty() == false) {
			Token poppedToken = (Token) reversedStack.pop();
			
			// Add the next token to end of the display.
			display += " " + poppedToken.sval();
		}
		
		
		// If the display command is not empty.
		if (display.length() > 0) {
		    // Remove the extra space at the start of the display text.
		    display = display.substring(1, display.length());
			
			c.setDisplayText(display);
			a.setTarget(c);
		}
	}
}