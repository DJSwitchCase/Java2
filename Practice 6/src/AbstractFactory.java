public class AbstractFactory {
    public static void main(String[] args){

        Factory1 factory = new Factory1();
        Car audi = factory.createCarAudi();
        Car toyota = factory.createCarToyota();
        Tank tankT51 = factory.createTankT51();
        Tank tankT52 = factory.createTankT52();

        audi.drive();
        toyota.drive();
        tankT51.drive();
        tankT52.drive();

    }
}
interface Car{
    void drive();
}

interface Tank{
    void drive();
}
class Toyota implements  Car{

    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}

class Audi implements  Car{

    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}

class T51 implements  Tank{

    @Override
    public void drive() {
        System.out.println("drive T51");
    }
}


class T52 implements  Tank{

    @Override
    public void drive() {
        System.out.println("drive T52");
    }
}

interface AbstraсtFactory{
    Car createCarAudi();
    Car createCarToyota();
    Tank createTankT51();
    Tank createTankT52();
}

class Factory1 implements AbstraсtFactory {


    @Override
    public Car createCarAudi() {
        return new Audi();
    }

    @Override
    public Car createCarToyota() {
        return new Toyota();
    }

    @Override
    public Tank createTankT51() {
        return new T51();
    }

    @Override
    public Tank createTankT52() {
        return new T52();
    }
}
