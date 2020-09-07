package trinnSkatt;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Nfakultet {

	public static void main(String[] args) {
		
		String tallTxt = showInputDialog("Oppgi et tall");
		
		int n = parseInt(tallTxt);
		int fak = 1;
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				fak = fak * i;
			}
			showMessageDialog (null, "Fakultet " + n + " er " + fak);
		}

	}

}
