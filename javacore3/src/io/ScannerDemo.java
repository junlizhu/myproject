package io;

import java.io.PrintStream;
import java.util.Scanner;


public class ScannerDemo {

	public static void main(String[] args) {
		PrintStream out = System.out;
		Scanner scanner = new Scanner(System.in); 
		int r ;
		double s ;
		double l;
		
		out.println("计算圆的面积需要一个半径的参数：");
		out.println("请输入一个数字：");
		if (scanner.hasNext()) {
			r=scanner.nextInt();
			s=3.14*r*r;
			l=2*3.14*r;
			
			out.println("圆的面积s等于：  " + s);
			out.println("圆的周长l等于：  " + 3.14*2*r);
		} else {

		}
		
	}

}
