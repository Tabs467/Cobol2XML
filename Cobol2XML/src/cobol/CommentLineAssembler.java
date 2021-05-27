package cobol;
import java.util.Stack;

import parse.*;
import parse.tokens.*;

public class CommentLineAssembler extends Assembler {
	/**
	* This Comment Assembler removes the COBOL comment syntax and trims the typed comment down so it is ready to
	* be displayed in XML.
	*
	* @param Assembly the assembly to work on
	*/
	public void workOn(Assembly a) {
		Cobol c = new Cobol();
		
		Stack assemblyStack = a.getStack();
		
		String comment = "";
		
		// If the comment is not empty.
		while (assemblyStack.empty() == false) {
			Token poppedToken = (Token) assemblyStack.pop();
			
			// Add the next token to end of the comment.
			if (poppedToken.isWord() || poppedToken.isSymbol()) {
				comment += " " + poppedToken.sval();
			}
			else if (poppedToken.isNumber()) {
				comment += " " + poppedToken.nval();
			}
		}
		
		
		// If the comment is not empty.
		if (comment.length() > 0) {
			// Reverse the order of the words so they are in the correct order
			// (Since they will be in the reverse order from the stack)
			String stringArray[] = comment.split(" "); 
		    String unreversedComment = ""; 
		    for (int stringIndex = stringArray.length - 1; stringIndex >= 0; stringIndex--) { 
		    	unreversedComment += stringArray[stringIndex] + " ";
		    }
		    
		    // Remove the two extra spaces at the end of the reversed string.
		    unreversedComment = unreversedComment.substring(0, unreversedComment.length() - 2);
			
			c.setCommentLine(unreversedComment);
			a.setTarget(c);
		}
	}
}