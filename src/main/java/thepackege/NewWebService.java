/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thepackege;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Daniel
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * The cool getOffer method
     */
    @WebMethod(operationName = "getOffer")
    public double getOffer(@WebParam(name = "ssn") long ssn, @WebParam(name = "loanAmount") long loanAmount, @WebParam(name = "loanDuration") long loanDuration, @WebParam(name = "creditScore") int creditScore) {
        return Math.random()*10;
    }
}
