package com.formation.java;

/**
 * @author Admin
 */
public class ScanChar {

	public static void main(String[] args) {
		String art = AsciiArt.printChar('V');
		char c = scanChar("V");
		System.out.println(c);
	}

	public static char scanChar(String s) {
		// Iterate over each character from A to Z.
		for(char c = 'A'; c <= 'Z'; c++) {
			// Check to see if the character corresponds with the ASCII art.
			if (AsciiArt.printChar(c) == s) {
				// Return the character if it does.
				return c;
			}
		}

		// Optionally use a null character to indicate that the string passed
		// doesn't correspond to any valid ASCII art.
		return "?".charAt(0);

	}

}

class AsciiArt {
	public static String printChar(char s) {
		return "S";
	}
}
