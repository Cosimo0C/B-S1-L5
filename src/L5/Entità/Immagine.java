package L5.Entità;

import L5.Interfaccie.Eseguibile;

public class Immagine extends ElementoMutimediale implements Eseguibile {
    protected int luminosità;

   public Immagine( String titolo, int luminosità){
        super(titolo);
        this.titolo=titolo;
        this.luminosità=luminosità;
    }
    public void toshow(){
        System.out.print("Sto mostrando"+" "+this.titolo +" Luminosità"+" ");
        for (int i = 0; i < this.luminosità; i++) {
            System.out.print("*");
        }
        System.out.println();
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
