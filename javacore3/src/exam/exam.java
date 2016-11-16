package exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;


public class exam {

	public static void main(String[] args) throws IOException {
		File file = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "test1.txt");
		Writer writer = new FileWriter(file, true);
		writer.write("这是一个java上机题的文件： \r\n");
		writer.write("计算XX以内所有能被7整除的数的和以及平均数。\r\n");
		writer.write("得到答案后，将答案转换成字符串重新写入文件\r\n");
		writer.write("\r\n");
		writer.write("得到的答案是：");
		writer.close();
		
	
			BufferedReader readTxt = new BufferedReader(new FileReader(file));
			
		
		int sum = 0;
		PrintStream out = System.out;
		Scanner scanner = new Scanner(System.in);
		int a, b;
		out.println("请输入变量a：");
		a = scanner.nextInt();

		out.println("请输入最大范围数b：");
		b = scanner.nextInt();

		ArrayList<Integer> so = new ArrayList<Integer>();

		for (int i = a; i <= b; i++) {
			if (i % a == 0) {
				so.add(i);
			}

		}
		out.println(so);
		for (int j = 0; j < so.size(); j++) {
			sum = sum + so.get(j);
		}
		out.println("这个集合和为：");
		out.println(sum);
		out.println("这个集合中的最小值为：");
		out.println(so.get(0));
		out.println("这个集合中的最大值为：");
		out.println(so.get(so.size() - 1));
		out.println("这个集合的平均值为：");
		out.println(sum / so.size());
		
		}}
