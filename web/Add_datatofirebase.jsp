<%-- 
    Document   : Add_datatofirebase
    Created on : Aug 21, 2021, 10:38:18 AM
    Author     : supamid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Car" %>

<% Car car = (Car) session.getAttribute("car");%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <script src="https://www.gstatic.com/firebasejs/8.10.0/firebase-app.js"></script>
        <script src="https://www.gstatic.com/firebasejs/8.6.3/firebase-database.js"></script>


        <!-- TODO: Add SDKs for Firebase products that you want to use
             https://firebase.google.com/docs/web/setup#available-libraries -->

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
            <input type="button" value="Save" onclick="save_car();" />
        </p>

        <script>
            var databaseRef = firebase.database().ref('car/');

            function save_car() {
                var uid = firebase.database().ref().child('car').push().key;

                var data = {
                    car_id: uid,
                    carName: '<%= car.getCarName()%>',
                    carbrand: '<%= car.getCarbrand()%>',
                    carseat: '<%= car.getCarseat()%>',
                    carcc: '<%= car.getCarcc()%>',
                    carprice: '<%= car.getCarprice()%>'
                }

                var updates = {};
                updates['/car/' + uid] = data;
                firebase.database().ref().update(updates);

                alert('Car is created to firebase successfully!');
                reload_page();
            }

            function reload_page() {
                window.location.reload();
            }

        </script>
    </body>
</html>
