package com.sample.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class SigninValidate
 */
@WebServlet("/SigninValidate")
public class SigninValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SigninValidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("user");
		String password = request.getParameter("pass");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from details1 where username='" + uname + "'and password='" + password + "'");
			while (rs.next()) {
				/*
				 * out.println(uname); out.println(password); out.println(
				 * "login success");
				 */
				
				out.println("<!DOCTYPE html>");
				out.println("<html lang=\"en\">");
				out.println("<head>");
				out.println("<title>Bootstrap Example</title>");
				out.println(" <meta charset=\"utf-8\">");
				out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
				out.println(
						" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">");
				out.println(
						"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
				out.println(
						" <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
				out.println("	</head>");
				out.println("<body>");
				out.println("<div class=\"container\">");
				out.println("<table class=\"table\" style =\"width:350px\">");
				out.println("    <thead>");
				out.println("    <tr>");
				out.println("  <th>USERNAME</th>");
				out.println(" <th>FULLNAME</th>");
				out.println(" <th>EMAIL ID</th>");
				out.println("  </tr>");
				out.println("   </thead>");
				out.println(" <tbody style =\"width:350px\">");
				out.println("<tr>");
				out.println(" <td>" + rs.getString("userName") + "</td>");
				out.println("<td>" + rs.getString("fullname") + "</td>");
				out.println(" <td>" + rs.getString("email") + "</td>");
				out.println("</tr>");
				out.println(" </tbody>");
				out.println(" </table>");
				out.println("</div>");

				out.println("</body>");
				out.println("</html>");
			}
		}
		catch (Exception e2) {
			System.out.println(e2);
		}
	}
}
