import models.Library;
import models.Person;
import utils.Util;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for Util class")
class UtilTest {

    Util util = new Util();

    @BeforeEach
    void init() {
        util = new Util();
    }

    @Test
    @DisplayName("Testing getLibraryUsers")
    void getLibraryUsers() {
        util.addUserToQueue(new Person("Tayo", "Senior Student"));
        util.addUserToQueue(new Person("Bond", "Teacher"));
        util.addUserToQueue(new Person("Shade", "Junior Student"));

        assertTrue(util.getLibraryUsers().size() == 3);
    }

    @Test
    @DisplayName("Testing addUserToQueue")
    void addUserToQueue() {
        util.addUserToQueue(new Person("Tayo", "Senior Student"));
        util.addUserToQueue(new Person("Bond", "Teacher"));

        assertEquals(2, util.getLibraryUsers().size(), "it should return " + 2);
    }

    @Test
    @DisplayName("Testing addBook")
    void addBook() {
        util.addBook("Change");
        util.addBook("Change");
        util.addBook("The City");
        assertAll(
                () ->  assertTrue(Library.books.containsKey("Change")),
                () ->  assertTrue(Library.books.containsKey("The City")),
                () ->  assertEquals(2, Library.books.get("Change"))
        );
    }

    @Test
    @DisplayName("Testing borrowBook")
    void borrowBook() {
        util.addBook("Changes");

        assertAll(
                () -> assertEquals("Teacher got Changes from the library.", util.borrowBook("Changes", new Person("Tayo", "Teacher"))),
                () -> assertEquals("book taken", util.borrowBook("Changes", new Person("Tammy", "Senior Student"))),
                () -> assertEquals("Becoming is not available at this time.", util.borrowBook("Becoming", new Person("Tayo", "Teacher")))
        );

    }

    @Test
    @DisplayName("Testing processPriorityQueue")
    void processPriorityQueue() {
        util.addUserToQueue(new Person("Tayo", "Senior Student"));
        util.addUserToQueue(new Person("Bond", "Teacher"));

        util.addBook("Science");
        util.addBook("Science");

        util.processPriorityQueue("Science", util.getLibraryUsers());

        assertEquals(0, Library.books.get("Science"));
    }

    @Test
    @DisplayName("Testing processQueue")
    void processQueue() {
        util.addUserToQueue(new Person("Tayo", "Senior Student"));
        util.addUserToQueue(new Person("Bond", "Teacher"));

        util.addBook("Science");
        util.addBook("Science");
        util.addBook("Science");

        util.processQueue("Science", util.getLibraryUsers());
        assertTrue(Library.books.get("Science") == 1);

    }
}