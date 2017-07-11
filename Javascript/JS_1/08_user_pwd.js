var user="basit"
var pwd="basit"
var attempts=0;
function noOfAttempts(){
	attempts++;
}
function check(){
	noOfAttempts()
	if(attempts>3){
		document.write("Login failed")
	}
	if(document.getElementById('uname').value==user && document.getElementById(
		'pass').value==pwd){
		alert("Login successful")
		document.write("You have successfully logged in")
	}
	else {
		alert("Try again")
	}
}