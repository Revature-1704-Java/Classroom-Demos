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