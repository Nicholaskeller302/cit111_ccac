
public class Foods {
    public static void main(String[] args) {
        
        //Create a new Pizza object
        Pizza pizza = new Pizza();
        
        //Show how much of the Pizza is left before eating and after
        System.out.println("Pizza has %" + pizza.percRemanining + " left to eat.");
        pizza.eatPizza(25);
        System.out.println("Pizza has %" + pizza.percRemanining + " left to eat.");
        
        //Create a new Donut object
        Donut donut = new Donut();
        
         //Show how much of the Donut is left before eating and after
        System.out.println("Donut has %" + donut.percRemaining + " left to eat.");
        donut.simulateEating(60);
        System.out.println("Donut has %" + donut.percRemaining + " left to eat.");
        
        //Create a new Pie object
        Pie pie = new Pie();
         //Show how much of the Pie is left before eating and after
        System.out.println("Pie has %" + pie.percRemanining + " left to eat.");
        pie.eatPie(20);
        System.out.println("Pie has %" + pie.percRemanining + " left to eat.");
    }
}
