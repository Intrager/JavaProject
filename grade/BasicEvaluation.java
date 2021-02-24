package grade;

public class BasicEvaluation implements GradeEvaluation {
	@Override
	public String getGrade(int point) {
		String grade;

		if (point >= 95 && point <= 100)
			grade = "A+";
		else if (point >= 90)
			grade = "A";
		else if (point >= 85)
			grade = "B+";
		else if (point >= 80)
			grade = "B";
		else if (point >= 75)
			grade = "C+";
		else if (point >= 70)
			grade = "C";
		else if (point >= 65)
			grade = "D+";
		else if (point >= 60)
			grade = "D";
		else
			grade = "F";
		return grade;
	}
}