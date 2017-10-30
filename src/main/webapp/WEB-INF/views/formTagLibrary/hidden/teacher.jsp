<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Form Tag Library-hidden</title>
   </head>
   <body>

      <h2>Teacher Information</h2>
      <form:form method = "POST" action = "/springmvc/addTeacher">
         <table>
            <tr>
              <td><form:label path = "name">Name</form:label></td>
              <td><form:input path = "name" /></td>
            </tr>
            <tr>
              <td><form:label path = "age">Age</form:label></td>
              <td><form:input path = "age" /></td>
            </tr>
            <tr>
              <td><form:hidden path = "id" value = "1" /></td>
            </tr>
            <tr>
              <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
              </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>