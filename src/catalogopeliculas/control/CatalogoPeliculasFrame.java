
package catalogopeliculas.control;

import catalogopeliculas.model.Film;
import catalogopeliculas.view.FilmDialog;
import catalogopeliculas.view.FilmDisplay;
import catalogopeliculas.view.swing.SwingFilmDialog;
import catalogopeliculas.view.swing.SwingFilmDisplay;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;


public class CatalogoPeliculasFrame extends JFrame{
    private final Film[] film;
    private final List<Film> lista;
    //private final Listas listas;
    private FilmDialog filmDialog;
    private FilmDisplay filmDisplay;
    private final Map<String, Command> commands = new HashMap<>();
    
    public CatalogoPeliculasFrame(Film[] film){
        this.film = film;
        lista = new ArrayList<>();
        this.setTitle("Catálogo Películas");
        this.setSize(900, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(FilmDialog(), BorderLayout.NORTH);
        this.add(FilmDisplay(), BorderLayout.CENTER);
        this.setVisible(true);
    }

    private Component FilmDialog() {
        SwingFilmDialog dialog = new SwingFilmDialog(film);
        filmDialog = dialog;
        return dialog;
    }

    private Component FilmDisplay() {
        SwingFilmDisplay display = new SwingFilmDisplay();
        filmDisplay = display;
        return display;
    }

   
     public FilmDialog getFilmDialog() {
        return filmDialog;
    }

    public FilmDisplay getFilmDisplay() {
        return filmDisplay;
    }

    public void add(Command command) {
        commands.put(command.name(), command);
    }
}
