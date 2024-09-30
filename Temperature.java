import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		while(true) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Temperature :");
		
		int Temp=sc.nextInt();
		
		System.out.println("Choose the scale  \n  --> C for celsius \n  --> F for Fahrenheit \n  --> K for Kelvin \n");
		
		String scale=sc.next().toUpperCase();
		
		
		switch(scale) {
		
		case "C" :
			System.out.println("Fahrenheit :" +celsiustofarenheit(Temp));
			
			System.out.println("Kelvin  :" +celsiustokelvin(Temp));
			break;                                                                   
			
		case "F" :
            System.out.println("Celsius :" +fahrenheittocelsius(Temp));
			
			System.out.println("Kelvin  :" +fahrenheittokelvin(Temp));
			break;
		case "K" :
            System.out.println("Celsius :" +kelvintocelsius(Temp));
            
            System.out.println("Fahrenheit :" +kelvintofahrenheit(Temp));

			break;
			
		  default:
			  
	            System.out.println("*******Invalid key try to enter correct key ********");


			
		}
		
		System.out.println();
		}
	}
	public static double celsiustofarenheit(double celsius){
		return celsius* (9/5) + 32;	
	}
	public static double celsiustokelvin(double celsius){
		return celsius + 273.15;
	}
	public static double fahrenheittocelsius(double fahrenheit) {
		return (fahrenheit - 32) *5/9;
	}
	public static double fahrenheittokelvin(double fahrenheit) {
		return (fahrenheit - 32) *5/9 + 273.15;

	}
	public static double kelvintocelsius(double kelvin) {
		return kelvin - 273.15;
	}
	public static double kelvintofahrenheit(double kelvin) {
		return (kelvin-  273.15) * 9/5 + 32;
  }
}
