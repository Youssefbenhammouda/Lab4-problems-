package problem7;

public class Carpenter extends Person {
    public Carpenter(String name) {
        super(name);
    }

    @Override
    public String getJob() {
        return "Carpenter";
    }
}