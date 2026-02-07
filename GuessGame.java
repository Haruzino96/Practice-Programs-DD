import java.util.*;

public class GuessGame{
    public static void main(String giann []){
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int rand = random.nextInt(100) + 1;
        int guess = 0;
        
        while(guess != rand){
            System.out.print("Guess a number from 1-100: ");
            guess = scanner.nextInt();
            
            if(guess == rand){
                System.out.println("\nCorrect Guess! :DD");
            }else if(guess > rand){
                System.out.println("Guess is too high! :< ");
            }else{
                System.out.println("Guess is too low! :<<");
            }
        }
    }
}