var http = require('http');
var fs = require('fs');

function onRequest(req, res) {

	res.writeHead(200, {
		'Content-Type' : 'text/html'
	});

	fs.readFile('h1.html', null, function(error, data) {
		if (error) {
			res.writeHead(404);
			res.write('File not found!');
		} else {
			res.write(data);
		}

		res.end();
	});
};
http.createServer(onRequest).listen(8000);
console.log('Server running at localhost:8000');
