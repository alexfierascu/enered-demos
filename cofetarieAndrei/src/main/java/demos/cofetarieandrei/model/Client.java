package demos.cofetarieandrei.model;

import lombok.*;

@Setter
@Getter
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor

/**
 * Created by Andrei on 12/17/2019.
 */
public class Client  {
   private String nume;
   private String prenume;
    private String adresa;
    private  int varsta;
    private boolean clientFidel;
}
