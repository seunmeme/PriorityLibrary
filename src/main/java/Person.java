public class Person implements Comparable<Person>{
    private String name;
    private String type;
    private int rank;

    public Person(String name, String type) {
        this.name = name;
        this.type = type;

        if (this.type == "Teacher"){
            this.rank = 1;
        } else if (this.type == "Senior Student"){
            this.rank = 2;
        } else if(this.type == "Junior Student"){
            this.rank = 3;
        }

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }



    @Override
    public int compareTo(Person o) {
        if(rank < o.rank){
            return -1;
        }else if(rank > o.rank){
            return 1;
        }else {
            return 0;
        }

    }
}
