import models.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for Person class")
class PersonTest {

    Person person;

    @BeforeEach
    void init() {
        person = new Person("Sol", "Teacher");
    }


    @Test
    @DisplayName("Testing getName")
    void getName() {
        String expected = "Sol";
        String actual = person.getName();
        assertEquals(expected, actual, "it should return " + expected);
    }

    @Test
    @DisplayName("Testing getType")
    void getType() {
        String expected = "Teacher";
        String actual = person.getType();
        assertEquals(expected, actual, "it should return " + expected);
    }


}