package businessLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import gui.Login;


public class LookForProgress {
	
	
	
	
	public String user_file;
	public String curr_id;
	
	public void Read() throws FileNotFoundException, IOException{
		
		curr_id = String.valueOf(Login.id); 
		user_file = "questions.txt";
		
		File r = new File(user_file + curr_id);
		FileReader fr = new FileReader(r);
		System.out.print("Progress found, loading...");
		//r.readingRecords();
	}
	public void LookFor() {
	
		
		
		
		try {
			Read();
		}
		catch(FileNotFoundException ex){
			System.out.println("No progress found, creating new progress...");
			WriteProgress w = new WriteProgress();
			w.writing();
			
		}
		catch(IOException e) {
			System.out.println("No");
		}
		
		
	}

}


