(function () {
    var app = angular.module("work2", []);
    app.controller("StoreController", function ($http) {
        var pb = this;
        this.contacts = [];
        this.delete = function(loc) {
            pb.contacts.splice(loc, 1)
        };
        
        $http.get("phone-book.json").then(function(res) {
            console.log(res)
            pb.contacts = res.data.contacts
        },function(res) {
            console.log("Error")
        })
    });
})();