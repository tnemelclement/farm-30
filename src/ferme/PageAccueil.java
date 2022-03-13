package ferme;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PageAccueil extends JPanel {
    ArrayList<Capteur> capteurs = Data.getCapteurList();

    PageAccueil() {
        setLayout(new GridLayout(2, 2));
        for (Capteur ca : capteurs) {
            add(new BlocCapt(ca), BorderLayout.CENTER);
        }
    }

}
