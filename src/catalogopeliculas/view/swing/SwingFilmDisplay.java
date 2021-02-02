
package catalogopeliculas.view.swing;

import catalogopeliculas.model.Film;
import catalogopeliculas.model.Listas;
import catalogopeliculas.view.FilmDisplay;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SwingFilmDisplay extends JPanel implements FilmDisplay{

    private Listas listas;
    private Film film;
            
    public void display(Film film) {
        this.listas = listas;
        this.film = film;
        
    }
    
    private JLabel genre() {
        return new JLabel("Géneros");
    }
    
    private JLabel news() {
        return new JLabel("Novedades");
    }
    private JLabel mostSeen() {
        return new JLabel("Más Vistas");
    }
    
    private JLabel mostValued() {
        return new JLabel("Más Valoradas");
    }
    
}
