package dependency.injection.hard;

public class InjectionExecution {

    public static void main(String[] args) {
        ClientA service = new ClientA();
        service.doSomething();
    }
}
