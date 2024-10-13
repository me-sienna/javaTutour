package homework2;

class Car {
    int gas;
    String carName;

    Car() {

    }

    Car(String carName) {
        setCarName(carName);
    }

    Car(int gas) {
        setGas(gas);
    }

    Car(String carName, int gas) {
        setCarName(carName);
        setGas(gas);
    }

    void setGas(int gas) {
        this.gas = gas;
    }

    int getGas() {
        return gas;
    }

    void setCarName(String carName) {
        this.carName = carName;
    }

    String getCarName() {
        return carName;
    }

    int move(int gas) {
        if(this.gas < 5) {
            System.out.println(getCarName() + " out of gas, resume gas: " + getGas());
            return refuel(10);
        }
        else {
            this.gas -= gas;
            System.out.println(getCarName()+" move, resume gas: "+ getGas());
            return getGas();
        }
    }

    int refuel(int amount) {
        this.gas += amount;
        System.out.println("fuel amount: " + amount + " resume fuel: " + getGas());
        return getGas();
    }
}

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        String[] carNames = {"kia", "ferrari", "bmw", "toyota"};
        int[] carGas = {10, 20, 15, 17};

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(carNames[i], carGas[i]);
        }

        for (int i = 0; i < 7; i++) {
            for (Car c : cars) {
                if (c.getGas()>=0) {
                    c.move(5);
                }
                System.out.println();
            }
        }
    }
}

