import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {


    public static void parseCSV(String filePath) {
        //List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                System.out.println(Arrays.toString(values));
                // Предполагая, что в CSV есть заголовки, пропускаем первую строку
                // if (values[0].equals("Фамилия Имя")) continue;
                // Student student = new Student(values[0], values[1] /* передайте дополнительные значения */);
                // students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return students;
    }
}
