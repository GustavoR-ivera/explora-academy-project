/**
 * 
 */

package businessLogic;

import java.util.ArrayList;

import data.Question;
import gui.Login;

/**
 * @author griverab
 *
 */
public class ProgressCompute {
	
	private int totalArtQuestions;
	private int artQuestionsAvailable; 
	private int artProgress;
	private int totalBiologyQuestions;
	private int biologyQuestionsAvailable; 
	private int biologyProgress;
	private int totalScienceQuestions;
	private int scienceQuestionsAvailable; 
	private int scienceProgress;
	private int totalGeometryQuestions;
	private int geometryQuestionsAvailable; 
	private int geometryProgress;
	private int z;
	
	
	public ProgressCompute() {
		/*calculamos el total de preguntas de arte (no cambia durante la ejecucion del programa)*/
		ReadingQuestions r = new ReadingQuestions("questions.txt");
		r.readingRecords();
		this.totalArtQuestions = r.getArtQuestions().size();
		this.totalGeometryQuestions = r.getGeometryQuestions().size();
		this.totalScienceQuestions = r.getScienceQuestions().size();
		this.totalBiologyQuestions = r.getBiologyQuestions().size();
		
		z = r.getArtQuestions().size();
	}
	
	/*calcula el porcentaje de avance por categoria*/
	public int  artProgress(ArrayList<Question> questionsL1, ArrayList<Question> questionsL2) {

		/*calculamos el total de preguntas de arte disponibles (cambia durante la ejecucion del programa) */
		
		
		artQuestionsAvailable = questionsL1.size() + questionsL2.size();
		
		//this.artProgress  = ((this.totalArtQuestions-this.artQuestionsAvailable)/(this.totalArtQuestions))*100;
		float artt = (( (float) totalArtQuestions- (float) artQuestionsAvailable)/( (float) totalArtQuestions))*100;
		
		int finalArt = (int) artt;
		return finalArt; 
		
	}
	
	public int biologyProgress(ArrayList<Question> questionsL1, ArrayList<Question> questionsL2) {

		/*calculamos el total de preguntas de arte disponibles (cambia durante la ejecucion del programa) */
		this.biologyQuestionsAvailable = questionsL1.size() + questionsL2.size();
		
		//this.biologyProgress = ((this.totalBiologyQuestions-this.biologyQuestionsAvailable)/(this.totalBiologyQuestions))*100;
		float biologyy = (( (float) totalBiologyQuestions- (float) biologyQuestionsAvailable)/( (float) totalBiologyQuestions))*100;
		
		int finalBiology = (int) biologyy;
		return finalBiology; 

	}
	
	public int scienceProgress(ArrayList<Question> questionsL1, ArrayList<Question> questionsL2) {

		/*calculamos el total de preguntas de arte disponibles (cambia durante la ejecucion del programa) */
		this.scienceQuestionsAvailable = questionsL1.size() + questionsL2.size();
		
		//this.scienceProgress = ((this.totalScienceQuestions-this.scienceQuestionsAvailable)/(this.totalScienceQuestions))*100;
		float sciencee = (( (float) totalScienceQuestions- (float) scienceQuestionsAvailable)/( (float) totalScienceQuestions))*100;
		
		int finalScience= (int) sciencee;
		return finalScience; 

	}
	
	public int geometryProgress(ArrayList<Question> questionsL1, ArrayList<Question> questionsL2) {

		/*calculamos el total de preguntas de arte disponibles (cambia durante la ejecucion del programa) */
		this.geometryQuestionsAvailable = questionsL1.size() + questionsL2.size();
		
		//this.geometryProgress = ((this.totalGeometryQuestions-this.geometryQuestionsAvailable)/(this.totalGeometryQuestions))*100;
		float geometryy = (( (float) totalGeometryQuestions- (float) geometryQuestionsAvailable)/( (float) totalGeometryQuestions))*100;
		
		int finalGeometry= (int) geometryy;
		return finalGeometry; 
	}


	
	
	public int getTotalArtQuestions() {
		return totalArtQuestions;
	}

	public int getArtQuestionsAvailable() {
		return artQuestionsAvailable;
	}

	public int getArtProgress() {
		return artProgress;
	}

	public int getBiologyProgress() {
		return biologyProgress;
	}

	public int getScienceProgress() {
		return scienceProgress;
	}

	public int getGeometryProgress() {
		return geometryProgress;
	}
	
}