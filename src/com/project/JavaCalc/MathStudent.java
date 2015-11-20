/*
 * Math Student Class
 * @author Brandon Tarney 11/12/15
 * @version 1.0
 */

package com.project.JavaCalc;

import javax.swing.JOptionPane;

class MathStudent extends Student 
{
	private final double MATH_MIDTERM_PERCENTAGE = .50;
	private final double MATH_FINALEXAM_PERCENTAGE = 0.50;
	
	/*
	 * Constructor for Math Student
	 * <p> Prints status</p>
	 * @param
	 * @return
	 */
	public MathStudent()
	{
		System.out.println("MathStudent's Constructor");
	}
	
	/*
	 * Calculate the final grade with inputs
	 * 
	 * @param	midterm			integer value of midterm test
	 * @param	finalExamGrade	integer value of the final exam
	 * @return
	 */
	public void calculate(int midterm, int finalExamGrade)
	{
		finalNumericGrade = (midterm*MATH_MIDTERM_PERCENTAGE)+(finalExamGrade * MATH_FINALEXAM_PERCENTAGE);
		if (finalNumericGrade >= 90)
			finalLetterGrade = "A";
		else if ((finalNumericGrade >= 83) & (finalNumericGrade < 90))
			finalLetterGrade = "B";
		else if ((finalNumericGrade >= 76) & (finalNumericGrade < 83))
			finalLetterGrade = "C";
		else if ((finalNumericGrade >= 65) & (finalNumericGrade < 76))
			finalLetterGrade = "D";
		else
			finalLetterGrade = "F";
		
	}
	
	/*
	 * Calculate the final grade with inputs
	 * 
	 * @param
	 * @return
	 */
	public void calculate()
	{
		midterm = Integer.parseInt(JOptionPane.showInputDialog("Enter the Midterm Grade"));
		finalExamGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter the Final Examination Grade"));
		finalNumericGrade = (midterm*MATH_MIDTERM_PERCENTAGE)+(finalExamGrade * MATH_FINALEXAM_PERCENTAGE);
		if (finalNumericGrade >= 90)
			finalLetterGrade = "A";
		else if ((finalNumericGrade >= 83) & (finalNumericGrade < 90))
			finalLetterGrade = "B";
		else if ((finalNumericGrade >= 76) & (finalNumericGrade < 83))
			finalLetterGrade = "C";
		else if ((finalNumericGrade >= 65) & (finalNumericGrade < 76))
			finalLetterGrade = "D";
		else
			finalLetterGrade = "F";
	}
}