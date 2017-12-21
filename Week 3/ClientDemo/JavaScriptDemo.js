//"use strict"
// var can be used to declare variables
var x = 5

// string can be created 3 ways
var y = 'some string'
var z = "another string"

//template literals
var current = `hello ${y+x}
one line
more lines
even more lines`;

console.log('current = ' + current)

console.log("x has the value of " + x + " and y has the value of " + y);
console.log(`x has the value of ${x} and y has the value of ${y}`);

//object notation
var user = {
  "id":1,
  "name":'john',
  "accounts":[
    {
      "id":1,
      "balance":22
    },
    {
      "id":2,
      "balance":333.5
    }
  ]
}

//functions
function add (a, b) {
  return a + b;
}

function truthiness (test) {
  if (test) {
    return true;
  } else {
    return false;
  }
}

function equality (a, b) {
  (a == b) ? console.log("equal") : console.log("not equal");
  (a === b) ? console.log("identical") : console.log("not identical");
}

function varlet() {
  if (true) {
    console.log(`b = ${b} hoisted`);
    let a = 5;
    var b = 10;
  }
  console.log(`b = ${b}`);
  console.log(`a = ${a}`);
}

//var vs let
function testVar() {
  var a = 30;
  if (true) {
    var a = 50;
    console.log(a);
  }
  console.log(a);
}

function testLet() {
  let a = 30;
  if (true) {
    let a = 50;
    console.log(a);
  }
  console.log(a);
}

function outer() {
  let out = 5;
  function inner() {
    console.log(out);
    let inn = 'in';
  }
  return inner;
}

//Classes
function Person(name, age) {
  let n = name;
  let a = age;

  this.getName = function() {
    return n;
  }

  this.setName = function(newName) {
    n = newName;
  }

  this.getAge = function() {
    return a;
  }

  this.setAge = function(newAge) {
    a = newAge;
  }
}

//lambdas vs anonymous vs named functions
let myFunction = () => { /*do something*/ }

let anonymous = function () {
  //technically a lambda
}

function someFunction() {

}

//const
const number = [];
number.push(11);
number.push(22);

//ES6 classes
class Parent {
  constructor(username, password) {
    this.username = username;
    this.password = password;
  }

  print() {
    console.log(this.username);
  }
}

class Child extends Parent {
  constructor (username, password, age) {
    super(username, password);
    this.age = age;
  }

  static countParents() {
    console.log ("There are two parents");
  }

  print() {
    console.log(this.username + ' ' + this.age);
  }
}

//Collections
let arr1 = [11, 22, 11, 24, 42];
let set = new Set(arr1);
console.log(set);
set.forEach(function(args) {console.log(args)})

//DOM Traversal/Manipulation
let template = `<h1>Hello, ${name}, this is a template!</h1>`;

document.getElementById('template').innerHTML += template;

function changeText(id) {
  id.innerHTML += "Text Changed!";
}

let newPara = document.createElement('p');
let node = document.createTextNode("this is new");
newPara.appendChild(node);

let target = document.getElementById("div1");
let child = document.getElementById("div2");
target.insertBefore(newPara,child);

//Unobtrusive event listener
window.addEventListener("resize", function() {
  document.getElementById("template").innerHTML = "Window Resized!";
})

//Event propagation defines order in which event listeners are triggered
function myDiv1Event(event) {
  console.log("div1");
}

function myDiv2Event(event) {
  console.log("div2");
}

//Bubbling (default)
//document.getElementById("div1").addEventListener("click", myDiv1Event);
//document.getElementById("div2").addEventListener("click", myDiv2Event);

//Capturing
document.getElementById("div1").addEventListener("click", myDiv1Event, true);
document.getElementById("div2").addEventListener("click", myDiv2Event, true);

//Parsing JSON strings into objects
let jsontext = `{"dogs":[{"name":"Rex","breed":"schnauzer"},{"name":"Lassie","breed":"Collie"},{"name":"Spot","breed":"dalmatian"}]}`;

let obj = JSON.parse(jsontext);
console.log(obj);

//AJAX
let xhr = new XMLHttpRequest();

xhr.onreadystatechange = function() {
  if (this.readyState == 4 & this.status == 200)
    console.log ("success!");
}

//OR xhr.onsuccess
//OR xhr.onerror

xhr.open('get', 'https://jsonplaceholder.typicode.com/users');

xhr.send();