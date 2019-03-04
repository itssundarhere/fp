class Point {
    // private x:number;
    // private y:number;
    constructor(_x, _y) {
        this._x = _x;
        this._y = _y;
        // this.x=x;
        // this.y=y; 
    }
    /*
    *getter & setter method type*
    getX(){
        return this.x;
    }
    setX(value){
        if(value<0)
            throw new Error('Cannot change value');
        else
            this.x=value;
    } */
    //Properties method
    get x() {
        return this._x;
    }
    set x(value) {
        if (value < 0) {
            throw new Error('Cannot change value');
        }
        else {
            this._x = value;
        }
    }
    draw() {
        console.log('x ' + this._x + ' y ' + this._y);
    }
}
let p = new Point(1, 65);
let x = p.x;
p.x = 50;
p.draw();
