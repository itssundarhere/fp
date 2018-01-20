(function () {
    var app = angular.module("work3", ["ngRoute"]);
    app.config(function($routeProvider, $locationProvider) {
        $routeProvider.when("/home", {
            template: "<h1>Home Content</h1>"
        }).when("/contact", {
            template: "<h1>Contact Content</h1>"
        }).when("/about", {
            template: "<h1>About Content</h1>"
        }).otherwise({
            template: "<h1>Other</h1>"
        })
    });
})();