<%-- 
    Document   : addcommentofirebase
    Created on : Aug 31, 2021, 8:52:38 AM
    Author     : supam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Comment" %>

<% Comment  comment = (Comment) session.getAttribute("comment"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Addcoment To firebase</title>
        <script src="https://www.gstatic.com/firebasejs/8.10.0/firebase-app.js"></script>
        <script src="https://www.gstatic.com/firebasejs/8.6.3/firebase-database.js"></script>
        
        <script>
            // Your web app's Firebase configuration
            var firebaseConfig = {
                apiKey: "AIzaSyBtrokNwl6X2bkIe2thPjp7PE_7vI7V8t8",
                authDomain: "carproject-d97ad.firebaseapp.com",
                databaseURL: "https://carproject-d97ad-default-rtdb.firebaseio.com",
                projectId: "carproject-d97ad",
                storageBucket: "carproject-d97ad.appspot.com",
                messagingSenderId: "278715086276",
                appId: "1:278715086276:web:1053bde19a855ce66b6091"
            };
            // Initialize Firebase
            firebase.initializeApp(firebaseConfig);
        </script>
        
    </head>
    <body>
        <h1>Addtofirebase</h1>


        <p>
            <input type="button" value="Save" onclick="save_comment();" />
        </p>

        <script>
            var databaseRef = firebase.database().ref('comment/');

            function save_comment() {
                var uid = firebase.database().ref().child('comment').push().key;

                var data = {
                    comment_id: uid,
                    Name: '<%= comment.getCommentName()%>',
                    Title: '<%= comment.getCommentTitle()%>',
                    Comment:'<%= comment.getCommentText()%>',
                    Date: '<%= comment.getCommentDate()%>',
                    Time: '<%= comment.getCommentTime()%>',
                    
                }

                var updates = {};
                updates['/comment/' + uid] = data;
                firebase.database().ref().update(updates);

                alert('Yout comment is created to firebase successfully!');
                reload_page();
            }

            function reload_page() {
                window.location.reload();
            }

        </script>
        
    </body>
</html>
