
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



    Horse lightest = barnSpaces.get(0);
    Horse heaviest = barnSpaces.get(0);
    
    for (Horse h : barnSpaces){
      //Find horses heavier than average
      if (h.getWeight() > averageWeight){
        System.out.println("fatter than average: " + h);
      }
      //lightest check
      if (h.getWeight() < lightest.getWeight()){
        lightest = h;
    }

    // heaviest check
      if (h.getWeight() > heaviest.getWeight()){
        heaviest = h;
      }
    }

    // display lightest and heaviest
    System.out.println("lightest horse: " + lightest.getName()
    + " " + lightest.getWeight());

    System.out.println("heaviest horse: " + heaviest.getName()
    + " " + heaviest.getWeight());
    

//while loop 

int i = 0;

while (i < barnSpaces.size()) {

  Horse current = barnSpaces.get(i);

  // Duke leaves, Princess takes same spot
  if (current.getName().equals("Duke")) {
    barnSpaces.remove(i);
    barnSpaces.add(i, new Horse("Princess", 1445));
    i++; // move past Princess
  }

  // Chief goes after Silver
  else if (current.getName().equals("Silver")) {
    barnSpaces.add(i + 1, new Horse("Chief", 1505));
    i += 2; // skip Silver and Chief
  }

  // Gypsy before Buddy, Magic after Buddy
  else if (current.getName().equals("Buddy")) {
    barnSpaces.add(i, new Horse("Gypsy", 1335));
    barnSpaces.add(i + 2, new Horse("Magic", 1425));
    i += 3; // skip Gypsy, Buddy, Magic
  }

  else {
    i++;
  }
  }

  //confirmation, i just copied and paste from the earlier thing

  for (Horse h : barnSpaces){
      //Find horses heavier than average
      if (h.getWeight() > averageWeight){
        System.out.println("fatter than average: " + h);
      }
      //lightest check
      if (h.getWeight() < lightest.getWeight()){
        lightest = h;
    }

    // heaviest check
      if (h.getWeight() > heaviest.getWeight()){
        heaviest = h;
      }

      System.out.println(h.getName() + " " + h.getWeight());
    }

    // display lightest and heaviest
    System.out.println("lightest horse: " + lightest.getName()
    + " " + lightest.getWeight());

    System.out.println("heaviest horse: " + heaviest.getName()
    + " " + heaviest.getWeight());
    

    // randomize barn horses
    ArrayList<Horse> randomized = RandomPermutation.next(barnSpaces);

    // display consecutive pairs
    for (int j = 0; j < randomized.size(); j += 2) {
      if (j + 1 < randomized.size()) 
        {
        System.out.println(randomized.get(j).getName() + " and " + randomized.get(j + 1).getName());
      } 
      else 
      {
        System.out.println(randomized.get(j).getName() + " has no partner");
      }
    }
}
}