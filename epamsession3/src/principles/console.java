package principles;

//implementation of Layered Architecture using SOLID KISS DRY and YAGIN


import java.util.Scanner;

public class console {   
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		Mathoperations m = new Mathoperations(); 
      System.out.print("Enter two numbers: ");
      double first = reader.nextDouble();
      double second = reader.nextDouble();
      System.out.print("Enter an operator (+, -, *, /): ");
      char op = reader.next().charAt(0);
      m.Calculator(first,second,op);
  
	}

}
