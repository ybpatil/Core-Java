import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LogicalOp {
    public static void main(String[] args) {
        int mathMarks = 50;
        int scienceMarks = 50;

//        int mathMarks;
//        int scienceMarks;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter your Math marks: ");
//        mathMarks = in.nextInt();
//        System.out.println("Enter your Science marks: ");
//        scienceMarks = in.nextInt();

        if (mathMarks == 50 && scienceMarks == 50) {
            System.out.println("You are pass!");
        }else {
            System.out.println("Hard luck. You are fail!");

        }

    }

}
