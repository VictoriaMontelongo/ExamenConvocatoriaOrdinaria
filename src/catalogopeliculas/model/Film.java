package catalogopeliculas.model;

public class Film {
    private final String caratula;
    private final String title;
    private final int year;
    private final  String director;
    private final  String genre;
    private final double calification;
    private final double duration;
    private final  int reproduction;

    public Film(String caratula, String title, int year, String director, String genre, double calification, double duration, int reproduction) {
        this.caratula = caratula;
        this.title = title;
        this.year = year;
        this.director = director;
        this.genre = genre;
        this.calification = calification;
        this.duration = duration;
        this.reproduction = reproduction;
    }


    public int getReproduction() {
        return reproduction;
    }

    public String getCaratula() {
        return caratula;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public double getCalification() {
        return calification;
    }

    public double getDuration() {
        return duration;
    }
    
    
    
}
