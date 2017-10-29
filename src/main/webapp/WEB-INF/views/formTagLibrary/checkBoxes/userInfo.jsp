<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Form Tag Library-CheckBoxes</title>
   </head>
   <body>

      <h2>Submitted User Information</h2>
      <table>
         <tr>
            <td>Username</td>
            <td>${username}</td>
         </tr>
         <tr>
            <td>Password</td>
            <td>${password}</td>
         </tr>    
         <tr>
            <td>Address</td>
            <td>${address}</td>
         </tr>  
         <tr>
            <td>Subscribed to Newsletter</td>
            <td>${receivePaper}</td>
         </tr>    
         <tr>
            <td>Favorite Frameworks</td>
            <td> 
	            <% 
	            String[] favoriteFrameworks = (String[])request.getAttribute("favoriteFrameworks");
	            for(String framework: favoriteFrameworks) {
	               out.println(framework);
	               }
	            %>
	         </td>
         </tr>     	  
      </table>  
   </body>
</html>