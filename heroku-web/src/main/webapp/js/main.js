function hello() {
	$.ajax({
		type: "GET",
		url: '/hello',
		success: function(data, type, xmlhttp){
			console.log('hello');
		}
	});
}