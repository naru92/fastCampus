package stream.reader;

import java.io.*;
import java.net.*;

public class FileCopy {
	
	public static void main(String[] args) throws IOException{
		
		long milliseconds = 0;
		
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			milliseconds = System.currentTimeMillis();
			
			int i;
			while (( i = fis.read()) != -1){
				fos.write(i);
			}
			
			milliseconds = System.currentTimeMillis() - milliseconds;
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		Socket socket = new Socket();
		BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		isr.readLine();
		
		System.out.println("�ð�: " + milliseconds );
				
	}
}
