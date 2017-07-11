function check(){
	var word=document.getElementById('string').value
	var len=word.length
	for(i=0,j=len-1;i<=j;i++,j--){
		if(word.charAt(i)!=word.charAt(j)){
			document.getElementById('display').innerHTML="Not a Palindrome"
			break;
		}
	}
	if(i>j){
		document.getElementById('display').innerHTML="It is a Palindrome"
	}
}