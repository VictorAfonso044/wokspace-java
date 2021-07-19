package com.example.teste;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.teste.models.Cadastro;
import com.example.teste.service.XmlService;
import com.example.teste.user.GetUserRequest;

@Component
@WebService(name = "cadastro_PortType", targetNamespace = "http://www.example.org/User")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class IndicatorEndpoint {
	
	private static final String NAMESPACE="http://www.example.org/User";
	

	    @Autowired
	    private XmlService  service ;

	    @WebMethod(operationName = "user")
	    @WebResult(name = "cadastroWS", targetNamespace = NAMESPACE, partName = "CadastroResponse")
	    public GetUserRequest getUserRequest(
	            @WebParam(name = "cadastroRequestWS", targetNamespace = NAMESPACE, partName = "cadastroRequest") GetUserRequest user) {
	    	Cadastro c = service.cadastrar(user);
	    	GetUserRequest cadastro = new GetUserRequest();
			cadastro.setNomebeneficiario(c.getNomebeneficiario());
			cadastro.setIdbeneficiario(c.getIdbeneficiario());
			cadastro.setIdprontuario(c.getIdprontuario());
			cadastro.setNumcarteira(c.getNumcarteira());
			cadastro.setDatanascimento(c.getDatanascimento());
			cadastro.setDatainclusao(c.getDatainclusao());
	    	return cadastro;
	    }
	}
