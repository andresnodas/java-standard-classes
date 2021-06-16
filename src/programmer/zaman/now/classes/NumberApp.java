package programmer.zaman.now.classes;

public class NumberApp {

	public static void main(String[] args) {
		
		Integer intValue = 10;
		
		Long longValue = intValue.longValue();
		Byte byteValue = intValue.byteValue();
		Short shortValue = intValue.shortValue();
		Double doubleValue = intValue.doubleValue();
		Float floatValue = intValue.floatValue();
		
		long parseLong = Long.parseLong("10");
		Double valueDouble = Double.valueOf("10");
		
		Integer valueInt = Integer.valueOf("as10"); //throw NumberFormatException
		
		
	}
	
}
