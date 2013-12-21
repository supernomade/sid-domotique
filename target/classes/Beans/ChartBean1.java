/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author loubna
 */
import java.io.Serializable;  
import java.util.LinkedHashMap;
import java.util.Map;
  
import org.primefaces.model.chart.DonutChartModel;  
  
public class ChartBean1 implements Serializable {  
  
    private DonutChartModel donutModel;  
      
    public ChartBean1() {  
        createDonutModel();  
    }  
      
    public DonutChartModel getDonutModel() {  
        return donutModel;  
    }  
   
    private void createDonutModel() {  
        donutModel = new DonutChartModel();  
          
        Map<String, Number> circle1 = new LinkedHashMap<String, Number>();  
        circle1.put("MC 1", 150);  
        circle1.put("MC 2", 400);  
        circle1.put("MC 3", 200);  
        circle1.put("MC 4", 10); 
        circle1.put("MC 5", 150);  
        circle1.put("MC 6", 400);  
        circle1.put("MC 7", 200);  
        circle1.put("MC 8", 10);
        circle1.put("MC 9", 200);  
        circle1.put("MC 10", 10);
        donutModel.addCircle(circle1);  
          
        
     
    }  
}  
