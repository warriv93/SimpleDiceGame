package p5;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

/**
 * Ett objekt av typen TextWindow kan visa text.
 * @author TSROAX
 *
 */
public class TextWindow {
	private static JFrame frame = new JFrame();
	private static JTextArea ta = new JTextArea();
	private static JScrollPane sp = new JScrollPane( ta );
	
	/*
	 * I stället för konstruktor. Exekveras då klassen läses in.
	 */
	static {
		frame.setTitle( "TextWindow" );
		frame.setBounds( 50, 50, 600, 400 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		ta.setFont( new Font("Monospaced", Font.PLAIN, 12) );
		ta.setEditable( false );
		((DefaultCaret)ta.getCaret()).setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		frame.getContentPane().add( sp );
		frame.setVisible( true );
	}
	
	/**
	 * Ändrar innehållet som syns i TextWindow till strängen txt.
	 * @param txt Texten som ska visas i TextWindow
	 */
	public static void setText( String txt )  {
		ta.setText( txt );
		JScrollBar bar = sp.getVerticalScrollBar();
		bar.setValue( bar.getMaximum()-bar.getVisibleAmount() );
	}

	/**
     * Ändrar innehållet som syns i TextWindow till den sträng som genereras av objektets toString-metod.
     * @param obj objektet vars toString-metod genererar texten som visas i TextWindow
	 */
	public static void setText( Object obj )  {
		setText( obj.toString() );
	}
	
	/**
	 * Lägger till txt sist i TextWindow
	 * @param txt texten som läggs till sist i TextWindow
	 */
	public static void append( String txt ) {
		ta.append( txt );
	}
	
	/**
	 * Lägger till strängen som genereras av obj.toString() sist i TextWindow
	 * @param obj objektet vars toString-metod genererar texten som läggs till sist i TextWindow
	 */
	public static void append( Object obj ) {
		append( obj.toString() );
	}
	
	/**
	 * Radbrytning i TextWindow 
	 */
	public static void println() {
		append( "\n" );
	}
	
	/**
	 * Lägger till txt sist i TextWindow. Nästa text som läggs till kommer på ny rad.
	 * @param txt texten som läggs till sist i TextWindow
	 */
	public static void println( String txt ) {
		append( txt + "\n" );
	}
	
	/**
	 * Lägger till strängen som obj.toString() genererar sist i TextWindow. Nästa text som läggs till kommer på ny rad.
	 * @param obj objektet vars toString-metod genererar texten som läggs till sist i TextWindow
	 */
	public static void println( Object obj ) {
		println( obj.toString() );
	}
}
