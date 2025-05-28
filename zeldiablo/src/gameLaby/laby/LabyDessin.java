package gameLaby.laby;


import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
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
        //gc.fillRect(px * 20, py*20, 20, 20);
        gc.fillArc(px*40, py*40, 40, 40, 0, 360, ArcType.ROUND);


        for(int i = 0; i <laby.getLabyrinthe().getLength(); i++){
            for(int j = 0; j < laby.getLabyrinthe().getLengthY(); j++){
                if( laby.getLabyrinthe().getMur(i,j) == true ) {
                    gc.setFill(Color.BLACK);
                    gc.fillRect(i*40,j*40,40,40);
                }
            }
        }
    }
}
