
package info.java.tips.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the info.java.tips.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CadastroWS_QNAME = new QName("http://www.example.org/User", "cadastroWS");
    private final static QName _CadastroRequestWS_QNAME = new QName("http://www.example.org/User", "cadastroRequestWS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: info.java.tips.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link GetUserRequest }
     * 
     */
    public GetUserRequest createGetUserRequest() {
        return new GetUserRequest();
    }

    /**
     * Create an instance of {@link CadastroWS }
     * 
     */
    public CadastroWS createCadastroWS() {
        return new CadastroWS();
    }

    /**
     * Create an instance of {@link CadastroRequestWS }
     * 
     */
    public CadastroRequestWS createCadastroRequestWS() {
        return new CadastroRequestWS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastroWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/User", name = "cadastroWS")
    public JAXBElement<CadastroWS> createCadastroWS(CadastroWS value) {
        return new JAXBElement<CadastroWS>(_CadastroWS_QNAME, CadastroWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastroRequestWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/User", name = "cadastroRequestWS")
    public JAXBElement<CadastroRequestWS> createCadastroRequestWS(CadastroRequestWS value) {
        return new JAXBElement<CadastroRequestWS>(_CadastroRequestWS_QNAME, CadastroRequestWS.class, null, value);
    }

}
