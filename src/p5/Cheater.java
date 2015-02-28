package p5;
import java.util.Random;

public class Cheater extends Player {
	private Dice dice;
	private Random rand = new Random();


	/**
	 * kontruktorn Cheater skapas, den innehåller Players (name) 
	 * o klassen dice importeras. 
	 * @param name
	 */
	public Cheater(String name){
		super(name);
		this.dice = new SimpleDice();
	}
	
	 /**
	  * 
	  * kontruktorn Cheater skapas, den innehåller Players (name) 
	  * o klassen dice har man möjlighet att ändra i (tex hur många sidor den ska ha.) 
	  * @param name
	  * @param dice
	  */
	public Cheater(String name, Dice dice){
		super(name);
		this.dice = dice;
	}

	public void setDice(Dice dice){
		this.dice = dice;

	}
	public Dice getDice(){
		return dice;
	}

	/**
	 * return the value in the method getSides() inside of the class Dice.
	 * @return
	 */
	public int getDiceSides()
	{
		return this.dice.getSides();
	}
	
	/*
	 * skapar res som randomizar ett värde i Sides metoden, 
	 * en boolean som hämtar nästa random värde i ordningen,
	 * så sålänge som res inte = sides just nu & värdet i cheat så ökar res med 1.
	 * sen return slutvärdet på res
	 * (non-Javadoc)
	 * @see p5.Player#throwDice()
	 */
	public int throwDice() {

		//int res = rand.nextInt(dice.getSides())+1;
		int res = this.dice.throwDice();
//		int rescheat  = rand.nextInt(dice.getSides())+1;
//		rescheat = rescheat/2;
		
		boolean cheat = rand.nextBoolean();
		if(res != dice.getSides() && cheat){
//		if(rescheat!=res){
		res ++;
	}
		return res;
	}

	public static void main (String [] args){
		Player spelare1 = new OrdinaryPlayer( "Viktor",new SimpleDice( 6 ) );
		Player spelare2 = new Cheater( "Signe", new SimpleDice( 6 ) ); 
		Game spel = new Game( spelare1, spelare2 );
		TextWindow.println( "\nResultatet av tio spel" );
		for( int i=0; i<10; i++ )
			spel.play( false );
	}
}
