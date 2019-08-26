<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
	  $("#aaa").on("click",function(){
		  $.ajax({
			url:"aaa",
			type:"post",
			dataType:"text",
			headers:{'Content-Type':'application/json'},
			
			data:JSON.stringify({userid:'홍길동', passwd='1234'}),
			success:function(data,status,xhr){	
				
				console.log(data);
			},
			error:function(xhr,status,error){}
		  }); 
	  });
	});
	
	$(document).ready(function() {
		  $("#bbb").on("click",function(){
			  $.ajax({
				url:"bbb",
				type:"post",
				dataType:"text",
				headers:{'Content-Type':'application/json'},
				
				data:JSON.stringify([{userid:'홍길동', passwd='1234'},{userid:'홍길동2', passwd='999'}]),
				success:function(data,status,xhr){
					
					console.log(data);
				},
				error:function(xhr,status,error){}
			  }); 
		  });
		});
	 
</script>
</head>
<body>
	<button id="aaa">aaa호출</button><br>
	<button id="bbb">bbb호출</button><br>

	<div id="result"></div>
</body>
</html>