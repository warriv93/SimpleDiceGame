package p5;

import java.util.Random;

public class OrdinaryPlayer extends Player{
	private Dice dice;
	private Random rand = new Random();
	
	/**
	 * skapar ett nytt dice objekt och ger användaren en möjlighet till att namnge playerklassen OrdinaryPlayer
	 * @param name
	 */
	public OrdinaryPlayer(String name){
		super(name);
		this.dice = new SimpleDice();
	}
	/**
	 * denna konstruktorn har möjligheten till att välja vilket dice objekt du vill ha och även namnge playerklassen OrdinaryPlayer
	 * @param name 	namn på 
	 * @param dice
	 */
	public OrdinaryPlayer(String name, Dice dice){
		super(name);
		this.dice = dice;
	}
	
	public void setDice(Dice dice){
		this.dice = dice;
		
	}
	/**
	 * 
	 * @return dice objektet tärning 
	 * 
	 */
	public Dice getDice(){
		return dice;
	}

	public int getDiceSides()
	{
		return this.dice.getSides();
	}
	
	public int throwDice() {
		
		//int res = rand.nextInt(dice.getSides())+1;
		return this.dice.throwDice();
		
		//return res;
	}
	
}
