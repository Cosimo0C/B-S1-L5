package L5.Entità;

import L5.Interfaccie.Eseguibile;

public class Immagine extends ElementoMutimediale implements Eseguibile {
    protected int luminosità;
    Immagine( String titolo, int luminosità){
        super(titolo);
        this.titolo=titolo;
        this.luminosità=luminosità;
    }
    public void toshow(){

    }
    @Override
    public void alzaLuminosità() {

    }

    @Override
    public void abbassaLuminosità() {

    }
}
