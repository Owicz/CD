
package sklep;


public class CD {
    private String title;
    private double price;
    
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    
    @Override
    public String toString(){
        String nl = System.getProperty("line.seperator");
        return "CD"+nl
                +"title:"+title
                +"price:"+price;
    }
}