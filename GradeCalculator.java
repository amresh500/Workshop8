public class GradeCalculator {

    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        int[] scores = {95, 82, 67, 58, 74};
        for (int score : scores) {
            System.out.println("Score: " + score + " Grade: " + calculateGrade(score));
        }
    }
}