public class Car 
{
		
	int maxSpeed = 100;  //whole numbers 
	int minSpeed = 0;
	double weight = 4079.00; //decimal numbers (float)
	
	boolean isTheCarOn = false;  //true/false or 0/1
	char condition = 'A';  //'a','b','c'
	
	//must be capital S in String
	String nameOfCar = "Sally";
	
	//initialize data types
	double maxFuel = 16;
	double currentFuel = 8;
	double mpg = 26.4;
	
	int numberOfPeopleInCar = 1;
	int maxNumberOfPeopleInCar = 6;
	
	//default constructor
	public Car()
	{
		
	}
	
	//creating a constructor
	public Car(int customMaxSpeed, double customWeight, boolean customIsCarOn)
	{
		//change max speed to the one set as a parameter
		maxSpeed = customMaxSpeed;
		weight = customWeight;
		isTheCarOn = customIsCarOn;
	}
	
	//--------------------------------------------------------
	//Getters and Setters
	//--------------------------------------------------------
	public int getMaxSpeed()
	{
		//'this' means this specific object
		return this.maxSpeed;
	}
	
	//takes a parameter used to set the maxSpeed
	public void setMaxSpeed(int newMaxSpeed)
	{
		this.maxSpeed =  newMaxSpeed;
	}
	
	public int getMinSpeed()
	{
		//'this' means this specific object
		return this.minSpeed;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public boolean getIsTheCarOn()
	{
		return this.isTheCarOn;
	}
	
	//--------------------------------------------------------
	//--------------------------------------------------------
	
	//prints car properties
	public void PrintVariables()
	{
		System.out.println("Max speed: " + maxSpeed);
		System.out.println("Min speed: " + minSpeed);
		System.out.println("Weight: " + weight);
		System.out.println("Is the car on: " + isTheCarOn);
		System.out.println("Car condition: " + condition);
		System.out.println("Name of car: " + nameOfCar);
		System.out.println("Number of people in car: " + numberOfPeopleInCar);
	}
	
	//reduce condition of car
	public void WreckCar()
	{
		condition = 'C';
	}
	
	//increase max speed 
	public void UpgradeMaxSpeed()
	{
		//gets the maxspeed from the getter and adds 10
		setMaxSpeed(getMaxSpeed() + 10);
	}
	
	//adds number of passenger
	public void GetIn()
	{
		//checks if car is full
		if(numberOfPeopleInCar < maxNumberOfPeopleInCar)
		{
			numberOfPeopleInCar++;
			System.out.println("Someone got into the car!" + numberOfPeopleInCar);
		}
		else
		{
			System.out.println("The Car is full!" + numberOfPeopleInCar);
		}
	}
	
	//subtracts number of passengers
	public void GetOut()
	{
		//checks if car is empty
		if(numberOfPeopleInCar > 0)
		{
			numberOfPeopleInCar--;
			System.out.println("Someone got out of the car!");
		}
		else
		{
			System.out.println("The Car is Empty!");
		}
	}
	
	//returns miles left of remaining gas
	public double MilesLeftOfGas()
	{
		return currentFuel * mpg;
	}
	
	//returns total range of miles per tank
	public double GasRange() 
	{
		return maxFuel * mpg;
	}
	
	public void TurnCarOn()
	{
		
		//checks if car is off
		if(!isTheCarOn)
		{
			isTheCarOn = true;
			System.out.println("The Car was started!");
		}
		else
		{
			System.out.println("Car is already on!");
		}
	}
	
	public static void main(String[] args) 
	{
		Car tommyCar = new Car();
		tommyCar.GetOut();
		tommyCar.GetOut();
		tommyCar.GetIn();
		tommyCar.GetIn();
		tommyCar.GetIn();
		tommyCar.GetIn();
		tommyCar.GetIn();
		tommyCar.GetIn();
		tommyCar.GetIn();
		tommyCar.TurnCarOn();
		tommyCar.TurnCarOn();
		
		
		/*
		//create instance new car
		System.out.println("Birthday Present V1: ");
		Car bdayPresent = new Car(500, 5000.45, true);  //10 is min speed parameter
		bdayPresent.PrintVariables();
		bdayPresent.GetIn();
		bdayPresent.GetIn();
		bdayPresent.GetIn();
		System.out.println("Miles Left: " + bdayPresent.MilesLeftOfGas());
		System.out.println("Max Miles: " + bdayPresent.GasRange());
		
		System.out.println("Birthday Present V2: ");
		bdayPresent.PrintVariables();
		
		bdayPresent.GetOut();
		System.out.println("Birthday Present V3: ");
		bdayPresent.PrintVariables();
		*/
		
		/*
		//create another instance of car
		System.out.println("Christmas Present: ");
		Car xmasPresent = new Car(550, 2000, false);
		xmasPresent.PrintVariables();
		*/
		
		/*
		//create instance of car
		Car familyCar = new Car();
		
		//print out car properties
		System.out.println("Family car.");
		familyCar.PrintVariables();
		
		//creating new instance based off the old one
		//Car aliceCar = familyCar;
		
		//upgrade car
		familyCar.UpgradeMinSpeed();
		//print car changed properties
		familyCar.PrintVariables();
		
		//System.out.println("Alice's car.");
		//aliceCar.PrintVariables();
		*/
	}

}