package dependency.injection.setter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Service {

    public void doThat() {
        System.out.println("I've worked today for more " +
                "than 8H, I wanna go home!");
    }
}
