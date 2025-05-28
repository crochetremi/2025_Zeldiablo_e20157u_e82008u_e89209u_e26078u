package gameLaby.laby;

import moteurJeu.Clavier;
import moteurJeu.Jeu;

import java.io.IOException;

public class LabyJeu implements Jeu {

    Labyrinthe labyrinthe;


    public void update(double secondes, Clavier clavier) {
            if(clavier.bas == true){
                labyrinthe.deplacerPerso(Labyrinthe.BAS);
            }
            if(clavier.haut == true){
                labyrinthe.deplacerPerso(Labyrinthe.HAUT);
            }
            if(clavier.gauche== true){
                labyrinthe.deplacerPerso(Labyrinthe.GAUCHE);
            }
            if(clavier.droite == true){
                labyrinthe.deplacerPerso(Labyrinthe.DROITE);
            }
    }

    public void init()  {
        try{
            this.labyrinthe = new Labyrinthe("zeldiablo/labySimple/laby1.txt");

        }
        catch (IOException e){
            System.out.println("Impossible de charger labyrinthe.");
        }
    }

    public boolean etreFini() {
        return false;
    }

    public Labyrinthe getLabyrinthe() {
        return labyrinthe;
    }

}
