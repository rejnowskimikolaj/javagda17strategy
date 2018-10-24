package file_saving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BufferedWriterFileOperator implements FileOperator {
    @Override
    public void saveToFile(List<String> lines) {
        try {
            FileWriter writer = new FileWriter("src/main/resources/output.txt");
            BufferedWriter buffer = new BufferedWriter(writer);

            for (String line : lines) {
                buffer.write(line + "\n");
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
