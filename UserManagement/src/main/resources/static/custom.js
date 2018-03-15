$(document).ready(function(){
	
	$("#submitbtn").click(function(e){
		e.preventDefault();
    	username = $("#userName").val();
		password = $("#password").val();
		data={"username":username, "password":password}
		$.ajax({
					url:"/login",
					type:"POST",
					datatype:"json",
					success:function(result){console.log(result);}
						   
				})		
		})	
});
