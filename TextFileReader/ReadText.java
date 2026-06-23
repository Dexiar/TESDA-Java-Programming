import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadText {
    public static void main(String[] args) {
        String fileLocalString = "./TextFileReader/resources/source.txt";
        try {
            FileReader fr = new FileReader(fileLocalString);
            BufferedReader reader = new BufferedReader(new FileReader("./TextFileReader/resources/source.txt"));
            String lines;
            while ((lines = reader.readLine()) !=null) {
                System.out.println(lines);
            }
        } catch (Exception e) {
            System.out.println("AN ERROR OCCURED DURING READING THE FILE");
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
