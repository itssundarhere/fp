interface Point{
    x: number,
    y: number
}

//---------------------------
class PointCalculation{
    x:number;
    y:number;
    draw(){
       console.log('x '+this.x+' y '+this.y);
    }
    getDistance(another:PointCalculation){

    }
}
let p = new PointCalculation();
p.draw();