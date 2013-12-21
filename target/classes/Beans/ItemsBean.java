/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.ItemDao;
import classes.Items;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author CHAM
 */
public class ItemsBean {
    List<Items> lis=new ArrayList<Items>();
    Map<String,Integer> HS=new HashMap<String, Integer>();
List<Integer> l1=new ArrayList<Integer>();
List<String> l2=new ArrayList<String>();

    ItemDao itD=new ItemDao();
Items it=new Items();

    //getters and setters

    public List<String> getL2() {
        return l2;
    }

    public void setL2(List<String> l2) {
        this.l2 = l2;
    }

    public List<Integer> getL1() {
        return l1;
    }

    public void setL1(List<Integer> l1) {
        this.l1 = l1;
    }

    public Map<String, Integer> getHS() {
        return HS;
    }

    public void setHS(HashMap<String, Integer> HS) {
        this.HS = HS;
    }

    public Items getIt() {
        return it;
    }

    public void setIt(Items it) {
        this.it = it;
    }

    public ItemDao getItD() {
        return itD;
    }

    public void setItD(ItemDao itD) {
        this.itD = itD;
    }

    public List<Items> getLis() {
        return lis;
    }

    public void setLis(List<Items> lis) {
        this.lis = lis;
    }
    
    
    public List getAllAut(){
        System.out.println("ok1");
      
         //lis=itD.getItemAuteur();
        HS=itD.getNbrAuteur();
        l1 = new ArrayList(HS.entrySet());
//         List<String> l=new ArrayList<String>();
//         for(Items i:lis){
//             l.add(i.getNomLong());
//         }
//         for(String element:l){
//             if(!HS.containsKey(element)){
//                 HS.put(element, 1);
//             }
//             else
//               HS.  
//         }
         //l1=(List<Integer>) HS.values();
         //l2=(List<String>) HS.keySet();

        return l1;
    }
    
    
    
}
