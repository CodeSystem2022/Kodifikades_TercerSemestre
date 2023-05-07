let persona = {
	nombre: 'Carlos',
	apellido: 'Perez',
	email: 'pepe@gmail',
	edad: 40,
	nombreCompleto: () => {
		return `${this.nombre} + ${this.apellido}`;
	},
};

console.log(persona.nombreCompleto());
