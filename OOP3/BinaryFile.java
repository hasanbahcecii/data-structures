// BinaryFile alt sınıfı
package OOP3;

import java.io.FileInputStream;
import java.io.IOException;

class BinaryFile extends _File {
    private final String fileType = "Binary";

    public BinaryFile(String fileName, String fileWay) {
        super(fileName, fileWay);
    }

    @Override
    public void Read() {
        try (FileInputStream fis = new FileInputStream(fileWay + "/" + fileName)) {
            System.out.println("Binary dosya okunuyor...");
            int data;
            while ((data = fis.read()) != -1) {
                // örnek: byte değerlerini yazdır
                System.out.print(data + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Dosya okunamadı: " + e.getMessage());
        }
    }

    @Override
    public String Info() {
        return super.Info() + "\nDosya Tipi: " + fileType;
    }
}