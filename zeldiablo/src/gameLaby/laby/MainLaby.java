package gameLaby.laby;
import gameArkanoid.ArkanoidDessin;
import gameArkanoid.ArkanoidJeu;
import moteurJeu.MoteurJeu;


public class MainLaby {

    public static void main(String[] args) {
        int width = 800;
        int height = 600;
        int pFPS = 20;

        // creation des objets
        LabyJeu jeuLaby = new LabyJeu();
        jeuLaby.init();

        LabyDessin dessinArk = new LabyDessin();

        // parametrage du moteur de jeu
        MoteurJeu.setTaille(width,height);
        MoteurJeu.setFPS(pFPS);

        // lancement du jeu
        MoteurJeu.launch(jeuLaby, dessinArk);
    }
}