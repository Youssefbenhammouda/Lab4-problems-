package instructor;

import student.Person;

public class Instructor extends Person {
    private String employeeNumber;

    public Instructor() {
        super();
    }

    public Instructor(String lastName, String firstName, String phone, String email,
                      String employeeNumber) {
        super( firstName,lastName, phone, email);
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "Instructor{id=" + id
                + ", employeeNumber='" + employeeNumber + '\''
                + ", lastName='" + lastName + '\''
                + ", firstName='" + firstName + '\''
                + ", phone='" + phone + '\''
                + ", email='" + email + '\''
                + '}';
    }

    public String cleanEmployeeNumber(){

        int k =0;
        StringBuilder cleaned = new StringBuilder(employeeNumber);
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

    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                employeeNumber, lastName, firstName);
    }

    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor\n")
                .append("----------\n")
                .append("Employee #: ").append(cleanEmployeeNumber())
                .append("\nName : ").append(lastName).append(", ").append(firstName)
                .append("\nEmail : ").append(email)
                .append("\nPhone : ").append(phone);
        return sb.toString();
    }

    public String displayName() {
        StringBuilder sb = new StringBuilder();
        if (firstName != null) {
            sb.append(firstName);
        }
        if (lastName != null) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(lastName);
        }
        return sb.toString();
    }
}