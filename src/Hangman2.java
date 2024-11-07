import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman2{
    
    public static void main(String[] args) throws FileNotFoundException {

        List<String> words = new ArrayList<>();

        Scanner scanner = new Scanner(new File("C:\\Users\\anmol\\Downloads\\world_alpha1.text"));
        Scanner keyboard = new Scanner (System.in);
        
        while(scanner.hasNext()){
            words.add(scanner.nextLine());
        }

        Random rand = new Random();

        String word = words.get(rand.nextInt(words.size()));

        System.out.println(word);

        List<Character> playerGuesses = new ArrayList<>();
        // overthinly
        // -v-----n-y
        while(true){
            printWordState(word, playerGuesses);
            getPlayerGuess(keyboard, playerGuesses, word);
            if(printWordState(word, playerGuesses)){
                System.out.println("You Win");
                break;

            }
            System.out.println("Please enter huess for the word");
            if(keyboard.nextLine().equals(word)){
               System.out.println("You Win");
               break; 
            }
            else{
                System.out.println("No! Try Again");
            }
            }
        //printWordState(word, playerGuesses);
        
        
               //getPlayerGuess(keyboard, playerGuesses, word);
                        // "A" -> 'A'
                        // String str = "A"
                        // str.chartA(0) -> "A" -> 'A'
                
             }
                
             private static boolean printWordState(String word, List<Character>playerGuessess){
            int correctCount = 0;
            for(int i =0;i<word.length();i++) {
            if(playerGuessess.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
                correctCount++;

            }

            else {
                System.out.print("-");
            }
        }
            System.out.println();

            return word.length()==correctCount;

        
    }
    
        private static void getPlayerGuess(Scanner keyboard, List<Character> playerGuessess, String word){
        System.out.println("please enter a letter");
        String letterGuess =keyboard.nextLine();
        playerGuessess.add(letterGuess.charAt(0));



        //printWordState(word, playerGuessess);

       
        }
    
    
    


            
}