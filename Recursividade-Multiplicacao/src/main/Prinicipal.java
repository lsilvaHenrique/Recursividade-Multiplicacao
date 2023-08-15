package main;

import controller.MultiController;

public class Prinicipal {
	
	public static void main(String args[]) {
		MultiController multi = new MultiController();
		int n = multi.Multi(10, 5);
		System.out.println(n);
	}
	
}
