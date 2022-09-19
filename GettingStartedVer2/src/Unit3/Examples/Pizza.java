package Unit3.Examples;

public class Pizza {
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;

    // Menu go to Cod --> Generate
    // to select all, you can click on first, hold shift and click last

    public Pizza(String store, int inches, int numToppings, boolean isDeepDish) {
        this.store = store;
        this.inches = inches;
        this.numToppings = numToppings;
        this.isDeepDish = isDeepDish;
    }
    public Pizza(String store, int inches, boolean isDeepDish) {
        this.store = store;
        this.inches = inches;
        this.isDeepDish = isDeepDish;
        numToppings = 0;
    }

    /**
     * This is a method that returns a print-ready string representing the object
     *The moethod header must be public String toString()
     * This method never prints anything
     *
     * WE are giving Java instructions on HOW to print a Pizza object
     * With this method, we can print a pizza reference var and the toString() method
     * is automatically called and the string that is returned is printed
     *
     * @return String that is ready to print
     */

    public String toString() {
        String str = "";
        str += "You ordered a ";
        if(isDeepDish) {
            str +=  "deep-dish " + inches + " inch pizza from " + store;
        }
        else {
            str += "thin crust " + inches + " inch pizza from " + store;
        }
        str += "\nYou ordered " + numToppings + " toppings";

        return str;
    }



    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }
}
