
package com.project.JavaCalc;

import java.util.*;

import org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.*;
import org.mockito.Mockito.*;


//TODO add Mockito via Maven/Gradle build system?



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
	

	/*
	 * Tests midterm values 0-100 at intervals of 10
	 */
	@Test
	public void normalTestMidterm() {
		int[] midterm = {0,10,20,30,40,50,60,70,80,90,100};
		int finalExam = 100;
		int researchPaper = 100;
		ArrayList<Double> finalGrade = new ArrayList();
		ArrayList<Double> mockFinalGrade = new ArrayList();
		for (int mid : midterm){
			sciStudent.calculate(mid, finalExam, researchPaper);
			finalGrade.add( (Double) sciStudent.getFinalNumericGrade());
			mockFinalGrade.add( (Double) mockCalcScienceFinal(mid, finalExam, researchPaper));
		}
//		Assert.fail();
		assertThat(mockFinalGrade, is(not(empty())));
	}
	
	@After
	public void cleanup () {
		sciStudent = null;
	}

	
	
}
