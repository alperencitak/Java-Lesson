package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args){
        BufferedReader reader = null;
        int total =0;
        try {
             reader = new BufferedReader(new FileReader("C:\\Users\\alper\\Documents\\NetBeansProjects\\JavaLesson\\src\\main\\java\\readingFileDemo\\numbers.txt"));
             String line = null;
             while((line = reader.readLine())!=null){
                 total += Integer.valueOf(line);
             }
             System.out.println("Total = " + total);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
                reader.close();
            }
            catch(IOException exception){
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, exception);
            }
            catch(NullPointerException exception){
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, exception);
            }
        }
    }

}
