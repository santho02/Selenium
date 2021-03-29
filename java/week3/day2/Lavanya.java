package week3.day2;

public class Lavanya {

	public static void main(String[] args) {
    
		//eg:Car->Name,Colour,Price,Model,SerialNo=6
		
		String abc="Lavanya";
		String colour="RED";
		long price= 8947937;
		String model="Honda city 007";
		//int serialNo=6;
		
		
		public void serialNo(int serial){
			System.out.println("The serial no of the car is "+serial);
		}
		
		//TO get directly with typing the s.o.p, we can use Ctrl+space just type the "Syso" 
		System.out.println("My name is "+abc);//+ in the sense it will add r join the string in to one variable. 
		System.out.println("My fav colour is "+colour);
		System.out.println("The price of the car is "+price);
		System.out.println("Model is "+model);
		//System.out.println("The serial no of the car is "+serialNo);
						
		/*
		 * We used to run the code in Eclipse.
		 * Always endup with semicolon;
		 * Access modifiers-4
		 * 1.Public--Anyone can access
		 * 2.Private--Only u can access r within the class
		 * 3.Protected--same as private/ ur data will be protected
		 * 4.Default/Package--If u not mentioned any modifiers to the class it will assign the class as a Default
		 * 
		 * 
		 * Data Types:It is used to declare the varibles with 
		 * the help of data types before use it in program
		 * eg:Car->Name,Colour,Parts,Price,Model,SerialNo
		 * There are two data types:
		 * 1.Primitive: 8 types
		 * -int-->For numbers within 32 bit
		 * -char--> represent in single quotes 'D'
		 * -float-->For decimal points like 2.34,In C program the compiler doesn't understand whether it is a float r double so we have to use f in the last of the number.
		 * -long-->it has high priority then Interger,bcou the size of the bit is 64.eg: long 8927598257
		 * -short-->Mostly we dont use it. Same like a interger but it may contains only one value to assign the varibles.
		 * -Byte-->---------Not used in the program------------------.
		 * -boolean-->If the statement may get statements may execute corrtly then it will return "true".If it may fail then it will return "false".
		 * -double-->It is same as the float but more then 2 r 3 values after the decimal then we can use double to assign the varibles.
		 * int a=15;
		 * printf("%d",a);
		 * 
		 * float a=2.34908340876;//More then 2 number after the decimal point then it will consider as "Double".
		 * printf("%0.2f",a);
		 * 
		 * 2.Non-Primitive:3 types because these data types are called as Class.
		 * -String--->We used a string for Name r sentance.more then 1 character. For declare the variables we have to use double quotes Sting a="Lavanya is a monkey";
		 * -Array-->It is a collection of datatypes r set of datatypes.In array the index is always starts with '0'. There are two types of array=Single and multi-dimensional array.
		 * To represent the array we have to use eg:[] Square bracket and to store the variables inside the flower bracket. int a[]={1,2,3,4};
		 * -classes-->
		 *  public void getName(String name){-->These is the way to create the method
		 *  s.o.p(name);//
		 *  }While we declare the method we dont use the semicolon.
		 *  
		 *  
		 *  String is a class r it is a sequence of characters.
		 *  
		 *  object-->It has a state and behavior and also identity.
		 *  
		 *  class-->A class is blue print which includes all your data.It contains variables and methods.
		 *  
		 *  how to create an object for the class?
		 *  Using "new" Keyword to create an object.
		 * => Syntax for object creation:
		 * -> Classname variablename = new Classname();  
		 * -->Lavanya santhosh = new Lavanya();   (important)
		 *  ()->It represents Constructor.
		 *  constructor has no return type.Which means it doesnt return any value.
		 *  We have to achieve using object creation.
		 *  
		 *  
		 *  + is used to add two values r string.It is also known as Concat
		 *  
		 *  To pronounce u have to say nan variable assign pana "ab" nu kudu thu irukan.
		 *
		 *Create a "Project"
		 *inside the project u have the "package"
		 *inside the project u have the "class"
		 *
		 *To create this all u have to go to the project then right click then new there u see the option to the pacakage same as like 
		 *package to create the class to right click on the packaghe then go to the class
		 *there u have to fill it in CamelCase for "Project" then for lowercase - Packaga, Camelcase-class.
		 *In camelcase the first letter r the first word is always starts with capitial letter.
		 *
		 */
		
		
	}

}
