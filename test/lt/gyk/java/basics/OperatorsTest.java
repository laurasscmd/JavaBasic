package lt.gyk.java.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperatorsTest {
    //private final Operators operators= new Operators();
    @Test
    public void will_cech_if_triangle_equilateral (){

        String expected = "Triangle is Equilateral. Sides: " + 5 + " " + 5 + " " + 5;

        String actual=Operators.trianglecheck(5,5,5);

        Assertions.assertEquals(expected, actual);
    }


}
