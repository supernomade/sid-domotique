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
  
import org.primefaces.model.chart.BubbleChartModel;  
  
public class ChartBean2 implements Serializable {   
  
    private BubbleChartModel bubbleModel;  
  
    public ChartBean2() {  
        createBubbleModel();  
    }  
  
    private void createBubbleModel() {  
        bubbleModel = new BubbleChartModel();  
  
        bubbleModel.add(new BubbleChartSeries("Domotique", 1, 1,55));  
        bubbleModel.add(new BubbleChartSeries("Systeme", 1, 1, 36));  
        bubbleModel.add(new BubbleChartSeries("Electrique", 1, 1, 40));  
        bubbleModel.add(new BubbleChartSeries("Bugatti", 50, 123, 60));  
        bubbleModel.add(new BubbleChartSeries("BMW", 15, 89, 25));  
        bubbleModel.add(new BubbleChartSeries("Audi", 40, 180, 80));  
        bubbleModel.add(new BubbleChartSeries("Aston Martin", 70, 70, 48));  
    }  
}  
