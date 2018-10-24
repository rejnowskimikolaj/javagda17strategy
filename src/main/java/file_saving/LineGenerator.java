package file_saving;

import java.util.List;

public interface LineGenerator {
    List<String> getLinesFrom(List<Student>students);
}
