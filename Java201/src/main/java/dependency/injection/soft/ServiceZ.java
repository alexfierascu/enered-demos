package dependency.injection.soft;

public class ServiceZ implements ServiceInterface {
    @Override
    public void getInfo() {
        System.out.println("ServiceZ info");
    }
}
