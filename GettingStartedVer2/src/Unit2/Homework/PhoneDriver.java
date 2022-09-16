package Unit2.Homework;

public class PhoneDriver {
    public static void main(String args[]) {
        Phone samsung8NoService = new Phone("Samsung", 8, false);
        Phone apple64Service = new Phone("Apple", 64);
        samsung8NoService.printPhoneDetails();
        apple64Service.printPhoneDetails();
        samsung8NoService.turnOnService();
        samsung8NoService.printPhoneDetails();
        apple64Service.turnOffService();
        apple64Service.printPhoneDetails();

        apple64Service.setService(true);
        System.out.println(apple64Service.getService());
    }
}
