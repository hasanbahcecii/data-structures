package OOP3;
abstract class _File {
    protected String fileName;
    protected String fileWay;

    public _File(String fileName, String fileWay) {
        this.fileName = fileName;
        this.fileWay = fileWay;
    }

    public String Info() {
        return "Dosya Adı: " + fileName + "\nDosya Yolu: " + fileWay;
    }

    public abstract void Read(); // her alt sınıf kendi okuma mantığını uygular
}



