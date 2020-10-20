package com.formation.java;

/**
 * @author Admin
 */
public class Kariakoo {

	public static void main(String[] args) {
		System.out.println(Kariakoo.getPositionAt(0));
		System.out.println(Kariakoo.getPositionAt(1));
		System.out.println(Kariakoo.getPositionAt(2));
		System.out.println(Kariakoo.getPositionAt(3));
		System.out.println(Kariakoo.getPositionAt(100000));
		System.out.println(Kariakoo.getPositionAt(2147483647));
	}
	static final int NUMBER_OF_POSSIBLE_POSITIONS = 6;
	final static int[] POSSIBLE_POSITIONS = { 0, 1, -1, -4, -5, -3 };
	/**
	 * Computes the position of the Kariakoo​​​​​​​‌​‌‌​​​​​​‌​​‌‌​‌​​‌‌‌​‌
	 * dancer.
	 */
	static int getPositionAt(int n) {
		return POSSIBLE_POSITIONS[n % NUMBER_OF_POSSIBLE_POSITIONS];
	}

}

