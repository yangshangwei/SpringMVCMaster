<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Form Tag Library-RadioButtons</title>
   </head>
   <body>

      <h2>ArtisanOne Information</h2>
      <form:form method = "POST" action = "/springmvc/addArtisanOne">
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
               <td><form:label path = "favoriteFood">Favorite Food</form:label></td>
               <td>
                  <form:radiobuttons path = "favoriteFood" items = "${foodList}" />        	
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