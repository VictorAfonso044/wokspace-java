
package info.java.tips.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "cadastro_PortType", targetNamespace = "http://www.example.org/User")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CadastroPortType {


    /**
     * 
     * @param cadastroRequest
     * @return
     *     returns info.java.tips.ws.CadastroWS
     */
    @WebMethod
    @WebResult(name = "cadastroWS", targetNamespace = "http://www.example.org/User", partName = "CadastroResponse")
    public CadastroWS user(
        @WebParam(name = "cadastroRequestWS", targetNamespace = "http://www.example.org/User", partName = "cadastroRequest")
        CadastroRequestWS cadastroRequest);

}