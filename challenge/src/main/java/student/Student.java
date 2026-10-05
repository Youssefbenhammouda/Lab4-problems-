package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student() {
        super();
    }
    public Student(String lastName, String firstName, String phone, String email,
                   String cne) {

        this(lastName, firstName, phone, email,cne,Major.COMPUTER_SCIENCE);
    }
    public Student(String lastName, String firstName, String phone, String email,
                   String cne, Major major) {
        super( firstName,lastName, phone, email);
        this.cne = cne;
        this.major = major;
        major.addStudent(this);
    }



    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{id=" + id
                + ", cne='" + cne + '\''
                + ", lastName='" + lastName + '\''
                + ", firstName='" + firstName + '\''
                + ", phone='" + phone + '\''
                + ", email='" + email + '\''
                + ", major=" + (major != null ? major.getCode() : null)
                + '}';
    }

    public String getFullNameFormatted(){
        return String.format("%s, %s",this.lastName.toUpperCase(),this.firstName);
    }
}