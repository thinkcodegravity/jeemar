var a=10;
var b=true;
var d=10.0;
var e="john";
var f='a';
 test();
function test(){
	var g=10;
	g=true;
	var names=["john","jane","andy"];
	console.log(names[0]);
	var student={
		name:"jane",
		grade:1,
		school:"ABC school"
	}
	console.log( student.school );
	
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
