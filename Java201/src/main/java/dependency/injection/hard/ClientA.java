package dependency.injection.hard;

import lombok.Data;

@Data

public class ClientA {

    private ServiceB serviceB;

    public void doSomething() {
        serviceB = new ServiceB();
        String info = serviceB.showInfo();
        System.out.println(info);
        serviceB.faSumaA2NR();
    }
}
