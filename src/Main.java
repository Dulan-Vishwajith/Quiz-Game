import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        String[] questions = {
                "What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was Facebook launched?",
                "Who is known as the father of computer?",
                "What was the first programming language?"
        };
        String[][] options ={
                {"1.Storing file","2.Encrypting data","3.Directing internet traffic","4.Managing password"},
                {"1.CPU","2.GPU","3.Hard Drive","4.RAM"},
                {"1.2000","2.2004","3.2006","4.2008"},
                {"1.Steve Jobs","2.Bill Gates","3.Alan Turing","4.Charles Babbage"},
                {"1.COBOL","2.C","3.Fortran","4.Assembly"}
        };
        int[] answers = {3,1,2,4,3};
        int score = 0;
        int guess;
        Scanner input = new Scanner(System.in);

        System.out.println("\n******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        for(int i =0;i<questions.length;i++){
            System.out.println("\n"+questions[i]);

            for (String option :options[i]){
                System.out.println(option);
            }
            System.out.print("\nEnter your guess : ");
            guess = input.nextInt();

            if(guess==answers[i]){
                System.out.println("\n*******");
                System.out.println("Correct");
                System.out.println("*******");
                score++;
            }
            else{
                System.out.println("\n*****");
                System.out.println("Wrong");
                System.out.println("*****");

            }
        }
        System.out.println("\nYour final score is : "+score+" out of "+questions.length);


        input.close();



    }
}
