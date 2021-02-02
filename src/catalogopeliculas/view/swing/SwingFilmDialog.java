
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
import javax.swing.JPanel;


public class SwingFilmDialog extends JPanel implements FilmDialog{

    private Film film;
    private List<Film> films;
    
    public SwingFilmDialog(Film film) {
        this.film = film;
        films = new ArrayList<>();
    }
    
    @Override
    public Film getFilm() {
        return film;
        
    }
    
    private Component genre() {
        JComboBox comboGenre = new JComboBox((ComboBoxModel) films);
        comboGenre.addItemListener(getFilms());
        films = (List<Film>) comboGenre.getSelectedItem();
        return comboGenre;
    }
    
    private Component news() {
        JComboBox comboNews = new JComboBox((ComboBoxModel) films);
        comboNews.addItemListener(getFilms());
        films = (List<Film>)comboNews.getSelectedItem();
        return comboNews;
    }
    
    private Component mostSeen() {
        JComboBox comboSeen = new JComboBox( (ComboBoxModel) films);
        comboSeen.addItemListener(getFilms());
        films = (List<Film>) comboSeen.getSelectedItem();
        return comboSeen;
    }
    
    private Component mostValued() {
        JComboBox comboValued = new JComboBox((ComboBoxModel) films);
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
