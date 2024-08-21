/**
 * 
 */
package businessLogic;

import java.util.ArrayList;

import data.Question;

/**
 * @author Gustavo Rivera
 *
 */
public class Classification {

	private ArrayList<Question> geometryQuestionsL1;
	private ArrayList<Question> geometryQuestionsL2;
	private ArrayList<Question> scienceQuestionsL1;
	private ArrayList<Question> scienceQuestionsL2;
	private ArrayList<Question> artQuestionsL1;
	private ArrayList<Question> artQuestionsL2;
	private ArrayList<Question> biologyQuestionsL1;
	private ArrayList<Question> biologyQuestionsL2;
	
	public Classification() {
		this.geometryQuestionsL1 = new ArrayList<Question>();
		this.geometryQuestionsL2 = new ArrayList<Question>();
		this.scienceQuestionsL1 = new ArrayList<Question>();
		this.scienceQuestionsL2 = new ArrayList<Question>();
		this.artQuestionsL1 = new ArrayList<Question>();
		this.artQuestionsL2 = new ArrayList<Question>();
		this.biologyQuestionsL1 = new ArrayList<Question>();
		this.biologyQuestionsL2 = new ArrayList<Question>();
		
	}
	
	public void geometryQuestionClassifier(ArrayList<Question> geometryQuestions ) {
		
		for (Question i : geometryQuestions) {
			if(i.getLevel() == 1) {
				this.geometryQuestionsL1.add(i);
			}
			else {
				this.geometryQuestionsL2.add(i);
			}
		}
	}
	public void artQuestionClassifier(ArrayList<Question> artQuestions) {
		
		for (Question i : artQuestions) {
			if(i.getLevel() == 1) {
				this.artQuestionsL1.add(i);
			}
			else {
				this.artQuestionsL2.add(i);
			}
		}
		
	}
	public void biologyQuestionClassifier(ArrayList<Question> biologyQuestions) {
		for (Question i : biologyQuestions) {
			if(i.getLevel() == 1) {
				this.biologyQuestionsL1.add(i);
			}
			else {
				this.biologyQuestionsL2.add(i);
			}
		}
	}
	public void scienceQuestionClassifier(ArrayList<Question> scienceQuestions) {
		for (Question i : scienceQuestions) {
			if(i.getLevel() == 1) {
				this.scienceQuestionsL1.add(i);
			}
			else {
				this.scienceQuestionsL2.add(i);
			}
		}
	}
	
	
	
	public ArrayList<Question> getScienceQuestionsL1() {
		return scienceQuestionsL1;
	}
	public ArrayList<Question> getScienceQuestionsL2() {
		return scienceQuestionsL2;
	}
	public ArrayList<Question> getBiologyQuestionsL1() {
		return biologyQuestionsL1;
	}
	public ArrayList<Question> getBiologyQuestionsL2() {
		return biologyQuestionsL2;
	}
	public ArrayList<Question> getArtQuestionsL1() {
		return artQuestionsL1;
	}
	public ArrayList<Question> getArtQuestionsL2() {
		return artQuestionsL2;
	}
	public ArrayList<Question> getGeometryQuestionsL1() {
		return geometryQuestionsL1;
	}
	public ArrayList<Question> getGeometryQuestionsL2() {
		return geometryQuestionsL2;
	}
}

