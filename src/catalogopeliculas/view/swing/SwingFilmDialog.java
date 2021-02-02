
package catalogopeliculas.view.swing;

import catalogopeliculas.model.Film;
import catalogopeliculas.view.FilmDialog;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SwingFilmDialog extends JPanel implements FilmDialog{

    private Film film;
    private List<Film> films;
    private final Film[] pelis;
    
    public SwingFilmDialog(Film[] pelis) {
        this.pelis = pelis;
        films = new ArrayList<>();
        this.add(new JLabel("Géneros"));
        this.add(genre());
        this.add(new JLabel("Novedades"));
        this.add(news());
        this.add(new JLabel("Más Vistas"));
        this.add(mostSeen());
        this.add(new JLabel("Más Valoradas"));
        this.add(mostValued());
        
    }
    
    @Override
    public Film getFilm() {
        return film;
        
    }
    
    private Component genre() {
        JComboBox comboGenre = new JComboBox();
        comboGenre.addItemListener(getFilms());
        films = (List<Film>) comboGenre.getSelectedItem();
        return comboGenre;
    }
    
    private Component news() {
        JComboBox comboNews = new JComboBox();
        comboNews.addItemListener(getFilms());
        films = (List<Film>)comboNews.getSelectedItem();
        return comboNews;
    }
    
    private Component mostSeen() {
        JComboBox comboSeen = new JComboBox();
        comboSeen.addItemListener(getFilms());
        films = (List<Film>) comboSeen.getSelectedItem();
        return comboSeen;
    }
    
    private Component mostValued() {
        JComboBox comboValued = new JComboBox();
        comboValued.addItemListener(getFilms());
        films = (List<Film>) comboValued.getSelectedItem();
        return comboValued;
    }

    private ItemListener getFilms() {
        return new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.DESELECTED) {
                    return;
                }
                film = (Film) e.getItem();
            }
        };
    }
    
}
