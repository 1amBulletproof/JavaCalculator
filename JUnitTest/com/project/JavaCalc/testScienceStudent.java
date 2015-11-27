
package com.project.JavaCalc;

import org.junit.*;
import org.hamcrest.*;






public class testScienceStudent {

	ScienceStudent sciStudent;
	
	private double mockCalcScienceFinal(int midtermExam, int finalExam, int researchPaper){
		double midtermWeight = 0.4;
		double finalExamWeight = 0.4;
		double researchWeight = 0.2;
		return (midtermExam * midtermWeight + finalExam * finalExamWeight
				 + researchPaper * researchWeight);
	}
	
	@Before
	public void initialize() {
		sciStudent = new ScienceStudent();
	}
	
	@Test
	public void normalTestMidterm() {
		int[] midterm = {0,10,20,30,40,50,60,70,80,90,100};
		int finalExam = 100;
		int researchPaper = 100;
		System.out.println("test");
		for (int i = 0; i < midterm.length; i++){
			sciStudent.calculate(midterm[i], finalExam, researchPaper);
			System.out.println(sciStudent.getFinalNumericGrade());
			double finalGrade = mockCalcScienceFinal(midterm[i], finalExam, researchPaper);
			Assert.assertEquals(finalGrade, sciStudent.getFinalNumericGrade(), 0.1);
			System.out.println(finalGrade);	
		}	
	}
	
	@After
	public void cleanup () {
		sciStudent = null;
	}

	
	
}
