package businessLogic;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import data.Question;


/**
 * @author Gustavo Rivera
 *
 *
 */
public class ReadingQuestions {
	
	private String fileName;
	private ArrayList<Question> geometryQuestions;
	private ArrayList<Question> scienceQuestions;
	private ArrayList<Question> artQuestions;
	private ArrayList<Question> biologyQuestions;
	


	public ReadingQuestions(String fileName) {
		this.fileName = fileName;
		this.geometryQuestions = new ArrayList<Question>();
		this.scienceQuestions = new ArrayList<Question>();
		this.artQuestions = new ArrayList<Question>();
		this.biologyQuestions = new ArrayList<Question>();

	
	}

	public void readingRecords() {
		File inFile = new File(this.fileName);
		try {
			Scanner sc = new Scanner(inFile);
			readItem(sc);
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Archivo inexistente -- " + this.fileName);
			System.exit(0);
		}
	}

	private void readItem(Scanner sc) {
		while(sc.hasNext()) {
			String line = sc.nextLine();
			processLine(line);
		}
	}

	private void processLine(String line) {
		
		Scanner sc = new Scanner(line);
		sc.useDelimiter(",");
		Question q = null;
		String category = sc.next().trim().toLowerCase();
		int level = Integer.parseInt(sc.next().trim());
		String statement = sc.next().trim();
		String opA = sc.next().trim();
		String opB = sc.next().trim();
		String opC = sc.next().trim();
		String opD = sc.next().trim();
		String answer = sc.next().trim();
		
		/*------------------------------------------------*/
		switch(category) {
		case "geometry":
			q = new Question(level, statement, opA,opB,opC,opD,answer);
			this.geometryQuestions.add(q);
	
			break;

		case "art":
			
			q = new Question(level, statement, opA,opB,opC,opD,answer);
			this.artQuestions.add(q);
			
			break;

		case "science":
			
			q = new Question(level, statement, opA,opB,opC,opD,answer);
			this.scienceQuestions.add(q);
			
			break;
		
		case "biology":
			
			q = new Question(level,statement, opA,opB,opC,opD,answer);
			this.biologyQuestions.add(q);
			
			break;

		default:
			System.out.println("Categoria de objeto desconocida -- " + category);
		}
		sc.close();
	}

	

	
	public ArrayList<Question> getScienceQuestions() {
		return scienceQuestions;
	}
	
	public ArrayList<Question> getBiologyQuestions() {
		return biologyQuestions;
	}
	public ArrayList<Question> getArtQuestions() {
		return artQuestions;
	}
	
	public ArrayList<Question> getGeometryQuestions() {
		return geometryQuestions;
	}

	
	
	
}

