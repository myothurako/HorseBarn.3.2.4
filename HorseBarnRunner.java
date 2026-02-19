
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
   // System.out.println(barnSpaces);

    for (Horse h : barnSpaces) {
      // CODE TO ADD (error because it attempts to change the size of the Array while
      // traversing)
      // if (h.getName().equals("Patches"))
      // barnSpaces.remove(h);
      System.out.println(h);
    }

    // int numSpaces = barnSpaces.size();
    // for (int i = 0; i < numSpaces; i++)
    // {
    // Horse h = barnSpaces.get(i);
    // if (h.getName().equals("Patches"))
    // {
    // System.out.println("Bye bye " + barnSpaces.remove(i));
    // i--;
    // }
    // else if (h.getName().equals("Lady"))
    // {
    // System.out.println("Bye bye " + barnSpaces.remove(i));
    // i--;
    // }
    // }
    // int i = 0;
    // while (i < barnSpaces.size()) {
    //   Horse h = barnSpaces.get(i);

    //   if (h.getName().equals("Patches")) {
    //     System.out.println("Bye bye " + barnSpaces.remove(i));
    //   } else if (h.getName().equals("Lady")) {
    //     System.out.println("Bye bye " + barnSpaces.remove(i));
    //   } else {
    //     i++;
    //   }
    // }




    //3.2.5
    
    
  }
}