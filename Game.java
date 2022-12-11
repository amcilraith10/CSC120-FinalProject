import java.util.Scanner;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Game<skillLevel> {
    public static Player player;
    public Companion companion;
    public Terrain terrain;
    //public SkillLevel skillLevel;
    public static GameObject gameObject;
    
    public Game() {
        player = new Player("Player", "human", 0, "center");
        companion = new Companion("Companion", "center", "A friendly companion.");
        terrain = new Terrain("Center", "center", "Welcome to the Center of Dnaltrop. You are currently in the center of a city far into the future. There are many tall buildings around you.", 5);
        //skillLevel = new SkillLevel(0);
        gameObject = new GameObject("tree", "Park", 1, "A large tree with many branches.");
    }


    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player("unnamed", "Human", 0, "center");
    
    //Game startup and setting the player's name
        System.out.println("Welcome to Dnaltrop. What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome to Dnaltrop, " + name + ".");
        //Used this tutorial for doing TimeUnit sleep method with try/catch: https://www.geeksforgeeks.org/timeunit-sleep-method-in-java-with-examples/
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You are currently in the center of a city far into the future. There are many tall buildings around you.");
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You can go north, south, east, or west.");
        System.out.println("You can also quit playing at any time by typing quit.");
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("What would you like to do?");

    //Messy game loop time! 
    while(true){
        //credit for how to split a command string into two parts goes to one of my roommates, Sophi Cerda 
        String command = scanner.nextLine();
        String[] words =  command.split("\\s+", 2);

        if (command == null || command.length() == 0) {
            System.out.println("Command not recognized. Please use go or quit.");
            return; }
        else {
            String verb = words[0].toLowerCase();
            String noun = "unassigned" ;
            //System.out.println(words.length);
                if (words.length > 1) {
                    noun = words[1].toLowerCase();
                    //System.out.println(verb + noun);
                    }
                    else {
                        System.out.println("Please add a noun to your command.");
                    } 

            //scanner.close();    
     //Detects what command is being used and calls the appropriate method       
        if(verb.equals("go")){
            //System.out.println("Which direction would you like to go?");
            //System.out.println(noun);
            player.go(noun);}
        
        else if (verb.equals("help")){
            System.out.println("You can go north, south, east, or west. You can explore objects around you by typing explore + the object's name.");
            System.out.println("You can also quit playing at any time by typing quit.");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            System.out.println("What would you like to do?");
        } }
        
        else if(verb.equals("explore")){
            System.out.println("explore command recognized");
            GameObject.explore(noun);
        }

        else if(verb.equals("quit")){
            System.out.println("Thank you for playing Dnaltrop.");
            break;
        }
        else{
            System.out.println("Command not recognized. Please use a recognized command or quit.");   
    }
} } } }