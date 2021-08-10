<%@page import="com.example.dao.MainDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.ArrayList"
    import="com.example.dao.MainDao"
    import="com.example.types.ItemList"%>
    
<!DOCTYPE html>
<html>
<body bgcolor=#D3D3D3>

<h1>Items in The database</h1>
<table border="1">
<tr>
<td>ID</td>
<td>Row Title</td>
</tr>
<tr>
<%
MainDao mainDao=new MainDao();
ArrayList<ItemList>list=mainDao.getItems();
for(int i=0;i<list.size();i++){ %>
<td><%=list.get(i).getRow_id()%></td>
<td><%=list.get(i).getRow_title() %></td>
</tr>
<%} %>
</table>
<form action="UserLoggedServlet">
			Item Name		
			<input type="text" name="itemName"/><br><br>		
			<input type="submit" value="submit"id="sub">			
		</form>
		
<script>
$(document).ready(function() {
$("#sub").click(function() {
alert("succeess");
$.ajax({
url: "userLogged.jsp",
type: "post",
data: {
itemName:$('#itemName').val(),
success : function(data){
alert(data);
}
}
});
});
});
</script>		
</body>
</html>