package model;

public class Car {
    int number;
    String name;
    int series;

    public Car(int number, String name, int series) {
        this.number = number;
        this.name = name;
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", series=" + series +
                '}';
    }
}
