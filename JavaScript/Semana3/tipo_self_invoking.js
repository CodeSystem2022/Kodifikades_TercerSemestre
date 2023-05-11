miFuncion(8, 2);

function miFuncion(a, b){
    //console.log("Sumamos: "+ (a + b));
    return a + b;
}

//Llamamos la funcion
miFuncion(5, 4);

let resultado = miFuncion(6, 7);
console.log(resultado);

//Declaramos una función de tipo expresión o anónima

let x = function(a, b){ return a + b};
resultado = x(5, 6); //para llamarla se pone la variable y ()
console.log(resultado);

//Funciones que se llaman a sí mismas: self y invoking
(function(a, b){
    console.log('Ejecutando la funcion: '+ (a + b));
})(9, 6);
