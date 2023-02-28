package Unit9.Notes_9_2;

public class Drink extends MenuItem{
    private int numOz;
    private boolean isFrozen;

    public Drink(String name, int numOz) {
        super(name);
        this.numOz = numOz;
        this.isFrozen = false;
        System.out.println("This drink holds " + numOz + " ounces");
    }

    public Drink(String name, int numOz, boolean isFrozen) {
        // here, no direct call to a superclass constructer was made,
        // therefore, Java will make an implicit call to super() on my behalf
        //super(name) :       explicit call to superclass constructer
        super(name);
        this.numOz = numOz;
        this.isFrozen = isFrozen;
        if (isFrozen) {
            System.out.println(getName() + "holds " + numOz + " ounces");
        }
        else {
            System.out.println("This drink holds " + numOz + " ounces");
        }
    }

}
