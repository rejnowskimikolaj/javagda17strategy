package file_saving;

import java.util.ArrayList;
import java.util.List;

public class SemicolonSeparatingLineGenerator implements LineGenerator {

    private static final String SEPARATOR = ";";
    @Override
    public List<String> getLinesFrom(List<Student> students) {

        List<String>lines = new ArrayList<>();
        for (Student student : students) {
            lines.add(toLine(student));
        }

        return lines;
    }

    private String toLine(Student student){
        String result = "";
        result+=student.getFirstName()+SEPARATOR;
        result+=student.getLastName()+SEPARATOR;
        result+=student.getId();
        return result;
    }
}
