



// Llamamos a la funcion
miFuncion(5, 4)

let resultado = miFuncion(6, 7)
console.log(resultado)

// Declaramos una función de tipo expresión o anónima
let x = function(a, b){ return a + b}
resultado = x(5, 6)
console.log(resultado)







// Pasos por valor

// Tipos primitivos

let k = 10 

function cambiarValor(a){
    a = 20;
}

cambiarValor(k)
console.log(k)


// Pasos por referencia

const persona = {
    nombre: "Juan",
    apellido: "Lopez"
}

function cambiarValorObjeto(p1){
    p1.nombre = "Ignacio"
    p1.apellido = "Perez"
}

cambiarValorObjeto(persona)
console.log(persona) 