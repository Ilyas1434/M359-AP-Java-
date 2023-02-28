package Unit9.Notes_9_2;

public class MenuItem {
    private String name;

//    public MenuItem() {
//        // non-arg (argument) / default constructer w/ no parameters
//        name = "none given";
//        System.out.println("Created a MenuItem without a name?!?!?");
//    }
    public MenuItem(String name) {
        this.name = name;
        System.out.println("Created a MenuItem called " + name);
    }
    public String getName() {
        return name;
    }

}
