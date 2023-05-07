miFuncion(8, 2); //  hosting

// Creamos la funcion
function miFuncion(a, b) {
	//    console.log("Sumamos: "+(a + b));
	return a + b; // la funcion regresa un valor. se puede asignar a una variable
} // aunque no estemos retornando automaticamente el compilador utiliza return

// Llamando la funcion
miFuncion(5, 4);

let resultado = miFuncion(6, 7);
console.log(resultado);

// Funciones flecha
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7); // Asignamos el valor a una variable
console.log(resultado);

const response = increaseAll(1, 2, 3, 4, 5, 6);
function increaseAll() {
	let increment = 0;
	for (let i = 0; i < arguments.length; i++) {
		increment = array[i];
	}
	return increment;
}
console.log(response);
