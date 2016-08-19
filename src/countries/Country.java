package countries;

import board.Territory;

public class Country {

	private String name;
	private int gdp;
	private String [] technologies;
	private Territory [] territories;
	
	public Country() {
		this.name = null;
		this.gdp = 0;
		this.technologies = null;
	}
	
	public Country(String name) {
		this.name = name;
		if(name.equals("Russia")) {
			this.gdp = 24;
		} else if(name.equals("Germany")) {
			this.gdp = 34;
		} else if(name.equals("Great_Britain")) {
			this.gdp = 30;
		} else if(name.equals("Japan")) {
			this.gdp = 25;
		} else if(name.equals("United_States")) {
			this.gdp = 36;
		}
	}
	
}
