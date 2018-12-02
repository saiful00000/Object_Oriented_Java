
/* Java program for a university advising system
*  the program is an console application
*  I try this code in console mode to implement my android project
 */

package StudentAdvisingSystem;

public class Advisor {

    public String advisorName = "Mehjabin";

    public static void main(String[] args) {

        Subjects subjects = new Subjects("Biology","DataStructure","Algorithm");

        Student student = new Student("161-003-042","Md. Saiful Islam",subjects);

        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());
        System.out.println(student.getSubjects().getSubject1());
        System.out.println(student.getSubjects().getSubject2());
        System.out.println(student.getSubjects().getSubject3());

    }

}
