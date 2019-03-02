package ac.za.cput;

import java.util.*;

public class Assignment1App {

    public void animalList(){

        List animal = new ArrayList();

        animal.add("Horse");
        animal.add("Sheep");
        animal.add("Cat");
        animal.add("Dog");
        animal.add("Mouse");

        System.out.println("Number of elements in the array are 5: "+ animal.size());

        animal.remove(3);

        System.out.println("Number of elements in the array are 4 now : "+animal.size());


    }
    public void colourSets(){

        Set colour = new HashSet();
        colour.add("Navy");
        colour.add("Black");
        colour.add("Yellow");
        colour.add("Orange");

        // Print the elements of the Set
        System.out.println("myColours: " + colour);

        List secondaryColour = new ArrayList();
        secondaryColour.add("Maroon");
        secondaryColour.add("Blue");
        secondaryColour.add("Red");
        secondaryColour.add("Green");
        secondaryColour.add("Red");
        secondaryColour.add("Brown");
        //the set using the appropriate constructor
        Set mySet2 = new HashSet(secondaryColour);

        // Print the elements of the list an the the set
         System.out.println("mySecondaryColours: " + mySet2);

        // Compare the two sets
        System.out.println("colour matches secondColour: " + colour.equals(mySet2));

    }
    public void mapEmpNameWithEmpCity(){

        Map mapNamewithCity = new HashMap();
        mapNamewithCity.put("Salomi", "Stellenbosch");
        mapNamewithCity.put("Thandiswa", "Cape Town");
        mapNamewithCity.put("Ziyanda", "Gugulethu");
        mapNamewithCity.put("Masivuye", "Cape Town");

        //String element = (String) mapNamewithCity.get("Salomi");

        System.out.println("Salomi stays in: "+ mapNamewithCity.get("Salomi"));
    }

    public void checkCollection(){

        Integer[] numbers = new Integer[]{1,2,3,4,5,6};
        Collection<Integer> myNumCollection = new LinkedHashSet<>();
        Collections.addAll(myNumCollection,numbers);
        System.out.println(myNumCollection);
        System.out.println("The collection contains: "+numbers.length+" values");


    }
    public static void main (String []args){
        Assignment1App app = new Assignment1App();
        app.animalList();
        app.colourSets();
        app.mapEmpNameWithEmpCity();
        app.checkCollection();
    }

}
