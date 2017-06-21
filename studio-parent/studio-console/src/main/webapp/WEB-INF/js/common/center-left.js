$(document).ready(function() {
	LeftMenu.init();
});

var LeftMenu=function(){
	return{
		init:function(){
			$.ajax({
			   type: "POST",
			   url: "/login/system/common/leftmenu",
			   success: function(data){
				   menuTree=data.children;
			   },
			   async: false
			});
		}
	};
}();


// 手动通过点击模拟高亮菜单项
$('#treeMenu').on('click', 'a', function() {
    $('#treeMenu li.active').removeClass('active');
    $(this).closest('li').addClass('active');
});
