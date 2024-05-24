package BaseDonnee;

public class Route {
    private int idSiteDepart;
    private int idSiteArrivee;
    private int distance;

    public Route(int idSiteDepart, int idSiteArrivee, int distance) {
        this.idSiteDepart = idSiteDepart;
        this.idSiteArrivee = idSiteArrivee;
        this.distance = distance;
    }

    public int getIdSiteDepart() {
        return idSiteDepart;
    }

    public int getIdSiteArrivee() {
        return idSiteArrivee;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Route [idSiteDepart=" + idSiteDepart + ", idSiteArrivee=" + idSiteArrivee + ", distance=" + distance + "]";
    }
}

