package demos.cofetarieandrei.model;

import java.io.IOException;

/**
 * Created by Andrei on 12/17/2019.
 */
public interface ClientModelInterface {

    public void updateClient(String proprietate, String valoare);

    public void deliveryToClient();

    public void makePayment(double valoare) throws IOException;





}
