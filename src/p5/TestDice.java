package p5;

import java.util.Random;

public class TestDice {

	
	/**
	 * konstruktor med möjligheten att lägga in en dice klass o en nbrofthrows skapas.
	 * en array med antalet sidor på tärningen skapas 
	 * en loop som kastar tärningen beroende på hur mycket du skirver i nbrofthrows
	 * ny loop som skriver ut värdena från throwDice
	 * 
	 * @param dice
	 * @param nbrOfThrows
	 */
	public static void test( Dice dice, int nbrOfThrows ){
		int[] res = new int[ dice.getSides() ];


		for(int i = 0; i< nbrOfThrows;i++){
			//			int res = rand.nextInt(dice.getSides())+1;


			res[dice.throwDice()-1]++;


		}
//		for(int j = 0 ; j< res.length;j++){
//			TextWindow.println(res[j]);
//
//		}
		TestSimpleDice.printResult(res);
	}

	/**
	 * en konstruktor där du kan lägga in en player klass och ange antalet kast som ska genomföras.
	 * 
	 * Bascially, you check if an object is an instance of a specific class. 
	 * You normally use it, when you have a reference or parameter to an object that is of a 
	 * super class or interface type and need to know whether the actual object has some other 
	 * type (normally more concrete).
	 * 
	 * så om Cheater har extend player (alltså är en instance av player) så ska Cheater döpas om till p1
	 * sen ksa en array med DiceSides skapas
	 * och en forloop som tar hänsyn till hur många kast du skriver in i nbrogrhrows lägger då 
	 * till de random värden som kommer fprn throwDice,
	 * 
	 * ytterliggare en ifsats frågar om OrdinaryPlayer har något med player klassen att göra. 
	 * har den det så repeteras samma sak som innan fast för OrdinaryPlayer klassen.
	 * 
	 * @param player
	 * @param nbrOfThrows
	 */
	public static void test(Player player, int nbrOfThrows){
//		Dice dice;
		
		
//		dice = null;

			if (player instanceof Cheater) {
				Cheater p1 = (Cheater) player;
				
			p1.getDice().getSides();
			int[] res2 = new int[ p1.getDiceSides() ];

			for(int i = 0; i< nbrOfThrows;i++){

				res2[p1.throwDice()-1]++;

			}

			for(int j = 0 ; j< res2.length;j++){
				TextWindow.println(res2[j]);

			}

		}
		else if (player instanceof OrdinaryPlayer) {
			OrdinaryPlayer p2 = (OrdinaryPlayer) player;

			int[] res2 = new int[ p2.getDiceSides() ];

			for(int i = 0; i< nbrOfThrows;i++){

				res2[p2.throwDice()-1]++;

			}

			for(int j = 0 ; j< res2.length;j++){
				TextWindow.println(res2[j]);

			}

		}

	}



	public static void main (String []args){
		TestDice.test( new SimpleDice( 6 ), 1000000 );
		TextWindow.println();
		TestDice.test( new SimpleDice( 4 ), 1000000 );


		TestDice.test( new OrdinaryPlayer( "Rut", new SimpleDice( 6 ) ), 1000000 );
		TextWindow.println(); 
		TestDice.test( new Cheater( "Fuffe", new SimpleDice( 6 ) ), 1000000 );
	}
}
