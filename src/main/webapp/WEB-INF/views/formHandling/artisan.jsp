<!-- (1)引入标签的声明,声明后在页面中就可以使用Spring表单标签了 -->    
<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%> 
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   
   <body>
      <h2>Artisan Information</h2>
      <form:form method = "POST" commandName="artisan" action = "/springmvc/addArtisan">
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
               <td><form:label path = "id">id</form:label></td>
               <td><form:input path = "id" /></td>
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