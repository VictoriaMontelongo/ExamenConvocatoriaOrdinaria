
package catalogopeliculas.model;

import java.util.ArrayList;
import java.util.List;

public class Genre implements Listas{

    private final Film film;
    private final List<Film> comedy;
    private final List<Film> family;
    private final List<Film> terror;
    private final List<Film> romance;
    
    public Genre(Film film){
        this.film = film;
        comedy = new ArrayList<>();
        family = new ArrayList<>();
        terror = new ArrayList<>();
        romance = new ArrayList<>();
    }
    
    @Override
    public void organization(Film film) {
        if(film.getGenre() == "Comedy"){
            comedy.add(film);
        }
        if(film.getGenre() == "Family"){
            family.add(film);
        }
        if(film.getGenre() == "Terror"){
            terror.add(film);
        }
        if(film.getGenre() == "Romance"){
            romance.add(film);
        }
    }

   
    
}
