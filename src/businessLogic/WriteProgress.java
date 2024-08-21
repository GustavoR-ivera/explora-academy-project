package businessLogic;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Collections;

import data.Question;
import gui.Login;

/**
 * @author griverab
 *
 */
public class WriteProgress {
	
	public static String user_file;
	public static String curr_id;
	
	public WriteProgress() {
		
		}
	
	public void writing() {
		/*creamos un objeto de tipo readingQuestions para que cree las listas con preguntas 
		 * de cada categoria*/
		ReadingQuestions r = new ReadingQuestions("questions.txt");
		r.readingRecords();
		
		  try {
			  
			
			curr_id = String.valueOf(Login.id); 
			user_file = "questions.txt";
	        Path fuente = Paths.get(user_file);
	        Path destino = Paths.get(user_file + curr_id);
	            
	        Files.copy(fuente, destino, StandardCopyOption.COPY_ATTRIBUTES);
	        
	        
	        } catch (IOException e) {
	            System.err.println("Error -> " + e.getMessage());
	        }
		
	
	}
}