package com.analyser.census_analyser_project;

public class CSVStateCensus {

	private String state;
	private int population;
	private int areaDensity;
	private int maleRatio;
	private int femaleRatio;

	public CSVStateCensus(String state, int population, int areaDensity, int maleRatio, int femaleRatio) {
		super();
		this.state = state;
		this.population = population;
		this.areaDensity = areaDensity;
		this.maleRatio = maleRatio;
		this.femaleRatio = femaleRatio;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getAreaDensity() {
		return areaDensity;
	}

	public void setAreaDensity(int areaDensity) {
		this.areaDensity = areaDensity;
	}

	public int getMaleRatio() {
		return maleRatio;
	}

	public void setMaleRatio(int maleRatio) {
		this.maleRatio = maleRatio;
	}

	public int getFemaleRatio() {
		return femaleRatio;
	}

	public void setFemaleRatio(int femaleRatio) {
		this.femaleRatio = femaleRatio;
	}

	@Override
	public String toString() {
		return "CSVStateCensus [state=" + state + ", population=" + population + ", areaDensity=" + areaDensity
				+ ", maleRatio=" + maleRatio + ", femaleRatio=" + femaleRatio + "]";
	}

}
