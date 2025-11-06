// SongNode.java
// Bu sınıf, bağlı listedeki her bir şarkıyı temsil eder.

public class SongNode {
    private String title;     // Şarkının başlığı
    private String artist;    // Şarkının sanatçısı
    private double duration;  // Şarkının süresi (dakika cinsinden)
    private SongNode next;    // Listenin bir sonraki elemanını gösteren referans

    // Yapıcı (Constructor) metot
    public SongNode(String title, String artist, double duration, SongNode next) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.next = null; // burada next de olabilir (son eleman)
    }

    // ---- Getter & Setter metotları ----
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public SongNode getNext() {
        return next;
    }

    public void setNext(SongNode next) {
        this.next = next;
    }
}
