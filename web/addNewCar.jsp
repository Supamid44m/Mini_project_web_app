<%-- 
    Document   : addNewCar
    Created on : Jul 25, 2021, 5:42:07 PM
    Author     : supam
    object     : to add new car
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<marquee><h1>เพิ่มข้อมูลรถ</h1></marquee>
<center>
<form action="addNewcarServlet">
      <p>ชื่อรถ:</p>
      <input type="text" name="carName">
      <p>ยี่ห้อ:</p>
      <input type="radio" name="carbrand" value="Tesla" ><b>Tesla</b>
      <input type="radio" name="carbrand" value="Ferrari" ><b>Ferrari</b>
      <input type="radio" name="carbrand" value="lamborghini" ><b>lamborghini</b>
      <input type="radio" name="carbrand" value="Mercedes-Benz" ><b>Mercedes-Benz</b>
      <input type="radio" name="carbrand" value="Honda" ><b>Honda</b>
      <input type="radio" name="carbrand" value=" Other " ><b>Other</b><br>
      <p>จำนวนทีนั่ง:</p>
      <select  name="carseat">
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        
      </select>
      <p>ขนาดเครื่องยนต์:</p>
      <input type="text" name="carcc" value=""><br>
      <p>ราคา:</p>
      <input type="text" name="carprice" value=""><br>
      
      <input type="submit"  value="เพิ่มข้อมูล">


    </form>
    </center>