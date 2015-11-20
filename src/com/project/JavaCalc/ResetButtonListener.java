//ResetButtonListener, Exercise 13-6, Page 574

package com.project.JavaCalc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ResetButtonListener implements ActionListener
{
	DrawGUI x;

	ResetButtonListener(DrawGUI a)
	{
		System.out.println("ResetButtonListener Constructor...");
		x = a;
	}

	public void actionPerformed(ActionEvent e)
	{
		x.radEnglish.doClick();
		x.txtMidterm.setVisible(true);
		x.txtFinalExam.setVisible(true);
		x.txtResearch.setVisible(true);
		x.txtPresentation.setVisible(true);
		x.txtMidterm.setText("");
		x.txtFinalExam.setText("");
		x.txtResearch.setText("");
		x.txtPresentation.setText("");
		x.lblFinalGrade.setText("");
		x.lblStudentType.setText("ENGLISH STUDENT");
	}
}
