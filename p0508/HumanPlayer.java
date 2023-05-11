package p0508;

import java.util.Scanner;

public class HumanPlayer extends Player{
	private static Scanner stdIn;
	static {
		stdIn = new Scanner(System.in);
		
	}
	
	//--- 손 결정(키보드를 통해 입력) ---//
	public int nextHand() {
		do {
			System.out.print("가위바위보!!!0...가위/1...바위/2...보:");
			hand = stdIn.nextInt(); 
		} while (hand < 0 || hand > 2);
		return hand;
	}

}
