package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegEx {

	public static void main(String[] args) {
		
		String text = "TestLeaf(9876) Has Number of Employees 20";
		String pattern = "\\d{4}";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		while (m.find()) {
			String num = m.group();
			System.out.println(text.replaceAll(num, ""));
		}
		

	}

	
	
	
	
	
	
	
	
}
