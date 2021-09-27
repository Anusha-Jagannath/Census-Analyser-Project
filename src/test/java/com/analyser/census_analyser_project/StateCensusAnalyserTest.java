package com.analyser.census_analyser_project;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import junit.framework.Assert;

/**
 * test cases for file found and not found Both happy and sad test cases are
 * tested. Both happy and sad test cases are tested
 * 
 * @author Anusha Jagannath
 *
 */
public class StateCensusAnalyserTest {

	String correctPath = "/Users/anushajs/eclipse-workspace/Yml-training/census-analyser-project/data/census.csv";
	String incorrectPath = "/Users/anushajs/eclipse-workspace/Yl-training/census-analyser-project/data/census.csv";
	String noDelimiter = "/Users/anushajs/eclipse-workspace/Yl-trainingcensus-analyser-project/data/census.csv";

	/**
	 * method to test reading CSV file given correct file path name
	 * 
	 * @throws IOException
	 * @throws CensusAnalyserException
	 */
	@Test
	public void givenCorrectFilePath_ShouldReadTheCSVFile_ReturnCountOfLines()
			throws IOException, CensusAnalyserException {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		stateCensusAnalyser.loadCSV(correctPath);
		long result = stateCensusAnalyser.countLines(correctPath);
		Assert.assertEquals(10, result);
	}

	/**
	 * method to test reading csv file given incorrect file path name
	 */
	@Test
	public void givenIncorrectFilePath_ShouldThrow_CustomException() {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		try {
			stateCensusAnalyser.loadCSV(correctPath);
		} catch (IOException e) {
			Assert.assertEquals("please check file path", e.getMessage());
		} catch (CensusAnalyserException e) {
			Assert.assertEquals("please check file path", e.getMessage());
		}
	}

	/**
	 * method to test reading csv file given incorrect file path name with no
	 * delimiter
	 */
	@Test
	public void givenIncorrectFilePathNoDelimiter_ShouldThrow_CustomException() {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		try {
			stateCensusAnalyser.loadCSV(noDelimiter);
		} catch (IOException e) {
			Assert.assertEquals("please check file path", e.getMessage());
		} catch (CensusAnalyserException e) {
			Assert.assertEquals("please check file path", e.getMessage());
		}
	}
}
