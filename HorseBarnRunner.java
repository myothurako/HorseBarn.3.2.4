
/*
 * Activity 3.2.4
 */
import java.util.ArrayList;

public class HorseBarnRunner {
  public static void main(String[] args) {
    /* your code here */
    HorseBarn barn = new HorseBarn();
    ArrayList<Horse> barnSpaces;
    barnSpaces = barn.getSpaces();
 
    //3.2.5
    double averageWeight = Algorithms.getAverage(barnSpaces);
    System.out.println("average weight is " + averageWeight);



    
    
    for (Horse h : barnSpaces){
      //Find horses heavier than average
      if (h.getWeight() > averageWeight){
        System.out.println("fatter than average: " + h);
      }
    }

    
  }
}