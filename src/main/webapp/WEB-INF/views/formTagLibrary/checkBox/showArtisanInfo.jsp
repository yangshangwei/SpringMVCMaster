<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Form Tag Library-CheckBox</title>
   </head>
   <body>
      <h2>Submitted Artisan Information</h2>
      <table>
         <tr>
            <td>Username</td>
            <td>${name}</td>
         </tr>
         <tr>
            <td>Password</td>
            <td>${password}</td>
         </tr>  
          <tr>
            <td>IsNotified</td>
            <td>${isNotified}</td>
         </tr>   
      </table>  
   </body>
</html>