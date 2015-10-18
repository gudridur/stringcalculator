package is.ru.stringcalculator;

public class Calculator {

	public static String delimeters = "[,\n]";
	public static String lines = "//";

	public static int add(String text){

		if (text.startsWith(lines)){
			String newDelimeter = Character.toString(text.charAt(2));
			text = text.substring(3);
			//String newDelimeter = String.valueOf(temp);
			text.replaceAll(newDelimeter,",");
			text.replaceAll(newDelimeter,"\n");
			return sum(splitNumbers(text, newDelimeter));

		}

		if(text.equals("")){
			return 0;
		}
		else
			return sum(splitNumbers(text, delimeters));
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers, String delim){

	    return numbers.split(delim);
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }



}