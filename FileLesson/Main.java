package FileLesson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\alper\\Documents\\NetBeansProjects\\JavaLesson\\src\\main\\java\\FileLesson\\testFile.txt");
        createFile(file);
        getFileInfo(file);
        writeFile(file,"test4");
        readFile(file);
    }

    public static void createFile(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("The file already exists");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void getFileInfo(File file) {
        if(file.exists()){
            System.out.println("File name -> " + file.getName());
            System.out.println("File path -> " + file.getAbsolutePath());
            System.out.println("Can the file be written -> " + file.canWrite());
            System.out.println("Is the file readable -> " + file.canRead());
            System.out.println("File size -> " + file.length());
        }
        else{
            System.out.println("The file not exists");
        }
    }
    
    public static void readFile(File file){
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeFile(File file, String line){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsolutePath(),true));
            writer.newLine();
            writer.write(line);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
