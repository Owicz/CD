/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sklep.CDs;

import java.util.ArrayList;

/**
 *
 * @author danie_000
 */
public class List extends CD{
    private java.util.List<CD> list = new ArrayList<>();
    
    public List(){
       list.add();
    }
    /**
     * @return the list
     */
    public java.util.List<CD> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(java.util.List<CD> list) {
        this.list = list;
    }
    
}
