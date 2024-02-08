package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StringConverter;

/**
 * Servlet implementation class GetUpperCase
 */
@WebServlet("/GetUpperCase")
public class GetUpperCase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetUpperCase() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userTextUpper = request.getParameter("userUpper");
		StringConverter convertStringUpper = new StringConverter(userTextUpper.toUpperCase());
		request.setAttribute("convertStringUpper", convertStringUpper);
		getServletContext().getRequestDispatcher("/response_upper.jsp").forward(request, response);
	}

}
