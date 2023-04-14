package P0413;

import java.util.Scanner;

public class CH10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("점수:");
		int point= stdIn.nextInt();
		
		if (point >= 0 && point <= 49) {
				System.out.print("가");}
			else if (point >= 49 && point <= 59){
				System.out.print("양");}
			else if (point >= 49 && point <= 69){
				System.out.print("미");}
			else if (point >= 49 && point <= 79){
				System.out.print("우");}
			else if (point >= 49 && point <= 100){
				System.out.print("수");}
			else
				System.out.println("잘못된 점수입니다.");
		
		
		}
	}

