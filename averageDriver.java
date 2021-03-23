import java.util.Scanner;
/*
This program will user the scanner class to receive input from user in order to calulate the average school for
the student.
@author Michael Soskin
@version 1.0
@date 20-3-21
 */


public class averageDriver {

    private double mathScore;
    private double englishScore;
    private double scienceScore;
    private double historyScore;
    private double quiz;
    private double attendance;

    //Parameterized constructor
    public averageDriver(double mathScore, double englishScore, double scienceScore, double historyScore, double quiz,
                 double attendance) {
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.scienceScore = scienceScore;
        this.historyScore = historyScore;
        this.quiz = quiz;
        this.attendance = attendance;
    }
    public double getMathScore() { return mathScore; }
    public void setMathScore(double mathScore) { this.mathScore = mathScore; }
    public double getEnglishScore() { return englishScore; }
    public void setEnglishScore(double englishScore) { this.englishScore = englishScore; }
    public double getScienceScore() { return scienceScore; }
    public void setScienceScore(double scienceScore) { this.scienceScore = scienceScore; }
    public double getHistoryScore() { return historyScore; }
    public void setHistoryScore(double historyScore) { this.historyScore = historyScore; }
    public double getQuiz() { return quiz; }
    public void setQuiz(double quiz) { this.quiz = quiz; }
    public double getAttendance() { return attendance; }
    public void setAttendance(double attendance) { this.attendance = attendance; }

    //calculate the average
    public double average() {
        double sum = mathScore + scienceScore + historyScore + englishScore;
        return sum / 4;
    }

    //calculate grade
    public double grade() {
        double avg = average() * 0.5;
        double q = quiz * 0.4;
        double a = attendance * 0.1;
        return avg + q + a;
    }

    //find the letter grade
    public char letterGrade() {
        double grades = grade();

        if (grades >= 90 && grades <= 100)
            return 'A';
        else if (grades >= 80 && grades <= 89.9)
            return 'B';
        else if (grades >= 70 && grades <= 79.9)
            return 'C';
        else if (grades >= 65 && grades <= 69.9)
            return 'D';
        else
            return 'F';
    }

    // Main function for user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Student's full name: ");
        String name = sc.nextLine();
        System.out.print("Enter English numeric score: ");
        int englishScore = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Math numeric score: ");
        int mathScore = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Science numeric score: ");
        int scienceScore = sc.nextInt(); sc.nextLine();
        System.out.print("Enter History numeric score: ");
        int historyScore = sc.nextInt(); sc.nextLine();
        System.out.print("Enter overall quiz score: ");
        int quiz = sc.nextInt(); sc.nextLine();
        System.out.print("Enter attendance score: ");
        int attendance = sc.nextInt(); sc.nextLine();

        sc.close();

        //Instantiate class averageDriver
        averageDriver obj = new averageDriver(mathScore, englishScore, scienceScore, historyScore, quiz, attendance);

        //displaying formated output
        System.out.println("\n" + name + "'s Grade Report: ");
        System.out.println("---------------------------------");
        System.out.println("English\tMath\tScience\tHistory\tAverage Of four courses\tQuiz\tAttendence");
        System.out.println(obj.getEnglishScore() + "\t" + obj.getMathScore() + "\t" + obj.getScienceScore()+"\t"
                + obj.getHistoryScore() + "\t" + obj.average() + "\t\t\t" + obj.getQuiz() + "\t" + obj.getAttendance());
        System.out.println("\nOverall Score: "+obj.grade());
        System.out.println("Letter Grade: "+obj.letterGrade());
    }
}
