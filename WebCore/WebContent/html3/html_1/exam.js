function dayin() {
	var arr = [0,0,0,0,0,0,0,0,0,0];
	for (var i = 1; i <=9; i++) {
		$('#table').append("<tr id='r" + i + " ' ></tr>");
		var sum = 0;
	for (var j = 0; j <=9; j++) {
		$("#r" + i).append("<td id='d" + j + "'>" + i + "*" + j + "=" + i * j
				+ "&nbsp</td>");
		sum = sum + i * j;
		arr[j] = arr[j] + i * j;
		
	}
		
	}
	
}