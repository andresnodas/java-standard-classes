package programmer.zaman.now.classes;

import java.util.Base64;

public class Base64App {

	public static void main(String[] args) {
		
		String query = "belajar()   pemrograman()   java";
		
		String encodeString = Base64.getEncoder().encodeToString(query.getBytes());
		System.out.println(encodeString);
		
		String decode = new String(Base64.getDecoder().decode(encodeString));
		System.out.println(decode);
		
		/*
		 * YmVsYWphcigpICAgcGVtcm9ncmFtYW4oKSAgIGphdmE=
		 * belajar()   pemrograman()   java
		 * */
		
	}
	
}
