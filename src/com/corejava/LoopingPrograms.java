package com.corejava;

import java.util.Iterator;

public class LoopingPrograms {
	
	public static void main(String[] args) {
		
		int x = 5;
		int num = 0;
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(num+"  ");
				num++;
				
			}
			System.out.println(); 
			
		}
		
	}

}
