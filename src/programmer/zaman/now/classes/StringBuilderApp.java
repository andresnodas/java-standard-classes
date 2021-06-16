package programmer.zaman.now.classes;

public class StringBuilderApp {

	public static void main(String[] args) {
		
		String name = "Eko";
		name = name + " " + "Kurniawan";
		name = name + " " + "Khannedy";
		
		StringBuilder builder = new StringBuilder();
		builder.append("Andres");
		builder.append(" ");
		builder.append("Nodas");
		
		String fullName = builder.toString();
		
	}
	
}
