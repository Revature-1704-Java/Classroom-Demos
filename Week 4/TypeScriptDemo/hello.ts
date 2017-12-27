function hello(someone) {
  return "Hello, " + someone;
}

let person = "Mehrab Rahman";

document.body.innerHTML = hello(person);

//3 basic types
let isDone: boolean = false;
let num: number = 42;
let myName: string = "Mehrab";

let isNotDone = true;

//When type is unknown
let notSure: any = 4;
notSure = "maybe a string now";
notSure = false;

//collections
let list: number[] = [1, 2, 3];
let genlist: Array<number> = [1, 2, 3];
enum Color {Black, White, Red};
let c: Color = Color.White;

//if function returns nothing, it's void
function bigAlert(): void {
  alert("Big Alert!");
}

//lambdas
let f1 = function (i: number): number {
  return i + i;
}
let f2 = (i: number) => i + i;

//Interfaces
interface Adult {
  name: string;
  //optional properties:
  age?: number;
  move(): void;
}

let a: Adult = {name: "Jonathan", move: () => { }};

class Point {
  x: number;
  y: number;

  constructor(x: number, y: number) {
    this.x = x;
    this.y = y;
  }

  dist() {
    return Math.sqrt(this.x*this.x + this.y*this.y);
  }
}

//Inheritance
class Point3D extends Point {
  z: number;

  constructor(x: number, y: number, z: number) {
    super(x, y);
    this.z = z;
  }

  //Overwriting
  dist() {
    let d = super.dist();
    return Math.sqrt(d*d + this.z*this.z);
  }
}

//Modules "." operator can separate submodules
module Geometry {
  export class Square {
    constructor(public sideLength: number = 0) { }

    area() {
      return Math.pow(this.sideLength, 2);
    }
  }
}

let s1 = new Geometry.Square(5);

//Generics
class Tuple<T1, T2> {
  constructor(public item1: T1, public item2: T2) {}
}

interface Pair<T> {
  item1: T;
  item2: T;
}

//Template strings
let newName = `Mehrab`;
let greeting = `Hi ${newName}, how are you?`;