import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
public class UsingMapped {
    private static String bigTextFile = "test.txt";
    public static void main(String[] args) throws Exception {
        File file = new File(bigTextFile);
        file.delete();
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
           FileChannel fileChannel = randomAccessFile.getChannel();
            MappedByteBuffer buffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 4096 * 8 * 8);
            buffer.put("Learning Core Java".getBytes());
        } System.out.println ("The test.txt file is created successfully and the statement Learning Core Java is copied to it.");
    }
}