// Playlist.java
// Bu sınıf, şarkıların bağlı liste yapısında tutulduğu ana çalma listesidir.

public class Playlist {
    private SongNode headSong;     // Listenin ilk elemanını tutar
    private SongNode currentSong;  // O anda çalan şarkıyı gösterir

    // Yapıcı (Constructor)
    public Playlist() {
        headSong = null;
        currentSong = null;
    }

    //  Yeni şarkı ekleme (sona ekler)
    public void addSong(String title, String artist, double duration) {
        SongNode newSong = new SongNode(title, artist, duration, null);

        if (headSong == null) {
            // Liste boşsa başa ekle
            headSong = newSong;
            currentSong = headSong;
        } else {
            // Listenin sonuna ekle
            SongNode temp = headSong;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newSong);
            currentSong = newSong; // Son eklenen şarkıyı currentSong yap
        }
    }

    //  Belirli bir pozisyona şarkı ekleme
    public void addSongAt(String title, String artist, double duration, int position) {
        SongNode newSong = new SongNode(title, artist, duration, null);

        if (position == 0 || headSong == null) {
            // Başa ekleme durumu
            newSong.setNext(headSong);
            headSong = newSong;
            if (currentSong == null) currentSong = headSong;
            return;
        }

        SongNode temp = headSong;
        for (int i = 0; i < position - 1 && temp.getNext() != null; i++) {
            temp = temp.getNext();
        }

        newSong.setNext(temp.getNext());
        temp.setNext(newSong);
    }

    //  Şarkı silme
    public void removeSong(String title) {
        if (headSong == null) {
            System.out.println("Liste boş, silinecek şarkı yok.");
            return;
        }

        // İlk eleman silinecekse
        if (headSong.getTitle().equals(title)) {
            headSong = headSong.getNext();
            if (currentSong != null && currentSong.getTitle().equals(title)) {
                currentSong = headSong; // currentSong'u güncelle
            }
            System.out.println(title + " silindi.");
            return;
        }

        // Diğer elemanlar
        SongNode prev = headSong;
        SongNode temp = headSong.getNext();

        while (temp != null) {
            if (temp.getTitle().equals(title)) {
                prev.setNext(temp.getNext());
                if (currentSong != null && currentSong.getTitle().equals(title)) {
                    currentSong = headSong; // currentSong'u başa al
                }
                System.out.println(title + " silindi.");
                return;
            }
            prev = temp;
            temp = temp.getNext();
        }

        System.out.println("Şarkı bulunamadı: " + title);
    }

    //  Tüm listeyi yazdır
    public void showPlaylist() {
        if (headSong == null) {
            System.out.println("Şarkı listesi boş!");
        } else {
            SongNode temp = headSong;
            int i = 1;
            while (temp != null) {
                System.out.println(i + ". " + temp.getTitle() + " - " 
                    + temp.getArtist() + " (" + temp.getDuration() + " dk)");
                temp = temp.getNext();
                i++;
            }
        }
    }

    //  Şu anda çalan şarkıyı göster
    public void nowPlaying() {
        if (currentSong == null) {
            System.out.println("Şu anda hiçbir şarkı çalmıyor!");
        } else {
            System.out.println("Şu anda çalan şarkı: " + currentSong.getTitle() 
                + " - " + currentSong.getArtist());
        }
    }

    //  Sonraki şarkıya geç
    public void nextSong() {
        if (currentSong == null) {
            System.out.println("Henüz çalma listesinde şarkı yok!");
            return;
        }

        if (currentSong.getNext() == null) {
            System.out.println("Listenin sonuna geldiniz, başka şarkı yok.");
        } else {
            currentSong = currentSong.getNext();
            System.out.println("Şimdi çalıyor: " + currentSong.getTitle() + " - " + currentSong.getArtist());
        }
    }

    //  Şarkı ismine göre arama
    public void findSong(String title) {
        if (headSong == null) {
            System.out.println("Liste boş!");
            return;
        }

        SongNode temp = headSong;
        boolean found = false;
        while (temp != null) {
            if (temp.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Şarkı bulundu: " + temp.getTitle() + " - " + temp.getArtist());
                found = true;
            }
            temp = temp.getNext();
        }

        if (!found) System.out.println("Şarkı bulunamadı: " + title);
    }

    //  Sanatçı adına göre arama
    public void findArtist(String artist) {
        if (headSong == null) {
            System.out.println("Liste boş!");
            return;
        }

        SongNode temp = headSong;
        boolean found = false;
        while (temp != null) {
            if (temp.getArtist().equalsIgnoreCase(artist)) {
                System.out.println("Sanatçının şarkısı: " + temp.getTitle() + " (" + temp.getDuration() + " dk)");
                found = true;
            }
            temp = temp.getNext();
        }

        if (!found) System.out.println("Bu sanatçıya ait şarkı bulunamadı: " + artist);
    }

    //  Toplam süreyi hesapla
    public double totalDuration() {
        double totalDuration = 0;
        if (headSong == null) {
            System.out.println("Liste boş. Süre hesaplanamaz!");
            return 0;
        }

        SongNode temp = headSong;
        while (temp != null) {
            totalDuration += temp.getDuration();
            temp = temp.getNext();
        }

        return totalDuration;
    }

    // ---- Getter & Setter'lar ----
    public SongNode getHeadSong() {
        return headSong;
    }

    public void setHeadSong(SongNode head) {
        this.headSong = head;
    }

    public SongNode getCurrentSong() {
        return currentSong;
    }

    public void setCurrentSong(SongNode current) {
        this.currentSong = current;
    }
}
