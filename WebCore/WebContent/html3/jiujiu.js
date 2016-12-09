function p() {
	var arr = [0,0,0,0,0,0,0,0,0,0];
	for (var i = 1; i <= 9; i++) {
		$("#table").append("<tr id='r" + i + "'></tr>");
		var sum = 0;
		for (var j = 1; j <= i; j++) {
			$("#r" + i).append(
					"<td id='d" + j + "'>" + i + "*" + j + "=" + i * j
							+ "&nbsp</td>");
			sum = sum + i * j;
			arr[j] = arr[j] + i * j;
		}
		for (var j = 9; j > i; j--) {
			$("#r" + i).append("<td >&nbsp</td>");
		}
		$("#r" + i).append("<td class='style'>" + sum + "&nbsp</td>");
	}
	$("#table").append("<tr id='ft'></tr>");
	for (var i = 1; i <= 9; i++) {
		$("#ft").append("<td class='style'>"+arr[i]+"</td>");
	}
	$("#ft").append("<td class='style'>统计</td>");
	$("#button1").attr("disabled" ,'disabled');
	
}

function tongji() {
	$("td").removeClass();
}
function yangshi(){
	$('div').addClass('div');
	$('table').addClass('table');
	$('td').addClass('td');
}

