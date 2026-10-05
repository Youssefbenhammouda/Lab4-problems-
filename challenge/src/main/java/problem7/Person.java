package problem7;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getJob() {
        return "normal person";
    }

    public void display() {
        System.out.println("I am " + name + " the " + getJob());
    }
}
