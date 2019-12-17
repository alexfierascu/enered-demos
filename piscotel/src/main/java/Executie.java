import model.Client;

import static utils.PaymentMethods.CARD;
import static utils.PaymentMethods.CASH;

public class Executie {
    public static void main(String[] args) {
        Client cc=new Client();
        cc.setNume("Popescu");
        cc.setPrenume("cc-Alexandru");
        cc.setAddresa("str. 3 Fantani");
        cc.setVarsta(33);
        System.out.println(cc.getAddresa());
//        Client Paul =new Client();
//        Paul.builder()
//                .nume("Decebal")
//                .prenume("Paul-Vasile")
//                .addresa("strada 3 lalele")
//                .varsta(34)
//                .build();
        cc.updateClient("varsta","45");
        System.out.println(cc.getVarsta());
        cc.deliverToClient();
        cc.deliverToCLient("str. 3 boschetari");
        cc.setClient(true);
        cc.makePayment(CARD, 100);
        cc.makePayment(CASH, 100);
    }
}
