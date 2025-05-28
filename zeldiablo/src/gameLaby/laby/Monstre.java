package gameLaby.laby;

public class Monstre {
    private int x;
    private int y;

    public Monstre() {}

    /**
     * Cette méthode renvoie un tableau de longeur 2 de coordonées valide, elle permet de préparer l'apparition du monde
     * position[0] est la coordonée x
     * @return duo de coordonées
     */
    public int[] positionAleatoire(Labyrinthe labyrinthe) {

        int[] position = new int[2];

        boolean positionvalide = false;
        while (!positionvalide) {
            position[0] = (int)(Math.random()*labyrinthe.getLength());
            position[1] = (int)(Math.random()*labyrinthe.getLength());
            if(!(labyrinthe.getMur(position[0],position[1]))){
                positionvalide = true;
            };
        }

    }
}