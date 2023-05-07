function myFunction(a, b) {
	console.log(arguments);
}
myFunction(1, 2);
const myFunctionToString = myFunction.toString();
console.log(myFunctionToString);
