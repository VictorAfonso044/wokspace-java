function toast(){
let num = document.getElementById('numcampos').value;
$.ajax({
			 
			 method: "GET",
			 url: "http://localhost:8010/api/procedure/"+ num,
			}).done(function(msg){
			    console.log('Funfo');
			});		
    let x = document.getElementById("btn1");
    x.value = "Criando..";
    setTimeout(function(){ x.value = "Criado com sucesso"; }, 3000);
    }