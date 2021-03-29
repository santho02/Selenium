package week3.day2;

public class Lavanya_1 {

	
	//eg:Car->Name,Colour,Price,Model,SerialNo=6
     //Today learnings are how to create a method. 
	//how to implement the method using object creations.
	//what is the class and what is the string.
	//how to declare the variables inside the constructor.
	//how to pass the value in the constructor call it in the main method.
	public String getName(String ab) {
		System.out.println("My name is "+ab);
		return "0";
	}
	
	public char getColour(char ab) {
		System.out.println("The colour is "+ab);
		return 'a';
	}
	public void getPrice(long ab) {   //void has no return types if u try to give the return value it may throw an error.
		System.out.println("The price of the car is "+ab);
	}
	public void getModel(float ab) {
		System.out.println("The model of the car "+ab);
	}
	public void getSerialNo(int ab) {
     System.out.println("The serial number for the car is "+ab);		
	}
	
	
	public static void main(String[] args) {
    Lavanya_1 abc =new Lavanya_1();  //object creation syntax
    abc.getName("Lavanya");
    abc.getColour('D');
    abc.getPrice(100000000);
    abc.getModel(15.13f);
    abc.getSerialNo(123);
	}

}
//if,else --> conditional statement
//for loop 
//while, do-while
//for each