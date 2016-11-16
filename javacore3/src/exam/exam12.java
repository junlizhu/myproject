package exam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

public class exam12 {

	public void count() throws IOException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		double sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int aa = input.nextInt();
		System.out.println("请输入整数型最大范围：");
		int tt = input.nextInt();
		if (aa > 0 && tt > 0) {
			for (int i = 1; i <= tt; i++) {
				if (i % aa == 0) {
					list.add(i);
				}
			}
			System.out.println("这个集合为：");
			System.out.println(list);
			System.out.println("这个集合共含有"+list.size()+"个数");
			for (int j = 0; j < list.size(); j++) {
				sum = list.get(j) + sum;
			}
			System.out.println("集合中最小值是：");
			System.out.println(list.get(0));
			System.out.println("集合中最大值是：");
			System.out.println(list.get(list.size() - 1));
			System.out.println("集合中所有值的和是：");
			System.out.println(sum);
			System.out.println("集合中所有数的平均值是：");
			System.out.println(sum / list.size());
			File file=new File("D:\\Exam.txt");
			Writer writer=new FileWriter(file);
			writer.write("计算XX以内所有能被7整除的数的和以及平均数。\r\n");
			writer.write("输出从控制台读取的值，符合条件的数有几个？对符合条件的数，排序输出！和是多少，平均数是多少，最大值是多少，最小值是多少？\r\n");
			writer.write("首先能够被7整除的数，必定取7的余为0，所以利用取余方法加上for循环可以得到所有数。\r\n");
			writer.write("为了让整个程序更具灵活性，我们可以用两个变量来代替7和取余的最大范围。\r\n");
			writer.write("计算XX以内所有能被7整除的数的和以及平均数。\r\n");
			writer.write("定义一个成员方法进行计算并输出所需要的数值。\r\n");
			writer.write("在主方法里调用该方法。\r\n");
			writer.write("这个集合为:\r\n");
			writer.close();
			Writer writer1=new FileWriter(file,true);
			writer1.write(list+"\r\n");
			writer1.write("这个集合的个数为:\r\n");
			writer1.write(list.size()+"\r\n");
			writer1.write("集合中最大值为:\r\n");
			writer1.write(list.get(list.size() - 1)+"\r\n");
			writer1.write("集合中最小值为:\r\n");
			writer1.write(list.get(0)+"\r\n");
			writer1.write("集合中所有元素的和为:\r\n");
			writer1.write(sum+"\r\n");
			writer1.write("集合中所有元素的平均值为:\r\n");
			writer1.write(sum/list.size()+"\r\n");
			writer1.flush();
			writer1.close();

		} else {
			System.out.println("输入参数有误！");
		}
	}
	/*public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		
	}*/

}

