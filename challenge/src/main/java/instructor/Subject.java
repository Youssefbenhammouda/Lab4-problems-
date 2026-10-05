package instructor;

public class Subject {
    private int id;
    private String code;
    private String title;
    private Instructor instructor;

    private static int nextId = 1;

    public Subject() {
        id = nextId++;
    }

    public Subject(String code, String title, Instructor instructor) {
        this();
        this.code = code;
        this.title = title;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }



    @Override
    public String toString() {
        return "Subject{id=" + id
                + ", code='" + code + '\''
                + ", title='" + title + '\''
                + ", instructor=" + (instructor != null ? instructor.getEmployeeNumber() : null)
                + '}';
    }

    public String normalizedCode(){
        int k =0;
        StringBuilder cleaned = new StringBuilder(code.toUpperCase());
        for (int i = 0; i < cleaned.length(); i++) {

            if(cleaned.charAt(i) != ' '){
                char temp = cleaned.charAt(i);
                cleaned.setCharAt(i,cleaned.charAt(k));
                cleaned.setCharAt(k++,temp);


            }

        }
        cleaned.delete(k,cleaned.length());
        return cleaned.toString();
    }

    public String properTitle(){
        StringBuilder proper = new StringBuilder(title.toLowerCase());
        proper.setCharAt(0,Character.toUpperCase(proper.charAt(0)));
        for (int i = 1; i < proper.length()-1; i++) {

            if(proper.charAt(i) == ' ') proper.setCharAt(i+1,Character.toUpperCase(proper.charAt(i+1)));


        }

        return  proper.toString();
    }

    public boolean isIntroCourse(){
            if(normalizedCode().startsWith("INTRO-") || title.toLowerCase().contains("intro")) return true;
            return false;
    }

    public String syllabusLine() {
        StringBuilder sb = new StringBuilder();
        sb.append(normalizedCode()).append(" - ").append(properTitle())
                .append(" (Instructor: ")
                .append(instructor.getLastName()).append(' ').append(instructor.getFirstName())
                .append(')');
        return sb.toString();
    }
}