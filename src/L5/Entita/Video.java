package L5.Entita;

import L5.Interfaccie.Avvia;
import L5.Interfaccie.Eseguibile;
import L5.Interfaccie.Riproducibile;

import java.util.Scanner;

public class Video extends ElementoMutimediale implements Riproducibile, Eseguibile, Avvia {
    protected int luminosità;
    protected int volume;
    protected int durata;

   public Video(String titolo, int luminosità, int volume, int durata){
        super(titolo);
        this.titolo=titolo;
        this.luminosità=luminosità;
        this.volume=volume;
        this.durata=durata;
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sta Riproducendo" + " " +this.titolo);
        for (int i = 0; i <this.durata ; i++) {
            System.out.print(this.titolo+" "+"Volume"+" ");
            for (int j = 0; j <this.volume ; j++) {
                System.out.print("!");
            }
            System.out.print(" "+"Luminosità"+" ");
            for (int z = 0; z <this.luminosità ; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Premi 1 se vuoi cambiare il volume o 2 per cambiare la luminosità. 0 per uscire");
        int ris= scanner.nextInt();
        if (ris >=0 & ris<3){
        switch (ris){
            case 1 :
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
                break;
                }else {
                    System.out.println("Il numero non è compreso tra 0 e 2");
                }
            case 2:
                System.out.println("Premi 1 se vuoi aumentare la luminosità o 2 per abbassare la luminosità. 0 per uscire");
                int luminosità= scanner.nextInt();
                if (luminosità>=0& luminosità<3){
                switch (luminosità){
                    case 1:
                        alzaLuminosità();
                        break;
                    case 2:
                        abbassaLuminosità();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("PROBLEMA REGOLAZIONE LUMINOSITA'");
                }
                }else {
                    System.out.println("Il numero non è compreso tra 0 e 2");
                }
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
    public void alzaLuminosità() {
        if (this.luminosità<20) {
            System.out.print("Ho alzato la luminosità" + " ");
            for (int i = 0; i <this.luminosità ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }else {
            System.out.println("La Luminosità è al massimo");
        }
    }

    @Override
    public void abbassaLuminosità() {
        if (this.luminosità>0){
            System.out.print("Ho abbassato la luminosità" + " ");
            for (int i = 0; i <this.luminosità ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }else {
            System.out.println("La luminosità è al minimo");
        }
    }

    @Override
    public void avvia() {
       play();
    }
}
