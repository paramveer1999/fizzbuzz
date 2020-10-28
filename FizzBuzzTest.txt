import org.junit.Assert;
import fizzbuzz.FizzBuzzConverter;
import org.junit.Test;

public class FizzBuzzTest {
	


    
    @Test
    public void function(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals("5", fizzBuzz.convert(5));
        

    }
}