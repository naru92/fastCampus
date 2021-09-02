package stream.inputstream;

import java.io.*;

public class FileInputTest1 {
	public static void main(String[] args) {
		
		
		
		try (FileInputStream fis =  new FileInputStream("input.txt");) {
			
			int i;
			while((i = fis.read()) != -1){
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
		
		}
		System.out.println("end");
		
		
	}
}
