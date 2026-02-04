package lec8_objectandclass.example1;

public class car {

    private String model;
    private int year;

    public car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Model:" + model + ", Year:" + year);
    }
}
