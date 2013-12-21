/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HibernateUtile.HibernateUtil;
import classes.Items;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author CHAM
 */
public class ItemDao {
    
         
    
   
    public List<Items> getItemAuteur(){
       
		try{
		 System.out.println("ok2");
		Session session=HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                //Query q = session.createQuery("from Items it,Analysechamp an where "
                      // + "it.idAnalyseChamp=an.idAnalyseChamp and an.numeroChamp=2");
                
		Query q = session.createQuery("select idItem,nomLong,count(idItem),analysechamp.idAnalyseChamp from Items it where it.analysechamp.champs.numeroChamp=2 group by it.nomLong");
                    //System.out.println(q.list().size());
                		//Query q = session.createQuery("from Items it where it.analysechamp.champs.numeroChamp=2 group by it.nomLong");

		return q.list();
                    
		} 
		catch (Exception e) {
                    return null;
		}
		
       }
    
//    public HashMap<String,Integer> getNbrAuteur(){
//       
//		try{
//		 System.out.println("ok3");
//		Session session=HibernateUtil.getSessionFactory().openSession();
//                session.beginTransaction();
//                //Query q = session.createQuery("from Items it,Analysechamp an where "
//                      // + "it.idAnalyseChamp=an.idAnalyseChamp and an.numeroChamp=2");
//                
//		Query q = session.createQuery("select nomLong,count(idItem) from Items it where it.analysechamp.champs.numeroChamp=2 group by it.nomLong");
//                    //System.out.println(q.list().size());
//                		//Query q = session.createQuery("from Items it where it.analysechamp.champs.numeroChamp=2 group by it.nomLong");
//
//		return (HashMap<String, Integer>) q.list();
//                    
//		} 
//		catch (Exception e) {
//                    return null;
//		}
//		
//       }
    public Map<String,Integer> getNbrAuteur(){
       
		try{
		 System.out.println("ok3");
		Session session=HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                //Query q = session.createQuery("from Items it,Analysechamp an where "
                      // + "it.idAnalyseChamp=an.idAnalyseChamp and an.numeroChamp=2");
                
		Query q = session.createQuery("select nomLong,count(idItem) from Items it where it.analysechamp.champs.numeroChamp=2 group by it.nomLong");
                    //System.out.println(q.list().size());
                		//Query q = session.createQuery("from Items it where it.analysechamp.champs.numeroChamp=2 group by it.nomLong");

		return (Map<String, Integer>) q.list();
                    
		} 
		catch (Exception e) {
                    return null;
		}
		
       }
    
    
    
}
