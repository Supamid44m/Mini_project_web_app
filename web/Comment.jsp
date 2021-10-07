<%-- 
    Document   : Comment
    Created on : Aug 31, 2021, 8:04:59 AM
    Author     : supam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comment box</title>
        <style>
        #title{
        width:300px; 
        height:200px;
        }
        </style>
    </head>
    <body>
        <h1>Comment box </h1>
        <form action="addcommentServlet">
            <p>ชื่อของคุณ<p>
            <input type="text" name="commentName"  value="" size="30"><br>
            <p>หัวข้อ</p>
            <input type="text" name="commentTitle"  value="" ><br>
            <p>ความคิดเห็น</p>
            <input type="text" name="commentText"  value=""  id="title"><br>
            <p>วันที่</p>
            <input type="date" name="commentDate" value=""><br>
            <p>เวลา</p>
            <input type="time" name="commentTime" value=""><br>
            <br>
            <input type="submit" value="ตกลง">
       </form>
    </body>
</html>
