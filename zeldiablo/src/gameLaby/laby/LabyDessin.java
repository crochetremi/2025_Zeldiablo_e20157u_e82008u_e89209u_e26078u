package gameLaby.laby;

import gameArkanoid.ArkanoidJeu;
import gameArkanoid.Raquette;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import moteurJeu.DessinJeu;
import moteurJeu.Jeu;

public class LabyDessin implements DessinJeu {

    @Override
    public void dessinerJeu(Jeu jeu, Canvas canvas) {

        //Crée le jeu
        LabyJeu laby = (LabyJeu) jeu;

        //Crée le canva
        final GraphicsContext gc = canvas.getGraphicsContext2D();

        // dessin fond
        gc.setFill(Color.LIGHTGRAY);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        // dessin perso
        gc.setFill(Color.RED);
        Perso pj = laby.getLabyrinthe().pj;
        double px = pj.x;
        double py = pj.y;
        gc.fillRect(px, py, 10, 10);



        for(int i = 0; i <laby.getLabyrinthe().getLength(); i++){
            for(int j = 0; j < laby.getLabyrinthe().getLengthY(); j++){
                if( laby.getLabyrinthe().getMur(i,j) == true ) {
                    gc.setFill(Color.BLACK);
                    gc.fillRect(i*10,j*10,10,20);
                }
            }
        }
    }
}
