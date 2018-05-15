/**
 *
 * @author Nicholas.keller302
 */
public class Donut {

    //Member variables
    public int percRemaining = 100;
    public String name;
    public int calories;
    public boolean glazed;
    public String Flavor;

    public void simulateEating(int percEaten) {
        percRemaining -= percEaten;
    }
    
    public void addGlaze() {
        Flavor = "Glazed";
        calories = calories + 60;

    }
}
