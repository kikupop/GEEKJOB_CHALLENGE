<%-- 
    Document   : kadai2
    Created on : 2018/06/18, 13:02:05
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            // 受け取るパラメータの文字コード
            request.setCharacterEncoding("UTF-8");
            
            //総額
            out.print("総額" + request.getParameter("total") + "円です。");
            //変数sum　情報取出し
            String sum = request.getParameter("total");
            //文字列sum 数値化
            int i = Integer.parseInt(sum);
            //数量
            out.print("数量は" + request.getParameter("count") + "個です。");
            String quantity = request.getParameter("count");
            int j = Integer.parseInt(quantity);
            
            //種類 文字型数字
            request.getParameter("type");
            if("type".equals("1")){
                 out.print("分類は雑貨です。");
            }else if("type".equals("2") ){
                out.print("分類は生鮮食品です。");
            }else{
                out.print("その他です。");
            }
            // ボタンの情報
//            out.print(request.getParameter("btnTest"));
//          商品の単価画面表示
            out.print("商品の単価は" + i/j + "円です。");

    //      ポイント計算
            int point = 0;
            if(i >= 5000 ){
                point += i * 0.05;
                        out.print(point + "ポイント付与します。");
            }else if(i >= 3000 && i < 5000){
                point += i * 0.04;
                        out.print(point + "ポイント付与します。");
            }else if(i < 3000){
                point = 0;
                        out.print(point + "ポイント付与します。");
            }
        %>
    
        
    </body>
</html>
