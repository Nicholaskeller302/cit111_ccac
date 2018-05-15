/**
 *
 * @author Nicholas.keller302
 */
public class Pizza {
    //Member variables
    public int percRemanining = 100;
    public boolean pepperoi;
    public boolean extraCheese;
    
    //Subtract the perc eaten from the perc remanining
    public void eatPizza(int percEaten) {
        percRemanining -= percEaten;
    }
    
    //Add extra cheese
    public void addExtraCheese() {
        extraCheese = true;
    }
    
    //Add pepperoi
    public void addPepperoi() {
        pepperoi = true;
    }
}
