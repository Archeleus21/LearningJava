public class Car 
{
	int maxSpeed = 100;  //whole numbers 
	int minSpeed = 0;
	double weight = 4079.00; //decimal numbers (float)
	
	boolean isTheCarOn = false;  //true/false or 0/1
	char condition = 'A';  //'a','b','c'
	
	//must be capital S in String
	String nameOfCar = "Sally";
	
	//prints car properties
	public void PrintVariables()
	{
		System.out.println("Max speed: " + maxSpeed);
		System.out.println("Min speed: " + minSpeed);
		System.out.println("Weight: " + weight);
		System.out.println("Is the car on: " + isTheCarOn);
		System.out.println("Car condition: " + condition);
		System.out.println("Name of car: " + nameOfCar);
	}
	
	public void WreckCar()
	{
		condition = 'C';
	}
	
	public void UpgradeMinSpeed()
	{
		minSpeed = maxSpeed;
		maxSpeed++;
	}
	
	public static void main(String[] args) 
	{
		//create instance of car
		Car familyCar = new Car();
		
		System.out.println("Family car.");
		familyCar.PrintVariables();
		
		//creating new instance based off the old one
		//Car aliceCar = familyCar;
		
		familyCar.UpgradeMinSpeed();
		familyCar.PrintVariables();
		
		//System.out.println("Alice's car.");
		//aliceCar.PrintVariables();
	}

}
