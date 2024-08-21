/**
 * 
 */
package businessLogic;

import java.util.ArrayList;
import java.util.Random;


import data.Question;

/**
 * @author griverab
 *
 */
public class QuestionSelector {
	/*atributes*/
	
	
	/*contructor function*/
	public QuestionSelector() {
		
		
	}
	
	public Question selector(ArrayList<Question> questions) {
		try {
			Random rand = new Random();
			int index = rand.nextInt(questions.size()); 
			return questions.get(index);
		}catch (IllegalArgumentException e) {
			return null;
		}
		

	}
}
