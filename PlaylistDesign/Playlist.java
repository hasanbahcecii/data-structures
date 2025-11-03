public class Playlist 
{
    private SongNode headSong;
    private SongNode currentSong;

    public Playlist() 
    {
        headSong = null;
        currentSong = null;
    };

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
            currentSong = newSong; //  Son eklenen şarkıyı currentSong yap
        }
    }

    public void addSongAt(String title, String artist, double duration, int position) {
        SongNode newSong = new SongNode(title, artist, duration, null);

        if (position == 0 || headSong == null) {
            // Başa ekle
            newSong.setNext(headSong);
            headSong = newSong;
            if (currentSong == null) currentSong = headSong;
            return;
        }

        SongNode temp = headSong;
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        newSong.setNext(temp.next);
        temp.setNext(newSong);
    }

    public void removeSong(String title) 
    {
        if (headSong == null) 
        {
            // Liste boş
            return;
        }

        // Eğer ilk düğüm silinecekse
        if (headSong.getTitle().equals(title)) 
        {
            headSong = headSong.getNext();
            if (currentSong != null && currentSong.getTitle().equals(title)) 
            {
                currentSong = headSong; // currentSong'u güncelle
            }
            return;
        }

        // Aradaki düğümleri kontrol et
        SongNode prev = headSong;
        SongNode temp = headSong.getNext();

        while (temp != null) 
        {
            if (temp.getTitle().equals(title)) 
            {
                prev.setNext(temp.getNext()); // bağlantıyı kopar
                if (currentSong != null && currentSong.getTitle().equals(title)) 
                {
                    currentSong = headSong; // currentSong'u başa al
                }
                return;
            }
            prev = temp;
            temp = temp.getNext();
        }
    }

    public void showPlaylist() {
        if (headSong == null) {
            System.out.println("Şarkı listesi boş!");
        } else {
            SongNode temp = headSong;
            int i = 1;
            while (temp != null) {
                System.out.println(i + ". " 
                    + temp.getTitle() + " - " 
                    + temp.getArtist() + " (" 
                    + temp.getDuration() + " dk)");
                temp = temp.getNext(); // sonraki düğüme geç
                i++;
            }
        }
    }


    public void nowPlaying()
    {

    }

    public void nextSong()
    {

    }

    public void findSong(String title)
    {
        
    }

    public void findArtist(String title)
    {
        
    }

    public double totalDuration()
    {
        double totalDuration = 0;
        if(headSong == null)
        {
            System.out.println("Liste bos. Sarkici bulunamaz ve sure hesaplanamaz!");
            return 0;
        }
        else
        {
            SongNode temp = headSong;

            while(temp != null)
            {
                totalDuration += temp.getDuration();
                temp = temp.getNext(); 
            }
        }
        return  totalDuration;
    }

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
