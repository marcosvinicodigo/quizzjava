/**
 * 
 */
function validar(resposta, respostacerta, id){

	
	if(resposta == respostacerta){
		
		
		proxima(+id+1);
	} else {
		
		window.location.href= "gameover?pontos=" + id;
		
	}
}

function proxima(id){
	window.location.href= "proxima?id=" + id;
	
	
}

function rankear(pontos){
	window.location.href="rankear?pontos=" + pontos;
}

function enviarNome(){
	let nome = formRank.nome.value
	
	if (nome === ""){
		alert("Preencha o nome")
	    formContato.nome.focus()
	    return false
	} else {
			document.forms["formRank"].submit()
		}
	
}