package de.rheinahrcampus.gse.schichtplan.core;


public enum Arbeitspensum {
	
	HUNDERT(1.00),
	FUENFUNDSIEBZIG(0.75),
	FUENFZIG(0.50);
	
	private double prozentDezimal;
	
	private Arbeitspensum(double prozentDezimal) {
		this.prozentDezimal = prozentDezimal;
	}
	
	public double getProzentDezimal() {
		return prozentDezimal;
	}

}
