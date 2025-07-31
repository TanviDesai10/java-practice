import java.util.Scanner;

public class  QuizGame{
    public static void main(String[] args){

        String[] questions= {"what is the main function of a router?",
                            "What part of computer is considered as a brain?",
                            "What year was facebook launched?",
                            "Who is known as a father of computer?",
                            "What was the first programming language?"};

        String[] [] options={ {"1.Storing files", "2.Encrypting data", "3.Directing internet traffic", "4.Storing data"},
                             { "1.CPU ", "2.Hard drive ", "3.GPU  ", "4.RAM"},
                             { "1.2002 ", "2.2007 ", "3.2004 ", "4.2003" },
                             { "1.Steve Jobs", "2.Bill Gates", "3.Allan Turing", "4.Charles Babbage" },
                             { "1.C ", "2.C+ ", "3.Java ", "4.Fortran "}};

        int[] answers={3,1,3,4,4};
        int score=0;
        int guess;

        Scanner sc = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("Welcome to Quiz Game");
        System.out.println("********************");

        for(int i=0; i<questions.length;i++) {
            System.out.println(questions[i]);
            for (String option : options[i]){
                System.out.println(option);

            }
            System.out.print("Guess your Answer:");
            guess = sc.nextInt();

            if(guess == answers [i]) {
                System.out.println("CORRECT !");
                score++;
            }
            else{
                System.out.println("WRONG ! ");
            }
            System.out.println(" Your score is " + score + "  out of " + questions.length);
        }

        sc.close();

    }
}
