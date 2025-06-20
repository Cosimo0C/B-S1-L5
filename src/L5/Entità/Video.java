package L5.Entità;

import L5.Interfaccie.Eseguibile;
import L5.Interfaccie.Riproducibile;

public class Video extends ElementoMutimediale implements Riproducibile, Eseguibile {
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
}
