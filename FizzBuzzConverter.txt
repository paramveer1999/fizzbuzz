package fizzbuzz;

public class FizzBuzzConverter {



    public String convert(int value) {


        if(value%3==0&&value%5==0){
            return "FizzBuzz";
        }

        if(value%5==0||check1(value)){
            return "Buzz";
        }

        if(value%3==0||check2(value)){
            return "Fizz";
        }

        return String.valueOf(value);
    }
	public boolean check1(int value)
	{
		int temp=value;
		while(temp!=0)
		{
			int rem=temp%10;
			temp/=10;
			if(rem==5) {return true;}
		}
		return false;
	}
	public boolean check2(int value)
	{
		int temp=value;
		while(temp!=0)
		{
			int rem=temp%10;
			temp/=10;
			if(rem==3) {return true;}
		}
		return false;
	}
	
}