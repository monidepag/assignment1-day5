import java.util.Scanner;

interface AdvancedArithmetic {
	
	int divisor_sum(int n);

}

class MyCalculator implements AdvancedArithmetic{
	
	public int divisor_sum(int n) {
		int s =0;
		for(int i=1;i<=n;i++)
			if(n%i==0)
				s+=i;
		return s;
	}

}

public class testerCalculator {
    public static void main(String[] args) {

		MyCalculator m = new MyCalculator();
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
		if(n>1000)
		System.out.println("The number is greater than 1000");
		else
		System.out.println("The sum of the divisors of " + n + " is " + m.divisor_sum(n));

	}
}
