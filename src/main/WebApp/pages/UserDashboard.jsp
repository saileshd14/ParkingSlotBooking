<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parking Spots</title>
</head>
<body>
<form method ="get" action="viewBookigs">
<input type="submit" name="viewBookings" value="View Bookings"><br>
</form>
<form method ="get" action="bookParkingSlot">
<input type="submit" name="bookParkingSlot" value="Book a Parking Slot" ><br>
</form>
<form action="addMoney.jsp">
<input type="submit" value="Add Money in Wallet"><br>
</form>
<form action="viewUserInfo">
<input type="submit" name="viewUserInfo" value="View User Information"><br>
</form>
<form method ="get" action="modiflyUserInfo">
<input type="submit" name="modiflyUserInfo" value="Modifly User Info"><br>
</form>
<form method ="get" action="cancelBooking">
<input type="submit" name="cancelBooking"  value="Cancel Booking"><br>
</form>

</body>
</html>