import java.io.File;
public class FileClassDemo {
public static void main(String[] args) {
File f = new File("sample.txt");
System.out.println("File exists: " + f.exists());
System.out.println("File name: " + f.getName());
System.out.println("Absolute path: " + f.getAbsolutePath());
}
}
