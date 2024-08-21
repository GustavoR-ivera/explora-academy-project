/**
 * 
 */
package data;

/**
 * @author Gustavo Rivera
 *
 */
public class Question {
	
	private int level;
	private String statement;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String answer;
	
	public Question(int level, String statement, String optionA, String optionB, String optionC, String optionD, String answer) {
		
		this.level = level;
		this.statement = statement;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
	}
	
	public int getLevel() {
		return level;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "level = " +level+ ", statement = " + statement + ", A = " + optionA + ", B = " + optionB + ", C = "
				+ optionC + ", D = " + optionD + ", answer = " + answer;
	}
}
