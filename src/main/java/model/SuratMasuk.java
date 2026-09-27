package model;

public class SuratMasuk extends Surat {
    protected String tanggalMasukSurat;
    protected String pengirim;

    public SuratMasuk(int urutanSurat, String nomorSurat, String perihal,
            String tanggalMasukSurat, String pengirim) {

        super(urutanSurat, nomorSurat, perihal);
        this.tanggalMasukSurat = tanggalMasukSurat;
        this.pengirim = pengirim;
    }

    public String getTanggalMasukSurat() {
        return tanggalMasukSurat;
    }

    public String getPengirim() {
        return pengirim;
    }

    public void setTanggalMasukSurat(String tanggalMasukSurat) {
        this.tanggalMasukSurat = tanggalMasukSurat;
    }

    public void setPengirim(String pengirim) {
        this.pengirim = pengirim;
    }

    // Polymorphism - Method Overriding
    @Override
    public void tampilkanDaftarSurat() {
        System.out.println("==========================");
        System.out.println("DAFTAR SURAT MASUK");

        super.tampilkanDaftarSurat();

        System.out.println("Tanggal Surat Masuk: " + tanggalMasukSurat);
        System.out.println("Pengirim: " + pengirim);
    }
}