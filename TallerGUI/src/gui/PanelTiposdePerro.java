package gui;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JList;

public class PanelTiposdePerro extends JPanel {
	
	public PanelTiposdePerro() {
		 setBorder(new TitledBorder("Perros en la exposición"));
		String[] data = {"Puppy (Gran Danés) ", "Taylor (Beagle)", "Cobrador (Akita)", "Brutal y Mamut (Doberman)", "Maximus (Mastin Español)", "Tony (Bull Terrier)", "Nieve (Gigante de los Pireneos)", "Titán (Pug)", "Leviatán (Chiuahua", "Tarzán (Gosque)", "Fido (Mastin Napolitano)"};
		JList<String> list = new JList<>(data);
		JScrollPane scrollPane = new JScrollPane(list);

		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane);
		setPreferredSize(new Dimension(0, 0));

	}
}
