package L5.Entità;

import L5.Interfaccie.Riproducibile;

public class Audio extends ElementoMutimediale implements Riproducibile {
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
        System.out.println("Sta Riproducendo" + " " +this.titolo);
        for (int i = 0; i <this.durata ; i++) {
            System.out.print(this.titolo+" "+"Volume"+" ");
            for (int j = 0; j <this.volume ; j++) {
                System.out.print("!");
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
}
