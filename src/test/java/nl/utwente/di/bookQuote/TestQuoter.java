package nl.utwente.di.bookQuote;

import nl.utwente.di.CalcTemp.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test ;

import java.util.HashMap;

/***Tests the Quoter*/
public class TestQuoter {

    @Test
    public void testCalc1 ( ) throws Exception {
        Calculator calculator = new Calculator () ;
        double price = calculator.getResult ("1") ;
        Assertions.assertEquals (33.8 ,price, 0.0 , "F of C 1") ;
    }
}
