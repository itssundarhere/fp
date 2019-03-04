"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var like_component_1 = require("./like.component");
var component = new like_component_1.LikeComponent(15, true);
// component.likesCount=2;
// component._isSelected=false;
component.onClick();
console.log(component.likesCount);
