angular.module('UI', []).controller('navigation',
    function($http) {
        var self = this;

        self.template = "home.html";

        self.home = function(){
            self.template = "home.html";
        }

        self.products = function(){
            self.template = "products.html";
            $http.get('products', {
            }).success(function(data) {
                self.productlist = data;
            }).error(function() {
                alert("Error");
            });
        };

    });