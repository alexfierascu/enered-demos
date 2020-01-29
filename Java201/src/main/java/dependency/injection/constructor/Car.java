package dependency.injection.constructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Service service;

    public void doSomething() {
        service.doThat();
    }

}
