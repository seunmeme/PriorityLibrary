
# PriorityLibrary
A simple web application that implements priority queue and normal queue (FIFO).


## UML Diagram for Classes


| Person                 | Library                        |  Util                                                  |   
| ---------------------  |------------------------------- | ------------------------------------------------------ |
| - name : String         | - books : Map<String, Integer>  |  - libraryUsers: List\<Person>                         |
| - type : String         |                                |                                                        |
| - rank : int            |                                |  + addUserToQueue() : void                              |
|                         |                  |  + addBook() : void                                     |       
| + Person(name: String, type: String) |                  |  + borrowBook(book: String, libraryUser: Person) : String                                |       
| + getName() : String    |                                |  + processPriorityQueue(book: String, libraryUsers: List<Person>) : void |                               
| + getType() : String    |                                |   + processQueue(book: String, libraryUsers: List<Person>) : void  |   
| + compareTo() : int     |                                |         |   


## Author
Solomon Odewale