<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Form Tag Library-listBox</title>
   </head>
   <body>

      <h2>Submitted ArtisanBlack Information</h2>
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
            <td>Favorite Web Frameworks</td>
            <td> <% String[] favoriteFrameworks = (String[])request.getAttribute("favoriteFrameworks");
               for(String framework: favoriteFrameworks) {
                  out.println(framework);
               }
            %></td>
         </tr>     	 
         <tr>
            <td>Gender</td>
            <td>${(gender=="M"? "Male" : "Female")}</td>
         </tr>
         <tr>
            <td>Favourite Number</td>
            <td>${favoriteNumber}</td>
         </tr>   
         <tr>
            <td>Country</td>
            <td>${country}</td>
         </tr>
         <tr>
            <td>Skills</td>
            <td> <% String[] skills = (String[])request.getAttribute("skills");
            for(String skill: skills) {
               out.println(skill);
            }
            %></td>
         </tr>   	  
      </table>  
   </body>
</html>