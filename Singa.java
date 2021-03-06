package com.company;

public class Singa extends Binatang implements IKarnivora, IHerbivora {

    public String suara;
    public String warnaBulu;

    public void Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        this.Singa(nama, jmlKaki, suara, warnaBulu);
    }

    public void Binatang(String nama, int jmlKaki) {
        this.Binatang(nama, jmlKaki);
    }

    @Override
    public String nama() {
        System.out.println("Nama : Singa kali y");
        return suara;
    }

    @Override
    public int jmlKaki() {
        System.out.println("Jumlah Kaki : 4");
        return 4;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan : Daging");
    }

    public void warnaBulu() {
        System.out.println("Warna Bulu : Coklat");
    }

    public void Suara() {
        System.out.println("Suara : Roaaarr");
    }

    public void Jenis() {
        System.out.println("Jenis : Karnivora");
    }
}
