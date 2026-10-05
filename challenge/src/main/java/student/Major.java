package student;

public class Major {
    private int id;
    private String code;
    private String name;

    static private int nextId=1;
    public static final Major COMPUTER_SCIENCE = new Major("23","Computer Science");
    public static final int STUDENTS_MAX_CAPACITY = 50;
    private Student[] students = new Student[STUDENTS_MAX_CAPACITY];
    private int studentsSize = 0;

    public Major() {
        this.id = nextId++;
    }

    public Major(String code, String name) {
        this();
        this.code = code;
        this.name = name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Major< id=" + id
                + ", code='" + code + '\''
                + ", name='" + name + '\''
                + '>';
    }


    public  void addStudent(Student student){
        if(studentsSize>=50) return ;

        students[studentsSize++] = student;
    }


    public Student findStudentByCNE(String cne){
        for (int i = 0; i < studentsSize; i++)
            if(students[i].getCne().equals(cne))
                return students[i];



        return null;
    }
    public int getStudentCount(){
        return studentsSize;
    }

    public boolean removeStudent(String cne){
        Student occ = findStudentByCNE(cne);

        if(occ == null) return  false;

        int occIdx = -1;
        for (int i = 0; i <studentsSize ; i++) {
            if(occIdx < 0 &&  students[i]==occ) {
                occIdx = i;
                studentsSize--;

            }
            if(occIdx>=0){
                students[i] = students[i+1];

            }

        }
        return  true;
    }

    public double getOccupancyRate(){

        return  studentsSize*1.0/STUDENTS_MAX_CAPACITY;
    }

    public int getStudentsSize() {
        return studentsSize;
    }
    public String  getStudentListAsString(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < studentsSize; i++) {
            s.append(students[i]);
            s.append('\n');


        }
        return s.toString();
    }
}