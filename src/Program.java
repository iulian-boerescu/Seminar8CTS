import Adapter.JSONParser;
import Adapter.XMLParser;
import Adapter.XMLtoJsonAdapter;
import Facade.Facade;
import FacadeMasini.DealerAuto;

public class Program {
    public static void main(String[] args) {

        XMLParser xmlParser = new XMLParser();
        JSONParser jsonParser = new XMLtoJsonAdapter(xmlParser);
        jsonParser.parserJson("convert");

        Facade facade = new Facade();
        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();

        DealerAuto dealer = new DealerAuto();
        dealer.descriereMasinaElectrica();
        dealer.descriereMasinaFamilie();
        dealer.descriereMAsinaSport();
        System.out.println(dealer.descriereMasinaElectrica());

    }
}