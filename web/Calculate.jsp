<%-- 
    Document   : Calculate
    Created on : Aug 29, 2021, 7:22:09 PM
    Author     : supam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>คำนวณภาษี</title>
    </head>
    <body>
        <form action="calservlet">
            <p>จำนวนยอดจัด</p>
            <input type="text" name="carprice">
            <p>ระยะเวลา(ปี)</p>
            <input type="text" name="caryear">
            <p>ระยะเวลา(เดือน) 1 ปี = 12 เดือน  </p>
            <input type="text" name="carmonth">
            <p>ดอกเบี้ย ใส่เป็น % เช่น 7% = 0.07</p>
            <input type="text" name="carvat"><br>
            <br>
            <input type="submit"  value="คำนวณ">
        </form>
    </body>
</html>
