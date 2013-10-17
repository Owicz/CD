/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sklep;

/**
 *
 * @author danie_000
 */
public class GameCD extends CD{
     private String genre ;
     private String gameMode;
     /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the gameMode
     */
    public String getGameMode() {
        return gameMode;
    }

    /**
     * @param gameMode the gameMode to set
     */
    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }
    
    @Override
    public String toString(){
        String nl = System.getProperty("line.separator");
        return getClass().getSimpleName()+nl
                +"title: "+getTitle()+nl
                +"price: "+getPrice()+nl
                +"price: "+genre+nl
                +"title: "+gameMode+nl;
    }





}
