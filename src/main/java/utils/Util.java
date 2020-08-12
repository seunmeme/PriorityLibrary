package utils;

import models.Library;
import models.Person;

import java.util.*;

public class Util {

    private List<Person> libraryUsers = new ArrayList();

    public List<Person> getLibraryUsers() {
        return libraryUsers;
    }

    public void addUserToQueue(Person person){
        libraryUsers.add(person);
    }


//    add books to library and increase number of books accordingly
    public void addBook(String book){

        int count = 1;
        if(Library.books.containsKey(book)){
            count = Library.books.get(book) + 1;
        }
        Library.books.put(book, count);
    }


//    Logic to lend book to users if available or give feedback if it's not
    public String borrowBook(String book, Person libraryUser){

        try{

            if(Library.books.get(book) == null){
                throw new NullPointerException();
            }

//        Logic to reduce quantity of book after lending
            if(Library.books.get(book) > 0){
                int newCount = Library.books.get(book) - 1;
                Library.books.remove(book);
                Library.books.put(book, newCount);

                return libraryUser.getType() + " got " + book + " from the library.";

            }else{
                return "book taken";
            }

        } catch (NullPointerException e){
            return book + " is not available at this time.";
        }

    }


//    Logic to process lending books based on priority
    public void processPriorityQueue(String book, List libraryUsers){
        PriorityQueue users = new PriorityQueue(libraryUsers);

        for(int i = 0; i < users.size(); i++){
            Person currentUser = (Person)users.peek();
            libraryUsers.remove(currentUser);
            System.out.println(borrowBook(book, currentUser) );
        }

    }


//    Logic to process lending books based on queue
    public void processQueue(String book, List<Person> libraryUsers){
        LinkedList users = new LinkedList(libraryUsers);

        for(int i = 0; i < users.size(); i++){
            Person currentUser = (Person)users.peek();
            libraryUsers.remove(currentUser);
            System.out.println(borrowBook(book, currentUser) );
        }

    }


}
