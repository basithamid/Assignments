
function generate() {
	var n=document.getElementById('num').value;
	var tab=[];
	for(var i=1;i<=10;i++){
		tab.push(n*i)
		console.log(tab[i-1]);
		document.getElementById('answer').innerHTML=tab;
		
	}
}