package exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class exam11 {

	private static final Object List = null;

	private static OutputStream out;

	private static String sum;

	private int tt;

	private int aa;

	public exam11(int in1, int in2) {
	}

	
	public int getrange() {
		return tt;
	}

	
	public int getA() {
		return aa;
	}

	
	public void setMax(int range) {
		this.tt = range;
	}

	
	public void setA(int a) {
		this.aa = a;
	}

	public void exam1(int range, int a) {
		this.tt = range;
		this.aa = a;
	}

	private void count() throws IOException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		double sum = 0;
		if ((aa % 1) == 0 && aa > 0 && tt > 0) {
			for (int i = 0; i <= tt; i++) {
				if (i % aa == 0) {
					list.add(i);
				}

			}
			System.out.println("这个集合为：");
			System.out.println(list);
			for (int j = 0; j < list.size(); j++) {
				sum = list.get(j) + sum;
			}
			System.out.println("集合中最小值是：");
			System.out.println(list.get(0));
			System.out.println("集合中最大值是：");
			System.out.println(list.get(list.size() - 1));
			System.out.println("集合中所有数的平均值是：");
			File file=new File("D:\\Exam.txt");
			Writer writer=new FileWriter(file, true);

			System.out.println(sum / list.size());

		} else {
			System.out.println("输入参数有误！");
		}
	}

	public static void main(String[] args) throws IOException {
		File file = new File(
				"D:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "test2.txt");
		RandomAccessFile rafile = new RandomAccessFile(file, "rw");
		
		Writer writer = new FileWriter(file, true);
		writer.write("这是一个java上机题的文件： \r\n");
		writer.write("计算XX以内所有能被7整除的数的和以及平均数。\r\n");
		writer.write("符合条件的数有几个？对符合条件的数，排序输出！和是多少，平均数是多少，最大值是多少，最小值是多少？。\r\n");
            writer.flush();
         	writer.close();
		BufferedReader readTxt = new BufferedReader(new FileReader(file));
	
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int in1 = input.nextInt();
		System.out.println("请输入整数型最大范围：");
		int in2 = input.nextInt();
        exam11 pExam = new exam11(in1, in2);
		pExam.tt = in2;
		pExam.aa = in1;
		pExam.count();
		
		
	}

}
