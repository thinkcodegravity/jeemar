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


function checkUserAjax (){
	
	var serverCommunicationObject={
	        url: '/checkUser',
	        type: 'post',
	        data: {
	                  userid:$("#uid").val()
			},
	        context: this,
	        success: function (data) {
	                  if(data == "unavailable")
				  		alert("userid already taken");
	        },
	        error: function (data) {
	                  console.log("failure");
	        }
	};
	
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
$(document).ready(function() {
		$(".password").blur( disableReg );
//	$("#userid").blur( checkUser );
//	$("input").click( testInput );
//	$("#header").mouseenter( headermouse );
//	$("#header").mouseleave( headermouseout );
	
});


