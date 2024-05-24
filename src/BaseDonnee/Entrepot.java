package BaseDonnee;

public class Entrepot {
    private int idEntrepot;
    private int idSite;
    private int coutFixe;
    private int stock;

    public Entrepot(int idEntrepot, int idSite, int coutFixe, int stock) {
        this.idEntrepot = idEntrepot;
        this.idSite = idSite;
        this.coutFixe = coutFixe;
        this.stock = stock;
    }

    public int getIdEntrepot() {
        return idEntrepot;
    }

    public int getIdSite() {
        return idSite;
    }

    public int getCoutFixe() {
        return coutFixe;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Entrepot [idEntrepot=" + idEntrepot + ", idSite=" + idSite + ", coutFixe=" + coutFixe + ", stock=" + stock + "]";
    }
}
