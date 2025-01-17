package com.federicotoluzzo.classi.irlanda;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class GUIrlanda extends JFrame {
    public static String[] città = {"Dublino", "Belfast", "Galway", "Cork", "Waterford", "Londonderry", "Limerick"};
    private int[][] distanze = {
            {0, 168, 207, 253, 165, 0, 176},
            {168, 0, 0, 0, 0, 113, 0},
            {207, 0, 0, 0, 0, 0, 0},
            {253, 0, 0, 0, 0, 0, 99},
            {165, 0, 0, 0, 0, 0, 0},
            {0, 113, 0, 0, 0, 0, 0},
            {176, 0, 0, 99, 0, 0, 0}
    };

    public JComboBox start;
    public JComboBox end;
    public JButton submit;
    public Map map;
    public JLabel distance;
    public JLabel path;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GUIrlanda ir = new GUIrlanda();
        ir.setVisible(true);
        ir.setLayout(new BoxLayout(ir.getContentPane(), BoxLayout.Y_AXIS));

        ir.start = new JComboBox(città);
        ir.end = new JComboBox(città);
        ir.submit = new JButton("Submit");
        ir.map = new Map(480);
        ir.map.setPreferredSize(new Dimension(500, 500));
        ir.distance = new JLabel("Distance : ");
        ir.path = new JLabel("Path : ");

        ir.add(ir.start);
        ir.add(ir.end);
        ir.add(ir.submit);
        ir.add(ir.map);
        ir.add(ir.distance);
        ir.add(ir.path);

        ir.setResizable(false);

        ir.submit.addActionListener(e -> {
            try{
                ir.distance.setText("Distance : " + ir.getDistance(ir.start.getSelectedIndex(), ir.end.getSelectedIndex()) + "km");
                int[] path = ir.getPath(ir.start.getSelectedIndex(), ir.end.getSelectedIndex());
                int padre = ir.end.getSelectedIndex();
                Stack<String> pathStack = new Stack<>();
                StringBuilder pathString = new StringBuilder();
                ArrayList pathArrayList = new ArrayList();
                pathString.append("Path : ");
                while(padre != -1){
                    pathStack.push(città[padre]);
                    pathArrayList.add(padre);
                    padre = path[padre];
                }
                pathString.append(pathStack.pop());
                while(!pathStack.isEmpty()){
                    pathString.append(" > ");
                    pathString.append(pathStack.pop());
                }
                System.out.println(Arrays.asList(path).size());
                ir.map.setPath(pathArrayList);
                ir.path.setText(pathString.toString());
                ir.pack();
            } catch (Exception ex){}
        });
        ir.pack();
    }

    public int getDistance(int start, int end){
        String[] nodi = new String[this.distanze.length];
        int distanza = 0;
        int[] u = new int[this.distanze.length];  //vettore u
        for(int i = 0;i < u.length;i = i + 1){
            u[i] = -1;
        }
        for(int i = 0;i < nodi.length;i = i + 1){
            nodi[i] = "NV";
        }
        int [] pesi = new int[this.distanze.length];
        for(int i = 0; i < pesi.length; i = i + 1){
            pesi[i] = 1000000;
        }
        pesi[start]=0;
        while(true) {
            int min = -1;
            for (int i = 0; i < pesi.length; i = i + 1) {
                if ((min == -1) && (nodi[i].equals("NV"))) {
                    min = i;
                } else {
                    if ((nodi[i].equals("NV"))&&(pesi[i] < pesi[min])) {
                        min = i;
                    }
                }
            }
            if (min == -1) {break;}
            nodi[min] = "V";
            for (int i = 0; i < distanze.length; i = i + 1) {
                if ((distanze[min][i] != 0) && (nodi[i].equals("NV")) && (pesi[min] + distanze[min][i] < pesi[i])) {
                    pesi[i] = pesi[min] + distanze[min][i];
                    u[i]=min;
                }
            }
        }
        return pesi[end];
    }

    public int[] getPath(int start, int end){
        String[] nodi = new String[this.distanze.length];
        int distanza = 0;
        int[] u = new int[this.distanze.length];  //vettore u
        for(int i = 0;i < u.length;i = i + 1){
            u[i] = -1;
        }
        for(int i = 0;i < nodi.length;i = i + 1){
            nodi[i] = "NV";
        }
        int [] pesi = new int[this.distanze.length];
        for(int i = 0; i < pesi.length; i = i + 1){
            pesi[i] = 1000000;
        }
        pesi[start]=0;
        while(true) {
            int min = -1;
            for (int i = 0; i < pesi.length; i = i + 1) {
                if ((min == -1) && (nodi[i].equals("NV"))) {
                    min = i;
                } else {
                    if ((nodi[i].equals("NV"))&&(pesi[i] < pesi[min])) {
                        min = i;
                    }
                }
            }
            if (min == -1) {break;}
            nodi[min] = "V";
            for (int i = 0; i < distanze.length; i = i + 1) {
                if ((distanze[min][i] != 0) && (nodi[i].equals("NV")) && (pesi[min] + distanze[min][i] < pesi[i])) {
                    pesi[i] = pesi[min] + distanze[min][i];
                    u[i]=min;
                }
            }
        }

        return u;
    }
}
