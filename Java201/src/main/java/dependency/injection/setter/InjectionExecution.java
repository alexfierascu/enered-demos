package dependency.injection.setter;

public class InjectionExecution {

    public static void main(String[] args) {

        Service service = new Service();
        Human human = new Human();
        human.setService(service);
        human.doSomething();
    }
}
