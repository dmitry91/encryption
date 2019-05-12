<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Encryption</title>
    <style>
        form {
            border-style: solid;
            border-color: lightgrey;
            padding: 5px;
            width: 200px;
        }
    </style>
</head>
<body>

<h2>AES encryption</h2>
<h2>${message}</h2>
<form action="/encrypt" method="post">
    Encrypt data:<br>
    <input type="text" name="text">
    <br><br>
    <input type="submit" value="Submit">
</form>

<form action="/decrypt" method="post">
    Decrypt data:<br>
    <input type="text" name="text">
    <br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>