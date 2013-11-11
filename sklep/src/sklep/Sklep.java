
package sklep;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;

import sklep.CDs.AudioCD;
import sklep.CDs.CD;
import sklep.CDs.GameCD;
import sklep.CDs.MovieCD;


public class Sklep {

    
    public static void main(String[] args){
        AudioCD nowa = new AudioCD();
        nowa.setTitle("AC/DC");
        nowa.setPrice(5.99);
        try{
            nowa.setTitle("");
        }catch (IllegalArgumentException e){
            //System.out.println("Błąd");
            //System.out.println(nowa.toString());
            //kolejność ważna (od szczegółu do ogółu)
        }
        
        
        GameCD gra = new GameCD();
        gra.setTitle("The Wolf Among Us");
        gra.setPrice(5.90);
        gra.setGenre("adventure");
        gra.setGameMode("single player");
        //System.out.println(gra.toString());
        
        MovieCD film = new MovieCD();
        film.setTitle("Gravity");
        film.setPrice(49.90);
        film.setReleaseYear(2013);
        //System.out.println(film.toString());
        
        MovieCD film2 = new MovieCD("Avatar",19.90,2009);
        //System.out.println(film2.toString());
        
        //LISTY <- KOLEKCJE
        
        List<CD> list = new ArrayList<>(); //twożenie listy
        list.add(nowa); //dodawanie do listy
        list.add(gra);
        list.add(film);
        list.add(film2);
        
        //System.out.println(list); //1sposób
//         for(int i=0;i<list.size();i++){  //2sposób
//            System.out.println(i+": "+list.get(i));
//        }
         
//        for (CD o : list){  //3sposób dla każdego (przechodzi dla każdego)
//            System.out.println(o);
//        }
        Iterator<CD> it = list.iterator(); //3sposób z Iteratorem dobre przy modyfikowaniu kolekcji(dodaj/usun)
        while(it.hasNext()){
            System.out.println(it.next());
        }
         //Klasa nowa w któj będzie lista (prywatna czy publiczna) jak udostępniać,
         // bedziemy robić wyszukiwanie (np jedno słowo po tytule) wyrażenia regularne <-ważne! poczytaj
         //Zad dom: Jak przechowywana ArryList (czy tablica czy lista)
//        opd jak lista
//        Basically Java's ArrayList usually ensures enough space in an array for the elements to fit. If the array is not long enough then it provide more space for them: create new array with the double size of the original array and copies the elements into it.
    }
}