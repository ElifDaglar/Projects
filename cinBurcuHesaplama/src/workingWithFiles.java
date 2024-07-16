import java.io.*;
import java.util.Scanner;

public class workingWithFiles {
    public static void main(String[] args) {
        getFileInfo();
        readFile();
        writeFile();
        readFile(); //dosyanın üzerine yazdı
        MyList<String> sehirler = new MyList<>();
        sehirler.add("Ankara");
        sehirler.add();
    }

    public static void createFile() {
        File file = new File("C:\\Users\\Elif\\IdeaProjects\\file.txt");
        try {
            if (file.createNewFile()) {  //oluşturur aynı zamanda true false dönderir.
                System.out.println("Dosya oluşturuldu");
            } else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\Elif\\IdeaProjects\\file.txt");
        if (file.exists()) {
            System.out.println("Dosya Adı: " + file.getName());
            System.out.println("Dosya Yolu: " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi? " + file.canWrite());
            System.out.println("Dosya okunabilir mi? " + file.canRead());
            System.out.println("Dosya boyutu(byte): " + file.length());
        }
    }
    public static void readFile(){
        File file = new File("C:\\Users\\Elif\\IdeaProjects\\file.txt");
        try {
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine()){
                //okunacak satır varsa
                String line= reader.nextLine();
                System.out.println(line);
            }
            reader.close(); //dosyayı bellekten siler.

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile() {
        try {
            FileWriter fileWriter=new FileWriter("C:\\Users\\Elif\\IdeaProjects\\file.txt");
            //2.yol:
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Elif\\IdeaProjects\\file.txt",true));
            writer.write("Tugba");
            System.out.println("Dosyaya yazıldı.");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}


