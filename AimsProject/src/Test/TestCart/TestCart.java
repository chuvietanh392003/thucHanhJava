/**
 * Author: Chu Việt Anh
 */
package TestCart;

import java.util.ArrayList;
import java.util.List;

import Cart.Cart;
import Media.Book;
import Media.CompactDisc;
import Media.DigitalVideoDisc;
import Media.Media;
import Media.Track;

public class TestCart {
    private static List<Track> tracks;

    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();

        // Create new Media objects and add them to the cart
        // Create an array to store Media information
        Media[] mediaList = new Media[4];

        // Create Media
        Media media1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f, "John Director", 87);
        Media media2 = new Book("Tấm cám", "Animation", 18.15f);
        Media media3 = new Book("Thạch sanh", "Animation", 10.1f);

        // Fake data for CompactDisc
        tracks = new ArrayList<>();
        tracks.add(new Track("Nơi này có em", 5));
        tracks.add(new Track("Win", 3));
        CompactDisc media4 = new CompactDisc("Fake Artist", tracks);

        // Add Media to the array
        mediaList[0] = media1;
        mediaList[1] = media2;
        mediaList[2] = media3;
        mediaList[3] = media4;

        anOrder.addMedia(mediaList);

        // Print information of each Media in the cart
        for (Media m : mediaList) {
            System.out.println(m.toString());
        }
        
        
        
    
       
    }
}
