$(document).ready(function() {
	/*内部欢迎主页*/
    $.post("/login/system/comon/welcome.html", function(data){
		$("#mainPanel").empty();
		$("#mainPanel").append(data);
	});
});