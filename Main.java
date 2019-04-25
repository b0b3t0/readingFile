package VuvedenieVProgramiraneto;

import java.io.IOException;
import static VuvedenieVProgramiraneto.ExceptionsClasses.readFile;

public class Main {
    public static void main(String[] args) {
        try {
            readFile("F:\\JavaProjects\\Training\\src\\VuvedenieVProgramiraneto\\asd.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
