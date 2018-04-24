
package wild;

import animals.*;
import java.awt.*;
import javax.swing.*;

public class Wild {
    
    private static final Class[] classes = {
            Bear.class,
            Lion.class,
            Stone.class,
            DefaultWolf.class,
            Alphawulf.class
            // TODO: Add your own class here
    };
    public static final int MAP_SIZE = Math.round((float)Math.sqrt(classes.length+3)*20);;

    public static void main(String[] args) {
        
        int size = Math.round((float)Math.sqrt(classes.length+3)*20);
        Game game = new Game(size);
        
        Statistics stats = new Statistics(game, classes);
        
        for(Class c : classes)
            game.populate(c, 100);
        stats.update();
        
        JFrame gui = new JFrame();
        Container pane = gui.getContentPane();
        
        JLabel boardLabel = new JLabel();
        boardLabel.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        boardLabel.setText(game.toString());
        pane.add(boardLabel, BorderLayout.WEST);
        
        JLabel statsLabel = new JLabel();
        statsLabel.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        statsLabel.setText(stats.toString());
        pane.add(statsLabel, BorderLayout.EAST);
        
        gui.pack();
        gui.setVisible(true);
        
        while(true) {
            game.iterate();
            stats.update();
            boardLabel.setText(game.toString());
            statsLabel.setText(stats.toString());
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }
    
}
