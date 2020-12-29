import java.util.*;
import java.io.*;

public class PigLatin {
public static void main(String[] args) {
	System.out.println(pigLatinSimple("mock"));
	System.out.println(pigLatinSimple("pie"));
	System.out.println(pigLatinSimple("david"));
	System.out.println(pigLatinSimple("aaron"));
}

public static String pigLatinSimple(String s){
	ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList(new Character[] {'a', 'e', 'i', 'o', 'u'}));
	String pig = "";
	if (vowels.contains(s.charAt(0))) {
		pig = s + "hay";
		return pig;
	}
	pig = s.substring(1,s.length()) + s.charAt(0) + "ay";
	return pig;
}
}
