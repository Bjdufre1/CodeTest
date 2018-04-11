/**
 * Song is a class that is used to store data about a song based on its name
 * and its qi value. Song implements comparable so that it can compare songs
 * based on the value of qi.
 *
 * @author Brady Dufresne
 * @since 4-11-2018
 */
public class Song implements Comparable<Song>{

    private String songName;
    private double qi;

    /**
     * Constructor for the Song object that sets the values passed to the class variables
     *
     * @param songName The name of the song
     * @param qi the calculated qi value of the song
     */
    public Song(String songName, double qi){
        this.songName = songName;
        this.qi = qi;
    }

    /**
     * Method to return the name of the song
     *
     * @return The name of the current song
     */
    public String getSongName() {
        return songName;
    }


    /**
     * Method to set the name of the song
     *
     * @param songName The name that that the song is being set to
     */
    public void setSongName(String songName) {
        this.songName = songName;
    }

    /**
     * Method to get the value of qi for the current song
     *
     * @return The current songs qi value
     */
    public double getQi() {
        return qi;
    }

    /**
     * Method to set the value of qi
     *
     * @param qi The value to set qi to
     */
    public void setQi(double qi) {
        this.qi = qi;
    }

    /**
     * Overriding the compareTo method so that when the list is sorted, it is sorted based upon the highest qi value
     *
     * @param song The song that is being compared to
     * @return Returns 1,-1,or 0 depending if the current qi is larger, smaller, or the same
     */
    @Override
    public int compareTo(Song song) {
        if(song.getQi() > this.qi){
            return 1;
        }
        else if(song.getQi() < this.qi){
            return -1;
        }
        return 0;
    }

    /**
     * Overriding te toString method to print the Song object easily
     *
     * @return The name of the song
     */
    @Override
    public String toString() {
        return this.getSongName();
    }
}
