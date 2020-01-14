package demos.cofetarie.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cofetarie {

    private String numeCoferatrie;

    private List<Client> listaClienti = new ArrayList<>();

    private List<ProdusCofetarie> produseCofetarie = new ArrayList<>();

    private List<EvenimenteSpeciale> evenimenteCofetarie = new ArrayList<>();

    private Map<String, String> orar = new LinkedHashMap<>();
}
