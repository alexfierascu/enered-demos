package demos.cofetarie.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cofetarie {

    private String numeCoferatrie;

    private List<Client> listaClienti = new ArrayList<>();

}
