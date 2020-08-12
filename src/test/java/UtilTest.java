import models.Library;
import models.Person;
import utils.Util;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for Util class")
class UtilTest {

    Util util;

    @BeforeEach
    void init() {
        util = new Util();
    }

    @Test
    @DisplayName("Testing addUserToQueue")
    void addUserToQueue() {
        util.addUserToQueue(new Person("Tayo", "Senior Student"));
        util.addUserToQueue(new Person("Bond", "Teacher"));
        assertEquals(2, Util.libraryUsers.size(), "it should return " + 2);
    }

    @Test
    @DisplayName("Testing addBook")
    void addBook() {
        util.addBook("Change");
        assertTrue(Library.books.containsKey("Change"));
    }

    @Test
    @DisplayName("Testing borrowBook")
    void borrowBook() {
//        assertAll(
//                () -> assertTrue(school.getGrades().get(0).getStudents().contains(applicant1)),
//                () -> assertTrue(school.getGrades().get(1).getStudents().contains(applicant2)),
//                () -> assertTrue(school.getGrades().get(2).getStudents().contains(applicant3)),
//        );

    }

    @Test
    @DisplayName("Testing processPriorityQueue")
    void processPriorityQueue() {
    }

    @Test
    @DisplayName("Testing processQueue")
    void processQueue() {
    }
}