package ac.za.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.*;

public class Assigment1Test {

    private Assignment1App assignlist;
    @Before
    public void setUp(){

        assignlist = new Assignment1App();
    }
    @After
    public void tearDown(){

    }

@Test
    public void testAnimalList(){

    List animal = assignlist.animalList();

    assertEquals("Number of elements in the array are 5",4,animal.size());

}
@Test
    public void testSetList() {

    Set mySet2 = assignlist.colourSets();

    assertFalse(mySet2.contains("green"));

}
@Test
    public void testMaps(){

    Map mapNamewithCity =  assignlist.mapEmpNameWithEmpCity();


    assertEquals("Salomi stays in Stellenbosch ","Stellenbosch", mapNamewithCity.get("Salomi"));
}
@Test
    public void testCollection(){
    Collection<Integer> myNumCollection = assignlist.checkCollection();

    assertEquals("The size of this collection is 6. ",6,myNumCollection.size());

  }

}
