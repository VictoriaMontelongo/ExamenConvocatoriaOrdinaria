package catalogopeliculas.control;

import catalogopeliculas.model.Film;
import catalogopeliculas.model.Genre;
import catalogopeliculas.model.Listas;
import catalogopeliculas.model.MostSeen;
import catalogopeliculas.model.MostValued;
import catalogopeliculas.model.News;


public class CatalogoPeliculas {

    
    public static void main(String[] args) {
        Film film = null;
        
        Listas listasG = new Genre(film);
        Listas listasN = new News(film);
        Listas listasS = new MostSeen(film);
        Listas listasV = new MostValued(film);
        
        CatalogoPeliculasFrame peliculasFrame = new CatalogoPeliculasFrame(film);
        peliculasFrame.add(new AddCommand(peliculasFrame.getFilmDialog(), peliculasFrame.getFilmDisplay()));

    }
    
}
