
function calculate() {
	var d = new Date;
	var year = d.getFullYear();
	console.log(year);
	var age = document.getElementById('age').value;
	var birth_year = year-age;
	document.getElementById('birth_year').value=birth_year.toString();
}