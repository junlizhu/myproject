package javacore3;


public class Tringle {
	 public  Tringle(){
   	  for (int i = 1; i < 5; i++) {
   		  for (int j = 1; j < i-1; j++) {
   			  System.out.println(" ");
   			  for (int k = 1; k <=2*i-1; k++) {
   				System.out.print("*");
			}
   			System.out.println("");
		}
	}
     }
	public static void main(String[] args) {
	}
}
