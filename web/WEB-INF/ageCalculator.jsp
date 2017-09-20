<%-- 
    Document   : index
    Created on : Sep 18, 2017, 8:20:50 AM
    Author     : 643699
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Next Birthday</title>
    </head>
    <body>
        <h1>Calculate Next Birthday!</h1>
        <div><form action="ageCalculator" method="GET">
                Enter your current age: <input type="text" name="age" value="${age}"><br>
                <input type="submit" value="Age next birthday">
            </form>            
        </div>
        ${errorMessage}
        ${nextYearAge}
    </body>
</html>
