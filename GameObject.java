import java.lang.reflect.Array;  
import java.util.ArrayList;
import java.util.*;

public class GameObject {
    static String name;
    String location;
    Integer objectSkillLevel; //object skill level
    static Integer skillLevel; //player skill level
    String objectDescription;
    static ArrayList<GameObject> objects = new ArrayList<GameObject>();

public GameObject(String name, String location, Integer objectSkillLevel, String objectDescription) {
    this.name = name;
    this.location = location;
    this.objectSkillLevel = objectSkillLevel;
    GameObject.skillLevel = 0;
    this.objectDescription = objectDescription;
    //GameObject.objects.add(this); 
}

//Let's make some game objects!
 
//north objects
static GameObject fountain = new GameObject("fountain", "north", 5, "You see a beautiful fountain. It is made of glass and seems almost alive with bursts of water and lights. You see a few coins at the bottom of the fountain.");
static GameObject coins = new GameObject("coins", "north", 20, "You see a few coins at the bottom of the fountain. They are relics of old times before currency was digital. You pick them up and put them in your pocket.");
static GameObject bench = new GameObject("bench", "north", 3, "You see a bench. It is made of metal and has a beautiful design. It is sitting in the shade of one of the skybridges. You sit down and relax for a moment.");
static GameObject skybridge = new GameObject ("bridge", "north", 2, "You see a skybridge. It is made of glass and is very high up in the trees. You walk up it and look down at the park below. You see a few people walking around and a few benches.");
static GameObject tree  = new GameObject ("tree", "north", 1, "You see a tree. It is very tall and has a lot of branches. It is very old and has a lot of history. You look up at the skybridge and see a few people walking around.");

//east objects
static GameObject bridge = new GameObject("bridge", "east", 2, "You see a bridge. It is made of metal and is very new. It has tracks for high-speed rail and paths for pedestrians. You walk across it and look down at the river below.");
static GameObject river = new GameObject("river", "east", 1, "You see a river. It is very wide and has a strong current. It is very beautiful. You look up at the bridge and see a few people walking around. A high-speed train passes by.");
static GameObject train = new GameObject("train", "east", 5, "You see a high-speed train. It is very fast and has a lot of power. You cannot board this train yet.");

//south objects
static GameObject station = new GameObject("train station", "east", 3, "You see a high-speed rail station. It is very large and has many trains and people moving through it. You spot a small card on the ground.");
static GameObject card = new GameObject("card", "east", 20, "You see a small card on the ground. It is a shiny metro card made of metal");

static GameObject[] objectsArray = {fountain, coins, bench, skybridge, tree, bridge, river, train, station, card};

//ArrayList<GameObject> objectsArrayList = new ArrayList<GameObject>();
//    objectsArrayList.add("fountain");
//    objectsArrayList.add("coins");
/** 
 * This method allows the player to explore the area
 * @param name the object the player is exploring
 */
public static void explore(String name) {
    //Integer newSkill;
    //Integer skillLevel;
    //String objectDescription;
    //for (int i = 0; i < GameObject.getLength(); i++) {
    //    if (name.equals(objectsArray[i].name)) {
    //        System.out.println(GameObject.objectsArray[i].name);
    //        objectDescription = objectsArray[i].objectDescription;
    //System.out.println("You are now exploring the " + name + ".");
    //System.out.println(objectDescription);
    //skill = SkillLevel.skill + objectSkillLevel;
    //System.out.println("You have earned " + objectSkillLevel + " points.");
    //System.out.println("Your total skill level is now " + skill + ".");


    if (name.equals("fountain")) {
        System.out.println(fountain.objectDescription);
        System.out.println("You have earned " + fountain.objectSkillLevel + " points.");
        skillLevel = skillLevel + fountain.objectSkillLevel;
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("coins")) {
        System.out.println(coins.objectDescription);
        skillLevel = skillLevel + coins.objectSkillLevel;
        System.out.println("You have earned " + coins.objectSkillLevel + " points.");
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("bench")) {
        System.out.println(bench.objectDescription);
        skillLevel = skillLevel + bench.objectSkillLevel;
        System.out.println("You have earned " + bench.objectSkillLevel + " points.");
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("bridge")) {
        System.out.println(bridge.objectDescription);
        skillLevel = skillLevel + bridge.objectSkillLevel;
        System.out.println("You have earned " + bridge.objectSkillLevel + " points.");
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("tree")) {
        System.out.println(tree.objectDescription);
        skillLevel = skillLevel + tree.objectSkillLevel;
        System.out.println("You have earned " + tree.objectSkillLevel + " points.");
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("river")) {
        System.out.println(river.objectDescription);
        skillLevel = skillLevel + river.objectSkillLevel;
        System.out.println("You have earned " + river.objectSkillLevel + " points.");
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("train")) {
        System.out.println(train.objectDescription);
        skillLevel = skillLevel + train.objectSkillLevel;
        System.out.println("You have earned " + train.objectSkillLevel + " points.");
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("station")) {
        System.out.println(station.objectDescription);
        skillLevel = skillLevel + station.objectSkillLevel;
        System.out.println("You have earned " + station.objectSkillLevel + " points.");
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
    else if (name.equals("card")) {
        System.out.println(card.objectDescription);
        skillLevel = skillLevel + card.objectSkillLevel;
        System.out.println("You have earned " + card.objectSkillLevel + " points.");
        System.out.println("Your total skill level is now " + skillLevel + ".");
    }
}


}