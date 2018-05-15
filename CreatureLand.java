
/**
 *
 * @author Nicholas.keller302
 */
public class CreatureLand {

    public static void main(String[] args) {
       //Create a creature called puppy and give it a name and species
        Creature puppy = new Creature();
        puppy.name = "Oreo";
        puppy.species = "Dachshund";
        //Set it's bite size and min size donut
        puppy.setBiteSize(10);
        puppy.setMinSizeDonutinmm(20);
        
        //Create the donut
        SizedDonut puppiesDonut = new SizedDonut();
        puppiesDonut.name = "Pumpkin Spice";
        puppiesDonut.sizeInmm = 32;
        //Eat the donut
        puppy.eatDonut(puppiesDonut);
        System.out.println("The " + puppy.species + " named " + puppy.name + " has grown and has to eat bigger donuts.");
        //Change the size of the minium size donut and eat try to eat it again
        puppy.setMinSizeDonutinmm(55);
        puppy.eatDonut(puppiesDonut);
    }
}
