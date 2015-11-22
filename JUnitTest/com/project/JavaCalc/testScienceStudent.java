
package com.project.JavaCalc;

import static org.junit.Assert.*;

import org.junit.Test;





public class testScienceStudent {

	private double calcScienceFinal(int midtermExam, int finalExam, int researchPaper){
		double midtermWeight = 0.4;
		double finalExamWeight = 0.4;
		double researchWeight = 0.2;
		return (midtermExam * midtermWeight + finalExam * finalExamWeight
				 + researchPaper * researchWeight);
	}
	
	
	@Test
	public void testMidterm() {
		ScienceStudent sciStudent = new ScienceStudent();
		int[] midterm = {0,10,20,30,40,50,60,70,80,90,100};
		int finalExam = 100;
		int researchPaper = 100;
		System.out.println("test");
		for (int i = 0; i < midterm.length; i++){
			sciStudent.calculate(midterm[i], finalExam, researchPaper);
			System.out.println(sciStudent.getFinalNumericGrade());
			double finalGrade = calcScienceFinal(midterm[i], finalExam, researchPaper);
			assertEquals(finalGrade, sciStudent.getFinalNumericGrade(), 0.1);
			System.out.println(finalGrade);

			
			
			
		}
		
		
		
	}

}
