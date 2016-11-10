package javacore3;

import java.util.Scanner;

public class YiYuAN {
	public static void main(String[] args){

        System.out.println("请输入a,b,c的值：");

        Scanner m = new Scanner(System.in);//标准输入  在Scanner申明一个对象

        double a = m.nextDouble();//nextDouble() 方法输入数字赋值给a

        double b = m.nextDouble();//nextDouble() 方法输入数字赋值给b

        double c = m.nextDouble();//nextDouble() 方法输入数字赋值给c

        double x1,x2,t;

        t = b * b - 4 * a * c;
        System.out.println("t=:" + t);

        System.out.println("方程" + a + "x^2+" + b + "x+" + c + " = 0的解：");
        if(t < 0){

            System.out.println("t < 0,则此方程无解");

        }else{

            x1 = ((-b)+Math.pow(t,1/2))/(2*a);//Math.pow(x,y)这个函数是求t的（1/2）次方/（2a）
            System.out.println("x1=:" + x1 );

            x2 = ((-b)-Math.pow(t,1/2))/(2*a);
            System.out.println("x2=:" + x2 );
        }
}
}




