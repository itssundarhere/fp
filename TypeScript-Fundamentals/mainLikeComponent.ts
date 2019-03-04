import {LikeComponent} from './like.component';
let component = new LikeComponent(15,true);
// component.likesCount=2;
// component._isSelected=false;
component.onClick();
console.log(component.likesCount);