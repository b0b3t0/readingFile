package VuvedenieVProgramiraneto;

import java.io.*;

public class ExceptionsClasses {
    public static void readFile(String fileName) throws IOException{
        try {
            FileInputStream input = new FileInputStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("The file \"" + fileName + "\" is not found!");
        }
    }

    public static void main(String[] args) {
        try {
            readFile("F:\\JavaProjects\\Training\\src\\VuvedenieVProgramiraneto\\asd.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}