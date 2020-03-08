package VuvedenieVProgramiraneto;

import java.io.IOException;
import static VuvedenieVProgramiraneto.ExceptionsClasses.readFile;

public class Main {
    
    private final static String FILE_PATH = "F:\\JavaProjects\\Training\\src\\VuvedenieVProgramiraneto\\asd.txt";
    
    public static void main(String[] args) {
        
        try {
            readFile(FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
