import com.ecommerce.DbConnection;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            Connection con = DbConnection.getConnection();
            Statement stmt = con.createStatement();
            
            stmt.executeUpdate("insert into eproduct (name, price, date_added) values ('New Product', 17800.00, now())");
            out.println("Executed an insert operation<br>");
            
            stmt.executeUpdate("update eproduct set price=2000 where name = 'New Product'");
            out.println("Executed an update operation<br>");
            
            stmt.executeUpdate("delete from eproduct where name = 'New Product'");
            out.println("Executed a delete operation<br>");
            
            stmt.close();
            con.close();
            out.println("</body></html>");

		}
		catch(Exception e)
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