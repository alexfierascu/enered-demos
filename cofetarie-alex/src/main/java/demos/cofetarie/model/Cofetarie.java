package demos.cofetarie.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cofetarie {

  private String numeCoferatrie;

  private List<Client> listaClienti;

}
