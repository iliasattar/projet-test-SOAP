package ws;

import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "banqueWS")
public class BanqueService {
    @WebMethod(operationName = "conversionDollarToDH")
    public double Conversion(@WebParam(name = "montant") double mt){
     return mt*11.56;
    }

    @WebMethod(operationName = "recupererCompte")
    public Compte getCompte(@WebParam(name = "code") Long code){
        return new Compte(code, Math.random()*90000, new Date());
    }

    @WebMethod(operationName = "creationListeCompte")
    public List<Compte> listeComptes(){
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1, Math.random()*90000, new Date()));
        comptes.add(new Compte(2, Math.random()*90000, new Date()));
        comptes.add(new Compte(3, Math.random()*90000, new Date()));
        return comptes;
    }


}
