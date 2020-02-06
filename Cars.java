import java.util.Scanner;
class MyCar{
	public void RollsRoyce() {
		System.out.println("    THIS IS ROLLS ROYCE.PVT AUTOMOBILE");
	}
}

//INHERITANCE

class MyCaar extends MyCar{
	public void RollsRoyce() {
		System.out.println("MODEL             : GHOST");
	}
}

//POLYMORPHISM

class Poly{
public	int CostDisplay(int price) {
	return 	(int) (price+price*0.1);  //APPROX IS 10%
	}
public	double CostDisplay(double price) {
	return 	(double) (price+price*0.15);  //ACCURATE IS 15%
	}
}

//ENCAPSULATION

class Engine{
	public static String EngModel;
	public static String getName() {
		return EngModel;
	}
public static void setName(String name) {
	EngModel = name;
}
}

//Abstraction
abstract class Mileage{
	public abstract void Mil();
}

class ONROAD extends Mileage{
	public void Mil() {
		System.out.println("ON ROAD VARIENT MILEAGE IS: 15L");
	}
	
}

class OFFROAD extends Mileage{
	public void Mil() {
		System.out.println("OFFROAD VARIENT MILEAGE IS: 12L");		
	}
	
}

public class Cars {
	public static void main(String[] args) {
		MyCar mc = new MyCar();
		mc.RollsRoyce();
		MyCar mcc = new MyCaar();
		mcc.RollsRoyce();
		Poly p = new Poly();
		Engine.setName("V-16 TURBO CHARGE");
		System.out.println("ENGINE VERSION    : "+Engine.getName());
		Scanner myObj = new Scanner(System.in);  // Creating a Scanner object
	    System.out.println("PLEASE ENTER TYPE OF VEHICLE : 1.ON ROAD  2.OFFROAD  ");
	    System.out.println("ENTER EITHER 1 or 2");
	    System.out.print("INPUT:");
	    String roadtype = myObj.nextLine();  // Read my input
	    
	    if(roadtype.equals("1")) {
	    	Mileage m = new ONROAD();
	    	m.Mil();
	    }
	    else if(roadtype.equals("2")){
	    	Mileage m = new OFFROAD();
	    	m.Mil();
	    }
	    else
	    {
	    	System.out.println("SORRY PLEASE CHECK THE INPUT YOU HAVE ENTERED");
	    }
		System.out.println("EX-SHOWROOM PRICE : "+p.CostDisplay(700000));
		System.out.println("ON-ROAD PRICE     : "+p.CostDisplay(700000.59));
		System.out.println("PLEASE ENTER THE COUNTRY: 1");
		String country = myObj.nextLine();
		if(country.equalsIgnoreCase("INDIA")||country.equalsIgnoreCase("U.S.A")||country.equalsIgnoreCase("U.K")
				||country.equalsIgnoreCase("U.A.E")||country.equalsIgnoreCase("CHINA")) {
	    	System.out.println("CONGRATS!! AVAIALBLE IN YOUR COUNTRY");
	    }
	    else
	    {
	    	System.out.println("SORRY!! YOU NEED FOR UNTIL ITS RELEASED IN YOUR COUNTRY ");
	    }
	}
}
