<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.6.0.min.js"></script>
<!-- include libraries(jQuery, bootstrap) -->
<link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script> 
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script> 

<!-- include summernote css/js-->
<link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.8/summernote.css" rel="stylesheet">
<script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.8/summernote.js"></script>

<!-- include jquery, bootstrap, summernote here -->
<link rel="stylesheet" href="summernote-audio.css">
<script type="text/javascript" src="summernote-audio.js"></script>

<script type="text/javascript">
	$(document).ready(function(){
		$('#summernote').summernote({			
             height: 300,                 // set editor height
             minHeight: 300,             // set minimum height of editor
             maxHeight: 300,             // set maximum height of editor
			 width: 900,
             focus: true                  // set focus to editable area after initializing summernote
			 
    	});
		$("h1").css("color","blue");
		$("#ajaxbtn").on('click', function(){
			$.ajax({
				url:'/helloajax',
				type:'get',
				dataType:'json',
				success:function(result){ //MemberDTO -JSON변환
					$("#result").html(result.id +":" + result.password);
				}
			});
		});
	});
</script>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<img src="images/drinks.jpg">
<h1>${model }</h1>
<textarea name="content" id="summernote" value=""></textarea>
<input type=button value="ajax요청" id="ajaxbtn">
<div id="result" ></div>
</body>
</html>