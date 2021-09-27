package com.analyser.census_analyser_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Ability for the analyser to load the Indian States Census Information from a
 * csv file
 * 
 * @author Anusha Jagannath
 *
 */
public class StateCensusAnalyser {
	/**
	 * reading csv file
	 * 
	 * @param path
	 * @throws IOException
	 * @throws CensusAnalyserException
	 */
	public void loadCSV(String path) throws IOException, CensusAnalyserException {
		try {
			Files.lines(new File(path).toPath()).forEach(System.out::println);
		} catch (FileNotFoundException e) {
			throw new CensusAnalyserException(CensusAnalyserException.ExceptionType.ENTERED_INVALID_FILE,
					"please check file path");
		} catch (IOException e) {
			throw new CensusAnalyserException(CensusAnalyserException.ExceptionType.IO_EXCEPTION,
					"please check file path");
		}
	}

	/**
	 * method to count no of lines in csv file
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public long countLines(String path) throws IOException {
		long entries = 0;
		entries = Files.lines(new File(path).toPath()).count();
		return entries;
	}

}
