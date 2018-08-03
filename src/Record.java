import util.Input;

public class Record {
    public String title;
    public String artist;
    public int releaseYear;
    public int Tracks;

    public Record(String title, String artist, int releaseYear, int tracks) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        Tracks = tracks;
    }

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

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getTracks() {
        return Tracks;
    }

    public void setTracks(int tracks) {
        Tracks = tracks;
    }

    public String getInfo() {

        return "Title: " + title + " Artist: " + artist + " Release Year: " + releaseYear + " Tracks: " + Tracks;
    }


    public boolean From2000() {

        if (releaseYear >= 2000) {
            return true;
        }
        return false; }

    public static Record [] recordCollection = new Record[5];

    public static void main(String[] args) {
        Record record1 = new Record("Band1", "Artist1", 1982, 8);
        Record record2 = new Record("Band2", "Artist2", 2000, 9);
        Record record3 = new Record("Band3", "Artist3", 2012, 12);
        Record record4 = new Record("Band4", "Artist4", 2015, 7);
        Record record5 = new Record("Band4", "Artist5", 2018, 10);

        record1.getInfo();
        System.out.println(record1.getInfo());
        System.out.println(record1.From2000());

        recordCollection[0]= record1;
        recordCollection[1]= record2;
        recordCollection[2]= record3;
        recordCollection[3]= record4;
        recordCollection[4]= record5;
        System.out.println(recordCollection.toString());

        for(Record record : recordCollection){
            System.out.println(record.getInfo());


        }




    }


}
