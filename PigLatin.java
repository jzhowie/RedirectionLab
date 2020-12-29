//TODO: HAVE EDGE CASES CHECKED FOR ERRORS, TESTING, PIG LAINT III
//NOTES: COMMENT OUT / CLEAR MAIN METHOD WHEN DONE
//ISSUES: TBD

import java.util.*;
import java.io.*;

public class PigLatin {
public static void main(String[] args) {
	System.out.println("/// PIG LAINT SIMPLE /// (Test cases from Rocket Chat)");
	System.out.println(pigLatinSimple("moCk"));
	System.out.println(pigLatinSimple("pIe"));
	System.out.println(pigLatinSimple("dAvid"));
	System.out.println(pigLatinSimple("Aaron"));
	System.out.println();

	System.out.println("/// PIG LAINT NORMAL /// (Test cases from Rocket Chat)");
	System.out.println(pigLatin("The"));
	System.out.println(pigLatin("checK"));
	System.out.println(pigLatin("Skee"));
	System.out.println(pigLatin("eMu"));
	System.out.println(pigLatin("gRade"));
}

public static String pigLatinSimple(String s) {
	String temp = s.toLowerCase();
	ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList(new Character[] {'a', 'e', 'i', 'o', 'u'}));
	String pig = "";

	if (vowels.contains(temp.charAt(0))) {
		pig = temp + "hay";
		return pig;
	}
	pig = temp.substring(1,temp.length()) + temp.charAt(0) + "ay";
	return pig;
}

public static String pigLatin(String s) {
	String temp = s.toLowerCase();
	ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList(new Character[] {'a', 'e', 'i', 'o', 'u'}));
	ArrayList<String> digraphs = new ArrayList<String>(Arrays.asList(new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"}));
	String pig = "";

	if (temp.length() >= 2 && digraphs.contains(temp.substring(0, 2))) {
		pig = temp.substring(2, temp.length()) + temp.substring(0, 2) + "ay";
		return pig;
	}
	else if (vowels.contains(temp.charAt(0))) {
		pig = temp + "hay";
		return pig;
	}
	else {
		pig = temp.substring(1,temp.length()) + temp.charAt(0) + "ay";
		return pig;
	}
}
}
