package L5.Entita;

import L5.Interfaccie.Avvia;
import L5.Interfaccie.Riproducibile;

import java.util.Scanner;

public class Audio extends ElementoMutimediale implements Riproducibile, Avvia {
    protected int durata;
    protected int volume;

   public Audio(String titolo, int volume, int durata){
        super(titolo);
        this.titolo=titolo;
        this.durata=durata;
        this.volume=volume;
    }

    @Override
    public void play() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sta Riproducendo" + " " +this.titolo);
        for (int i = 0; i <this.durata ; i++) {
            System.out.print(this.titolo+" "+"Volume"+" ");
            for (int j = 0; j <this.volume ; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
        System.out.println("Premi 1 se vuoi aumentare il volume o 2 per abbassare il volume. 0 per uscire");
        int volume= scanner.nextInt();
        if (volume >= 0 & volume < 3){
            switch (volume){
                case 1:
                    alzaVolume();
                    break;
                case 2:
                    abbassaVolume();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("PROBLEMA REGOLAZIONE VOLUME");
            }
        }else {
            System.out.println("Il numero non è compreso tra 0 e 2");
        }
    }

    @Override
    public void alzaVolume() {
        if (this.volume<20){
            System.out.print("Ho alzato il volume"+ " ");
            for (int i = 0; i <this.volume ; i++) {
                System.out.print("!");
            }
            System.out.println();
        }else {
            System.out.println("Il volume è al massimo");
        }

    }

    @Override
    public void abbassaVolume() {
        if (this.volume>0){
            System.out.print("Ho abbassato il volume"+ " ");
            for (int i = 0; i <this.volume ; i++) {
                System.out.print("!");
            }
            System.out.println();
        }else {
            System.out.println("Il volume è al minimo");
        }

    }

    @Override
    public void avvia() {
    play();
    }
}
