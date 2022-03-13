package ferme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PageAccueil extends JPanel {
    ArrayList<Capteur> capteurs = Data.getCapteurList();

    PageAccueil() {
        setLayout(new GridLayout(2, 2));
        for (Capteur ca : capteurs) {
            BlocCapt bloc = new BlocCapt(ca);
            //bloc.addActionListener(new OuvrirCapteur());
            add(bloc, BorderLayout.CENTER);
        }


    }

    class OuvrirCapteur implements ActionListener {
        public void actionPerformed(ActionEvent arg0){
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Article bien commandé !");
        }
    }
}
