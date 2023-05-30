// VIDEO 6 - uso de prototype
Persona3.prototype.telefono = '2618383832';
console.log(padre);
console.log(madre.telefono);
madre.telefono = '5492618383832';
console.log(madre.telefono);

function Person3(name, surname, email) {
	this.name = name;
	this.email = email;
	this.surname = surname;
}
const father = new Person3('Leo', 'Mattioli', 'elleon@gmail.com');
console.log(father);

//APPLY METHOD
const array = ['Ing', '124981249'];
console.log(father.nombreCompleto2.apply(father, array));
