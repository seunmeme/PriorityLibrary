
# PriorityLibrary
A simple web application that implements priority queue and normal queue (FIFO).


## UML Diagram for Classes


| Person                        | Library                           |  Util                           |   
| ----------------------------  |---------------------------------- | ------------------------------- |
| - name: String                | - books: Map<String, Integer>     |  - libraryUsers: List<Person>    
| - type: String                |                                   |
| - rank: int                   |                                   |
| ------------------------------------------------- | 
| + Person(name: String, type: String)          | 
| + getName(): String        | 
| + getType(): String      | 
| + compareTo(): int      |

## Author
Solomon Odewale