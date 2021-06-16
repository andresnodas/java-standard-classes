package programmer.zaman.now.classes;

public class StringApp {

	public static void main(String[] args) {
		
		String name = "Andres Nodas";
		String nameLowerCase = name.toLowerCase();
		String nameUpperCase = name.toUpperCase();
		
		System.out.println(name);
		System.out.println(nameLowerCase);
		System.out.println(nameUpperCase);
		System.out.println(name.length());
		System.out.println(name.startsWith("Andres"));
		System.out.println(name.endsWith("Nodas"));
		
		String[] names = name.split(" ");
		for(String value : names)
			System.out.println(value);
		
	}
	
}
