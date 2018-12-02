package StudentAdvisingSystem;

public class Student {

    private String studentId;
    private String studentName;
    private Subjects subjects;

    public Student(String studentId, String studentName, Subjects subjects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjects = subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

}
