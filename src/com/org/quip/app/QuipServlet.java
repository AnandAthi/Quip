package com.org.quip.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.quip.request.RequestHandler;

/**
 * Servlet implementation class QuipServlet
 */
public class QuipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuipServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println(" Is this the requested query param  " + request.getQueryString());
		RequestHandler handler=RequestHandler.getRequestHandler(request);
		handler.doProcess();
		StringBuffer buffer=new StringBuffer();
		buffer.append("<html>")
		.append("<head>")
		.append("<title>QUIP</title>")
		.append("<meta http-equiv='Content-Type' content='text/html'; charset='UTF-8'/>")
		.append("<meta name='txtweb-appkey' content='4a7fc205-b10a-4175-8fb0-f32734f92e97'/>")
		.append("</head>")
		.append("<body>")
		.append(handler.getResponseText())
		.append("</body>")
		.append("</html>");
		response.getWriter().print(buffer);
	}
}
