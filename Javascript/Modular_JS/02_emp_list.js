
function emp(id,name,sal,dept){
	this.eid=id;
	this.ename=name;
	this.salary=sal;
	this.dept_no=dept;
}


function add_to_list(){
	var id=document.getElementById('eid').value;
	var name=document.getElementById('ename').value;
	var sal=document.getElementById('salary').value;
	var dept=document.getElementById('dept').value;
	var Emp=new emp(id,name,sal,dept);
	/*Employee.push(Emp)
	console.log(Emp)
	console.log(Employee)*/

	Emp_Manager.addEmp(Emp);
	console.log(Emp_Manager.getEmp());
}

var Emp_Manager=(function(){
	var emps=[];
	return {
		addEmp:function(emp){emps.push(emp);},
		getEmp:function(){return emps;},
		sortEmp:function(){
			emps.sort(function(a,b) {
				return a.eid - b.eid;
			});
		}
	}

})();


function sort(){
	Emp_Manager.sortEmp();
	console.log(Emp_Manager.getEmp())

}
