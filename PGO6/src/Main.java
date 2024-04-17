import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student=new Student("John", "Doe", "doe@wp.pl", "Warsaw,Zlota 12", "333-322-222", new Date(1980,1,1));

        StudyProgramme it=new StudyProgramme("IT","AAA",7,5);

        student.enrollStudent(it);

        student.addGrade(5,"PGO");
        student.addGrade(2,"APBD");

        List<Student>students=new ArrayList<>();
        students.add(student);

        Student.promoteAllStudents(students);
        Student.displayInfoAboutAllStudents(students);


        }
    }
