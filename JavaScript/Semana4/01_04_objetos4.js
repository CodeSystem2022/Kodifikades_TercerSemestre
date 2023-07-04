let persona = {
nombre : 'Eduardo',
direccion : 'calle 7',
telefono : '+5426854512',
}

console.log(persona.nombre);

for (propiedad in persona) { // Se accede como si fuera un arreglo
    console.log(propiedad);
    console.log(persona[propiedad])
}