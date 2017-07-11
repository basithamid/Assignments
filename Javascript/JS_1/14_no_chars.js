function count(){
	var str=document.getElementById('string').value;
	var count=0
	for(i in str){
		if(str.charAt(i)!=' '){
			count++;
			console.log(count)
		}	
	}
	document.getElementById('display').innerHTML="No of characters:"+count;
}