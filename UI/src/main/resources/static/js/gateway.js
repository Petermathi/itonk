angular.module('gateway', []).controller('navigation',
    function($http) {
        var self = this;

        self.template = "home.html";

        self.home = function(){
            self.template = "home.html";
        }

        self.cats = function(){
            self.template = "cats.html";
            $http.get('cats', {
            }).success(function(data) {
                self.catlist = data;
            }).error(function() {
                alert("Error");
            });
        };

        self.dogs = function(){
            self.template = "dogs.html";
            $http.get('dogs', {
            }).success(function(data) {
                self.doglist = data;
            }).error(function() {
                alert("Error");
            });
        };
    });