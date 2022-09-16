package Unit2.Homework;

public class Phone {
    private String brand;
    private int storage;
    private boolean service;

    public Phone(String aBrand, int aStorage, boolean aService) {
        brand = aBrand;
        storage = aStorage;
        service = aService;
    }
    public Phone(String bBrand, int bStorage) {
        brand = bBrand;
        storage = bStorage;
        service = true;
    }
    public void turnOnService() {
        service = true;
    }
    public void turnOffService() {
        service = false;
    }
    public void printPhoneDetails() {
        System.out.println("This is a(n) " + brand + " phone, it has " + storage + "GB of storage, and the service status is ");
        System.out.println(service + " ");
    }

    /*
    These are getter methods. They return the value of the instance var
    so that the calling program can access it.
    The return type is equal to the type of the variable
    There are no parameters.
     */
    public String getBrand() {
        return brand;
    }
    public int getStorage() {
        return storage;
    }
    public boolean getService() {
        return service;
    }

    /*
    These are the setters. They allow us to change the private instance variables
    from other java files.
    They have void return type
    They have one parameter
     */
    public void setBrand(String cBrand) {
        brand = cBrand;
    }
    public void setStorage(int cStorage) {
        storage = cStorage;
    }
    public void setService(boolean cService) {
        service = cService;
    }
}
