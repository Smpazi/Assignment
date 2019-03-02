package testappinterface;

import createappwithinteface.SmallBusinesses;
import org.junit.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static junit.framework.TestCase.assertEquals;

//I want to test how much the business will be charge using 15% of the amount loaned.

public class TestInterfaceClass {
    @Test
    public void getInterest(){
        SmallBusinesses businesses = new SmallBusinesses("Salomi","mp123",800);

        double results = businesses.getInterest();

        assertEquals("The business will be charged interest of 120.0", 120.0,results);

    }


}
