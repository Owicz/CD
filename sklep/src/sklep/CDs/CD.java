
package sklep.CDs;



public class CD {
    private String title;
    private double price;
    protected String nl = System.getProperty("line.separator"); 
    //pole pakietowe jakby nic nie dać (dostepne tylko w paczce (sklep.CDs)
    //protected dostepne w dzieciach (trzeba miec zaufanie do dzieci)
    
    public CD(){
        
    }
    public CD(String title, double price){
        this.title = title;
        this.price = price;
    }
    
    public final void setTitle(String title){ // final zapobiega tu przesłanianiu. niweczy dziedziczenie
      //  if(title != null && !"".equals(title)){ //bo Stringi to obiekty dlatego nie zwykłe == or !=
                                                //kolejność taka bo null
        if(title != null && !title.isEmpty()){
            this.title=title;
        }else{
            throw new IllegalArgumentException("Tytul nie moze byc pusty");
        }    
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
        return getClass().getSimpleName()+nl
                +"title: "+title+nl
                +"price: "+price+nl;
    }
}

