package ferme;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class BlocCapt extends JPanel {
    JLabel  nom, localisation, info, valeur;

    BlocCapt(Capteur capt) {
        nom = new JLabel(capt.name, SwingConstants.CENTER);
        localisation = new JLabel(capt.localisation, SwingConstants.CENTER);
        info = new JLabel(capt.info, SwingConstants.CENTER);
        valeur = new JLabel(String.valueOf(capt.getValeur()), SwingConstants.CENTER);

        setLayout(new GridLayout(4,1));

        nom.setFont(new Font("Arial", Font.BOLD, 30));
        localisation.setFont(new Font("Arial", Font.PLAIN, 20));
        info.setFont(new Font("Arial", Font.ITALIC, 16));
        valeur.setFont(new Font("Arial", Font.BOLD, 40));

        setBackground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.black));



        add(nom);
        add(localisation);
        add(info);
        add(valeur);
    }


}
