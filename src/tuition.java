import java.util.Scanner;
public class tuition 
{
	public static double calculateTuition(double initial, double percentage)
	{
		double total=0;
		double newVal=initial;
		for(int i = 0; i<4; i++)
		{
			if(i==0)
			{
				total+=initial;
			}
			else
			{
				
				newVal+=(newVal*percentage);
				total+=newVal;
			}
		}
		return total;
	}

	public static void main(String[] args) 
	{
		double tuition;
		double increase;
		double cost;
		Scanner a = new Scanner(System.in);
		System.out.println("What is the initial cost of tuition?");
		tuition=a.nextDouble();
		System.out.println("What is the yearly percentage increase in tuition? (In Decimal Representation)");
		increase=a.nextDouble();
		cost=calculateTuition(tuition,increase);
		System.out.printf("The total cost of tuition is $%.2f",cost);
		

	}

}
