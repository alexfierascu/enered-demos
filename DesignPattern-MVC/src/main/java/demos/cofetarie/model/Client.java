package demos.cofetarie.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    private String nume;

    private String prenume;

    private String adresa;

    private int varsta;

    private boolean clientFidel;
}

