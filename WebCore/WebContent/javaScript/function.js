/**
 * 
 */
function pasta(grain, width, shape, hasEgg) {
	this.grain = grain;
	this.width = width;
	this.shape = shape;
	this.hasEgg = hasEgg;
	this.toString = pastaToString;
}
function pastaToString() {
	return "Grain: " + this.grain + "\n" + "Width: " + this.width + "\n"
			+ "Shape: " + this.shape + "\n" + "Egg?: " + Boolean(this.hasEgg);
}
function pastaDemo() {
	var spaghetti = new pasta("whset", 0.2, "circle", true);
	window.alert(spaghetti);
	pasta.prototype.foodgroup = "carbohydrates";
	spaghetti.color = "   pale straw   ";
	spaghetti.drycook = 7;
	spaghetti.freshcook = 0.5;
	window.alert("spaghetti.foodgroup=" + spaghetti.foodgroup)

	var chowFun = new pasta("rice", 3, "flat", false);
	window.alert(chowFun);
	pasta.prototype.trim = function() {
		// 用正则表达式将前后空格用空字符串替代。
		return this.replace(/(^\s*)|(\s*$)/g, "");
	}
	/*
	 * var s = spaghetti.color; window.alert(s + " (" + s.length + ")"); //
	 * 删除前后空格 s = s.trim(); //显示"leading and trailing spaces (27)"
	 * window.alert(s + " (" + s.length + ")"); window.alert(s);
	 */
	window.alert(spaghetti.color + " (" + (spaghetti.color).length + ")");
	var a = spaghetti.color.trim()
	window.alert(a + " (" + a.length + ")");
	window.alert(a);

}

function Student(name,name) {
	this.name = name;
	this.name = name;
	this.getName = getName;
	this.getName = getName;
}

function getName() {
	return this.name;
}
function getName() {
	return this.name;
}
function Button1_onclick() {
	var s = new Student("abcde","lijie", 20,  "123456789")
	alert(s.getName());
	alert(s.getName());
	//alert(s.getAge());
	//alert(s.name);
}

function stringDemo() {
	String.prototype.trim = function() {
		// 用正则表达式将前后空格用空字符串替代。
		console.info("这是prototype.trim！")
		return this.replace(/(^\s*)|(\s*$)/g, "");
	}
	var s = "    leading and trailing spaces    ";
	// 显示 " leading and trailing spaces (35)"
	window.alert(s + " (" + s.length + ")");
	// 删除前后空格
	s = s.trim();
	// 显示"leading and trailing spaces (27)"
	window.alert(s + " (" + s.length + ")");
}

function objDemo() {
	var myObject = new Object();
	myObject.name = "zhangsan";
	myObject.age = "22";
	myObject.phone = "133565687569";
	myObject["not a valid identifier"] = "This is the property value";
	myObject[100] = "100";

	for (prop in myObject) {
		// window.alert("The property'" + prop + "'is" +myObject[prop] +
		// "<br/>")
		document.write("The property'" + prop + "'is" + myObject[prop]
				+ "<br/>")
	}
}

function arrayDemo() {
	var myArray = new Array(3);
	myArray[0] = "Hello"
	myArray[1] = 42;
	myArray[2] = new Date(2016, 11, 24);
	document.write(myArray + "<br/>");
	document.write("myArray.length = " + myArray.length + "<br/>");// 长度为3
	// 添加某些expando的属性
	myArray.expando = "JScript!";
	myArray["another Expando"] = "Windows";
	document.write(myArray + "<br/>");
	document.write("myArray.length = " + myArray.length + "<br/>");
	// 长度不变，两个expando属性，并不影响长度
}

function withDemo() {
	/*
	 * var x, y; x=Math.cos(3 * Math.PI) + Math.sin(Math.LN10) y=Math.tan(14
	 * *Math.E)
	 */
	with (Math) {
		x = cos(3 * PI) + sin(LN10);
		y = tan(14 * E);
	}
	document.write("x = " + x + " y = " + y);
}

window.onload = initAll;
function initAll() {
	document.getElementsByTagName("form")[0].onsubmit = function() {
		return addNode();
	}
}
function addNode() {
	var inText = document.getElementById("textArea").value;
	var newText = document.createTextNode(inText);
	var newGraf = document.createElement("p");
	newGraf.appendChild(newText);
	var docBody = document.getElementsByTagName("body")[0];
	docBody.appendChild(newGraf);

	return false; // 此处不可以省略，起到抑制默认行为的作用
}





















