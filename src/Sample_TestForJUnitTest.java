import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Sample_TestForJUnitTest {
    @Test
    public void twoPlusTwoEqualsfour(){
        var a=new Sample_classForJUnitTest();
        assertEquals(0,a.add(2,2));
    }

    @Test
    public void threePlus3Equals6(){
        var a=new Sample_classForJUnitTest();
        assertEquals(6,a.add(3,3));
    }

    @Test
    public void negativeThreeplusfiveEqualsTwo(){
        var a=new Sample_classForJUnitTest();
        assertTrue(a.add(-3,5)==2);
    }

    @Test
}