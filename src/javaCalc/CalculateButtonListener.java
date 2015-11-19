//CalculateButtonListener, Exercise 13-5, Page 570
package javaCalc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculateButtonListener implements ActionListener
{
	DrawGUI x;

	CalculateButtonListener(DrawGUI a)
	{
		System.out.println("CalculateButtonListener Constructor...");
		x = a;
	}

	public void actionPerformed(ActionEvent e)
	{
		if (x.lblStudentType.getText() == "ENGLISH STUDENT")
			{
			EnglishStudent eStudent = new EnglishStudent();
			eStudent.calculate(Integer.parseInt(x.txtMidterm.getText()),
									 Integer.parseInt(x.txtFinalExam.getText()),
									 Integer.parseInt(x.txtResearch.getText()),
									 Integer.parseInt(x.txtPresentation.getText()));
			x.lblFinalGrade.setText("Numeric Grade: " +
			                   eStudent.getFinalNumericGrade() +
			                   "  Letter Grade: " +
			                   eStudent.getFinalLetterGrade());
			}

			if (x.lblStudentType.getText() == "MATH STUDENT")
			{
			MathStudent mStudent = new MathStudent();
			mStudent.calculate(Integer.parseInt(x.txtMidterm.getText()),
									 Integer.parseInt(x.txtFinalExam.getText()));
			x.lblFinalGrade.setText("Numeric Grade: " +
			                   mStudent.getFinalNumericGrade() +
			                   "  Letter Grade: " +
			                   mStudent.getFinalLetterGrade());
				}

			if (x.lblStudentType.getText() == "SCIENCE STUDENT")
				{
			ScienceStudent sStudent = new ScienceStudent();
			sStudent.calculate(Integer.parseInt(x.txtMidterm.getText()),
									 Integer.parseInt(x.txtFinalExam.getText()),
									 Integer.parseInt(x.txtResearch.getText()));
			x.lblFinalGrade.setText("Numeric Grade: " +
			                   sStudent.getFinalNumericGrade() +
			                   "  Letter Grade: " +
			                   sStudent.getFinalLetterGrade());
				}
		}
}
