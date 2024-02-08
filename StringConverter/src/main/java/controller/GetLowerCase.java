package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StringConverter;

/**
 * Servlet implementation class GetLowerCase
 */
@WebServlet("/GetLowerCase")
public class GetLowerCase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetLowerCase() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userTextLower = request.getParameter("userLower");
		StringConverter convertStringLower = new StringConverter(userTextLower.toLowerCase());
		request.setAttribute("convertStringLower", convertStringLower);
		getServletContext().getRequestDispatcher("/response_lower.jsp").forward(request, response);
		
	}

}
