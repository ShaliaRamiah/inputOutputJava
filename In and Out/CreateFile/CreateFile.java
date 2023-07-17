import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String[] args) {
        try {
            File en = new File("Success.txt");
            if (en.createNewFile()) {
                System.out.println("File created: " + en.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}