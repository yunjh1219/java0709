<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    Cookie[] cookies = request.getCookies();
    String username = null;

    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("username")) {
                username = cookie.getValue();
                break;
            }
        }
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Styled Web Page</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <header>
        <div class="inner">
            <h1><a href="#">DCODLAB</a></h1>
            <ul class="util">
                <li><a href="#">도움말</a></li>

<%
   if (username != null) {
%>
                <li><a href="logout.jsp">로그아웃</a></li>
<%
} else {
%>
               <li><a href="login.jsp">로그인</a></li>
<%
}
%>
                
                <li><a href="signup.jsp">회원가입</a></li>
            </ul>
            <ul id="gnb">
                <li><a href="#">DEPARTMENT</a></li>
                <li><a href="#">GALLERY</a></li>
                <li><a href="#">YOUTUBE</a></li>
                <li>
                    <a href="#">COMMUNITY</a>
                    <ul class="dropdown-content">
                        <li><a href="Board/list.jsp">온라인상담</a></li>
                        <li><a href="#">후기게시판</a></li>
                        <li><a href="#">자유게시판</a></li>
                    </ul>
                </li>
                <li><a href="#">LOCATION</a></li>
            </ul>
        </div>
    </header>
    
    <figure>
        <video src="images/visual.mp4" autoplay loop muted></video>
        <div class="inner">
            <h1>INNOVATION</h1>
            <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. <br>
                Id praesentium molestias similique quaerat magni facere in a? Adipisci, possimus reprehenderit!</p>
            <a href="#">view detail</a>
        </div>
    </figure>
    
    <section>
        <div class="inner">
            <h1>RECENT NEWS</h1>
            <div class="wrap">
            <article>
                    <div class="pic">
                        <img src="images/news1.jpg" alt="뉴스 1">
                    </div>
                    <h2><a href="#">Lorem ipsum dolor sit.</a></h2>
                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Vitae minus, eaque corrupti vero ad maiores!</p>
                </article>
                <article>
                    <div class="pic">
                        <img src="images/news2.jpg" alt="뉴스 2">
                    </div>
                    <h2><a href="#">Lorem ipsum dolor sit.</a></h2>
                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Vitae minus, eaque corrupti vero ad maiores!</p>
                </article>
                <article>
                    <div class="pic">
                        <img src="images/news3.jpg" alt="뉴스 3">
                    </div>
                    <h2><a href="#">Lorem ipsum dolor sit.</a></h2>
                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Vitae minus, eaque corrupti vero ad maiores!</p>
                </article>
                <article>
                    <div class="pic">
                        <img src="images/news4.jpg" alt="뉴스 4">
                    </div>
                    <h2><a href="#">Lorem ipsum dolor sit.</a></h2>
                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Vitae minus, eaque corrupti vero ad maiores!</p>
                </article>
        </div>
    </section>
 <footer>
        <div class="inner">
            <div class="upper">
                <h1>DCODELAB</h1>
                <ul>
                    <li><a href="#">Policy</a></li>
                    <li><a href="#">Terms</a></li>
                    <li><a href="#">Family Site</a></li>
                    <li><a href="#">Sitemap</a></li>
                </ul>
            </div>

            <div class="lower">
                <address>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas, facere.<br>
                    TEL : 031-111-1234 C.P : 010-1234-5678
                </address>
                <p>
                    2020 DOCDELAB &copy; copyright all right reserved.
                </p>
            </div>
        </div>
    </footer>
</body>
</html>

