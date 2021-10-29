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
				if(!str.equals("kraj"))
					System.out.println("Unos nije dobar");
				continue;
			}
			
			int x = Integer.parseInt(str_parts[0]);
			int y = Integer.parseInt(str_parts[2]);
			
			if(str_parts[1].equals("-")) {
				subtraction(x, y);
			}
					
		} while(!str.equals("kraj"));
		
	}
	
	public static void subtraction(int x, int y) {
		System.out.println(x - y);
	}

}
