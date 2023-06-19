<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parking Spots</title>
</head>
<body>
<form method ="get" action="displayParkingSlots">
Enter Location: <input type="text" name="location"><br>
Enter Date: <input type="date" name="date"><br>
Enter Check In Time: <input type="time" name="checkInTime"><br>
Enter Check Out Time: <input type="time" name="checkOutTime"><br>
<input type="submit" value="submit"><br>
</form>
</body>
</html>