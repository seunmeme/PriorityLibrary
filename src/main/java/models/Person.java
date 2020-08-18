package models;

public class Person {
    private String name;
    private String type;
    private int rank;

    public Person(String name, String type) {
        this.name = name;
        this.type = type;

        if ("Teacher".equals(this.type)) {
            this.rank = 1;

        } else if ("Senior Student".equals(this.type)) {
            this.rank = 2;

        } else if ("Junior Student".equals(this.type)) {
            this.rank = 3;
        }


    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getRank() {
        return rank;
    }
}
