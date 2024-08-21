package businessLogic;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import data.Question;
import gui.Login;
import gui.PrincipalPage;
import gui.ShowQuestion;
import levels.ArtModule;
import levels.BiologyModule;
import levels.GeometryModule;
import levels.ScienceModule;

public class NewQuestion {
	
	
	
	
	public static String SetNewQuestion(String module) {
		
		
		
		String file = "questions.txt";
		

		
		ReadingQuestions r = new ReadingQuestions(file + Login.id  );
		r.readingRecords();

		
		Classification c = new Classification();
		
	
		c.artQuestionClassifier(r.getArtQuestions());
		c.biologyQuestionClassifier(r.getBiologyQuestions());
		c.scienceQuestionClassifier(r.getScienceQuestions());
		c.geometryQuestionClassifier(r.getGeometryQuestions());
			
		if (module == "Art") {
			ArtModule m = new ArtModule(c.getArtQuestionsL1(), c.getArtQuestionsL2());
			ArrayList<Question> artQuestionsL1 = c.getArtQuestionsL1();
			ArrayList<Question> artQuestionsL2 = c.getArtQuestionsL2();
			
			if (ArtModule.CurrentLevel == 1) {
				try {
					
					QuestionSelector s = new QuestionSelector();
					
					Question q = s.selector(artQuestionsL1);
					

					
					ShowQuestion sq = new ShowQuestion("Art Module",q.getLevel(), q.getStatement(), 
							q.getOptionA(),q.getOptionB(), q.getOptionC(), q.getOptionD(), q.getAnswer());
					
					ShowQuestion.currentLine = String.valueOf( "art, " + q.getLevel() + ", "+ q.getStatement() + ", " + q.getOptionA() + ", " + q.getOptionB()+ 
							", " + q.getOptionC() + ", " + q.getOptionD() + ", " + q.getAnswer());
					

					
					PrincipalPage.CurrentQuestion = q;
					PrincipalPage.CurrentAnswer = q.getAnswer();
					PrincipalPage.CurrentOptionA = q.getOptionA();
					PrincipalPage.CurrentOptionB = q.getOptionB();
					PrincipalPage.CurrentOptionC = q.getOptionC();
					PrincipalPage.CurrentOptionD = q.getOptionD();
					
				
					sq.setVisible(true);
					
				}catch (NullPointerException a) {
					JOptionPane.showMessageDialog(m, "FELICIDADES, TERMINASTE EL NIVEL 1 DEL MODULO DE ARTE, VOLVERAS AL MENÚ PRINCIPAL");
					PrincipalPage welcome = new PrincipalPage();
					welcome.setVisible(true);
				}
			}
			if (ArtModule.CurrentLevel == 2) {
				try {
					
					QuestionSelector s = new QuestionSelector();
					
					Question q = s.selector(artQuestionsL2);
					

					
					ShowQuestion sq = new ShowQuestion("Art Module",q.getLevel(), q.getStatement(), 
							q.getOptionA(),q.getOptionB(), q.getOptionC(), q.getOptionD(), q.getAnswer());
					
					ShowQuestion.currentLine = String.valueOf( "art, " + q.getLevel() + ", "+ q.getStatement() + ", " + q.getOptionA() + ", " + q.getOptionB()+ 
							", " + q.getOptionC() + ", " + q.getOptionD() + ", " + q.getAnswer());
					

					
					PrincipalPage.CurrentQuestion = q;
					PrincipalPage.CurrentAnswer = q.getAnswer();
					PrincipalPage.CurrentOptionA = q.getOptionA();
					PrincipalPage.CurrentOptionB = q.getOptionB();
					PrincipalPage.CurrentOptionC = q.getOptionC();
					PrincipalPage.CurrentOptionD = q.getOptionD();
					

					sq.setVisible(true);
					
				}catch (NullPointerException a) {
					JOptionPane.showMessageDialog(m, "FELICIDADES, TERMINASTE EL NIVEL 2 DEL MODULO DE ARTE, VOLVERAS AL MENÚ PRINCIPAL");
					PrincipalPage welcome = new PrincipalPage();
					welcome.setVisible(true);
				}
			}
		}
		
		if (module == "Biology") {
			BiologyModule m = new BiologyModule(c.getBiologyQuestionsL1(), c.getBiologyQuestionsL2());
			ArrayList<Question> biologyQuestionsL1 = c.getBiologyQuestionsL1();
			ArrayList<Question> biologyQuestionsL2 = c.getBiologyQuestionsL2();
			
			if (ArtModule.CurrentLevel == 1) {
				try {
					
					QuestionSelector s = new QuestionSelector();
					
					Question q = s.selector(biologyQuestionsL1);
					

					
					ShowQuestion sq = new ShowQuestion("Biology Module",q.getLevel(), q.getStatement(), 
							q.getOptionA(),q.getOptionB(), q.getOptionC(), q.getOptionD(), q.getAnswer());
					
					ShowQuestion.currentLine = String.valueOf( "biology, " + q.getLevel() + ", "+ q.getStatement() + ", " + q.getOptionA() + ", " + q.getOptionB()+ 
							", " + q.getOptionC() + ", " + q.getOptionD() + ", " + q.getAnswer());
					

					
					PrincipalPage.CurrentQuestion = q;
					PrincipalPage.CurrentAnswer = q.getAnswer();
					PrincipalPage.CurrentOptionA = q.getOptionA();
					PrincipalPage.CurrentOptionB = q.getOptionB();
					PrincipalPage.CurrentOptionC = q.getOptionC();
					PrincipalPage.CurrentOptionD = q.getOptionD();
					

					sq.setVisible(true);
					
				}catch (NullPointerException a) {
					JOptionPane.showMessageDialog(m, "FELICIDADES, TERMINASTE EL NIVEL 1 DEL MODULO DE BIOLOGIA, VOLVERAS AL MENÚ PRINCIPAL");
					PrincipalPage welcome = new PrincipalPage();
					welcome.setVisible(true);
				}
			}
			if (ArtModule.CurrentLevel == 2) {
					
					try {
					
					QuestionSelector s = new QuestionSelector();
					
					Question q = s.selector(biologyQuestionsL2);
					

					
					ShowQuestion sq = new ShowQuestion("Biology Module",q.getLevel(), q.getStatement(), 
							q.getOptionA(),q.getOptionB(), q.getOptionC(), q.getOptionD(), q.getAnswer());
					
					ShowQuestion.currentLine = String.valueOf( "biology, " + q.getLevel() + ", "+ q.getStatement() + ", " + q.getOptionA() + ", " + q.getOptionB()+ 
							", " + q.getOptionC() + ", " + q.getOptionD() + ", " + q.getAnswer());
					

					
					PrincipalPage.CurrentQuestion = q;
					PrincipalPage.CurrentAnswer = q.getAnswer();
					PrincipalPage.CurrentOptionA = q.getOptionA();
					PrincipalPage.CurrentOptionB = q.getOptionB();
					PrincipalPage.CurrentOptionC = q.getOptionC();
					PrincipalPage.CurrentOptionD = q.getOptionD();
					

					sq.setVisible(true);
					
				}catch (NullPointerException a) {
					JOptionPane.showMessageDialog(m, "FELICIDADES, TERMINASTE EL NIVEL 2 DEL MODULO DE BIOLOGIA, VOLVERAS AL MENÚ PRINCIPAL");
					PrincipalPage welcome = new PrincipalPage();
					welcome.setVisible(true);
				}
			}
			
			
		}
		if (module == "Geometry") {
			GeometryModule m = new GeometryModule(c.getGeometryQuestionsL1(), c.getGeometryQuestionsL2());
			ArrayList<Question> geometryQuestionsL1 = c.getGeometryQuestionsL1();
			ArrayList<Question> geometryQuestionsL2 = c.getGeometryQuestionsL2();
			
			if (ArtModule.CurrentLevel == 1) {
				try {
					
					QuestionSelector s = new QuestionSelector();
					
					Question q = s.selector(geometryQuestionsL1);
					

					
					ShowQuestion sq = new ShowQuestion("Geometry Module",q.getLevel(), q.getStatement(), 
							q.getOptionA(),q.getOptionB(), q.getOptionC(), q.getOptionD(), q.getAnswer());
					
					ShowQuestion.currentLine = String.valueOf( "geometry, " + q.getLevel() + ", "+ q.getStatement() + ", " + q.getOptionA() + ", " + q.getOptionB()+ 
							", " + q.getOptionC() + ", " + q.getOptionD() + ", " + q.getAnswer());
					

					
					PrincipalPage.CurrentQuestion = q;
					PrincipalPage.CurrentAnswer = q.getAnswer();
					PrincipalPage.CurrentOptionA = q.getOptionA();
					PrincipalPage.CurrentOptionB = q.getOptionB();
					PrincipalPage.CurrentOptionC = q.getOptionC();
					PrincipalPage.CurrentOptionD = q.getOptionD();
					

					sq.setVisible(true);
					
				}catch (NullPointerException a) {
					JOptionPane.showMessageDialog(m, "FELICIDADES, TERMINASTE EL NIVEL 1 DEL MODULO DE GEOMETRIA, VOLVERAS AL MENÚ PRINCIPAL");
					PrincipalPage welcome = new PrincipalPage();
					welcome.setVisible(true);
				}
			}
			if (ArtModule.CurrentLevel == 2) {
					
					try {
					
					QuestionSelector s = new QuestionSelector();
					
					Question q = s.selector(geometryQuestionsL2);
					

					
					ShowQuestion sq = new ShowQuestion("Geometry Module",q.getLevel(), q.getStatement(), 
							q.getOptionA(),q.getOptionB(), q.getOptionC(), q.getOptionD(), q.getAnswer());
					
					ShowQuestion.currentLine = String.valueOf( "geometry, " + q.getLevel() + ", "+ q.getStatement() + ", " + q.getOptionA() + ", " + q.getOptionB()+ 
							", " + q.getOptionC() + ", " + q.getOptionD() + ", " + q.getAnswer());
					

					
					PrincipalPage.CurrentQuestion = q;
					PrincipalPage.CurrentAnswer = q.getAnswer();
					PrincipalPage.CurrentOptionA = q.getOptionA();
					PrincipalPage.CurrentOptionB = q.getOptionB();
					PrincipalPage.CurrentOptionC = q.getOptionC();
					PrincipalPage.CurrentOptionD = q.getOptionD();
					

					sq.setVisible(true);
					
				}catch (NullPointerException a) {
					JOptionPane.showMessageDialog(m, "FELICIDADES, TERMINASTE EL NIVEL 2 DEL MODULO DE GEOMETRIA, VOLVERAS AL MENÚ PRINCIPAL");
					PrincipalPage welcome = new PrincipalPage();
					welcome.setVisible(true);
				}
			}
			
			
		}
		if (module == "Science") {
			ScienceModule m = new ScienceModule(c.getScienceQuestionsL1(), c.getScienceQuestionsL2());
			ArrayList<Question> scienceQuestionsL1 = c.getScienceQuestionsL1();
			ArrayList<Question> scienceQuestionsL2 = c.getScienceQuestionsL2();
			
			if (ArtModule.CurrentLevel == 1) {
				try {
					
					QuestionSelector s = new QuestionSelector();
					
					Question q = s.selector(scienceQuestionsL1);
					

					
					ShowQuestion sq = new ShowQuestion("Science Module",q.getLevel(), q.getStatement(), 
							q.getOptionA(),q.getOptionB(), q.getOptionC(), q.getOptionD(), q.getAnswer());
					
					ShowQuestion.currentLine = String.valueOf( "science, " + q.getLevel() + ", "+ q.getStatement() + ", " + q.getOptionA() + ", " + q.getOptionB()+ 
							", " + q.getOptionC() + ", " + q.getOptionD() + ", " + q.getAnswer());
					

					
					PrincipalPage.CurrentQuestion = q;
					PrincipalPage.CurrentAnswer = q.getAnswer();
					PrincipalPage.CurrentOptionA = q.getOptionA();
					PrincipalPage.CurrentOptionB = q.getOptionB();
					PrincipalPage.CurrentOptionC = q.getOptionC();
					PrincipalPage.CurrentOptionD = q.getOptionD();
					

					sq.setVisible(true);
					
				}catch (NullPointerException a) {
					JOptionPane.showMessageDialog(m, "FELICIDADES, TERMINASTE EL NIVEL 1 DEL MODULO DE CIENCIA, VOLVERAS AL MENÚ PRINCIPAL");
					PrincipalPage welcome = new PrincipalPage();
					welcome.setVisible(true);
				}
			}
			if (ArtModule.CurrentLevel == 2) {
				try {
					
					QuestionSelector s = new QuestionSelector();
					
					Question q = s.selector(scienceQuestionsL2);
					

					
					ShowQuestion sq = new ShowQuestion("Science Module",q.getLevel(), q.getStatement(), 
							q.getOptionA(),q.getOptionB(), q.getOptionC(), q.getOptionD(), q.getAnswer());
					
					ShowQuestion.currentLine = String.valueOf( "science, " + q.getLevel() + ", "+ q.getStatement() + ", " + q.getOptionA() + ", " + q.getOptionB()+ 
							", " + q.getOptionC() + ", " + q.getOptionD() + ", " + q.getAnswer());
					

					
					PrincipalPage.CurrentQuestion = q;
					PrincipalPage.CurrentAnswer = q.getAnswer();
					PrincipalPage.CurrentOptionA = q.getOptionA();
					PrincipalPage.CurrentOptionB = q.getOptionB();
					PrincipalPage.CurrentOptionC = q.getOptionC();
					PrincipalPage.CurrentOptionD = q.getOptionD();
					

					sq.setVisible(true);
					
				}catch (NullPointerException a) {
					JOptionPane.showMessageDialog(m, "FELICIDADES, TERMINASTE EL NIVEL 2 DEL MODULO DE CIENCIA, VOLVERAS AL MENÚ PRINCIPAL");
					PrincipalPage welcome = new PrincipalPage();
					welcome.setVisible(true);
				}
			}
			
			
		}
		
		
		return null;
	}
}
