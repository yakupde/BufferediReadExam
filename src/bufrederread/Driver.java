package bufrederread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
	   File file=new File("C:\\Users\\stk22\\Desktop\\test.txt");
	        BufferedReader bufferedreader=null;
	        FileReader filereader=null;
	   
	    
	        
	        try {
	        	filereader=new FileReader(file);
	            bufferedreader=new BufferedReader(filereader);
	            String line=null;
	            
	            while ((line=bufferedreader.readLine())!=null) {
					System.out.println(line);;
					
				}
	            
	           
				
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
	        finally {
				if (bufferedreader!=null) {
					try {
						bufferedreader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (filereader!=null) {
					try {
						filereader.close();
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
					}
					
				}
			}
	       
	          
	        }

}
