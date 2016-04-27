package ua.lviv.java;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Date date = new Date(105, 11, 12);
	LocalDate localDate = LocalDate.now();
	LocalDate localDate2 = LocalDate.of(2016, 03, 22);

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(localDate);
		System.out.println(localDate2);
		request.setAttribute("atr1", date.toString());
		request.setAttribute("atr2", localDate.toString());
		request.setAttribute("atr3", localDate2.toString());
		request.getRequestDispatcher("/pages/index.jsp").forward(request, response);
	}

}
