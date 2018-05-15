
/**
 *
 * @author Nicholas.keller302
 */
public class Creature {
    
    //Member varibles
    public String name;
    public String species;
    private int biteSizeInPercent = 0;
    private int minSizeDonut = 0;

    
    //Have the creature eat the donut passed to it
    public void eatDonut(SizedDonut donutToEat) {
        if(donutToEat.sizeInmm > minSizeDonut) {
            donutToEat.simulateEating(biteSizeInPercent);
             System.out.println("Creature named " + name + " is eating " + biteSizeInPercent + "% of " + donutToEat.name);
        } else {
            System.out.println("The donut is to small for the creature");
        }
    }
    //Setter for donut size. If negative don't do anything
    public void setMinSizeDonutinmm(int minSizeDonutinmm) {
        if(minSizeDonutinmm > 0) {
            minSizeDonut = minSizeDonutinmm;
        } else {
            System.out.println("Negative values are not allowed");
        }
    }
    //Getter for donut size
    public int getMinSizeDonut() {
        return minSizeDonut;
    }
    
    //Setter for bite size
    public void setBiteSize(int percBiteSize) {
        biteSizeInPercent = percBiteSize;
    }
}
