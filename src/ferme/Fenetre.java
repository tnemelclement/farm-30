package ferme;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    JLabel title;
    JPanel accueil;
    JPanel footer;
    JPanel capteur;
    JPanel connexion;
    JPanel utilisateur;

    public Fenetre() {



        this.setSize(1000, 700);
        this.setTitle("FARM 3.0");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        init();

        add(title, BorderLayout.NORTH);
        add(utilisateur, BorderLayout.CENTER);
        add(footer, BorderLayout.SOUTH);

        //this.setContentPane(container);
        this.setVisible(true);
    }

    private void init() {
        // Title
        title = new JLabel("FARM 3.0"); // Affiche le titre.
        title.setFont(new Font("Arial", Font.BOLD, 50));
        title.setForeground(Color.black);

        // Accueil
        accueil = new PageAccueil();

        // Footer
        footer = new Footer();

        // Utilisateur
        utilisateur = new PageUtilisateur();
    }
}
