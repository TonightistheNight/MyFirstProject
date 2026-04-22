import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double grades [] = new double[5];
        for (int i=0; i<5; i++) {
            System.out.println("please enter grade: ");
            grades[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i=0; i<grades.length;i++)
            sum += grades[i];

        double avg = sum/grades.length;

        System.out.println("the average is : " +avg);
    }
}