<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Form Tag Library-TextArea</title>
   </head>
   <body>

      <h2>Artisan Information</h2>
      <form:form method = "POST" action = "/springmvc/addArtisanTextArea">
         <table>
            <tr>
               <td><form:label path = "name">Name</form:label></td>
               <td><form:input path = "name" /></td>
            </tr>
            <tr>
               <td><form:label path = "password">Password</form:label></td>
               <td><form:password path = "password" /></td>
            </tr>  
            <tr>
               <td><form:label path = "address">Address</form:label></td>
               <td><form:textarea path = "address" rows = "5" cols = "30" /></td>
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