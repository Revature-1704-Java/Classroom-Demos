let people = require('./logfile.js');
console.log(people[0].name);

let jquery = require('jquery');

jquery.each(people, function(key, value) {
  jquery('body').append('<h1>'+people[key].name+'</h1>');
});