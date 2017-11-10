import java.util.Scanner;
import java.util.Random;
public class OneWordEnigma {
   public static void main(String[] args) {
         
      Scanner kb = new Scanner(System.in);
         
      // set up the Question and Answer multi arrays
      String[][] Question = new String[5][10];
      String[][] Answer = new String[5][10];
     
         // LEVEL 1
         Question[0][0] = "What has to be broken before it can be made?";
         Answer[0][0] = "egg";
  
         Question[0][1] = "What has a face and two hands but no arms or legs?";
         Answer[0][1] = "clock";
     
         Question[0][2] = "It belongs to you but is used more by others. Your...";
         Answer[0][2] = "name";
  
         Question[0][3] = "Everything the light touches has it. The night hides it. What is it?";
         Answer[0][3] = "shadow";
  
         Question[0][4] = "What do you never eat at lunch or dinner?";
         Answer[0][4] = "breakfast";
  
         Question[0][5] = "I can be used to build castles, but I crumble in your hands.\nI'm at the bottom of the ocean, and am found all around the lands.\nWhat am I?";
         Answer[0][5] = "sand";
  
         Question[0][6] = "A cowboy rode to an inn on Friday. He stayed two nights and left on Friday.\nWhat was his horse's name?";
         Answer[0][6] = "friday";
     
         Question[0][7] = "Tall I am young, short I am old. But I'm always feeling bright. What am I?";
         Answer[0][7] = "candle";
  
         Question[0][8] = "What goes up when the rain comes down?";
         Answer[0][8] = "umbrella";
  
         Question[0][9] = "If you have me, you want to share me. If you share me, I'll be gone. What am I?";
         Answer[0][9] = "secret";
  
    
         // LEVEL 2
         Question[1][0] = "What is always coming but never arrives?";
         Answer[1][0] = "tomorrow";
  
         Question[1][1] = "What can travel around the world while staying in a corner?";
         Answer[1][1] = "stamp";
  
         Question[1][2] = "What gets wetter as it dries?";
         Answer[1][2] = "towel";
  
         Question[1][3] = "What kind of tree can you carry in your hand? ____ tree";
         Answer[1][3] = "palm";
  
         Question[1][4] = "Which word in the dictionary is spelled incorrectly?";
         Answer[1][4] = "incorrectly";
  
         Question[1][5] = "What building has the most stories?";
         Answer[1][5] = "library";
  
         Question[1][6] = "I'll tell you my story but you won't hear a thing. What am I?";
         Answer[1][6] = "book";
  
         Question[1][7] = "What can you catch but not throw?";
         Answer[1][7] = "cold";
  
         Question[1][8] = "What is at the end of a rainbow?";
         Answer[1][8] = "w";
  
         Question[1][9] = "What weighs more, a pound of feathers or a pound of bricks";
         Answer[1][9] = "neither";
  
  
         // LEVEL 3
         Question[2][0] = "Feed me and I grow, yet give me a drink and I disappear.";
         Answer[2][0] = "fire";
     
         Question[2][1] = "A man is pushing his car along the road when he comes to a hotel. \nHe shouts, \"I'm bankrupt!\" Why?";
         Answer[2][1] = "monopoly";
  
         Question[2][2] = "I'm in everybody but everybody still wants me. I won't feed your hunger but I'll feed the trees and plants.\nWhat am I?";
         Answer[2][2] = "water";
  
         Question[2][3] = "The poor have it, the rich need it, and you'll be hungry if you eat it. What am I?";
         Answer[2][3] = "nothing";
  
         Question[2][4] = "There are seven chickens. If each chicken lays seven eggs, how many chickens are there?";
         Answer[2][4] = "seven";
  
         Question[2][5] = "Tear one off and scratch my head. What was red is black instead.";
         Answer[2][5] = "matchstick";
  
         Question[2][6] = "What occurs once in every minute, twice in every moment, yet never in a thousand years?";
         Answer[2][6] = "m";
  
         Question[2][7] = "We see it once in a year, twice in a week, and never in a day. What is it?";
         Answer[2][7] = "e";
 
         Question[2][8] = "What is the centre of gravity?";
         Answer[2][8] = "v";
    
         Question[2][9] = "What goes up but never comes down?";
         Answer[2][9] = "age";
 
 
         // LEVEL 4
         Question[3][0] = "He married someone today, but is not married. Who is he?";
         Answer[3][0] = "minister";// or preacher
 
         Question[3][1] = "Mary's father has 5 daughters: Nana, Nene, Nini, Nono. What is the fifth daughter's name?";
         Answer[3][1] = "mary";
 
         Question[3][2] = "I can happen in the daytime and even at night. \nI'll block out the sun, but not all the light. \nWhat am I?";
         Answer[3][2] = "eclipse";

         Question[3][3] = "What invention lets you look right through a wall?";
         Answer[3][3] = "window";
 
         Question[3][4] = "What is as light as a feather, but can't be held for more than six minutes?";
         Answer[3][4] = "breath";
 
         Question[3][5] = "What weighs more, a pound of feathers or a pound of bricks";
         Answer[3][5] = "neither";
 
         Question[3][6] = "What goes through a town and over hills but never moves?";
         Answer[3][6] = "road";
 
         Question[3][7] = "What has a neck but no head?";
         Answer[3][7] = "bottle";
 
         Question[3][8] = "What can you hear but not touch or see?";
         Answer[3][8] = "sound";
 
         Question[3][9] = "What loses a head in the morning but gets it back at night?";
         Answer[3][9] = "pillow";
    
         // LEVEL 5
         Question[4][0] = "What becomes shorter when you add two letters to it?";
         Answer[4][0] = "short";
 
         Question[4][1] = "A house has four walls. All of the walls are facing south, and a bear is circling the house.\nWhat colour is the bear?";
         Answer[4][1] = "white";
 
         Question[4][2] = "A man leaves home. He makes three left turns before returning home. Why?";
         Answer[4][2] = "baseball";
 
         Question[4][3] = "If a blue house is made out of blue bricks, a yellow house is made out of yellow bricks,\nand a pink house is made out of pink bricks, what is a green house made of?";
         Answer[4][3] = "glass";
 
         Question[4][4] = "What has keys but can't open a single door?";
         Answer[4][4] = "piano";
 
         Question[4][5] = "What starts with \"M\", ends with \"N\", and has more than 100 letters?";
         Answer[4][5] = "mailman";
    
         Question[4][6] = "Thirty white horses stand on a red hill,\nFirst they champ,\nThen they stamp,\nThen they stand still.\nWhat are they?";
         Answer[4][6] = "teeth";
 
         Question[4][7] = "Thirty men and only two women (but they hold the most power) stand on a battlefield.\nDressed in black and white, they could fight for hours. What are they?";
         Answer[4][7] = "chess";
 
         Question[4][8] = "Railroad crossing without any cars. Can you spell that without any Rs?";
         Answer[4][8] = "that";
          
         Question[4][9] = "I have keys but no locks. I have a space but no room. \nYou can enter but can't go outside. What am I?";
         Answer[4][9] = "keyboard";
 
    
      String[] BONUSQuestion = new String[1];
      String[] BONUSAnswer = new String[1];
 
         BONUSQuestion[0] = "WELCOME TO THE SEQUENCE OF THE YEAR!! What letter comes next?: JFMAMJJASON_";
         BONUSAnswer[0] = "d";//D, December
       
       
      System.out.println("|| ONE WORD ENIGMA ||\n\n");
       
      System.out.print("Please enter your name: ");
      String name = kb.nextLine();
       
      System.out.println("\nWELCOME TO ONE-WORD ENIGMA, " + name + "!!\n");
      System.out.println("There five levels to complete, with five riddles on each.");
      System.out.println("\nThe solutions are only one word long, so think carefully before you answer.");
      System.out.println("If you guess incorrectly three times on a level, the game is over and you'll have to start over.");
      System.out.println("\nIf you get to the end, there is a bonus riddle for you to test your brain on!");
      System.out.print("\nReady? Enter 1 to begin or 0 to exit the game: ");
      int BeginOrEnd = kb.nextInt();
       
      if (BeginOrEnd == 0) {
         System.out.print("Thank you for playing!");
         System.exit(0);
      }
       
      // method for the Q&A
      ENIGMA(Question,Answer);
       
       
       
      // BONUS ROUND!!!
       
      System.out.println("\n\n\nYou made it to the Bonus Round! Ready? Here's your riddle:\n");
      System.out.println(BONUSQuestion[0]);
      System.out.print("Answer: ");
      String response = kb.next();
      String responseLower = response.toLowerCase();
       
      if(responseLower.equals(BONUSAnswer[0])) {
         System.out.println("Correct! Congratulations! You beat the game!");
         System.out.println("\n\nThank you for playing ONE-WORD ENIGMA!!");
         System.exit(0);
      }
      else {
         System.out.println("Incorrect. The answer is D.");
         System.out.println("Do you know why? What letters do the months in the year start with?");
         System.out.println("\n\nThank you for playing ONE-WORD ENIGMA!!");
         System.exit(0);
      }   
            
   }  
    
