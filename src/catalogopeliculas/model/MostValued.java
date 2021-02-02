
package catalogopeliculas.model;

import java.util.ArrayList;
import java.util.List;


public class MostValued implements Listas {
    
    private final Film film;
    List<Film> films;
    
    public MostValued(Film film){
        films = new ArrayList<>();
        this.film=film;
    }
    @Override
    public void organization(Film film) {
        if(film.getCalification() >= 8){
            films.add(film);
        }
    }
}
