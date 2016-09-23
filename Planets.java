/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * This program creates an enum of planets and orders them from the sun. 
 *  Unit 1-10
 *    
 *
 ****************************************************************************/


class Main {
	
	public enum Planets{
		Mercury (1), 
		Venus (2), 
		Earth (3), 
		Mars (4), 
		Jupiter (5), 
		Saturn (6), 
		Uranus (7), 
		Neptune (8)
		;
		
		private final int planetNumber; 
	
		public int Value(){
			return this.planetNumber;
		}
		
		private Planets(int planetNumber){
			this.planetNumber = planetNumber;
		}

	}
	
    public static void main(String[] args) {
    	int numberOfPlanets = 8;
    	
		for(int counter = 0; counter <= numberOfPlanets - 1; counter ++ ){
			Planets tempPlanet = Planets.values()[counter];
			System.out.println( tempPlanet + " " + tempPlanet.Value());
		}   
		
		System.out.println("Done.");
    }
}
