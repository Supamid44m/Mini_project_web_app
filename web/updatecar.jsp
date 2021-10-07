<%-- 
    Document   : updatecar
    Created on : Jul 25, 2021, 6:51:00 PM
    Author     : supam
    object : to show movie details
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Car" %>

<% Car  car = (Car) session.getAttribute("car"); %>

<h1>แก้ไขข้อมูลรถ:</h1>
<form action="addNewcarServlet">
      <p>ชื่อรถ</p>
      <input type="text" name="carName" value=" <%= car.getCarName() %> ">
      <p>ยี่ห้อ:</p>
      <input type="radio" name="carbrand" value="Tesla" ><b>Tesla</b>
      <input type="radio" name="carbrand" value="Ferrari" ><b>Ferrari</b>
      <input type="radio" name="carbrand" value="lamborghini" ><b>lamborghini</b>
      <input type="radio" name="carbrand" value="Mercedes-Benz" ><b>Mercedes-Benz</b>
      <input type="radio" name="carbrand" value="Honda" ><b>Honda</b>
      <input type="radio" name="carbrand" value=" Other " ><b>Other</b><br>
      <p>จำนวนทีนั่ง:</p>
      <select  name="carseat" >
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        
      </select>
      <p>ขนาดเครื่องยนต์:</p>
      <input type="text" name="carcc" value="<%= car.getCarcc() %>"><br>
      <p>ราคา:</p>
      <input type="text" name="carprice" value=<%= car.getCarprice() %>><br>
      
      <input type="submit"  value="แก้ไขข้อมูล"><br>
      
      <a href="Add_datatofirebase.jsp">save to Firebase</a>
      
     


    </form>

