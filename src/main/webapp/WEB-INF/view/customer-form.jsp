<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC demo</title>
    <style>
        .error{color:red;}
    </style>
</head>
<body>

    <form:form action="processForm" modelAttribute="customer">

        First name: <form:input path="firstName" />
        <br/>

        *Last name: <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error"/>
        <br/>

        *Free passes: <form:input path="passes" />
         <form:errors path="passes" cssClass="error"/>
         <br/>

         *Course: <form:input path="course" />
         <form:errors path="course" cssClass="error"/>
         <br/>

        <input type="submit" value="Submit" />


    </form:form>

</body>
</html>