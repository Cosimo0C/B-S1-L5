package L5.Entità;

import L5.Interfaccie.Riproducibile;

public class Audio extends ElementoMutimediale implements Riproducibile {
    protected int durata;
    protected int volume;
    Audio(String titolo, int volume, int durata){
        super(titolo);
        this.titolo=titolo;
        this.durata=durata;
        this.volume=volume;
    }

    @Override
    public void play() {

    }

    @Override
    public void abbassaVolume() {

    }

    @Override
    public void alzaVolume() {

    }
}
