$(document).ready(function() {
	Top.init();
	/*内部欢迎主页*/
    $.post("/login/system/comon/welcome.html", function(data){
		$("#mainPanel").empty();
		$("#mainPanel").append(data);
	});
});

var Top=function(){
	return{
		init:function(){
			$.ajax({
			   type: "POST",
			   url: "/login/system/common/topmenu.html",
			   success: function(data){
				   $("#topMenu").html(data);
			   },
			   async: false
			});
		},
		menu:function(){

		}
	};
}();