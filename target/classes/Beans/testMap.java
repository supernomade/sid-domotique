/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author loubna
 */

import DAO.ItemDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
public class testMap{
    ItemDao itD=new ItemDao();

    private Map<String, Integer> stringMap;
    private List entrySet;

    //getters and setters
    public ItemDao getItD() {
        return itD;
    }

    public void setItD(ItemDao itD) {
        this.itD = itD;
    }

   
    
    
    public List getEntrySet() { //getter of entrySet list
        stringMap = new HashMap<String, Integer>();
                stringMap=itD.getNbrAuteur();
        //System.out.println("---->"+stringMap.size());
        entrySet = new ArrayList(stringMap.keySet());
//        
//         Iterator it=entrySet.iterator();
//        while(it.hasNext()){
//            System.out.println("... it.next: "+it.next());
//        }

        return entrySet;
    }

    public void setEntrySet(List entrySet) {  //setter of entrySet list
        this.entrySet = entrySet;
    }
}