import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInput {

    public static void main(String[] args) {

        try {
            File f = new File("src/quote.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String newLine = br.readLine();

            while (newLine != null) {
                System.out.println(newLine);
                newLine = br.readLine();
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
