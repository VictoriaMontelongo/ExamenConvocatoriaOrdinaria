
package catalogopeliculas.model;

import java.util.ArrayList;
import java.util.List;


public class News implements Listas{

    private final Film film;
    List<Film> films;
    
    public News(Film film){
        films = new ArrayList<>();
        this.film = film;
    }
    @Override
    public void organization(Film film) {
        if(film.getYear() >= 2015){
            films.add(film);
        }
    }
    
}
