package model;

public class Car {

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCarseat() {
        return carseat;
    }

    public void setCarseat(String carseat) {
        this.carseat = carseat;
    }

    public int getCarcc() {
        return carcc;
    }

    public void setCarcc(int carcc) {
        this.carcc = carcc;
    }

    public int getCarprice() {
        return carprice;
    }

    public void setCarprice(int carprice) {
        this.carprice = carprice;
    }

    public Car() {
    }

    public Car(String name, String brand, String seat) {
        this.carName = name;
        this.carbrand = brand;
        this.carseat = seat;

    }

    String carName;
    String carbrand;
    String carseat;
    int carcc;
    int carprice;

}
