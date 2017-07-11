function check() {
	var alpha=document.getElementById('apb').value;
	if(alpha=='a' || alpha=='A' || alpha=='e' || alpha=='E' || alpha=='i' || alpha=='I' || alpha=='o' || alpha=='O' || alpha=='u' || alpha=='U'){
		alert("It is a vowel");
	}
	else{
		alert("Not a vowel");
	}
}