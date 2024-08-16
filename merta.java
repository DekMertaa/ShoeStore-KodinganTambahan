package merta;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "merta", urlPatterns = {"/merta"})
public class merta extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Shoe Store</title>");
            out.println("<style>");
            out.println("body {");
            out.println("  font-family: Arial, sans-serif;");
            out.println("  margin: 0;");
            out.println("  padding: 0;");
            out.println("  background-color: #f4f4f4;");
            out.println("}");
            out.println("header {");
            out.println("  background-color: #9e9e9e;");
            out.println("  color: white;");
            out.println("  padding: 10px 0;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("nav {");
            out.println("  margin: 0;");
            out.println("  padding: 10px;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("nav a {");
            out.println("  margin: 0 15px;");
            out.println("  text-decoration: none;");
            out.println("  color: #1976d2;");
            out.println("}");
            out.println(".slider {");
            out.println("  max-width: 100%;");
            out.println("  margin: 20px auto;");
            out.println("  position: relative;");
            out.println("  overflow: hidden;");
            out.println("}");
            out.println(".slides {");
            out.println("  display: flex;");
            out.println("  transition: transform 0.5s ease;");
            out.println("}");
            out.println(".slide {");
            out.println("  min-width: 100%;");
            out.println("  box-sizing: border-box;");
            out.println("  padding: 0 10px;");
            out.println("}");
            out.println(".slide img {");
            out.println("  width: 100%;");
            out.println("  border-radius: 8px;");
            out.println("  padding: 10px 0;");  // Padding atas dan bawah sebesar 20px
            out.println("}");
            out.println(".buttons {");
            out.println("  position: absolute;");
            out.println("  top: 50%;");
            out.println("  width: 100%;");
            out.println("  display: flex;");
            out.println("  justify-content: space-between;");
            out.println("  transform: translateY(-50%);");
            out.println("}");
            out.println(".buttons button {");
            out.println("  background-color: rgba(0, 0, 0, 0.5);");
            out.println("  border: none;");
            out.println("  color: white;");
            out.println("  padding: 10px;");
            out.println("  cursor: pointer;");
            out.println("}");
            out.println("footer {");
            out.println("  background-color: #9e9e9e;");
            out.println("  color: white;");
            out.println("  padding: 10px 0;");
            out.println("  text-align: center;");
            out.println("  position: fixed;");
            out.println("  width: 100%;");
            out.println("  bottom: 0;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Welcome to Shoe Store</h1>");
            out.println("</header>");
            out.println("<nav>");
            out.println("<a href='snkrs'>SNKRS</a>");
            out.println("<a href='about'>About</a>");
            out.println("<a href='contact'>Contact</a>");
            out.println("</nav>");
            out.println("<section>");

            // Slider untuk menampilkan gambar produk
            out.println("<div class='slider'>");
            out.println("<div class='slides'>");

            // Slide 1
            out.println("<div class='slide' id='slide1'>");
            out.println("<img src='https://www.adidas.co.id/media/wysiwyg/PLP-ID-INDEPENDENCE.jpg' alt='Casual Sneakers'>");
            out.println("</div>");

            // Slide 2
            out.println("<div class='slide' id='slide2'>");
            out.println("<img src='https://www.lazone.id/news/2018/Februari/14%20feb/Banner%20Adidas.jpg' alt='Formal Shoes'>");
            out.println("</div>");

            // Slide 3
            out.println("<div class='slide' id='slide3'>");
            out.println("<img src='https://www.grand-indonesia.com/wp-content/uploads/2022/01/NIKE-WEBSITE-BANNER.png' alt='Sports Footwear'>");
            out.println("</div>");

            out.println("</div>");
            out.println("<div class='buttons'>");
            out.println("<button onclick='moveSlide(-1)'>❮</button>");
            out.println("<button onclick='moveSlide(1)'>❯</button>");
            out.println("</div>");
            out.println("</div>");

            out.println("</section>");
            out.println("<footer>");
            out.println("<p>&copy; 2024 Shoe Store. All rights reserved.</p>");
            out.println("</footer>");
            out.println("<script>");
            out.println("let currentSlide = 0;");
            out.println("const slides = document.querySelector('.slides');");
            out.println("function moveSlide(direction) {");
            out.println("  const slideWidth = slides.querySelector('.slide').clientWidth;");
            out.println("  currentSlide += direction;");
            out.println("  if (currentSlide < 0) {");
            out.println("    currentSlide = slides.children.length - 1;");
            out.println("  } else if (currentSlide >= slides.children.length) {");
            out.println("    currentSlide = 0;");
            out.println("  }");
            out.println("  slides.style.transform = `translateX(${-currentSlide * slideWidth}px)`;");
            out.println("}");
            out.println("</script>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Shoe Store Webpage";
    }
}
