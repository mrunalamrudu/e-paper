<%-- 
    Document   : comp
    Created on : Feb 6, 2018, 9:23:01 AM
    Author     : Chetan_Kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html> 
<head>
    <title>Complaints Form</title>
<style>
* {
    box-sizing: border-box;
}

input[type=text], select, textarea{
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    resize: vertical;
}

label {
    padding: 12px 12px 12px 0;
    display: inline-block;
}

input[type=submit] {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    float: right;
}

input[type=submit]:hover {
    background-color: #45a049;
}

.container {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}

.col-25 {
    float: left;
    width: 25%;
    margin-top: 6px;
}

.col-75 {
    float: left;
    width: 75%;
    margin-top: 6px;
}


.row:after {
    content: "";
    display: table;
    clear: both;
}


@media (max-width: 600px) {
    .col-25, .col-75, input[type=submit] {
        width: 100%;
        margin-top: 0;
    }
}
</style>
</head>
<body>

<h2>Complaint Form</h2>
<p>We are very responsive to your complaints.</p>

<div class="container">
  <form action="comp_action.jsp">
    <div class="row">
      <div class="col-25">
        <label for="fullname">Full Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="fullname" name="fullname" placeholder="Your name..">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="email">e-mail id</label>
      </div>
      <div class="col-75">
        <input type="text" id="email" name="email" placeholder="Your e-mail id..">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="dept">Department</label>
      </div>
      <div class="col-75">
        <select id="dept" name="dept">
          <option value="computer science">computer science</option>
          <option value="ece">ece</option>
          <option value="metallurgy">metallurgy</option>
          <option value="mechanical">mechanical</option>
          <option value="eee">eee</option>
          <option value="chemical">chemical</option>
        </select>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="comp">Complaint</label>
      </div>
      <div class="col-75">
        <textarea id="comp" name="comp" placeholder="Write something.." style="height:200px"></textarea>
      </div>
    </div>
    <div class="row">
      <input type="submit" value="Submit">
    </div>
  </form>
</div>
<center><a href="home.jsp" style="height:15px;line-height:15px">Home</a></center>
</body>
</html>
    