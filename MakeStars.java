import java.util.*;
import java.io.*;

public class MakeStars {
public static void main(String[] args) throws FileNotFoundException {
	Scanner n = new Scanner (System.in);
	while (n.hasNextLine()) {
		String line = n.nextLine();
		Scanner linescan = new Scanner (line);
		while (linescan.hasNext()) {
			String next = linescan.next();
			String stars = "";
			for (int i = 0; i < next.length(); i++) {
				stars += '*';
			}
			stars += ' ';
			System.out.print(stars);
		}
		System.out.println();
	}
}
}
