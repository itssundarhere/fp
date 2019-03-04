var a;
var b;
var c;
var d;
var e = [1, 2, 3];
console.log(e[0]);
console.log("num " + a + " str " + b + " bool " + c + " any " + d);
var Direction;
(function (Direction) {
    Direction[Direction["Up"] = 0] = "Up";
    Direction[Direction["Down"] = 1] = "Down";
    Direction[Direction["Left"] = 2] = "Left";
    Direction[Direction["Right"] = 3] = "Right";
})(Direction || (Direction = {}));
var go;
go = Direction.Up;
console.log(go);
