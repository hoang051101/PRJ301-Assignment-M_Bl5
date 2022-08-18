<%-- 
    Document   : report
    Created on : Aug 16, 2022, 9:46:36 AM
    Author     : Ngo Tung Son
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="view/style.css" rel="stylesheet" type="text/css" id="style"/>

    </head>
    <body>
        <table border = "1px">
            <tr><center style="color:red;font-size:40px;">Bảng chấm công nhật tháng 8/22</center></tr>
            <tr>
                <td rowspan="2">STT</td>
                <td rowspan="2">Tên</td>
                <td rowspan="2">Chức vụ</td>
                <td rowspan="2">Sản phẩm</td>
                <td colspan="31"><center style="font-size:30px;">Các ngày trong tháng</center></td>
                <td rowspan="2">Tổng sản phẩm</td>
                <td rowspan="2">Ngày đi làm</td>
                <td rowspan="2">Nghỉ không phép</td>
                <td rowspan="2">Nghỉ có phép</td>
                <td rowspan="2">Tổng lương </td>
            </tr>
            <tr>            
                <td>1</td>
                <td>2</td>
                <td>3</td> 
                <td>4</td>
                <td>5</td>
                <td>6</td>
                <td style="background-color: yellow">7</td> 
                <td>8</td>
                <td>9</td>
                <td>10</td>
                <td>11</td> 
                <td>12</td>
                <td>13</td>
                <td style="background-color: yellow">14</td>
                <td>15</td> 
                <td>16</td>
                <td>17</td>
                <td>18</td>
                <td>19</td> 
                <td>20</td>
                <td style="background-color: yellow">21</td>
                <td>22</td>
                <td>23</td> 
                <td>24</td>
                <td>25</td>
                <td>26</td>
                <td>27</td> 
                <td style="background-color: yellow">28</td>
                <td>29</td>
                <td>30</td>
                <td>31</td> 
            </tr>
            <tr>
                <td>1</td>
                <td><a href = "#">Thái An</a></td>
                <td>Nhân viên</td>
                <td>Hàng nhôm</td>
                <td>130</td>
                <td>212</td>
                <td>321</td> 
                <td>412</td>
                <td>521</td>
                <td>126</td>
                <td style="background-color: yellow">CN</td> 
                <td>238</td>
                <td>129</td>
                <td>110</td>
                <td>141</td> 
                <td>132</td>
                <td>143</td>
                <td style="background-color: yellow">CN</td>
                <td>155</td> 
                <td>166</td>
                <td>175</td>
                <td>218</td>
                <td>319</td> 
                <td>230</td>
                <td style="background-color: yellow">CN</td>
                <td>252</td>
                <td>243</td> 
                <td>124</td>
                <td>125</td>
                <td>426</td>
                <td>227</td> 
                <td style="background-color: yellow">CN</td>
                <td>219</td>
                <td>310</td>
                <td>131</td> 
                <td>10xx</td>
                <td>27</td>
                <td>0</td>
                <td>0</td>
                <td>10xx*Giá 1 sp nhôm </td>
            </tr>
            <tr>
                <td>2</td>
                <td><a href = "#">An Bình</a></td>
                <td>Tổ trưởng</td>
                <td>Đánh bóng</td>
                <td>123</td>
                <td>232</td>
                <td>331</td> 
                <td>124</td>
                <td>325</td>
                <td>236</td>
                <td style="background-color: yellow">CN</td> 
                <td>212</td>
                <td>231</td>
                <td>123</td>
                <td>NP</td> 
                <td>NP</td>
                <td>NP</td>
                <td style="background-color: yellow">CN</td>
                <td>123</td> 
                <td>116</td>
                <td>117</td>
                <td>CP</td>
                <td>CP</td> 
                <td>210</td>
                <td style="background-color: yellow">CN</td>
                <td>222</td>
                <td>213</td> 
                <td>214</td>
                <td>CP</td>
                <td>CP</td>
                <td>CP</td> 
                <td style="background-color: yellow">CN</td>
                <td>129</td>
                <td>CP</td>
                <td>231</td> 
                <td>10xx</td>
                <td>18</td>
                <td>0</td>
                <td>9</td>
                <td>10xx*giá 1 sp nhôm + 1tr trách nhiệm/tháng </td>
            </tr>
            <tr>
                <td>3</td>
                <td><a href = "#">Ngô Linh</a></td>
                <td>Nhân viên</td>
                <td>Hàng Sắt</td>
                <td>130</td>
                <td>212</td>
                <td>321</td> 
                <td>412</td>
                <td>521</td>
                <td>126</td>
                <td style="background-color: yellow">CN</td> 
                <td>238</td>
                <td>KP</td>
                <td>110</td>
                <td>141</td> 
                <td>132</td>
                <td>143</td>
                <td style="background-color: yellow">CN</td>
                <td>155</td> 
                <td>166</td>
                <td>175</td>
                <td>CP</td>
                <td>CP</td> 
                <td>230</td>
                <td style="background-color: yellow">CN</td>
                <td>252</td>
                <td>243</td> 
                <td>124</td>
                <td>125</td>
                <td>426</td>
                <td>227</td> 
                <td style="background-color: yellow">CN</td>
                <td>219</td>
                <td>CP</td>
                <td>131</td> 
                <td>10xx</td>
                <td>23</td>
                <td>1</td>
                <td>3</td>
                <td>10xx*Giá 1 sp sắt - KP </td>
            </tr>
            <tr>
                <td>4</td>
                <td><a href = "#">Nguyễn Nam</a></td>
                <td>Nhân viên</td>
                <td>Mài dũa</td>
                <td>123</td>
                <td>232</td>
                <td>331</td> 
                <td>124</td>
                <td>325</td>
                <td>236</td>
                <td style="background-color: yellow">CN</td> 
                <td>212</td>
                <td>231</td>
                <td>123</td>
                <td>NP</td> 
                <td>NP</td>
                <td>NP</td>
                <td style="background-color: yellow">CN</td>
                <td>123</td> 
                <td>116</td>
                <td>117</td>
                <td>CP</td>
                <td>CP</td> 
                <td>210</td>
                <td style="background-color: yellow">CN</td>
                <td>222</td>
                <td>213</td> 
                <td>214</td>
                <td>CP</td>
                <td>CP</td>
                <td>CP</td> 
                <td style="background-color: yellow">CN</td>
                <td>129</td>
                <td>CP</td>
                <td>231</td> 
                <td>10xx</td>
                <td>18</td>
                <td>0</td>
                <td>9</td>
                <td>10xx*giá 1 sp mài dũa </td>
            </tr>
            <table border="1px">
                <tr style="font-size:15px;"> 
                    <td >
                        Ghi chú: 
                        - Ốm: Ô	
                        -- Nghỉ không phép: KP
                        -- Thai sản:	TS	
                        -- Tai nạn:	TN	
                        -- Nghỉ lễ	NL	
                        -- Nghỉ bù:	NB	
                        -- Ngừng việc: N
                        -- Nghỉ phép: NP
                        -- Chủ nhật: CN
                    </td>
                </tr>
            </table>

        </table>
    </body>
</html>
