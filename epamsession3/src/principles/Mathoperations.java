package principles;

//Calculator Program

import java.util.*;

public class Mathoperations {
	public static void Calculator(double first , double second, char op){
		double result = 0;
		switch(op){
          case '+':
              result = first + second;
              break;
          case '-':
              result = first - second;
              break;
          case '*':
              result = first * second;
              break;
          case '/':
              result = first / second;
              break;
          default:
              System.out.printf("Error! operator is not correct");
              break;
      }
		System.out.println(result);
	}
	
}
