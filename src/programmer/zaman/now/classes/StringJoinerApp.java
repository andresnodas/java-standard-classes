package programmer.zaman.now.classes;

import java.util.StringJoiner;

public class StringJoinerApp {

	public static void main(String[] args) {
		
		String[] names = {"Andres", "Nodas"};
		
		StringJoiner joiner = new StringJoiner("||", "[", "]");
		
		for(String value : names)
			joiner.add(value);
		
		System.out.println(joiner.toString()); // [Andres||Nodas]
		
	}
	
}
