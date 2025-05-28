package gameLaby.laby;

public class Monstre {
    private int x;
    private int y;

    public Monstre(Labyrinthe laby) {
        int[] posMonstre = positionAleatoire(laby);
        x = posMonstre[0];
        y = posMonstre[1];
    }

    /**
     * Cette méthode renvoie un tableau de longeur 2 de coordonées valide, elle permet de préparer l'apparition du monde
     * position[0] est la coordonée x
     * @return duo de coordonées
     */
    public int[] positionAleatoire(Labyrinthe labyrinthe) {

        int[] position = new int[2];

        boolean positionvalide = false;
        while (!positionvalide) {
            choisirCaseHasard(labyrinthe, position);
            positionvalide = !(labyrinthe.getMur(position[0], position[1]))
        }
        return position;
    }

    private static void choisirCaseHasard(Labyrinthe labyrinthe, int[] position) {
        int length = labyrinthe.getLength();
        position[0] = (int)(Math.random()* length);
        position[1] = (int)(Math.random()* length);
    }
}