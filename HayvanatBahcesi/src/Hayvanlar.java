public abstract  class Hayvanlar {
    private String turAdi;
    private int agirlik;
    private  int yas;
    private String renk;

    public String getTurAdi() {
        return turAdi;
    }

    public void setTurAdi(String turAdi) {
        this.turAdi = turAdi;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Hayvanlar{" +
                "turAdi='" + turAdi + '\'' +
                ", agirlik=" + agirlik +
                ", yas=" + yas +
                ", renk='" + renk + '\'' +
                '}';
    }
}
