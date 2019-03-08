package testappinterfacewithspring;

import createappwithinteface.SmallBusinesses;
import createappwithintefacespring.LoanInterest;
import createappwithintefacespring.config.AppConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static junit.framework.TestCase.assertEquals;

//I want to test how much the business will be charge using 15% of the amount loaned.

public class TestInterfaceClass {

    private LoanInterest busineses;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        busineses = (LoanInterest) ctx.getBean("busineses");

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void getInterest() throws Exception{
        //SmallBusinesses businesses = new SmallBusinesses("Salomi","mp123",800);

        double result=  busineses.getInterest();

        assertEquals("The business will be charged interest of 120.0", 120.0,result);

    }
     @Test
    public void getTotalAmountDueTest() throws Exception{
        double outPut = busineses.getTotalAmountDue();

        assertEquals("The total amount to be returned is 920.0",920.0,outPut);
    }



}
