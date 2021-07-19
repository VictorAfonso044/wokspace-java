<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h"%>
<link rel="stylesheet" type="text/css" href="main.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<div class="bg-contact3">
		<div class="container-contact3" >
			<div class="wrap-contact3">
<h1 class="contact3-form-title">Crud SOAP Struts</h1>

<h:form action="/hello" styleClass="contact3-form validate-form">

    <div class="wrap-input3 validate-input" data-validate="id do beneficiario é obrigatorio">
    <label class="label">ID Beneficiario: </label>
        <h:text property="idBeneficiario" styleClass="input3" />
        <span class="focus-input3"></span>
    </div>

    <div class="wrap-input3 validate-input" data-validate = "Obrigatorio">
    <label class="label">Nome Beneficiario: </label>
<h:text property="nomeBeneficiario" styleClass="input3" />
        <span class="focus-input3"></span>
    </div>
    <div class="wrap-input3 validate-input" data-validate = "Obrigatorio">
    <label class="label">Numero carteira: </label>
<h:text property="numCarteira" styleClass="input3" />
        <span class="focus-input3"></span>
    </div>
    <div class="wrap-input3 validate-input" data-validate = "Obrigatorio" ng-app="myApp">
        <label class="label">Data de nascimento: </label>
<h:text property="dataNascimento" styleClass="input3" />
        <span class="focus-input3"></span>
    </div>
    <div class="wrap-input3 validate-input" data-validate = "Obrigatorio">
        <label class="label">Data de inclusão: </label>
<h:text property="dataInclusao" styleClass="input3" />
        <span class="focus-input3"></span>
    </div>
    <div class="wrap-input3 validate-input" data-validate = "Obrigatorio">
    <label class="label">Id Prontuario: </label>
    <h:text property="idProntuario"  styleClass="input3" />
            <span class="focus-input3"></span>
    </div>
<h:submit styleClass="contact3-form-btn"/>
<br>


<h:errors />

</h:form>
<br>
<h:form action="/usuarios" >
<h:submit value="Tabela" styleClass="contact3-form-btn"/>
<h:errors />
</h:form>
</div></div>
<div class="container-contact3" >
<div class="wrap-contact3">
<h2 class="contact3-form-title" >Criar campos com dados aleatorios</h2>
<h:form action="/procedure" >
<div class="wrap-input3 validate-input" data-validate = "Obrigatorio">
        <label class="label">Numero de campos: </label>
<h:text property="numcampos" styleId="numcampos" styleClass="input3" />
        <span class="focus-input3"></span>
    </div>
<h:button property="create" styleId="btn1" value="Criar"  onclick="toast();" styleClass="contact3-form-btn"/>
<h:errors />
</h:form>
<div id="toast"><div id="img" ><i class="" style="font-size:20px;"></i></div><div id="desc">A notification message..</div>
<script type="text/javascript" src="main.js"></script>
</div></div></div>