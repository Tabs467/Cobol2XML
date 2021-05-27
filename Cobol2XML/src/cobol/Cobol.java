/*
 * @(#)Cobol.java	 0.0.1
 *
 * Copyright (c) 2019 Julian M. Bass
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 */

package cobol;

import utensil.*;

public class Cobol implements PubliclyCloneable {
	protected String program_id;
	protected String sectionName;
	protected String divisionName;
	
	protected int dayDateWritten = 0;
	protected String monthDateWritten;
	protected int yearDateWritten = 0;
	
	// Constant Value
	protected String constantName;
	protected double constantValue;
	protected int lineNumber = 0;
	
	// Comment Line
	protected String commentLine;
	
	// Decimal Variable
	protected String decimalVariableName;
	protected double decimalVariableWholeNumbers;
	
	// String Variable
	protected String stringVariableName;
	protected String stringVariableValue;
	protected double stringVariableSize;
	
	// Display Text Variable
	protected String displayText;
	

	
	/**
	 * Return a copy of this object.
	 *
	 * @return a copy of this object
	 */
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// this shouldn't happen, since we are Cloneable
			throw new InternalError();
		}
	}
	/**
	 * Compares two objects for equality, treating nulls carefullly,
	 * and relying on the first object's implementation of <code>
	 * equals()</code>.
	 *
	 * @param   o1   one object
	 *
	 * @param   o2   the other
	 *
	 * @return  <code>true</code> if the objects are equal and
	 *          <code>false</code> otherwise.
	 */
	public static boolean equal(Object o1, Object o2) {
		if (o1 == null || o2 == null) {
			return o1 == null && o2 == null;
		}
		return o1.equals(o2);
	}
	/**
	 * Compares this object against the specified object. The 
	 * result is <code>true</code> if and only if the argument is 
	 * not <code>null</code> and is a <code>Coffee</code> object 
	 * whose attributes all equal this object's attributes.
	 *
	 * @param   o   the object to compare with.
	 *
	 * @return  <code>true</code> if the objects are equal and
	 *          <code>false</code> otherwise.
	 */
	public boolean equals(Object o) {
		if (!(o instanceof Cobol)) {
			return false;
		}
		Cobol c = (Cobol) o;
		
		
		if (!equal(program_id, c.program_id)) {
			return false;
		}
		
		if (!equal(sectionName, c.sectionName)) {
			return false;
		}
		

		return true;
	}

	/**
	 * Return line of commented text from the COBOL program.
	 *
	 * @return line of commented text from the COBOL program
	 */
	public String getCommentLine() {
		return commentLine;
	}
	

	/**
	 * Return the name of this COBOL program.
	 *
	 * @return the name of this COBOL program
	 */
	public String getProgram_ID() {
		return program_id;
	}

	/**
	 * Return the section name.
	 *
	 * @return the section name
	 */
	public String getSectionName() {
		return sectionName;
	}

	/**
	 * Return the division name.
	 *
	 * @return the division name
	 */
	public String getDivisionName() {
		return divisionName;
	}
	
	/**
	 * Return the dayDateWritten of this COBOL program.
	 *
	 * @return the dayDateWritten of this COBOL program
	 */
	public int getDayDateWritten() {
		return dayDateWritten;
	}

	
	/**
	 * Return the monthWritten of this COBOL program.
	 *
	 * @return the monthWritten of this COBOL program
	 */
	public String getMonthDateWritten() {
		return monthDateWritten;
	}
	
	/**
	 * Return the dayDateWritten of this COBOL program.
	 *
	 * @return the dayDateWritten of this COBOL program
	 */
	public int getYearDateWritten() {
		return yearDateWritten;
	}
	
	
	/**
	 * Return the line of text to display from the display command in the COBOL program.
	 *
	 * @return the line of text to display from the display command in the COBOL program.
	 */
	public String getDisplayText() {
		return displayText;
	}
	
	
	/**
	 * Set a line of commented text from the COBOL program.
	 *
	 * @return line of commented text from the COBOL program
	 */
	public void setCommentLine(String commentLine) {
		this.commentLine = commentLine;
	}
	
	/**
	 * Set a line of text to display from the display command in the COBOL program.
	 *
	 * @return line of text to display from the COBOL program
	 */
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	/**
	 * Set the name of this cobol file.
	 *
	 * @param   String   the name
	 */
	public void setProgram_ID(String program_idString) {
		this.program_id = program_idString;
	}

	/**
	 * Set the dayDateWritten of this COBOL program.
	 *
	 * @param the dayDateWritten of this COBOL program
	 */
	public void setDayDateWritten(int dayDateWritten) {
		this.dayDateWritten = dayDateWritten;
	}
	
	/**
	 * Return the monthWritten of this COBOL program.
	 *
	 * @return the monthWritten of this COBOL program
	 */
	public void setMonthDateWritten(String monthDateWritten) {
		this.monthDateWritten = monthDateWritten;
	}
	
	/**
	 * Set the yearDateWritten of this COBOL program.
	 *
	 * @param the yearDateWritten of this COBOL program
	 */
	public void setYearDateWritten(int yearDateWritten) {
		this.yearDateWritten = yearDateWritten;
	}
	

	/**
	 * Set the section name 
	 *
	 * @param  String sectionName
	 */
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	
	/**
	 * Set the division name 
	 *
	 * @param  String divisionName
	 */
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	
	
	/**
	 * Return the constant name.
	 *
	 * @return the constant name
	 */
	public String getConstantName() {
		return constantName;
	}
	
	
	/**
	 * Return the constant value.
	 *
	 * @return the constant value
	 */
	public Double getConstantValue() {
		return constantValue;
	}
	
	
	/**
	 * Return the decimal variable name.
	 *
	 * @return the decimal variable name
	 */
	public String getDecimalVariableName() {
		return decimalVariableName;
	}
	
	
	/**
	 * Return how many whole numbers the decimal variable is able to hold.
	 *
	 * @return how many whole numbers the decimal variable is able to hold
	 */
	public Double getDecimalVariableWholeNumbers() {
		return decimalVariableWholeNumbers;
	}
	
	
	/**
	 * Return the string variable name.
	 *
	 * @return the string variable name
	 */
	public String getStringVariableName() {
		return stringVariableName;
	}
	
	
	/**
	 * Return the string variable value.
	 *
	 * @return the string variable value
	 */
	public String getStringVariableValue() {
		return stringVariableValue;
	}
	
	
	/**
	 * Return how many bytes the string variable is able to hold.
	 *
	 * @return how many bytes the string variable is able to hold
	 */
	public Double getStringVariableSize() {
		return stringVariableSize;
	}
	
	
	/**
	 * Return the line number.
	 *
	 * @return the line number
	 */
	public int getLineNumber() {
		return lineNumber;
	}

	
	/**
	 * Set the constant name 
	 *
	 * @param  String constantName
	 */
	public void setConstantName(String constantName) {
		this.constantName = constantName;
	}
	
	
	/**
	 * Set the constant value
	 *
	 * @param  Double constantValue
	 */
	public void setConstantValue(Double constantValue) {
		this.constantValue = constantValue;
	}
	
	
	/**
	 * Set the decimal variable name 
	 *
	 * @param  String decimalVariableName
	 */
	public void setDecimalVariableName(String decimalVariableName) {
		this.decimalVariableName = decimalVariableName;
	}
	
	
	/**
	 * Set how many whole numbers the decimal variable should be able to hold
	 *
	 * @param  Double decimalVariableWholeNumbers
	 */
	public void setDecimalVariableWholeNumbers(Double decimalVariableWholeNumbers) {
		this.decimalVariableWholeNumbers = decimalVariableWholeNumbers;
	}
	
	
	/**
	 * Set the string variable name 
	 *
	 * @param  String stringVariableName
	 */
	public void setStringVariableName(String stringVariableName) {
		this.stringVariableName = stringVariableName;
	}
	
	
	/**
	 * Set the string variable value
	 *
	 * @param  String stringVariableValue
	 */
	public void setStringVariableValue(String stringVariableValue) {
		this.stringVariableValue = stringVariableValue;
	}
	
	
	/**
	 * Set how many bytes the string variable should be able to hold
	 *
	 * @param  Double stringVariableSize
	 */
	public void setStringVariableSize(Double decimalVariableSize) {
		this.stringVariableSize = decimalVariableSize;
	}
	
	
	/**
	 * Set the line number
	 *
	 * @param  int lineNumber
	 */
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	
	
	/**
	 * Return a textual description of this cobol type.
	 * 
	 * @return a textual description of this cobol type
	 */
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(program_id);
		buf.append(", ");
		buf.append(divisionName);
		buf.append(", ");
		buf.append(sectionName);
		
		return buf.toString();
	}
}
