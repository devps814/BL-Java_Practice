import java.io.*;

// Custom Unchecked Exception
class FileMissingException extends RuntimeException {

    FileMissingException(String message) {
        super(message);
    }
}

public class FileHandling {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("data.txt"));

            String line;

            System.out.println("File Content:");

            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }

        }
        catch (FileNotFoundException e) {
            throw new FileMissingException("File not found!");

        }

        catch (IOException e) {
            System.out.println("Error while reading file");
        }

        finally {

            try {

                if (br != null) {
                    br.close();
                }

            } catch (IOException e) {
                System.out.println("Error with the closing of file");
            }
        }
    }
}