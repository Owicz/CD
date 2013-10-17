/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sklep;

/**
 *
 * @author danie_000
 */
public class MovieCD extends CD{
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
        String nl = System.getProperty("line.separator");
        return getClass().getSimpleName()+nl
                +"title: "+getTitle()+nl
                +"title: "+releaseYear+nl
                +"price: "+getPrice()+nl;
    }
}
