let x = 10; //variables de tipo primitiva
console.log(x.length);

//Objeto
let persona = {
    nombre: 'Miguel Angel',
    apellido: 'Bru Melis',
    email: 'nombre@mail.com',
    edad: 26,
    nombreCompleto: function(){
        return this.nombre+' '+this.apellido
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email)
console.log(persona.edad);