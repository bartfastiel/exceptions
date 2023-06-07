import java.io.PrintWriter;

public class Presentation {

    public static void main(String[] args) {
        int result = letTeacherSolveMathProblem("30", "5");
        System.out.println("30 / 5 = " + result);
    }

    private static int letTeacherSolveMathProblem(String number, String number1) {
        int numberA = Integer.parseInt(number);
        int numberB = Integer.parseInt(number1);
        int calcResult = numberA / numberB;
        PrintWriter out = new PrintWriter("filename.txt");
        out.println(calcResult);
        return calcResult;
    }

}
