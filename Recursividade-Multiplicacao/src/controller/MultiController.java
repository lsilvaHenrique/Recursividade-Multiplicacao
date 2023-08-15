package controller;

public class MultiController {
	
	public int Multi (int a, int b) {
	/* #condicao se parada sera quando b chegar a 0  */
		if (b == 0) {
			return 0;
		}
		
		return a + Multi(a, b - 1);
	}
}
