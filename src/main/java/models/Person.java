package models;

public class Person {
    private String name;
    private String type;
    private boolean hasLibraryCard;
    private int rank;

    public Person(String name, String type, boolean hasLibraryCard) {
        this.name = name;
        this.type = type;
        this.hasLibraryCard = hasLibraryCard;

        if ("Teacher".equals(this.type)) {
            this.rank = 1;

        } else if ("Senior Student".equals(this.type)) {
            this.rank = 2;

        } else if ("Junior Student".equals(this.type)) {
            this.rank = 3;
        }


    }

    public Person(String name, String type){
        this(name, type, false);
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

    public boolean hasLibraryCard() {
        return hasLibraryCard;
    }
}
