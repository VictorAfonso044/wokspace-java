<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="l"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h"%>
<link rel="stylesheet" type="text/css" href="main.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<div class="container-contact3" >
			<div class="wrap-contact4">
				<br><br>
				<span class="contact3-form-title" style="margin-top:10px;">
					Lista de cadastro
				</span>
				<table class="table table-striped" style="color:white;">
					<thead>
					  <tr>
						<th>Id Beneficiario</th>
						<th>Nome Beneficiario</th>
						<th>Numero carteira</th>
						<th>Data Nascimento</th>
						<th>Data Inclusão</th>
						<th>Id prontuario</th>
		
					  </tr>
					</thead>
					<tbody >
					<l:iterate id="u" name="usuarios" property="list">
					  <tr>
						<td><b:write name="u" property="idbeneficiario" /></td>
						<td><b:write name="u" property="nomebeneficiario" /></td>
						<td><b:write name="u" property="numcarteira" /></td>
						<td><b:write name="u" property="datanascimento" /></td>
						<td><b:write name="u" property="datainclusao" /></td>
						<td><b:write name="u" property="idprontuario" /></td>
					  </tr>
					  </l:iterate>
					</tbody>
				  </table>
				  <br><br>
<h:form action="/dowload" >
<h:submit value="Baixar Relatorio" styleClass="contact3-form-btn"></h:submit>
<h:errors ></h:errors>
</h:form>
</div>
</div>
