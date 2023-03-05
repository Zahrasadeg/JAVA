package class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo1 {
    public static void main(String[] args) throws IOException {
        //location or path of the file
        String path="Files/config.properties";
        //a class that help for navigate to that folder
        FileInputStream fileInputStream=new FileInputStream(path);
        //this properties class will assist us to read and write data to properties files
        Properties properties=new Properties();
        //loads all the data from file inside the above object "properties"
        properties.load(fileInputStream);
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("browser"));
        fileInputStream.close();


    }
}
