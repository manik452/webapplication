<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
<form method="POST" action='/ibs_payment/billLogin'>
    <input type="text" name="spk" id="spk" placeholder="City Secure Payment Key" value="">
    <input type="text" name="sti" id="sti" placeholder="Merchant Transaction Id" >
    <input type="text" name="txa" id="txa" placeholder="Amount">
    <input type="text" name="additionalInfo" id="additionalInfo" placeholder="Additional Information">

    <input type="submit" class="btn whiteBtn" value="Submit"/>
</form>
</body>
</html>
