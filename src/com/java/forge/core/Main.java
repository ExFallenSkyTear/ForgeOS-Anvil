package com.java.forge.core;

import com.java.framework.arguments.ArgumentsManager;

public class Main {
	private static final ArgumentsManager arguments = new ArgumentsManager("-", "/", ":", false);
	
	public static void main(String[] args) {
		arguments.newParameter("ip", "localhost");
		
		arguments.parseArguments(args);
		
		System.out.println(arguments.getParameter("ip"));
	}
}