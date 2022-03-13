package ferme;

import javax.swing.*;
import java.awt.*;

public class PageUtilisateur extends JPanel {

    private JLabel titre = new JLabel("UTILISATEUR : ");
    private JLabel name = new JLabel("PRENOM : ");
    private JLabel lastName = new JLabel("NOM : ");
    private JLabel utilisateur = new JLabel("UTILISATEUR");

    setLayout(new GridLayout(4,1));

    PageUtilisateur() {
        add(titre);
        add(name);
        add(lastName);
        add(utilisateur);
   }
}