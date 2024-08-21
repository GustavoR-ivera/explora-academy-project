package businessLogic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;

import data.Question;
import gui.Login;

/**
 * @author griverab
 *
 */
public class WritingQuestions {
	
	private String file;
	
	public WritingQuestions() {
		
		}
	
	public void writing() {
		/*creamos un objeto de tipo readingQuestions para que cree las listas con preguntas 
		 * de cada categoria*/
		
		file = "questions.txt";
		
		//System.out.println(file);
		//System.out.println(Login.id);
		//System.out.println(file + Login.id);
		ReadingQuestions r = new ReadingQuestions(file);
		
		r.readingRecords();

		/*una vez tengamos las listas con preguntas de cada categoria se las enviamos
		 * al clasificador de preguntas para que cree listas de preguntas de cada categoria 
		 * clasificadas por nivel*/
		Classification c = new Classification();
		
		/*ordenamos las preguntas dependiendo del nivel de dificultad*/
		c.artQuestionClassifier(r.getArtQuestions());
		c.biologyQuestionClassifier(r.getBiologyQuestions());
		c.scienceQuestionClassifier(r.getScienceQuestions());
		c.geometryQuestionClassifier(r.getGeometryQuestions());
		
		/*registramos las preguntas ordenadas en el archivo classifiedQuestions.txt*/
		
		try {
			
			FileWriter myWriter = new FileWriter("classifiedQuestions.txt");
			
			myWriter.write("Art questions level 1: ");
			myWriter.write("\n");
			for (Question i : c.getArtQuestionsL1()) {
				myWriter.write(i.toString());
				myWriter.write("\n");
			}
			myWriter.write("Art questions level 2: ");
			myWriter.write("\n");
			for (Question i : c.getArtQuestionsL2()) {
				myWriter.write(i.toString());
				myWriter.write("\n");
			}
			/**/
			myWriter.write("Science questions level 1: ");
			myWriter.write("\n");
			for (Question i : c.getScienceQuestionsL1()) {
				myWriter.write(i.toString());
				myWriter.write("\n");
			}
			myWriter.write("Science questions level 2: ");
			myWriter.write("\n");
			for (Question i : c.getScienceQuestionsL2()) {
				myWriter.write(i.toString());
				myWriter.write("\n");
			}
			/**/
			myWriter.write("Geometry questions level 1: ");
			myWriter.write("\n");
			for (Question i : c.getGeometryQuestionsL1()) {
				myWriter.write(i.toString());
				myWriter.write("\n");
			}
			myWriter.write("Geometry questions level 2: ");
			myWriter.write("\n");
			for (Question i : c.getGeometryQuestionsL2()) {
				myWriter.write(i.toString());
				myWriter.write("\n");
			}
			/**/
			myWriter.write("Biology questions level 1: ");
			myWriter.write("\n");
			for (Question i : c.getBiologyQuestionsL1()) {
				myWriter.write(i.toString());
				myWriter.write("\n");
			}
			myWriter.write("Biology questions level 2: ");
			myWriter.write("\n");
			for (Question i : c.getBiologyQuestionsL2()) {
				myWriter.write(i.toString());
				myWriter.write("\n");
			}
			
			myWriter.close();
		}
		catch (IOException e) {
			System.out.println("Error");
		}
	}
	}
