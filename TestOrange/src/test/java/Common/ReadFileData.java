package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ReadFileData {
//    public static void main(String[] args) {
     public String readData(){

         File file = new File

                ("C:/Users/rejiram.rn/OneDrive - PITSOLUTIONS/Desktop/TestOrange/src/test/java/Properties/javaLoc.properties");
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();
        try {
            prop.load(fileInput);
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        Enumeration KeyValues = prop.keys();
        while (KeyValues.hasMoreElements()) {
            String key = (String) KeyValues.nextElement();
            String value = prop.getProperty(key);
            System.out.println(key + ":- " + value);
            return value;
        }
        return "";
    }
}
