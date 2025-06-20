package L5;

import L5.Entità.Audio;
import L5.Entità.ElementoMutimediale;
import L5.Entità.Immagine;
import L5.Entità.Video;
import L5.Interfaccie.Avvia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Video v1 = new Video("Spider-man", 5, 10, 10);
        Video v2 = new Video("Avengers", 10, 15, 8);
        Audio a1= new Audio("audio12", 20, 30);
        Audio a2= new Audio("audio50", 8, 2);
        Immagine i1= new Immagine("Urlo", 5);
        Avvia [] file= {v1, v2, a1, a2, i1};
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("Inserisci un numero tra 1 e 5 per scegliere il file. 0 per uscire!");
            int ris= scanner.nextInt();
            if (ris>=0& ris<6){

            }else {
                System.out.println("Il numero non è compreso tra 0 e 5");
                break;
            }
        }while (5<0);
    }
}