package com.federicotoluzzo.classi.irlanda;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Map extends javax.swing.JPanel {
    private int[][] coordinates = {{773, 580}, {821, 217}, {367, 560}, {439, 942}, {654, 866}, {691, 126}, {420, 731}};
    private ArrayList<Integer> path;
    public Map(int size) {
        this.path = new ArrayList<>();
        this.size = size;
        setPreferredSize(new Dimension(size, size));
    }

    private final int size;

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(0xDDDDDD));
        g.drawLine(coordinates[0][0] * size / 1080, coordinates[0][1] * size / 1080, coordinates[1][0] * size / 1080, coordinates[1][1] * size / 1080);
        g.drawLine(coordinates[0][0] * size / 1080, coordinates[0][1] * size / 1080, coordinates[2][0] * size / 1080, coordinates[2][1] * size / 1080);
        g.drawLine(coordinates[0][0] * size / 1080, coordinates[0][1] * size / 1080, coordinates[3][0] * size / 1080, coordinates[3][1] * size / 1080);
        g.drawLine(coordinates[0][0] * size / 1080, coordinates[0][1] * size / 1080, coordinates[4][0] * size / 1080, coordinates[4][1] * size / 1080);
        g.drawLine(coordinates[0][0] * size / 1080, coordinates[0][1] * size / 1080, coordinates[6][0] * size / 1080, coordinates[6][1] * size / 1080);

        g.drawLine(coordinates[6][0] * size / 1080, coordinates[6][1] * size / 1080, coordinates[3][0] * size / 1080, coordinates[3][1] * size / 1080);
        g.drawLine(coordinates[5][0] * size / 1080, coordinates[5][1] * size / 1080, coordinates[1][0] * size / 1080, coordinates[1][1] * size / 1080);

        if(path.size() > 1){
            g.setColor(new Color(0x000000));
            for (int i = 0; i < path.size() - 1; i++) {
                System.out.printf("Devo disegnare una linea da %d %d a %d %d\n", coordinates[path.get(i)][0] * size / 1080, coordinates[path.get(i)][1] * size / 1080, coordinates[path.get(i + 1)][0] * size / 1080, coordinates[path.get(i + 1)][1] * size / 1080);
                g.drawLine(coordinates[path.get(i)][0] * size / 1080, coordinates[path.get(i)][1] * size / 1080, coordinates[path.get(i + 1)][0] * size / 1080, coordinates[path.get(i + 1)][1] * size / 1080);
            }
        }

        g.drawImage(new ImageIcon("Senza titolo_piccola.png").getImage(), 0, 0, null);
    }

    public void setPath(ArrayList<Integer> path){
        this.path = path;
        repaint();
    }
}
