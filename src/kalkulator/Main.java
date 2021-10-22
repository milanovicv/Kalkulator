package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str;
		
		do {
			str = scanner.nextLine();
			String[] str_parts = str.split(" ");
			
			if (str_parts.length != 3) {
				System.out.println("Unos nije dobar");
				continue;
			}
		} while(!str.equals("kraj"));
		
	}

}
