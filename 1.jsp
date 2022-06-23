<%@ page import="java.util.*" %>
<html>

<%
	String firstName="john";
	int a=10;
	int b=20;
	if( a==b)
		firstName="jane";
	else
		firstName="john";
	String [] names=new String[3];
		names[0]="mike";
		names[1]="andy";
		names[2]="tony";
		
	for ( int i=0;i<5;i++)
	{ %>
		JSP  expression Statements
		COUNTER <% = i %>
	<%}
	%>
	
	


	welcome mr <%= firstName %>

<html>