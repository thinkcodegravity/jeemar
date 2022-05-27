var a=10;
var b=true;
var d=10.0;
var e="john";
var f='a';
test();
function checkUser(){
	var uid=$("#userid").val(); // READING value from userid text box userid
	if(uid=="" ){
		$("#userid").val("MANDATORY"); // WRITE value from userid text box userid
	}	
	else if(uid=="john" || uid=="jane")
	{
		document.getElementById("userid").style="background:red";
		alert("userid is taken");
	}
	else{
		document.getElementById("userid").style="background:white";
		
	}
}
function validate(){
//	var uid=document.getElementById("userid").value;
	var uid=$("#userid").val();
	
//	var pwd=document.getElementById("password").value;
	var pwd=$(".password").val();
	if(uid==""){
		document.getElementById("userid").style="background:red";
		return false;
	}
	else if(pwd==""){
		alert("password is mandatory");
		return false;// customer stay on same page
	}
	else{
		return true; // will make server journey	
	}
}
 
function test(){
	var g=10;
	g=true;
	var names=["john","jane","andy"];
	console.log(names[0]);
	var student={
		name:"jane",
		grade:1,
		school:"ABC school",
		getGrade(){
			return this.grade;
		},
		sub(a,b){
			return a-b;
		}
	}
	console.log( student.school );
	console.log( student.getGrade() );
	console.log( student.sub(10,2) );
	var x=10;
	var y=20;
	console.log( x + y );
	console.log( x > y );
	console.log( x == y );
	
	// false OR true = true
	if(x==y || x<y)
		console.log(" x and y are equal");
	else
		console.log(" x and y are not equal");
	
	
	for(var j=1;j<5;j++)
		console.log("hi");
		
	var k=3;
	while(k > 1){
		console.log("bye");
		k--;
	}	
		
	
	var l=3;
	do{
		console.log("bye");
		l--;
	}	while(l > 1);
	
	
	try{
		var x=n/0;
	}catch(err){
		console.log('catch blcok');
	}
	finally{
		console.log('i am done');
	}
	
}
function add(a, b){
	return a+b;
}
	/*
	var a=10;
	var a=true; // redeclare variable
	a=30; // reassign same 
	
	const b=20;
	const b=30; // cannot redeclare
	b=40; // cannot reassign
	*/


function checkUserAjax (){
	/*
	java object = variable and methods
	js object   = property and functions
	ajax js object has property and functino
		property
			url : http url location of server program (compare with form action="")
			type : get/post
			data : key:value pair data
		function : contains call-back function
			success : if server program connection is a success
				(data) - contain servers response
			error : if server program connection failed
				(data) - contains reason why ajax could not connect to server program
	*/
	/*
		url: '/checkUser?userid='+$("#userid").val(),
	    type: 'get',
	        
	*/
	const serverCommunicationObject={
	        url: '/checkUser',
	        type: 'post',
	        data: {
	                  userid:$("#userid").val()
			},
	        context: this,
	        success: function (data) {
	                  if(data == "unavailable")
				  			alert("userid already taken");
	        },
	        error: function (data) {
	                  alert("unable to reach server program")
	        }
	};
	
	// jquery functino .ajax it will accept
	// javascript object with AJAX property and functions
	$.ajax(serverCommunicationObject);	
	
	
}
function testInput(){
	alert("userid clicked on text box");
}
function headermouse(){
	$("#header").css("background","red");
}
function headermouseout(){
	$("#header").css("background","#21618C");
}
function disableReg (){
	var uid=$("#userid").val();
	var pwd=$(".password").val();
	if(uid=="" ){
		$("#userid").css("background","red");		
		$("#regButton").slideUp( 5000 );
	}
	else if(pwd==""){
		$(".password").css("background","red");
		$("#regButton").slideUp( 5000 );
	}
	else
	{
		$("#userid").css("background","white");
		$(".password").css("background","white");
		$("#regButton").slideDown( 5000 );
	}	
	
		
}
function manipulateDom(){
	var tableCode=" <table border='1'> <tr><td>apple</td><td>mango</td></tr></table>"
	$("#footer").html(tableCode);
}
$(document).ready(function() {
		$(".password").blur( disableReg );
		$("#products").click( manipulateDom)
	$("#userid").blur( checkUserAjax );
	// HTML Eleemt)
//	$("input").click( testInput );
//	$("#header").mouseenter( headermouse );
//	$("#header").mouseleave( headermouseout );
	
});


