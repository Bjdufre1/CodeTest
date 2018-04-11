import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * The ZipfsSongProblem program implements a program that takes information
 * about an album and the number of plays per song and decides which songs
 * are the most popular based on Zipf's Law
 *
 * @author Brady Dufresne
 * @since 4-11-18
 */
public class ZipfsSongProblem {

    /**
     * The main method which creates an ArrayList of Songs, Sorts them, and
     * prints the most popular songs
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfSongs = input.nextInt();
        int numberToSelect = input.nextInt();
        int currentNumberOfPlays, firstSongPlays = 0;
        double qi, expectedPlays;
        ArrayList<Song> songArrayList = new ArrayList<>();
        String songName;
        for(int i = 1; i <= numberOfSongs; i++){
            currentNumberOfPlays = input.nextInt();
            //If the song is the first one, save the value for computing qi values later
            if(i == 1){
                firstSongPlays = currentNumberOfPlays;
            }
            songName = input.next();
            //Taking the number of plays on the first song and multiplying it by Zipf's Law number
            expectedPlays = firstSongPlays * ((double)1/i);
            //Calculating the qi value using Zipf's Law
            qi = ((double)currentNumberOfPlays)/expectedPlays;
            songArrayList.add(new Song(songName, qi));
        }
        //Sorting the ArrayList using the overridden compareTo method to compare by qi value
        Collections.sort(songArrayList);

        //Separating output from data if run from command line
        System.out.println();
        //Looping though the first x number of songs and printing their names
        for(int i = 0; i < numberToSelect; i++){
            System.out.println(songArrayList.get(i).toString());
        }
    }

}
