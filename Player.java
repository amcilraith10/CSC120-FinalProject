import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Player {
    String name;//name of the person
    String type;//type of player
    Integer skill;//player's level of skill (points earned)
    String location;//location of the player on the map

    /**
     * Constructor for object of class Player
     * @param name
     * @param type
     * @param health
     * @param location
     */
    public Player(String name, String type, int skill, String location){
        this.name = name;
        this.type = "Human";
        this.skill = 0;
        this.location = "center";
    }
static Player player = new Player("unnamed", "Human", 0, "center");

    
    /** 
     * This method moves the player in the specified direction
     * @param direction the direction the player is moving
     */
    public void go(String direction) {
        String description;
        description = null;
        if(direction.equals("north")){
            player.location = "north";
            System.out.println("You are now in the " + player.location + "ern side of the city.");
            //Used this tutorial for doing TimeUnit sleep method: https://www.geeksforgeeks.org/timeunit-sleep-method-in-java-with-examples/
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                // TODO catch block
                e.printStackTrace();
            }
            description = "Welcome to North Dnaltrop Park. You are in a large park with a lot of trees, diverse plants, and native grasses. There are glass skybridges up in the trees that you can walk on, and several beautiful fountains. There are also many benches and people walking around.";
            //SkillLevel.skill = SkillLevel.skill + 5;
        }
        else if(direction.equals("south")){
            player.location = "south";
            
            System.out.println("You are now in the " + player.location + "ern side of the city.");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                // TODO catch block
                e.printStackTrace();
            }
            description = "SOUTH DESCRIPTION";
        }
        else if(direction.equals("east")){
            player.location = "east";
            System.out.println("You are now in the " + player.location + "ern side of the city.");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                // TODO catch block
                e.printStackTrace();
            }
            description = "Welcome to the East Waterfront. You are on a sidewalk overlooking the city's beautiful river waterfront. There is a bridge ahead of you.";
        }
        else if(direction.equals("west")){
            player.location = "west";
            System.out.println("You are now in the " + player.location + "ern side of the city.");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                // TODO catch block
                e.printStackTrace();
            }
            description = "Welcome to the Dnaltrop University Campus. You are on a sidewalk in front of a large university. There are many students walking around, and a few professors. You see a large statue of the university's mascot, the Dnaltrop Dragon, in the center of the campus.";
        }
        else if (direction.equals("center")){
            player.location = "center";
            description = "Welcome to the Center of Dnaltrop. You are currently in the center of a city far into the future. There are many tall buildings around you.";
        }
        else{
            System.out.println("Direction not recognized. Please use north, south, east, or west to explore the map.");
        }

        System.out.println(description);
    }


   }