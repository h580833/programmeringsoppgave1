package trinnSkatt;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class KarakteroppgaveC {

	public static void main(String[] args) {

		for (int antStudenter = 1; antStudenter <= 10;) {
			
			String tallTxt = showInputDialog("Oppgi poengsum: ");
			int poeng = parseInt(tallTxt);
			
			if ((poeng>=0)&&(poeng<=39)) {
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu fikk karakter F";
				antStudenter++;
				showMessageDialog(null,utTxt);		
			}
			
			if ((poeng>=40)&&(poeng<=49)) {
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu fikk karakter E";
				antStudenter++;
				showMessageDialog(null,utTxt);
			}
			
			if ((poeng>=50)&&(poeng<=59)) {
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu fikk karakter D";
				antStudenter++;
				showMessageDialog(null,utTxt);
			}
			
			if ((poeng>=60)&&(poeng<=79)) {
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu fikk karakter C";
				antStudenter++;
				showMessageDialog(null,utTxt);
			}
			
			if ((poeng>=80)&&(poeng<=89)) {
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu fikk karakter B";
				antStudenter++;
				showMessageDialog(null,utTxt);
			}
			
			if ((poeng>=90)&&(poeng<=100)) {
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu fikk karakter A";
				antStudenter++;
				showMessageDialog(null,utTxt);
			}
			
			if ((poeng>100)&&(poeng<0)) {
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nUgyldig poengsum";
				showMessageDialog(null,utTxt);
			}
			

	}
  }
}	