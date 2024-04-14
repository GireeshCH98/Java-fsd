
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import com.ecommerce.DbConnection;
import com.mysql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        try 
        {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
           
            Connection con = DbConnection.getConnection();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           stmt.executeUpdate("insert into eproduct (name, price, date_added) values ('New Product', 17800.00, now())");
           ResultSet rst = stmt.executeQuery("select * from eproduct");
           
           while (rst.next()) 
           {
                   out.println(rst.getInt("ID") + ", " + rst.getString("name") + "<Br>");
           }
           
           stmt.close();
           
           
           
           out.println("</body></html>");
           con.close();
           
        } 
        catch (Exception e) 
        {
           e.printStackTrace();
        } 
   }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}