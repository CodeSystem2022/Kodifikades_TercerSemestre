class Product {
	constructor(id, name, price, count) {
		this.id = id;
		this.price = price;
		this.count = count;
		this.name = name;
	}

	getId() {
		return this.id;
	}
	getName() {
		return this.name;
	}
	getPrice() {
		return this.price;
	}
	setName(newName) {
		this.name = newName;
	}
	setPrice(newPrice) {
		this.price = newPrice;
	}

	toString() {
		return `ID: ${this.id}, Name: ${this.name}, Price: ${this.price}`;
	}
}


class Orden{
  static count = 0;
  static getMaxProducts(){
    return 5;
  }

  constructor(){
    this._id = ++Orden.counter();
    this._products = [];
    this._countAddedProducts = 0;
  }

  getId(){
    return this._id;
  }

  addProduct(product){
    if(this._products.length < Orden.getMaxProducts()) return this._products.push(product)
    return 'No se pueden agregar mas productos.'
  }

  total(){
    let totalSell = 0;
    for(let product of this._products){
      totalSell += product.price
    }
    return totalSell
  }

  showOrder(){
    let orderProduct = '';
    for(let product of this._products){
      orderProduct += product.toString() + " "
    }
    console.log(`Order: ${this._id}, Total ${this.total()}, Products: ${this.orderProduct}`)
  }
}