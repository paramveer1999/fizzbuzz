import org.junit.Assert;
import fizzbuzz.FizzBuzzConverter;
import org.junit.Test;

public class FizzBuzzTest {
	


    
    @Test
    public void function(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("5", fizzBuzz.convert(5));
        

    }
	@Test
    public void function1(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("7", fizzBuzz.convert(7));
        

    }
}