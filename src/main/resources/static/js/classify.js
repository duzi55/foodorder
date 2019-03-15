$(document).ready(function(){

    var url = decodeURI(location.href);
    var result = url.split("?")[1];
    console.log(result)
    // $("#tableId").text("桌号:"+result)
    $("#btnselect").click(function () {
        var totalpriceshow=$("#totalpriceshow").text();
        if(totalpriceshow==0){
            alert("请选择商品!");
        }else {
            $(".list-content ul li").each(function () {
              var  foodName=$(this).find("span.accountName").html()
              var  foodKind =$(this).find("span.taste").html()
              var foodPrice=$(this).find("span.accountPrice").html()
              var foodNum= $(this).find(".li_acount").html()
                $.post("",{ foodName:foodName,foodKind:foodKind})
            })
            window.location.href="order_notes.html?"+result;
        }


    });



});