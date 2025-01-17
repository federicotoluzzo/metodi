package com.federicotoluzzo.classi.irlanda;

import javax.swing.*;
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
    public JLabel distance;
    public JLabel path;
    public JButton submit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GUIrlanda ir = new GUIrlanda();
        ir.setVisible(true);
        ir.setLayout(new BoxLayout(ir.getContentPane(), BoxLayout.Y_AXIS));

        ir.start = new JComboBox(città);
        ir.end = new JComboBox(città);
        ir.distance = new JLabel("Distance : ");
        ir.path = new JLabel("Path : ");
        ir.submit = new JButton("Submit");

        ir.add(ir.start);
        ir.add(ir.end);
        ir.add(ir.distance);
        ir.add(ir.path);
        ir.add(ir.submit);

        ir.submit.addActionListener(e -> {
            try{
                ir.distance.setText("Distance : " + ir.getDistance(ir.start.getSelectedIndex(), ir.end.getSelectedIndex()));
                ir.path.setText("Path : " + ir.getPath(ir.start.getSelectedIndex(), ir.end.getSelectedIndex()));
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

    public String getPath(int start, int end){
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

        int padre = end;
        Stack<String> path = new Stack<>();
        StringBuilder pathString = new StringBuilder();
        while(padre != -1){
            path.push(città[padre]);
            padre = u[padre];
        }
        pathString.append(path.pop());
        while(!path.isEmpty()){
            pathString.append(" > ");
            pathString.append(path.pop());
        }
        System.out.println();
        return pathString.toString();
    }
}
