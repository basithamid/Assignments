
var array=[5,3,76,34,22,-10,88]
function calculate(){


	document.getElementById('numbers').innerHTML=array
	var min=Math.min(...array)
	var max=Math.max(...array)
	var sum=0
	for(i=0;i<array.length;i++){
		sum+=array[i]
	}
	var avg=sum/array.length
	document.getElementById('results').innerHTML="min:"+min+"<br>"+"max:"+max+"<br>"+"sum:"+sum+"<br>"+"avg:"+avg;
	
}