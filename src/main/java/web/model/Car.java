package web.model;

public class Car {
    private String madel;
    private String color;
    private int series;

    public Car() {
    }

    public Car(String madel, String color, int series) {
        this.madel = madel;
        this.color = color;
        this.series = series;
    }

    public String getMadel() {
        return madel;
    }

    public void setMadel(String madel) {
        this.madel = madel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
