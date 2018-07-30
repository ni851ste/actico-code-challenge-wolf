
package wild;

import animals.Bear;
import animals.DefaultWolf;
import animals.JensWolf;
import animals.LaurinWolf;
import animals.Lion;
import animals.Stone;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wild {

    private static List<Class> classes = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(classes,
                Bear.class,
                Lion.class,
                Stone.class,
                DefaultWolf.class,
                LaurinWolf.class,
                JensWolf.class
        );
        int size = Math.round((float) Math.sqrt(Wild.classes.size() + 3) * 20);
        Game game = new Game(size);

        Statistics stats = new Statistics(game, Wild.classes);

        for (Class c : Wild.classes)
            game.populate(c, 100);
        stats.update();

        JFrame gui = new JFrame();
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

        while (Game.running) {
            game.iterate();
            stats.update();
            boardLabel.setText(game.toString());
            statsLabel.setText(stats.toString());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }

}
