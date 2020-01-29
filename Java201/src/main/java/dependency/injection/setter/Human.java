package dependency.injection.setter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Human {
    private Service service;

    public void doSomething() {
        service.doThat();
    }

}
