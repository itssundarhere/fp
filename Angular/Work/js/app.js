(function(){
    var app = angular.module("Work",[]);
    app.controller("StoreController",function(){
        this.product = item
    });
    var item = [{
        name : "Shampoo",
        price : 220.1,
        description : "Its just a shampoo",
        canPurchase : false,
        soldOut : false
    },{
        name : "Shirt",
        price : 245.1,
        description : "Its just a Shirt",
        canPurchase : false,
        soldOut : false
    },{
        name : "Shoe",
        price : 245.1,
        description : "Its just a Shoe",
        canPurchase : true,
        soldOut : false
    }];
})();