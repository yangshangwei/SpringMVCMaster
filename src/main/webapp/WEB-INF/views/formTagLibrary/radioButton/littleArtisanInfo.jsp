<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Form Tag Library-RadioButton</title>
</head>
   <body>

      <h2>Submitted LittleArtisan Information</h2>
      <table>
         <tr>
            <td>Name</td>
            <td>${name}</td>
         </tr>
         <tr>
            <td>Gender</td>
            <td>${(gender=="M"? "Male":"Female")}</td>
         </tr>    	  
      </table>  
   </body>
</html>