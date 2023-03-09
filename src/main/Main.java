package main;

import controller.MatrizThread;

public class Main {

	public static void main(String[] args) {
		int m[][] = new int [3][5];
		
		for(int x = 0; x < 3; x++){
			for(int y = 0; y < 5; y++) {
				m[x][y] = (int) (Math.random() * 11) + 1;
			}
		}
		
		for(int x = 0; x < 3; x++){
			for(int y = 0; y < 5; y++) {
				System.out.print(m[x][y] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			MatrizThread matriz = new MatrizThread(i, m);
			matriz.start();
		}
		
	}
}
