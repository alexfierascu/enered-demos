package dependency.injection.constructor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Service {

    public void doThat() {
        System.out.println("I've done that");
    }
}
