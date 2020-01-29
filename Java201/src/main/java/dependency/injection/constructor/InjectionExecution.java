package dependency.injection.constructor;

public class InjectionExecution {

    public static void main(String[] args) {

        Service service = new Service();
        Car car = new Car(service);
        car.doSomething();
    }
}
