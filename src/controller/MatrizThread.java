package controller;

public class MatrizThread extends Thread{
	
	int i;
	int m[][];

	public MatrizThread(int i, int m[][]) {
		this.i = i;
		this.m = m;
	}
	
	@Override
	public void run() {
		SomaLinha();
	}

	private void SomaLinha() {
		int vets[] = new int [3];
		
		for(int y = 0; y < 5; y++) {
			vets[i] += m[i][y];
		}
		
		System.out.println("linha " + i + " ==> " + vets[i]);
		
	}
}
