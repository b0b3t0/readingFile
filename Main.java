package VuvedenieVProgramiraneto;

import java.io.IOException;
import static VuvedenieVProgramiraneto.ExceptionsClasses.readFile;

public class Main {
    //We give the static FILE_PATH variable the path of the file that we wont to read
    private final static String FILE_PATH = "file_path"; 
    
    public static void main(String[] args) {
        
        try {
            readFile(FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
