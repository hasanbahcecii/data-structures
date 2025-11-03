package OOP3;
import java.io.*;
import java.util.Scanner;
// TextFile alt sınıfı
class TextFile extends _File {
    private final String fileType = "Text";

    public TextFile(String fileName, String fileWay) {
        super(fileName, fileWay);
    }

    @Override
    public void Read() {
        try (Scanner sn = new Scanner(new File(fileWay + "/" + fileName))) {
            System.out.println("Metin dosyası içeriği:");
            while (sn.hasNextLine()) {
                System.out.println(sn.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı: " + e.getMessage());
        }
    }

    @Override
    public String Info() {
        return super.Info() + "\nDosya Tipi: " + fileType;
    }
}