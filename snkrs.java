package merta;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "snkrs", urlPatterns = {"/snkrs"})
public class snkrs extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Snkrs</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: #f4f4f4; }");
            out.println("header { background-color: #9e9e9e; color: white; padding: 10px 0; text-align: center; }");
            out.println("footer { background-color: #9e9e9e; color: white; padding: 10px 0; text-align: center; position: fixed; width: 100%; bottom: 0; }");
            out.println("section { padding: 20px; text-align: center; }");
            out.println("div.shoe { margin: 20px; padding: 20px; background-color: white; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); display: inline-block; width: 200px; }");
            out.println("img { width: 100%; height: auto; border-radius: 8px; }");
            out.println("h2 { color: #1976d2; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>ShoeStore</h1>");
            out.println("</header>");
            out.println("<section>");
            out.println("<h2>Our Collection</h2>");
            
            // Menu Sepatu
            out.println("<div class='shoe'>");
            out.println("<img src='https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/u_126ab356-44d8-4a06-89b4-fcdcc8df0245,c_scale,fl_relative,w_1.0,h_1.0,fl_layer_apply/8f5874ee-4398-4516-a168-c034a9abbb3b/air-jordan-1-low-quai-54-shoes-FmKDX1.png' alt='Shoe 1'>");
            out.println("<h3>Air Jordan 1 Low Quai</h3>");
            out.println("<p>Comfortable and stylish sneakers for everyday wear.</p>");
            out.println("</div>");

            out.println("<div class='shoe'>");
            out.println("<img src='https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/u_126ab356-44d8-4a06-89b4-fcdcc8df0245,c_scale,fl_relative,w_1.0,h_1.0,fl_layer_apply/5b9a5321-c1e8-4af8-9c92-8a2ee4269c68/air-jordan-1-high-method-of-make-shoes-wvNP62.png' alt='Shoe 2'>");
            out.println("<h3>Air Jordan 1 Mid Method of Make</h3>");
            out.println("<p>Elegant shoes perfect for formal occasions.</p>");
            out.println("</div>");

            out.println("<div class='shoe'>");
            out.println("<img src='https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/u_126ab356-44d8-4a06-89b4-fcdcc8df0245,c_scale,fl_relative,w_1.0,h_1.0,fl_layer_apply/91dbc52f-7169-4de3-9ba0-a77be6b94eb0/air-jordan-1-mid-shoes-86f1ZW.png' alt='Shoe 3'>");
            out.println("<h3>Air Jordan 1 High Method of Make</h3>");
            out.println("<p>Durable footwear designed for sports and activities.</p>");
            out.println("</div>");

            out.println("</section>");
            out.println("<footer>");
            out.println("<p>&copy; 2024 ShoeStore. All rights reserved.</p>");
            out.println("</footer>");
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
}
