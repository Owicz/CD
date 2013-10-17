
package sklep;


public class Sklep {

    
    public static void main(String[] args){
        AudioCD nowa = new AudioCD();
        nowa.setTitle("AC/DC");
        nowa.setPrice(5.99);
        System.out.println(nowa.toString());
        GameCD gra = new GameCD();
        gra.setTitle("The Wolf Among Us");
        gra.setPrice(59.90);
        gra.setGenre("adventure");
        gra.setGameMode("single player");
        System.out.println(gra.toString());
        MovieCD film = new MovieCD();
        film.setTitle("Gravity");
        film.setPrice(49.90);
        film.setReleaseYear(2013);
        System.out.println(film.toString());
    }
}