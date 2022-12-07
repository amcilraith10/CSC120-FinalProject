import java.util.Scanner;

public class Player {
    String name;//name of the person
    String type;//type of player
    Integer health;//player's level of health (0-10)
    String location;//location of the player on the map

    /**
     * Constructor for objects of class Person
     */
    public Player(String name){
        this.name = name;
        this.type = "Human";
        this.health = 10;
        this.location = "center";
    }
    
    /**
     * Changes the name of the player.
     * @param newName the new name indicated by the player
     */
    public void setName(String newName) {
        name = newName;
        System.out.println("Welcome to Dnaltrop, " + name + ".");
  }
    /** 
     * This method moves the player in the specified direction
     * @param direction the direction the player is moving
     */
    public void go(String direction){
        if(direction.equals("north")){
            this.location = "north";
        }
        else if(direction.equals("south")){
            this.location = "south";
        }
        else if(direction.equals("east")){
            this.location = "east";
        }
        else if(direction.equals("west")){
            this.location = "west";
        }
        else{
            System.out.println("Direction not recognized. Please use north, south, east, or west to explore the map.");
        }

        System.out.println("You are now in the " + this.location + "ern side of the city.");
    
    }

public static void main(String[] args) {
        Scanner firstInput = new Scanner(System.in);
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Welcome to Dnaltrop. What is your name?");
        String name = nameInput.nextLine();
        Player player = new Player(name);
        System.out.println("Welcome to Dnaltrop, " + name + ".");
        System.out.println("You are currently in the center of a city far into the future. There are many tall buildings around you.");
        System.out.println("You can move north, south, east, or west.");
        String direction = firstInput.nextLine();
        player.go(direction);
        //System.out.println("You are now in the " + player.location + "ern side of the city.");
    
    while(true){
        Scanner input = new Scanner(System.in);

    }    
    }   }