import java.util.Scanner;
public class MadLibsGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Let's play a MAD LIBS GAME");
        System.out.println("Enter the following words: ");

        System.out.println("1. Enter an Adjective: ");
        String adj1=sc.nextLine();
        System.out.println("2. Enter an Noun (Plural): ");
        String noun1=sc.nextLine();
        System.out.println("3. Enter an Verb (ending in -ing) ");
        String verb1=sc.nextLine();
        System.out.println("4. Enter an Adverb: ");
        String adv=sc.nextLine();
        System.out.println("5. Enter an Noun: ");
        String noun2=sc.nextLine();

        System.out.println("THE CREATED FUNNY STORY IS: ");

        System.out.println("The "+adj1+" creature spotted the "+noun1+" immediately. It began "+verb1+" very "+adv+" toward the nearest "+noun2+".");
        sc.close();
    }
}
