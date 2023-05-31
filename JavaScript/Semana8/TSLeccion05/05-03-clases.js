class Persona {
	static countPersonObject = 0; //Atributo estatico
	email = 'Default value email'; //Atributo no estatico
  
	constructor(nombre, apellido) {
		this._nombre = nombre;
		this._apellido = apellido;
	}

	get nombre() {
		return this._nombre;
	}
	//6.2 Parte Set (Modificamos el atributo)

	set nombre(nombre) {
		this._nombre = nombre;
	}
	//Tarea Asignada
	get apellido() {
		return this._apellido;
	}
	set apellido(apellido) {
		this._apellido = apellido;
	}

	nombreCompleto() {
		return this._nombre + ' ' + this._apellido;
	}

	toString() {
		return this.nombreCompleto();
	}
}

class Empleado extends Persona {
	//Clase hija
	constructor(nombre, apellido, departamento) {
		super(nombre, apellido);
		this._departamento = departamento;
	}

	get departamento() {
		return this._departamento;
	}

	set departamento(departamento) {
		this._departamento = this.departamento;
	}

	// Sobreescritura:
	nombreCompleto() {
		//return this.nombre+' '+this._apellido+', departamento: '+ this.departamento;
		return super.nombreCompleto() + ', ' + this._departamento;
	}
}

const employee1 = new Empleado('Lucas', 'Ruiz', 'Developer');
console.log(employee1);
console.log(employee1.nombreCompleto());
console.log(employee1.toString());

const person1 = new Persona('Lionel', 'Messi');
console.log(person1.toString());
