<%@ page language="java" 
    contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
	  <head>
	   <style>
			h1 {text-align: center;}
			p {text-align: center;}
			div {text-align: center;}
		</style>
         <meta http-equiv="Content-Type" 
            content="text/html; charset=windows-1256">
         <title>   Login   </title>
      </head>

	<body  bgcolor=#D3D3D3 >
		<form action="LoginServlet">

			Please enter your username 		
			<input type="text" name="username"/><br><br>		
		
			Please enter your password
			<input type="password" name="password"/><br><br>
			
			<input type="submit" value="submit">			
		
		</form>
	</body>
</html>
