import java.util.Scanner;
public class PROJECT_AIRLINE {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int weight,choice,extra = 0,extracharge = 0;
		String name,boarding = null,travel = null;
		System.out.println("Enter Your Name:");
		name=s.next();
		System.out.println("Enter Travel Class:\n");
		System.out.println("1.Economy.\n2.Business.\n3.First.");
		choice=s.nextInt();
		System.out.println("Enter Baggage Weight (in kg):");
		weight=s.nextInt();
		if (choice==1)
		{
			boarding="Gate E1";
			travel="Economy";
			System.out.println("Your Free Baggage Limit Is 15kg.");
            if (weight>15)
            {
            	extra=weight-15;
            	extracharge=extra*500;
            }
            System.out.println("Your Boarding Gate Is E1.");
		}
		else if (choice==2)
		{
			boarding="Gate B2";
			travel="Business";
			System.out.println("Your Free Baggage Limit Is 25kg.");
            if (weight>25)
            {
            	extra=weight-25;
            	extracharge=extra*300;
            }
            System.out.println("Your Boarding Gate Is B2.");
		}
		else if (choice==3)
		{
			boarding="Gate F1";
			travel="First";
			System.out.println("Your Free Baggage Limit Is 35kg.");
            if (weight>35)
            {
            	extra=weight-35;
            	extracharge=extra*200;
            }
            System.out.println("Your Boarding Gate Is F1.");
		}
		else
		{
			System.out.println("Invalid Choice.");
		}
		System.out.println("------------------------------------------------");
		System.out.println("                     Summary                    ");
		System.out.println("------------------------------------------------\n");
		System.out.println("Passenger Name:"+name);
		System.out.println("Travel Class:"+travel);
		System.out.println("Total Baggage (kg):"+weight);
		System.out.println("Extra Baggage (kg)"+extra);
		System.out.println("Extra Charge on Baggage:"+extracharge);
		System.out.println("Boarding Gate:"+boarding);
		System.out.println("------------------------------------------------");
		System.out.println("                     Thank You                  ");
		System.out.println("------------------------------------------------");
	}

}
