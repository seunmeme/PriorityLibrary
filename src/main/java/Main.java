import models.Person;
import utils.Util;

public class Main {
    public static void main(String[] args) {

        Util util = new Util();

        util.addBook("Habits");
        util.addBook("Science");
        util.addBook("Habits");
        util.addBook("Peer Pressure");
        util.addBook("The City");

        util.addUserToQueue(new Person("Martins", "Senior Student"));
        util.addUserToQueue(new Person("Seyi", "Junior Student"));
        util.addUserToQueue(new Person("Tayo", "Teacher"));

       util.processPriorityQueue("Habits", util.getLibraryUsers());
        // util.processQueue("Habits", util.getLibraryUsers());

    }
}
