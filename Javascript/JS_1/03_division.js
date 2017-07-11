
function calculate() {
	var n1=document.getElementById('num1').value;
		var n2=document.getElementById('num2').value;
		console.log("n1:"+n1);
		console.log("n2:"+n2);
	if(n2==0){
		
		
		alert("Divide by zero error");
	}
	else{
		var q=n1/n2;
		document.write(q);
	}
}