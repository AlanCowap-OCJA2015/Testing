package nu.xdi.testing.scanner;

import java.util.Scanner;

/**
 * Small app to experiment with the Scanner class
 * @author Kevin Phair
 * @date 21 Jul 2015
 */
public class ScannerTestApp {

	public static void main(String[] args) {

		String userText;
		int testNum;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		testNum = scan.nextInt();
		System.out.println("The number that was entered was " + testNum);

		// If we want to get a full line after this, we need to discard the
		// end of line from the integer that was just entered
		scan.nextLine();
		
		// Buffer is now clear and will wait for the line to be entered
		System.out.println("Now enter some text: ");
		userText = scan.nextLine();
		
		System.out.println("I wasn't expecting that! ");
		System.out.println("'" + userText + "'");
		System.out.println("Really?");
		
		scan.close();
	}

}
