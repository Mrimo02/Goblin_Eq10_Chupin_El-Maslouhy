package BaseDonnee;

public class Site {
    private int idSite;
    private int x;
    private int y;

    public Site(int idSite, int x, int y) {
        this.idSite = idSite;
        this.x = x;
        this.y = y;
    }

    public int getIdSite() {
        return idSite;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Site [idSite=" + idSite + ", x=" + x + ", y=" + y + "]";
    }
}
