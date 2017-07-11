function remove(){
	var str=document.getElementById('string').value
		str=str.replace(/ /g,'')
	document.getElementById('display').innerHTML="Sentence without spaces:"+str
}