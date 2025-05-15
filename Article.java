package projet_piles;

public class Article {

    private double prix;
    private String code;

    public Article () {
    }

    public double getPrix() {
        return prix;
    }

    public String getCode() {
        return code;
    }

    public void setPrix(double prix ) {
        this.prix = prix;
    }

    public void setCode( String  code ) {
        this.code = code;
    }
}

