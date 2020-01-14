package demos.cofetarie.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdusCofetarie {

    private String numeProdusCofetarie;

    private double pretProdusCofetarie;

    private double gramajProdusCofetarie;

}
