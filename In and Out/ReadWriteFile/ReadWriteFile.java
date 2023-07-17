import java.io.*;
public class ReadWriteFile {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide input and output files");
            System.exit(0);
            }   
        String inputFile = args[0];
        String outputFile = args[1];
        try ( InputStream inputStream = new FileInputStream(inputFile);
        OutputStream outputStream = new FileOutputStream(outputFile);) {
        long fileSize = new File(inputFile).length();
         byte[] allBytes = new byte[(int) fileSize];
         inputStream.read(allBytes);
         outputStream.write(allBytes);
         } catch (IOException ex) {
             ex.printStackTrace();
         }System.out.println("The copy.txt file is created successfully and content of the sample.txt is copied to the copy.txt file.");
    }
}