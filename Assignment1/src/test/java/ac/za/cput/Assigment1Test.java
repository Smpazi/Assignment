package ac.za.cput;

import org.junit.Test;
import java.util.*;

import static junit.framework.TestCase.*;

public class Assigment1Test {


@Test
    public void testAnimalList(){

    List animal = new ArrayList();
    animal.add("Horse");
    animal.add("Sheep");
    animal.add("Cat");
    animal.add("Dog");
    animal.add("Mouse");

    assertEquals("Number of elements in the array are 5",5,animal.size());
    animal.remove(3);
    assertEquals("Number of elements in the array are 4",4,animal.size());
}
@Test
    public void testSetList() {
    Set colour = new HashSet();
    colour.add("Navy");
    colour.add("Black");
    colour.add("Yellow");
    colour.add("Orange");

    List secondColour = new ArrayList();
    secondColour.add("Maroon");
    secondColour.add("Blue");
    secondColour.add("Grey");
    secondColour.add("Green");
    secondColour.add("Red");
    secondColour.add("Brown");
    // Now create the set using the appropriate constructor
    Set mySet2 = new HashSet(secondColour);

    // Compare the two sets
   // System.out.println("colour matches secondColour: " + colour.equals(mySet2));
    assertFalse(colour.equals(mySet2));
}
@Test
    public void testMaps(){

    Map mapNamewithCity = new HashMap();
    mapNamewithCity.put("Salomi", "Stellenbosch");
    mapNamewithCity.put("Thandiswa", "Cape Town");
    mapNamewithCity.put("Ziyanda", "Gugulethu");
    mapNamewithCity.put("Masivuye", "Cape Town");

    assertEquals("Salomi stays in: ","Stellenbosch", mapNamewithCity.get("Salomi"));
}
@Test
    public void testCollection(){
    Integer[] numbers = new Integer[]{1,2,3,4,5,6};
    Collection<Integer> myNumCollection = new LinkedHashSet<>();
    Collections.addAll(myNumCollection,numbers);


    assertEquals("The size of this collection is 6. ",6,numbers.length);

}

}
