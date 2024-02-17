package me.tunisiaa.classi.es5;

public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return String.format("%d/%d/%d", day, month, year);
    }
}
