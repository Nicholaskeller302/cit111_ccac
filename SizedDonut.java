/**
 *
 * @author Nicholas.keller302
 */
public class SizedDonut {
    //Member varibles
    public String name;
    public int sizeInmm;
    
    private int percRemaning = 100;
    
    public void simulateEating(int percEaten) {
        percRemaning -= percEaten;
        System.out.println("");
    }
    
    public int getPercRemaining() {
        return percRemaning;
    }
    
    public int getSizeInMM() {
        return sizeInmm;
    }
}
