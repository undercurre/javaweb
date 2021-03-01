//获取超链接,注册点击事件,显示框和遮挡层
$("#link").on('click',function () {
    $("#login").css("display","block");
    $("#bg").css("display","block");
    //获取关闭,注册点击事件,隐藏登录框和遮挡层
    $("#closeBtn").on('click',function () {
        $("#login").css("display","none");
        $("#bg").css("display","none");
    })
})



