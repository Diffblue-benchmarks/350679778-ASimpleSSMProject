/* 页面初始化加载函数：
 * jquery方法：
 * $(function(){
 * 
 * })
 * 
 * $(document).ready(function(){
 * 
 * 
 * })
 * 
 * 	原生js：
 * window.onload = function(){}
 * document.ready(function(){
 * 
 * })
 * document.ready 和 window.onload 的区别是：
 * 	上面定义的document.ready方法在DOM树加载完成后就会执行，
 * 	而window.onload是在页面资源（比如图片和媒体资源，它们的加载速度远慢于DOM的加载速度）
 * 	加载完成之后才执行。也就是说$(document).ready要比window.onload先执行。
 */


$(function(){
	selectList();
})


function selectList(){
	$.ajax({
		url:"select",
		data:"",
		datatype:"json",
		success:function(result){
			console.log("success");
			var r = JSON.parse(result);
			for(var i=0;i<r.length;i++){
				$("#table").append("<tr><td>"+r[i].username+"</td><td>"+r[i].password+"</td>" +
						"<td>"+r[i].param3+"</td><td>"+r[i].param4+"</td></tr>");
			}
		},
		error:function(){
			console.log("error");
		}		
	})
}

