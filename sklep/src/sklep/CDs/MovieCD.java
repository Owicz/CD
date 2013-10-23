/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sklep.CDs;

/**
 *
 * @author danie_000
 */
    
public class MovieCD extends CD{
    
    public MovieCD(){
        
    }
    
    public MovieCD (String title, double cena, int releaseYear){
        super(title, cena);
        this.releaseYear = releaseYear;
        //this.title = title; //pierwszy sposób
        //setTitle(title); // drugi sposób
        
    }
    private int releaseYear;

    /**
     * @return the releaseYear
     */
    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     * @param releaseYear the releaseYear to set
     */
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    
    @Override
    public String toString(){
        return super.toString()
        +"Release Year: "+releaseYear+nl;
    }
}
