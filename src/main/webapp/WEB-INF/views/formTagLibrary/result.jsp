<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Form Tag Library-TextBox</title>
   </head>
   <body>

      <h2>Submitted Artisan Information</h2>
      <table>
         <tr>
            <td>Name</td>
            <td>${name}</td>
         </tr>
         <tr>
            <td>Age</td>
            <td>${age}</td>
         </tr>
         <tr>
            <td>ID</td>
            <td>${id}</td>
         </tr>
      </table>  
   </body>
</html>