package instructor;

public class Test {
    public static void main(String[] args) {
        Instructor ins1 = new Instructor("Kalloubi", "Fahd", "0661234567", "fahd.kalloubi@um6p.ma", " AB 123 ");
        Instructor ins2 = new Instructor("El Allali", null, "0667654321", "achraf.elallali@um6p.ma", "CD456");
        Subject sub1 = new Subject(" cs-java-101 ", "introduction to java", ins1);
        Subject sub2 = new Subject("Algo-201", "Algorithms", ins2);
        Subject sub3 = new Subject("intro-db", "databases", ins2);
        System.out.printf("`%s` -> `%s`%n",ins1.getEmployeeNumber(),ins1.cleanEmployeeNumber());
        System.out.printf("`%s` -> `%s`%n",sub1.getCode(),sub1.normalizedCode());
        System.out.printf("`%s` -> `%s`%n",sub1.getTitle(),sub1.properTitle());
        System.out.println(ins1.summaryLine());
        System.out.println();

        System.out.println(sub1.isIntroCourse());
        System.out.println(sub2.isIntroCourse());
        System.out.println(sub3.isIntroCourse());

        System.out.println();
        System.out.println(ins1.toCard());
        System.out.println();
        System.out.println(sub1.syllabusLine());
        System.out.println(sub2.syllabusLine());

        System.out.println();
        System.out.println(ins1.displayName());
        System.out.println(ins2.displayName());
    }
}
