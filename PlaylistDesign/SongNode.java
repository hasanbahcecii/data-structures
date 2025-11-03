public class SongNode 
{
    private String title;
    private String artist;
    private double duration;
    SongNode next;

    public SongNode(String title, String artist, double duration, SongNode next) 
    {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.next = null;

    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public SongNode getNext() {
        return next;
    }

    public void setNext(SongNode next) {
        this.next = next;
    }
   
}
