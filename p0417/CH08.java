package p0417;

import java.util.Scanner;

import javax.swing.JPopupMenu.Separator;

public class CH08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?:");
		int n = scan.nextInt ();
		if (n > 5) {
			for (int i=0; i < n; i++) {
				System.out.print
				('*');
				if (i % 5 == 4)
					System.out.println();
				
			}
			if (n % 5 !=0 )
				System.out.println();
			}
		}
		
	}

