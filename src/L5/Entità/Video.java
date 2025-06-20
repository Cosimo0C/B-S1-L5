package L5.Entità;

import L5.Interfaccie.Eseguibile;
import L5.Interfaccie.Riproducibile;

public class Video extends ElementoMutimediale implements Riproducibile, Eseguibile {
    protected int luminosità;
    protected int volume;
    protected int durata;
    Video(String titolo, int luminosità, int volume, int durata){
        super(titolo);
        this.titolo=titolo;
        this.luminosità=luminosità;
        this.volume=volume;
        this.durata=durata;
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

    @Override
    public void alzaLuminosità() {

    }

    @Override
    public void abbassaLuminosità() {

    }
}
