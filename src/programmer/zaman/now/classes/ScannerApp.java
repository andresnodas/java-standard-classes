package programmer.zaman.now.classes;

import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nama : ");
		String nama = scanner.nextLine();
		
		System.out.println("Hello " + nama);
		
	}
	
}
