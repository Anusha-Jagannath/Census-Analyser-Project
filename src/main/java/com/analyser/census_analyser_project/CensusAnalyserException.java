package com.analyser.census_analyser_project;

/**
 * Custom exception handling
 * 
 * @author Anusha Jagannath
 *
 */
public class CensusAnalyserException extends Exception {

	enum ExceptionType {
		ENTERED_INVALID_FILE, IO_EXCEPTION
	};

	ExceptionType type;

	public CensusAnalyserException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
