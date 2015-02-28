package p5;

import java.util.Random;

public class SimpleDice implements Dice {
	private int sides = 1;
	private Random rand = new Random();
	Dice dice;
	
	/**
	 * om inget värde angets till Konstruktorn, sides = 5 
	 */
	public SimpleDice(){
		this.sides = 5;
	}
	
	/**
	 * ger möjligheten att ange själv hutr många sidor tärningen ska ha.
	 * om mindre än 0 angets, skriv ut the dice needs atleast 1 side + sides
	 * annars skriv ut sides 
	 * @param sides sidor på tärnignen
	 */
	public SimpleDice(int sides){
		
		if( sides <= 0){
			
			throw new NegativeSidesException("The dice needs atleast 1 side: " + sides);
		
		}else
		this.sides = sides; 
		
	}
	/**
	 * retunerar ett random värde mellan 1 0ch sides variabeln.
	 */
	public int throwDice() {
		int res = rand.nextInt(sides)+1;
		
		
		return res;
	}
	/**
	 * retunerar hur många sidor tärningen har.
	 */
	public int getSides() {
		// TODO Auto-generated method stub
		return sides;
	}
}
