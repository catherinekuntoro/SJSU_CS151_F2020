import java.io.*;

public class CreateFile {

    public static void main(String[] args) {
        File f = new File("src/command_line_input.txt");
        try {
            //Setting up writing tools
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            //Reading tools
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line = br.readLine();

            while (line != null) {
                if (line.equals("@q")) {
                    break;
                } else {
                    bw.write(line); //write the current line
                    bw.newLine(); //create new line

                    line = br.readLine(); //reading the next line
                }
            }
            br.close();
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
