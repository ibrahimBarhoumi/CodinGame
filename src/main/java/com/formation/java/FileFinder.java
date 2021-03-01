package com.formation.java;

import java.io.File;
import java.util.Arrays;

/**
 * @author Admin
 */
public class FileFinder {

	private static String locateUniverseFormula() {
		String name = "universe-formula";
		File file = new File("/tmp/documents");
		String path = findFile(file, name);
		System.out.println(path);
		return path;
	}

	private static String findFile(File file, String name) {
		File[] list = file.listFiles();
		if (list != null) {
			Arrays.stream(list).forEach(file1 -> {});
			for(File fil : list) {
				if (fil.isDirectory()) {
					String found = findFile(fil, name);
					if (found != null)
						return found;
				} else if (name.equalsIgnoreCase(fil.getName())) {
					return fil.getAbsolutePath();
				}
			}
		}

		return null;
	}

	public static void main(String[] args) {
		locateUniverseFormula();
	}
}
