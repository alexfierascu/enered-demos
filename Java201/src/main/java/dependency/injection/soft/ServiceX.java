package dependency.injection.soft;

public class ServiceX implements ServiceInterface {
    @Override
    public void getInfo() {
        System.out.println("ServiceX info");
    }
}
