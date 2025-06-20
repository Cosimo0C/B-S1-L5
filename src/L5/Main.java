package L5;

import L5.Entità.Audio;
import L5.Entità.Immagine;
import L5.Entità.Video;

public class Main {
    public static void main(String[] args) {
        Video v1 = new Video("mike", 5, 10, 10);
        Audio a1= new Audio("audio12", 20, 30);
        Immagine i1= new Immagine("Urlo", 5);
        v1.play();
        v1.abbassaLuminosità();
        v1.alzaLuminosità();
        v1.alzaVolume();
        v1.abbassaVolume();
        a1.play();
        a1.alzaVolume();
        a1.abbassaVolume();
        i1.toshow();
    }
}