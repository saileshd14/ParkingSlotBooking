<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("#withcomponent").toggle();
    showAndHideUl = function()
    {
        $("#withoutcomponent").toggle();
        $("#withoutcomponent").toggleClass("component");
        $("#withcomponent").toggle();
    }

});
</script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form>
	<c:forEach var="i" items="${parkingList}">
			Parking Slot Name:  
			<input type="radio" onclick="showAndHideUl()" id="${i.getParkingSlot()}" name="parkingSlot" value="${i.getParkingSlot()}">
			 <label for="${i.getParkingSlot()}">${i.getParkingSlot()}</label><br>
			Location :  ${i.getLocation()}<br>
			Rating :${i.getRating()}<br>
			<br>
			<p>
			</c:forEach>
			
			<input type="submit" value="Submit">
				<div id="withoutcomponent">
   				 </div>
   				 <div id="withcomponent"> 
    			//second ul list
    </div>
			</form>

</body>
</html>
