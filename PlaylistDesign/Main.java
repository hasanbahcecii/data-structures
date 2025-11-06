// Main.java
// Programın başlangıç noktası. Playlist sınıfını test eder.

public class Main {
    public static void main(String[] args) {
        Playlist p1 = new Playlist();

        // Şarkı ekleme
        p1.addSong("Bohemian Rhapsody", "Queen", 6.0);
        p1.addSong("Imagine", "John Lennon", 3.1);
        p1.addSong("Unforgiven", "Metallica", 6.24);

        // Listeyi göster
        p1.showPlaylist();

        // Şu anda çalan şarkı
        p1.nowPlaying();

        // Sonraki şarkıya geç
        p1.nextSong();
        p1.nowPlaying();

        // Şarkı arama
        p1.findSong("Imagine");

        // Sanatçı arama
        p1.findArtist("Metallica");

        // Toplam süre
        System.out.println("Toplam süre: " + p1.totalDuration() + " dakika");

        // Şarkı silme
        p1.removeSong("Imagine");
        p1.showPlaylist();
    }
}
