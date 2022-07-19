import java.util.*;

class Main {

  public static void nullifierSort(ArrayList<Integer> arr) { //Sorting Algorithm
    for (int i = arr.size()-1; i > 0; i--) {
      arr.remove(i); //Removes all elements but the first
    }
  }

  public static int rng(int min, int max) { //Generates a random number
    return (int) ((Math.random() * (max - min)) + min); // Returns the random number 
  }
  
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in); //Creates scanner
    ArrayList<Integer> nums = new ArrayList<Integer>();//Creates ArrayList
    sorter sort = new sorter();
    System.out.print("Please enter the Array Size: "); //Prompts user to pick array size
      int arrSize = scan.nextInt(); // Takes user input and adds it to arrSize 
      if (arrSize > 0) { 
        for (int i = 0; i < arrSize; i++) { //Fills array with Random Numbers
          nums.add(rng(1, 1000));
        }
  }
    System.out.println(nums);
    System.out.println("Sorting...");
    nullifierSort(nums);
    System.out.println("Sorted!\n" + nums);

    
}
}