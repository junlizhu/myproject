package javacore3;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要打印等腰三角形的行数：");
		
		int x = input.nextInt();
		
		Triangle a = new Triangle();
		System.out.println(a.toString());
		Triangle b = new Triangle();
		System.out.println(b.toString());
		Triangle c = new Triangle();
		System.out.println(c.toString());
		Triangle d = new Triangle();
		System.out.println(d.toString());
		}

}
