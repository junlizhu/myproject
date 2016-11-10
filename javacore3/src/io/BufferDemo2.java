package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;

public class BufferDemo2 {

	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		File src = new File(
				"E:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "test.wmv");
		
		File dest = new File(
				"E:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "test38.wmv");
		
		FileInputStream in = new FileInputStream(src);
		//Reader in = new FileReader(src );
		//BufferedReader bReader = new BufferedReader(in);
		BufferedInputStream bInputStream = new BufferedInputStream(in);
		
		FileOutputStream out1 = new FileOutputStream(dest);
		//Writer writer = new FileWriter(dest);
		//BufferedWriter bWriter = new BufferedWriter(writer);
		BufferedOutputStream bOutputStream = new BufferedOutputStream(out1);
		
		/*InputStream is = null;
		try {
			is = new FileInputStream(src);
			//byte[] b =new byte[128];
			byte[] b =new byte[(int)src.length()];	//使用文件的长度去创建一个数组
			is.read(b);
			is.close();*/
		
		
		
		
		
		String tmp = bInputStream.toString();
		//String tmp = bReader.readLine();
		while (tmp != null) {
			bOutputStream.toString();
			//bWriter.write(tmp);
			//bWriter.newLine();
			bOutputStream.toString();
			tmp = bOutputStream.toString();
			//tmp = bReader.readLine();
			
		}
		bOutputStream.close();
		bInputStream.close();
		in.close();
		out1.close();
		//bReader.close();
		//in.close();
	    //bWriter.close();
		//writer.close();
		out.println("文件复制完成：");
	}

}
