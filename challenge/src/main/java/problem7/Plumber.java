package problem7;

public class Plumber extends Person {
    public Plumber(String name) {
        super(name);
    }

    @Override
    public String getJob() {
        return "Plumber";
    }
}