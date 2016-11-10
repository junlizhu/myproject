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

public class BufferDemo {

	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		File src = new File(
				"E:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "test.wmv");

		File dest = new File(
				"E:" + File.separator + "fileDemo" + File.separator + "Test" + File.separator + "test39.wmv");

		FileInputStream in = new FileInputStream(src);
		BufferedInputStream bInputStream = new BufferedInputStream(in);

		FileOutputStream out1 = new FileOutputStream(dest);
		BufferedOutputStream bOutputStream = new BufferedOutputStream(out1);

		
		byte[] b =new byte[600];
		//byte[] b =new byte[(int)src.length()];
		while (bInputStream.read(b) != -1) {
			
			bOutputStream.write(b);
			bInputStream.read(b);
			bOutputStream.write(b);
			
		}
		bInputStream.close();
		bOutputStream.close();
		out.println("文件复制完成：");

	}
}
		
	
	


