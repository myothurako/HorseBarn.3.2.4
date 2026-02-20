import java.util.ArrayList;
public class Algorithms {
 // COUNT ALL ZEROS
  public static int countZeros(ArrayList<Horse> arrList){
    int x = 0;
for (Horse a : arrList) 
{
if (a.getWeight() == 0)
   x++;
}
return x;

  }
// FIND SMALLEST
  public static int getSmallest(ArrayList<Horse> arrList){
     int smallest = arrList.get(0).getWeight();
 for (int j = 1; j < arrList.size(); j++)
{
    if (arrList.get(j).getWeight() < smallest)
         smallest = arrList.get(j).getWeight();
}
return smallest;
  }
// GET AVERAGE
public static double getAverage(ArrayList<Horse> arrList){
double sum = 0;
for (Horse h : arrList)
{
    sum += h.getWeight();
}
return (sum/arrList.size());
}
// HAS ZERO
public static boolean hasZero(ArrayList<Boolean> arrList){
  int index = 0;
boolean found = false;
while (!found && (index < arrList.size()))
{
   if(arrList.get(index) == false){
    found = true;
   }
   index++;
}
return found;
}
//REVERSE LIST
public static ArrayList<Integer> reverseList(ArrayList<Integer> arrList){
for (int i = 0; i < arrList.size()/2; i++)
{
   int start = arrList.get(i);
   int end = arrList.size()-1-i;
   arrList.set(i, arrList.get(end));
   arrList.set(end, start);
}
return arrList;
}
// GET SUM
public static int getSum(ArrayList<Integer> arrList){
    int sum = 0;
for (Integer a : arrList)
{
  sum += a;
}
return sum;
}
//CHECK DUPLITCATE
public static boolean checkDuplicate(ArrayList<Boolean> arrList){
    for (int i = 0; i < arrList.size(); i++)
{
   for (int j = i + 1; j < arrList.size(); j++)
   {
      if (arrList.get(i) == arrList.get(j))
         return true;
   }
}
return false;
}
//SWAP PAIRS
public static ArrayList<Integer> swapPairs(ArrayList<Integer> arrList){
    for (int i = 0; i < arrList.size()-1; i += 2)
{
   int a = arrList.get(i);
   arrList.set(i, arrList.get(i+1));
   arrList.set(i+1, a);
}
return arrList;
}
//has all positives
public static boolean hasAllPositive(ArrayList<Integer> arrList){
    boolean b = true;
for (int a : arrList)
{
   if (a <= 0)
       b = false;
}
return b;
}
//move left once, basically rotate
public static ArrayList<Integer> moveLeft(ArrayList<Integer> arrList){
    int first = arrList.get(0);
    for(int i = 0; i < arrList.size() - 1; i++){
        arrList.set(i, arrList.get(i + 1));
    }
    arrList.set(arrList.size() - 1, first);
    return arrList;
}
//get largest
public static int getLargest(ArrayList<Integer> arrList){
    int n = arrList.get(0);

for (int y = 1; y < arrList.size(); y++)
{
    if (arrList.get(y) > n)
       n = arrList.get(y);
}
 
return n;
}
}
