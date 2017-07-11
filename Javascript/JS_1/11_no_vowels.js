function calculate(){
	var string=document.getElementById('name').value;
	var n=string.length
	var count_a=0, count_e=0, count_i=0, count_o=0, count_u=0
	for(i in string){
		if(string.charAt(i)=='a' || string.charAt(i)=='A'){
			count_a++;
		}
		else if(string.charAt(i)=='e' || string.charAt(i)=='E'){
			count_e++;
		}
		else if(string.charAt(i)=='i' || string.charAt(i)=='I'){
			count_i++;
		}
		else if(string.charAt(i)=='o' || string.charAt(i)=='O'){
			count_o++;
		}
		else if(string.charAt(i)=='u' || string.charAt(i)=='U'){
			count_u++;
		}
	}
	document.getElementById('vowels').innerHTML="Count of A:"+count_a+"<br>"+"Count of E:"+count_e+"<br>"+"Count of I:"+count_i+"<br>"+"Count of O:"+count_o+"<br>"+"Count of U:"+count_u;

}