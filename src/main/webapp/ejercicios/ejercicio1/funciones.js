/**
 * 
 * 
 */


let letra = document.getElementById('cajaLetrInsertada').value;
const palabra = "vaca";

function formatear() {
	document.getElementById('cajaTexto1').value = "";
	document.getElementById('cajaTexto2').value = "";
	document.getElementById('cajaTexto3').value = "";
	document.getElementById('cajaTexto4').value = "";
	document.getElementById('palabraModificable').value = "";
	document.getElementById('numeroIntentos').value = '6';
	//alert("ssas")
}

function probar() {
	const split = plabra.split(' ');
	for (let i = 0; i < split.length; i++) {
		if (letra == split[i]) {
			let idTexto = 'cajatexto' + i;
			document.getElementById('idTexto').value = letra.toUpperCase();
		}
	}
}


