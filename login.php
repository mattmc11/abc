<?PHP 
    include_once("connection.php"); 
    if( isset($_POST['txtEmail']) && isset($_POST['txtPassword']) ) { 
        $email = $_POST['txtEmail'];
        $password = $_POST['txtPassword'];
        
        $query = "SELECT email, password FROM tbl_client ". 
        " WHERE email = '$email' AND password = '$password'"; 
        
        $result = mysqli_query($conn, $query);
        
        if($result->num_rows > 0){
			if(isset($_POST['mobile']) && $_POST['mobile'] == "android"){ 
                echo "success"; 
                exit; 
            } 
            echo "Login successful";
			
        }
		else{ 
            echo "Login Failed <br/>"; 
        }  
    } 
?>
<html>
<head><title>Login|Matt</title></head>
    <body>
        <h1>Login Example</h1>
        <form action="<?PHP $_PHP_SELF ?>" method="post">
            Email <input type="text" name="txtEmail" value="" /><br/>
            Password <input type="password" name="txtPassword" value="" /><br/>
            <input type="submit" name="btnSubmit" value="Login"/>
        </form>
    </body>
</html
