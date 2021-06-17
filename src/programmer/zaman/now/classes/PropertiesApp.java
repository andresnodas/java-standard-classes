package programmer.zaman.now.classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {

	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("application.properties"));
			
			System.out.println(properties.get("database.host"));
			System.out.println(properties.get("database.port"));
			
			properties.put("hobby", "Coding");
			properties.store(new FileOutputStream("application.properties"), "Komentar");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
