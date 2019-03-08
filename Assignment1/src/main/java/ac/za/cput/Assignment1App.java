package ac.za.cput;

import java.util.*;

public class Assignment1App {

    public List animalList(){

        List animal = new ArrayList();

        animal.add("Horse");
        animal.add("Sheep");
        animal.add("Cat");
        animal.add("Dog");
        animal.add("Mouse");

      //  System.out.println("Number of elements in the array are 5: "+ animal.size());

        animal.remove(3);

      //  System.out.println("Number of elements in the array are 4 now : "+animal.size());

        return animal;
    }
    public Set colourSets(){

        List secondaryColour = new ArrayList();
        secondaryColour.add("Maroon");
        secondaryColour.add("Blue");
        secondaryColour.add("Red");
        secondaryColour.add("Green");
        secondaryColour.add("Red");
        secondaryColour.add("Brown");
        //the set using the appropriate constructor
        Set mySet2 = new HashSet(secondaryColour);

        // Compare the two sets
      // System.out.println("I have blue in my set: " + mySet2.contains("Blue"));

        return mySet2;
    }
    public Map mapEmpNameWithEmpCity(){

        Map mapNamewithCity = new HashMap();
        mapNamewithCity.put("Salomi", "Stellenbosch");
        mapNamewithCity.put("Thandiswa", "Cape Town");
        mapNamewithCity.put("Ziyanda", "Gugulethu");
        mapNamewithCity.put("Masivuye", "Cape Town");


        System.out.println("Salomi stays in: "+ mapNamewithCity.get("Salomi"));

        return mapNamewithCity;
    }

    public Collection<Integer> checkCollection(){

        Integer[] numbers = new Integer[]{1,2,3,4,5,6};
        Collection<Integer> myNumCollection = new LinkedHashSet<>();
        Collections.addAll(myNumCollection,numbers);
        //System.out.println(myNumCollection);
       // System.out.println("The collection contains: "+numbers.length+" values");

        return myNumCollection;
    }
    public static void main (String []args){
        Assignment1App app = new Assignment1App();
        app.animalList();
        app.colourSets();
        app.mapEmpNameWithEmpCity();
        app.checkCollection();
    }

}
