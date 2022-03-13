package ferme;

import java.util.Random;

public class Capteur {
    public int code;
    public String name;
    public String localisation;
    public String info;
    public String unite;
    public int max;

    public Capteur(int code, String name, String localisation, String info, String unite, int max) {
        this.code = code;
        this.name = name;
        this.localisation = localisation;
        this.info = info;
        this.unite = unite;
        this.max = max;
    }

    public String getValeur() {
        Random rdm = new Random();
        return rdm.nextInt(max) + " " + unite;
    }
}


