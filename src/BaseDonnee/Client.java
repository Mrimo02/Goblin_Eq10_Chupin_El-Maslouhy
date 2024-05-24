package BaseDonnee;

public class Client {
    private String nom;
    private String mail;
    private int idSite;

    public Client(String nom, String mail, int idSite) {
        this.nom = nom;
        this.mail = mail;
        this.idSite = idSite;
    }

    public String getNom() {
        return nom;
    }

    public String getMail() {
        return mail;
    }

    public int getIdSite() {
        return idSite;
    }

    @Override
    public String toString() {
        return "Client [nom=" + nom + ", mail=" + mail + ", idSite=" + idSite + "]";
    }
}
