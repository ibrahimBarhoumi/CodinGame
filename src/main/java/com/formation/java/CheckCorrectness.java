package com.formation.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Admin
 */
public class CheckCorrectness {


	public static void main(String[] args) {
		System.out.println(CheckCorrectness.check("[()]"));
		System.out.println(CheckCorrectness.check("(()[])"));
		System.out.println(CheckCorrectness.check("([)]"));
		System.out.println(CheckCorrectness.check("(("));
		System.out.println(CheckCorrectness.check("[(()]"));
	}

	private static boolean check(String s) {
		Map<Character, Character> mappings = new HashMap<Character, Character>();
		mappings.put(')', '(');
		mappings.put(']', '[');
		// Initialize a stack to be used in the algorithm.
		Stack<Character> stack = new Stack<Character>();

		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// If the current character is a closing bracket.
			if (mappings.containsKey(c)) {

				// Get the top element of the stack. If the stack is empty, set a dummy value of '#'
				char topElement = stack.empty() ? '#' : stack.pop();

				// If the mapping for this bracket doesn't match the stack's top element, return false.
				if (topElement != mappings.get(c)) {
					return false;
				}
			} else {
				// If it was an opening bracket, push to the stack.
				stack.push(c);
			}
		}

		// If the stack still contains elements, then it is an invalid expression.
		return stack.isEmpty();
	}

}
