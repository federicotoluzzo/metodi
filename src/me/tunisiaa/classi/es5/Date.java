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

    public Date(String date) {
        String[] dates = date.split("/");
        this.day = Integer.parseInt(dates[0]);
        this.month = Integer.parseInt(dates[1]);
        this.year = Integer.parseInt(dates[2]);
    }

    public String toString(){
        return String.format("%d/%d/%d", day, month, year);
    }
}
