package student;

public class Test {
    public static void main(String[] args) {


        // Display computer science students

        Major cs = Major.COMPUTER_SCIENCE;
        Major math = new Major("11", "Mathematics");
        Major physics = new Major("20", "Soft skills");

        Student s1 = new Student("Ajerouassi", "Adam", "0612345678", "adam.ajerouassi@um6p.ma", "22885676");
        Student s2 = new Student("Hachimi", "Samir", "0623456789", "samir.hachimi@um6p.ma", "23585976", cs);
        Student s3 = new Student("Bennani", "Youssef", "0634567890", "youssef.bennani@um6p.ma", "21456789", math);
        Student s4 = new Student("BenYassine", "Salma", "0645678901", "salma.benyassine@um6p.ma", "22654321", math);
        Student s5 = new Student("Benhammouda", "Youssef", "0656789012", "youssef.benhammouda@um6p.ma", "23112233", physics);


        System.out.println("The list of students in the computer science major is:");

        System.out.printf("1. %s %s %s\n", s1.getCne(), s1.getLastName(),s1.getFirstName());
        System.out.printf("2. %s %s %s\n", s2.getCne(), s2.getLastName(),s2.getFirstName());
        System.out.println();

        // Q5
        System.out.println(s1.getFullNameFormatted());
        System.out.println(s3.getFullNameFormatted());
        System.out.println();

        // Q6
        System.out.println(cs.findStudentByCNE("23585976"));
        System.out.println(cs.findStudentByCNE("00000000"));

        // Q7
        System.out.println("CS students: " + cs.getStudentCount());
        System.out.println("Physics students: " + physics.getStudentCount());
        System.out.println();


        // Q8
        String cneToDelete = "23585976";
        Major majorToDeleteFrom = cs;
        System.out.printf("Student with cne=%s was %sdeleted from %s.\n",cneToDelete,(majorToDeleteFrom.removeStudent(cneToDelete) ? "":"not "), majorToDeleteFrom.getName());
        System.out.println("CS students: " + cs.getStudentCount());
        System.out.println();


        // Q9
        System.out.printf("Computer science capacity: %d students%n" +
                "Current enrollment: %d students%n" +
                "Occupancy rate = %.2f%%%n",Major.STUDENTS_MAX_CAPACITY,cs.getStudentsSize(),cs.getOccupancyRate()*100);
        System.out.println();

        // Q10
        System.out.println(math.getStudentListAsString());


    }
}

