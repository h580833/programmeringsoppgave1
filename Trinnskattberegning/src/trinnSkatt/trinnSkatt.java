package trinnSkatt;

import static javax.swing.JOptionPane.*;

public class trinnSkatt {

	public static void main(String[] args) {
		
		double brutto = Double.parseDouble(showInputDialog("Skriv inn din bruttoinntekt her:"));
		
		double prosent = 0;
		if (brutto < 180800)
			prosent = 0;
		else if (brutto <= 254500)
			prosent = 0.019;
		else if (brutto <= 639750)
			prosent = 0.042;
		else if (brutto <= 999550)
			prosent = 0.132;
		else
			prosent = 0.162;
		
		double trinnskatt = brutto * prosent;
		
		System.out.println("Trinnskatten din er: " + trinnskatt);
		
		
		

	}

}