   public static void ENIGMA(String[][] x,String[][] y) {
      int incorrect = 0;
      int[] number = {10,10,10,10,10};// use to make sure questions don't repeat, part 1
       
      Scanner kb = new Scanner(System.in);
      Random random = new Random();
       
      // Level #
      for(int i=0;i<5;i++) {
         System.out.println("\n\n\nLevel " + (i+1) + ", Begin!\n");
         incorrect = 0;
          
         // Level questions   
         for(int j=0;j<5;j++) {
            System.out.println("(" + (j+1) + ")");
             
            int num = random.nextInt(9)+0;
             
            // use to make sure questions don't repeat, part 2
            while(num == number[0] || num == number[1] || num == number[2] || num == number[3]) {
               num = random.nextInt(9)+0;
            }   
            
            System.out.print(x[i][num]);
                
            System.out.print("\nAnswer: ");
            String response = kb.next();
             
            // convert answer to lower case
            String responseLower = response.toLowerCase();
                
            if(responseLower.equals(y[i][num])) {
               System.out.println("Correct!\n");
            }
            // if incorrect
            else {
               System.out.println("Incorrect. Answer is \"" + (y[i][num]) + "\"\n");
               incorrect++;
                
               // penalty counter
                if (incorrect == 3) {
                   System.out.println("\n\nYou got three incorrect answers on this level, Game Over");
                   System.out.println("Thank you for playing! Try it again!");
                   System.exit(0);
                }
             }
             // use so questions don't repeat, part 3
             number[j] = num;
         }
         // passing a level
         System.out.println("Congratulations! You passed Level " + (i+1) + "!");
         System.out.println("You answered " + (5-incorrect) + " out of 5 riddles correctly.");
         System.out.print("Enter 1 to continue or 0 to exit: ");
         int num = kb.nextInt();
             
         // exiting the game
         if(num == 0) { 
            System.out.println("\nThank you for playing ONE-WORD ENIGMA!");
            System.exit(0);
         }   
      }
   }
}                                

