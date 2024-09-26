import org.example.Main;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import static org.junit.Assert.assertEquals;

public class testCalc {

    @BeforeClass
    public static void start() {
        System.out.println("Start");
    }
    @Test
    public void empty(){
        assertEquals(0, Main.Add(""));
    }
    @Test
    public void singleNumber(){
        assertEquals(9, Main.Add("9"));
    }
    @Test
    public void twonumbers(){
        assertEquals(7, Main.Add("5,2"));
    }
    @Test
    public void numbersinlines(){
        assertEquals(8, Main.Add("3,2\n3"));
        assertEquals(10, Main.Add("1\n2,3,4"));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumbers(){
        Main.Add("1,-2,3");
    }

    @Test
    public void testAddWithMultipleNumbersIncludingBiggerThan1000() {
        assertEquals(1006, Main.Add("1000,2,3000,4"));
    }
    @AfterClass
    public static void end(){
        System.out.println("End");
    }

}
