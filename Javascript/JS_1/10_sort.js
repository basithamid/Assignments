var array=[10,20,30,40,50]

function asc(){
	document.getElementById('display').innerHTML=array
	document.getElementById('result').innerHTML=array.sort(function(a,b){return a-b})
}

function desc(){
	document.getElementById('display').innerHTML=array
	document.getElementById('result').innerHTML=array.sort(function(a,b){return b-a})
}