
package catalogopeliculas.model;

import java.util.ArrayList;
import java.util.List;


public class MostSeen implements Listas{

    private final Film film;
    List<Film> films;
    
    public MostSeen(Film film){
        films = new ArrayList<>();
        this.film=film;
    }
    @Override
    public void organization(Film film) {
        if(film.getReproduction() >= 1000000){
            films.add(film);
        }
    }
    
}
