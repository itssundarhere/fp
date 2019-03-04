//---------------------------
var PointCalculation = /** @class */ (function () {
    function PointCalculation() {
    }
    PointCalculation.prototype.draw = function () {
        console.log('x ' + this.x + ' y ' + this.y);
    };
    PointCalculation.prototype.getDistance = function (another) {
    };
    return PointCalculation;
}());
var p = new PointCalculation();
p.draw();
