import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner it = new Scanner(System.in);

    ArrayList <String> lastNames = new ArrayList <String>();
    lastNames.add("Saleh");
    lastNames.add("Berri");
    lastNames.add("Mekled");
    System.out.println(lastNames);

    //when you add, everything in and after shifts
    lastNames.add(1, "Albonajim");
    System.out.println(lastNames);

    //printing size, not length, of array
    System.out.println("Size of lastNames is " + lastNames.size());

    //remove object at position 2
    System.out.println("String removed is " + lastNames.remove(2));

    //now things shift to fill the empty spot
    System.out.println(lastNames);
    System.out.println("Size of lastNames is " + lastNames.size());

    //set as in overwrite what is stored at position (replace)
    System.out.println("The String that is removed with set is " + lastNames.set(0, "Gorsline")); //return what is kicked
    System.out.println(lastNames);
    System.out.println("Size of lastNames is " + lastNames.size()); //size will not change

    lastNames.clear();
    System.out.println("Size of lastNames is " + lastNames.size());
    
    System.out.println();

    //working in ArrayList with multiple data types
    Integer one = new Integer(1);
    Double two = new Double(2.0);
    String three = "3";
    //lastNames.add(one);
    //lastNames.add(two);
    //lastNames.add(three);
    ArrayList demo = new ArrayList(); //no data type
    demo.add(one);
    demo.add(two);
    demo.add(three);
    System.out.println(demo); //although notes about mixed data types appear, java still runs the ArrayList



  }
}