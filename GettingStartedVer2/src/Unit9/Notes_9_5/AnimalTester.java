package Unit9.Notes_9_5;

/**
* Lesson 9-5: Polymorphism
 * The purpose of this tester class is to see what happens when an array
 * of Animal references is assigned objects of type Animal, Pig, and Cow
 * 
 * @author   Mrs. Denna 
 */
public class AnimalTester
{
   public static void main(String[] args)
   {
       Animal[] barn = new Animal[6];
       // 1. What data type does this array hold?
       // Animal

       barn[0] = new Animal("Murphy");
       barn[1] = new Cow("Daisy", "Dairy");
       barn[2] = new Pig("Wilbur", false);
       barn[3] = new Cow("Billy", "Beef");
       barn[4] = new Animal("Maggie");
       barn[5] = new Pig("Max", true);

       // 2. Did I ONLY store Animal objects in this array?  If not, why do you
       //    think this was allowed?
       // No, you stored Cows, Pigs, along with Animals. This was probably allowed because Cow and Pig are subclasses
       // of Animal
   
       for (Animal a: barn)
            a.speak();

       Animal c1 = new Cow("Daisy","Dairy");
       Cow cowCast = (Cow) c1;
       cowCast.spots();
            // 3. What method is getting called here?  The speak method of the Animal class?
            // No, the speak method of each individual class
       // 4. Try to summarize in 2-3 sentences WHAT you observed in this code.
       // In this code, I observed that it is possible to create arrays and use specific data types in relation to
       // super classes to allow more things possible
       // The Animal array can refer to any animal object or animal subclass
       // That's why we were able to store a pig or animal when the speak method is called, java will execute
       // the speak method for whatever type of object it is; it looks at the constructor to determine what type of object
       // it is

   }
   
}
