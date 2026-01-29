import java.io.*;
public class ByteWriteDemo {
public static void main(String[] args) throws IOException {
FileOutputStream fos = new FileOutputStream("data.bin");
fos.write(65); // writes ASCII value of 'A'
fos.close();
System.out.println("Data written using byte stream");
}
}
