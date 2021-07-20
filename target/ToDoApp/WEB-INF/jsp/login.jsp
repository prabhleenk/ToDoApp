<%--
  Created by IntelliJ IDEA.
  User: prabhleenkaur
  Date: 18/07/21
  Time: 6:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

  <title>Hello, world!</title>
</head>
<body>

<script type="text/javascript">

  function OnSubmitForm()
  {
    var id = document.getElementById("exampleInput").value;
    document.login.action="/home/"+id;
    return true;
  }
 </script>


<form name="login" method="post" modelAttribute="user" onsubmit="return OnSubmitForm();">
  <div class="mb-3">
    <label for="exampleInput" class="form-label">Id</label>
    <input type="number" path="id" class="form-control" id="exampleInput" name="id">
  </div>
  <button type="submit" class="btn btn-primary">Log In</button>
</form>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>

