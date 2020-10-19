package com.formation.java;

import java.io.File;
import java.util.Arrays;

/**
 * @author Admin
 */
public class FileFinder {

	private static String locateUniverseFormula() {
		String name = "universe-formula";
		File file = new File("/etc/documents");
		String path = findFile(file, name);
		System.out.println(path);
		return path;
	}

	private static String findFile(File file, String name) {
		String path = null;
		File[] list = file.listFiles();
		if (list != null) {
			for(File fil : list)
				if (fil.isDirectory()) {
					findFile(fil, name);
				} else if (name.equalsIgnoreCase(fil.getName())) {
					path = fil.getAbsolutePath();
					break;
				}
		}
		return path;
	}

	public static void main(String[] args) {
		locateUniverseFormula();
	}
}
