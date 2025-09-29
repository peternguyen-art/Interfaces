import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a file");

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            ShortWordFilter filter = new ShortWordFilter();

            try(Scanner scanner = new Scanner(selectedFile)) {
                System.out.println("Short words from "+ selectedFile.getName());

                while(scanner.hasNext()) {
                    String word = scanner.next();
                    if (filter.accept(word)) {
                        System.out.println(word);
                    }
                }

            }catch(FileNotFoundException e) {
                System.out.println("File Not Found");
            }
        } else {
            System.out.println("File not selected");
        }
    }
}