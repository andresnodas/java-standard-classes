package programmer.zaman.now.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {

	public static void main(String[] args) {
		
		String name = "Andres Nodas";
		StringTokenizer tokenizer = new StringTokenizer(name, " ");
		
		while(tokenizer.hasMoreElements()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
		/* Hasil outputnya
		 *Andres
		 *Nodas
		 * */
	}
	
}
