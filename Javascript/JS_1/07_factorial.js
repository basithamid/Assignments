
function factorial(n){
	var n=document.getElementById('num').value;
	fact=1;
	for(i=n;i>0;i--){
		fact*=i;
	}
	document.getElementById('d').innerHTML=fact;

}