package Main.java;

public class Date {
    int day;
    int month;
    int year;

    Date(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }
    String getDate() {
        return this.day + "-" + this.month + "-" + this.year;
    }   

}
