package demos.cofetarie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvenimenteSpeciale {

    private String numeEveniment;

    private int durataEveniment;

    private double pretEveniment;

    private String tematicaEveniment;

}
