package dependency.injection.soft;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientA {

    private ServiceInterface serviceInterface;

//    public ClientA(ServiceInterface serviceInterface) {
//        this.serviceInterface = serviceInterface;
//    }

    public void doSomething() {
        serviceInterface = new ServiceX();
//        serviceInterface = new ServiceY();
//        serviceInterface = new ServiceZ();
        serviceInterface.getInfo();
    }


}
