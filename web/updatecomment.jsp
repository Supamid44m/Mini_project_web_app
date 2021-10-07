<%-- 
    Document   : updatecomment
    Created on : Aug 31, 2021, 10:29:00 AM
    Author     : supam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Comment" %>

<% Comment  comment = (Comment) session.getAttribute("comment"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UpdateComment</title>
        <style>
        #title{
        width:300px; 
        height:200px;
        }
        </style>
    </head>
    <body>
        <h1>Confirm Comment  </h1>
        <form action="addcommentServlet">
            <p>ชื่อของคุณ<p>
            <input type="text" name="commentName"  value="<%= comment.getCommentName()%>" size="30"><br>
            <p>หัวข้อ</p>
            <input type="text" name="commentTitle"  value="<%= comment.getCommentTitle()%>" ><br>
            <p>ความคิดเห็น</p>
            <input type="text" name="commentText"  value="<%= comment.getCommentText()%>"  id="title"><br>
            <p>วันที่</p>
            <input type="date" name="commentDate" value="<%= comment.getCommentDate()%>"><br>
            <p>เวลา</p>
            <input type="time" name="commentTime" value="<%= comment.getCommentTime()%>"><br>
            <br>
            
            <input type="submit" value="แก้ไข"><br>
            
            <a href="addcommentofirebase.jsp">save to Firebase</a>
       </form>
    </body>
</html>
