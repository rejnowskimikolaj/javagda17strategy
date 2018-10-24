package file_saving;

public class Main {
    public static void main(String[] args) {
        Student student1 =new Student("Roger","Moore","1234");
        Student student2 =new Student("Roger","Waters","12345");
        Student student3 =new Student("Gary","Moore","1234");
        StudentBook studentBook =new StudentBook(new SemicolonSeparatingLineGenerator(),new BufferedWriterFileOperator());

        studentBook.addStudent(student1);
        studentBook.addStudent(student2);
        studentBook.addStudent(student3);
        studentBook.save();
    }
}
