
package catalogopeliculas.control;

import catalogopeliculas.model.Film;
import catalogopeliculas.view.FilmDialog;
import catalogopeliculas.view.FilmDisplay;


public class AddCommand implements Command{
    
    private final FilmDialog filmDialog;
    private final FilmDisplay filmDisplay;

    public AddCommand(FilmDialog filmDialog, FilmDisplay filmDisplay) {
        this.filmDialog = filmDialog;
        this.filmDisplay = filmDisplay;
    }
    
    

    @Override
    public void execute() {
        Film film = null;
        filmDisplay.display(film);
    }

    @Override
    public String name() {
        return "Hola";
    }
    
    
}
