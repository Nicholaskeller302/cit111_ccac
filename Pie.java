/**
 *
 * @author Nicholas.keller302
 */
public class Pie {
    //Member variables
    public int percRemanining = 100;
    public String flavor;
    public boolean nonfat;
    
    //Subtract the perc eaten from the perc remanining
    public void eatPie(int percEaten) {
        percRemanining -= percEaten;
    }
    
    //Change pies flavor
    public void changeFlavor(String f) {
        flavor = f;
    }
    
    //Add non-fat butter
    public void addNonfatButter() {
        nonfat = true;
    }
}
