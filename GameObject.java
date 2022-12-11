public class GameObject {
    public String name;
    public String location;
    public static Integer objectSkillLevel;
    public static String objectDescription;

public GameObject(String name, String location, Integer objectSkillLevel, String objectDescription) {
    this.name = name;
    this.location = location;
    GameObject.objectSkillLevel = objectSkillLevel;
    GameObject.objectDescription = objectDescription;
}


//Let's make some game objects!
GameObject fountain = new GameObject("fountain", "north", 5, "You see a beautiful fountain. It is made of glass and seems almost alive with bursts of water and lights. There are many people around it.");

/** 
 * This method allows the player to explore the area
 * @param object the object the player is exploring
 */
public static void explore(String noun) {
    Integer skill;
    skill = 0;
    System.out.println(objectDescription);
    skill = skill + objectSkillLevel;
        }


}