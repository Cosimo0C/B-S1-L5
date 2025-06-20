package L5;

import L5.Entita.Audio;
import L5.Entita.Immagine;
import L5.Entita.Video;
import L5.Interfaccie.Avvia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Creiamo un video");
        System.out.println("Inserisci un nome");
        String nome= scanner.nextLine();
        System.out.println("Inserisci un valore di luminosità compreso tra 0 e 20");
        int luminosita= scanner.nextInt();
        System.out.println("Inserisci un volare di volume compreso tra 0 e 20");
        int volume= scanner.nextInt();
        System.out.println("Inserisci una durata");
        int durata= scanner.nextInt();
        Video v1 = new Video(nome, luminosita, volume, durata);
        Video v2 = new Video("Avengers", 10, 15, 8);
        Audio a1= new Audio("audio12", 20, 30);
        Audio a2= new Audio("audio50", 8, 2);
        Immagine i1= new Immagine("Urlo", 5);
        Avvia [] file= {v1, v2, a1, a2, i1};

        int ris;
        do {
            System.out.println("Inserisci un numero tra 1 e 5 per scegliere il file. 0 per uscire!");
            ris=Integer.parseInt(scanner.nextLine());
            if (ris>0 & ris <= file.length){
                int pos=ris-1;
                file[pos].avvia();
            }else if (ris==0){
                System.out.println("Fine!");
            }else{
                System.out.println("Il numero non è compreso tra 0 e 5");
            }
        }while (ris!=0);
    }
}