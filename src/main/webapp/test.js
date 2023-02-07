var a=10;
var b=true;
var d=10.0;
var e="john";
var f='a';
test();
function passClick(){
// READ what customer typed in username text box
	var user=$("#username").val();
	if( user ==""  ){
	// WRITE a message in username text box
		$("#username").val("please type here");
		$("#login").slideUp(5000);
		document.getElementById("username").style="background:red";
	}
	else
		$("#login").slideDown(5000);
}
function validateUseridPass(){
	var user=document.getElementById("username").value;
	var pas=document.getElementById("pass").value;
	if( user == ""  ){
		alert("userid is mandatory");
		document.getElementById("username").style="background:red";
		return false;
	}
	else if( pas ==""){
		alert("password is mandatory");
		document.getElementById("pass").style="background:red";
		return false;
	}
	else
		return true;
}
function useridMouse(){
	console.log("customer placed mouse of userid text box");
}

function useridClicked(){
	console.log("customer clicked on userid text box");
}

function useridTyped(){
	
	console.log("customer is typing in userid text box");
}

function test(){
	console.log("printing from javascript program");
	var g=10;
	g=true;
	var names=["john","jane","andy"];
	console.log(  names[2] );
	
	
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
		console.log("try block");
		var x=4/2; 
		console.log("try block done");
	}catch(err){
		console.log('catch blcok');
	}
	finally{
		console.log('i am done');
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
function checkUserAjax (){
	var serverCommunicationObject={
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
$(document).ready(function() {
	
	$("#pass").click(passClick);
	$("#pass").mouseenter(passMouseEnter);
	$("#pass").mouseleave(passMouseExit);
});
function passMouseEnter(){
$("#pass").css("background","red");
}
function passMouseExit(){
$("#pass").css("background","green");
}
