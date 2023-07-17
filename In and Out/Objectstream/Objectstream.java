import java.io.*;
public class Objectstream {
    public static void main(String[] args) {
        String s = "Welcome world!";
        int i = 897648764;
        try {
            FileOutputStream out = new FileOutputStream("create.txt");
            ObjectOutputStream oout = new ObjectOutputStream(out);
            oout.writeObject(s);
            oout.writeObject(i);
            oout.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("create.txt"));
            System.out.println("" + (String) ois.readObject());
            System.out.println("" + ois.readObject());
            } catch (Exception ex) {
                 ex.printStackTrace();
            }
    }
}