package gameLaby.laby;

import moteurJeu.DessinJeu;
import moteurJeu.MoteurJeu;

import java.awt.*;
import java.io.IOException;

/**
 * charge et affiche un labyrinthe
 */
public class Main {
    public static void main(String[] args) throws IOException {

        // charge le labyrinthe à partir de labyjeu
        LabyJeu lb = new LabyJeu();
        lb.init();
        Labyrinthe laby = lb.getLabyrinthe();

        //affiche le labyrinthe charge
        for (int y = 0; y < laby.getLengthY(); y++) {
            // affiche la ligne
            for (int x = 0; x < laby.getLength(); x++) {
                if (laby.getMur(x, y))
                    System.out.print('X');
                else
                    System.out.print('.');
            }
            // saut de ligne
            System.out.println();
        }

    }
}
