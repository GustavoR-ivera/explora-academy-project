package businessLogic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import gui.Login;

public class DeleteCorrectAnswer {
	
	
	public static void removeLineFromFile(String lineToRemove) {
		 
	    try {
	    	String file = "questions.txt";

	        File inFile = new File(file + Login.id);
	 
	        if (!inFile.isFile()) {
	            System.out.println("no hay file");
	            return;
	        }
	 
	       
	        File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
	 
	        BufferedReader br = new BufferedReader(new FileReader(file + Login.id));
	        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
	 
	        String line = null;
	 
	    
	        while ((line = br.readLine()) != null) {
	 
	            if (!line.trim().equals(lineToRemove)) {
	 
	                pw.println(line);
	                pw.flush();
	            }
	        }
	        pw.close();
	        br.close();
	 
	   
	        if (!inFile.delete()) {
	            System.out.println("Could not delete file");
	            return;
	        }
	 
	       
	        if (!tempFile.renameTo(inFile)){
	            System.out.println("Could not rename file");
	 
	        }
	    } catch (FileNotFoundException ex) {
	        ex.printStackTrace();
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    }
	}

}