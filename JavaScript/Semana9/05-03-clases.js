//let persona3 = new Persona('Carla', 'Ponce'); Esto no se debe hacer: Persona is not defined 

class Persona{ //Definimos la clase. //Clase padre

//CLASE 8 STATIC
// 8.2 Atributos estáticos:
    //static contadorObjetosPersona = 0; 

    static contadorPersonas = 0;
    
    constructor(nombre, apellido){ 
        this._nombre = nombre;
        this._apellido = apellido; 
    //8.2 
        Persona.contadorObjetosPersona++;
        this.idPersona = ++Persona.contadorPersonas;
       //console.log('Se incrementa el contador: '+' '+Persona.contadorObjetosPersona);
    }
  
    get nombre(){
        return this._nombre;
    }

    //6.2 

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        //return this._nombre + ' ' + this._apellido;
        return this.idPersona + ' ' + this._nombre + ' ' + this._apellido;
    }
    
    toString(){ 
        return this.nombreCompleto();
    }

    //Clase 8: Lunes 29/5
    static saludar(){
        console.log('Saludos desde este metodo static');
    }

    static saludar2(persona){
        console.log(persona.nombre + ' ' + persona.apellido);
    }
}

class Empleado extends Persona{ 
    constructor(nombre, apellido, departamento){
        super(nombre,apellido);
        this._departamento = departamento;
    }

    static contadorEmpleados = 0;
    constructor(nombre, apellido, edad, sueldo){
        super(nombre, apellido, edad);
        this._idEmpleado = ++Empleado.contadorEmpleados;
        this._sueldo = sueldo;
    }

    get idEmpleado(){
        return this._idEmpleado;
    }

    get sueldo(){
        this._sueldo;
    }

    set sueldo(sueldo){
        this._sueldo = sueldo;
    }

    toString(){
        return super.toString()+ " "+this._idEmpleado+" "+this._sueldo;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = this.departamento;
    }

    //7.2 Sobreescritura:
    nombreCompleto(){
        //return this.nombre+' '+this._apellido+', departamento: '+ this.departamento;
        return super.nombreCompleto()+', '+this._departamento; 
    }
}


//Creamos objetos y los mostramos en consola:

let persona1 = new Persona("Martín", "Perez"); 
//console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';   
//console.log(persona1.nombre);
persona1.apellido = 'Rodriguez';   
//console.log(persona1.apellido);    
//console.log(persona1); 

let persona2 = new Persona("Carlos","Lara");
//console.log(persona2.nombre);
//persona2.nombre = 'Maria Laura';   
//console.log(persona2.nombre);
//console.log(persona2); 

let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
//console.log(empleado1);
console.log(empleado1.nombreCompleto()); 

//Object.prototype.toString Esta es la manenera de acceder a metodos y atributos de forma dinamica
console.log(empleado1.toString());
console.log(persona1.toString()); 

//persona1.saludar(); no se utiliza desde el objeto
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1); 

//CLASE 8 STATIC, 8.2 Atributos estáticos:
//console.log(persona1.contadorObjetosPersona);
console.log(Persona.contadorObjetosPersona); //Accedemos desde la clase padre Persona
console.log(Empleado.contadorObjetosPersona); //Accedemos desde la clase hija Empleado

console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersonas);

let persona3 = new Persona('Carla', 'Pertosi');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

// Prueba clase Cliente
let cliente1 = new Cliente("Miguel", "Zala", 29, new Date());
console.log(cliente1.toString());

let cliente2 = new Cliente("Natalia", "Ortega", 22, new Date());
console.log(cliente2.toString());