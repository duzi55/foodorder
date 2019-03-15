$(document).ready(function(){

    var url = decodeURI(location.href);
    var result = url.split("?")[1];
    console.log(result)
    $("#btnselect").click(function () {
        var totalpriceshow=$("#totalpriceshow").text();
        if(totalpriceshow==0){
            alert("请选择商品!");
        }else {
            $(".list-content ul li").each(function () {
              console.log(  $(this).find("span.accountName").html())
                console.log(  $(this).find("span.taste").html())
                console.log(  $(this).find("span.accountPrice").html())
                console.log(  $(this).find(".li_acount").html())



            })




            // alert(totalpriceshow);
            // window.location.href="/foodorder/order_notes.html"
        }


    });



});