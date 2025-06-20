package L5.Entità;

import L5.Interfaccie.Avvia;
import L5.Interfaccie.Eseguibile;

import java.util.Scanner;

public class Immagine extends ElementoMutimediale implements Eseguibile, Avvia {
    protected int luminosità;

   public Immagine( String titolo, int luminosità){
        super(titolo);
        this.titolo=titolo;
        this.luminosità=luminosità;
    }
    public void toshow(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Sto mostrando"+" "+this.titolo +" Luminosità"+" ");
        for (int i = 0; i < this.luminosità; i++) {
            System.out.print("*");
        }
        System.out.println();
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
        toshow();
    }
}
