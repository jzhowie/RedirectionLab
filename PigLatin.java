//TODO: HAVE EDGE CASES CHECKED FOR ERRORS, TESTING, PIG LAINT III
//NOTES: COMMENT OUT / CLEAR MAIN METHOD WHEN DONE
//ISSUES: TBD

import java.util.*;
import java.io.*;

public class PigLatin {
public static void main(String[] args) {
	System.out.println("/// PIG LAINT SIMPLE /// (Test cases from Rocket Chat)");
	System.out.println(pigLatinSimple("mock"));
	System.out.println(pigLatinSimple("pie"));
	System.out.println(pigLatinSimple("david"));
	System.out.println(pigLatinSimple("aaron"));
	System.out.println();

	System.out.println("/// PIG LAINT NORMAL /// (Test cases from Rocket Chat)");
	System.out.println(pigLatin("the"));
	System.out.println(pigLatin("check"));
	System.out.println(pigLatin("skee"));
	System.out.println(pigLatin("emu"));
	System.out.println(pigLatin("grade"));
}

public static String pigLatinSimple(String s) {
	ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList(new Character[] {'a', 'e', 'i', 'o', 'u'}));
	String pig = "";
	if (vowels.contains(s.charAt(0))) {
		pig = s + "hay";
		return pig;
	}
	pig = s.substring(1,s.length()) + s.charAt(0) + "ay";
	return pig;
}

public static String pigLatin(String s) {
	ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList(new Character[] {'a', 'e', 'i', 'o', 'u'}));
	ArrayList<String> digraphs = new ArrayList<String>(Arrays.asList(new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"}));
	String pig = "";
	if (s.length() >= 2 && digraphs.contains(s.substring(0, 2))) {
		pig = s.substring(2, s.length()) + s.substring(0, 2) + "ay";
		return pig;
	}
	else if (vowels.contains(s.charAt(0))) {
		pig = s + "hay";
		return pig;
	}
	else {
		pig = s.substring(1,s.length()) + s.charAt(0) + "ay";
		return pig;
	}
}
}
