<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Form Tag Library-RadioButton</title>
   </head>
   <body>

      <h2>User Information</h2>
      <form:form method = "POST" action = "/springmvc/addLittleArtisan">
         <table>
            <tr>
               <td><form:label path = "name">Name</form:label></td>
               <td><form:input path = "name" /></td>
            </tr>
            <tr>
               <td><form:label path = "gender">Gender</form:label></td>
               <td>
                  <form:radiobutton path = "gender" value = "M" label = "Male" />
                  <form:radiobutton path = "gender" value = "F" label = "Female" />
               </td>
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