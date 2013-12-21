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
  
import org.primefaces.model.chart.CartesianChartModel;  
import org.primefaces.model.chart.ChartSeries;  
  
public class ChartBean implements Serializable {  
  
    private CartesianChartModel categoryModel;  
  
    public ChartBean() {  
        createCategoryModel();  
    }  
  
    public CartesianChartModel getCategoryModel() {  
        return categoryModel;  
    }  
  
    private void createCategoryModel() {  
        categoryModel = new CartesianChartModel();  
  
        ChartSeries boys = new ChartSeries();  
        boys.setLabel("Auteurs");  
  
        boys.set("RAGAZZI ROBERTO", 7);  
        boys.set("FERNANDEZ NEDEO PATRICIA", 4);  
        boys.set("RODILLA SALA VICENTE", 4);  
        boys.set("SANZ JUEZ CARLOS ", 3);  
        boys.set("MIRANDA ANTONIO", 2);  
        boys.set("FERNANDEZ DIAZ ROMAN", 1);  
         
  
        categoryModel.addSeries(boys);  
         
    }  
}  
                      