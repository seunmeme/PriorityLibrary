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
//    Implemented using stream API
    public void processPriorityQueue(String book, List<Person> libraryUsers){
//        PriorityQueue<Person> users = new PriorityQueue<Person>(libraryUsers);
        PriorityQueue<Person> users = new PriorityQueue<Person>((firstUser, secondUser) -> Integer.compare(firstUser.getRank(), secondUser.getRank()));
        users.addAll(libraryUsers);
//         for(int i = 0; i < libraryUsers.size(); i++){
////             Person currentUser = (Person)users.poll();
////             libraryUsers.remove(currentUser);
////             System.out.println( borrowBook(book, users.poll()) );
////
//         }

        libraryUsers.stream()
               .forEach(user -> System.out.println( borrowBook(book, users.poll()) ) );

    }


//    Logic to process lending books based on queue
    public void processQueue(String book, List<Person> libraryUsers){
        LinkedList<Person> users = new LinkedList<Person> (libraryUsers);

        // for(int i = 0; i < users.size(); i++){
        //     Person currentUser = (Person)users.peek();
        //     libraryUsers.remove(currentUser);
        //     System.out.println(borrowBook(book, currentUser) );
        // }
        users.stream()
              .forEach(user -> System.out.println( borrowBook( book, user) ) );


    }


}
