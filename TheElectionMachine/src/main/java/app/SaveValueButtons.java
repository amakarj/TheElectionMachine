package app;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Dao;
import data.Answers;

/**
 * Servlet implementation class SaveValueButtons
 */
@WebServlet("/SaveValueButtons")
public class SaveValueButtons extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao = null;

	public void init() {
		dao = new Dao("jdbc:mysql://localhost:3306/minion", "admin", "password");


	}
	public SaveValueButtons() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		//Create empty list from Answers to store updated answers from dao
		ArrayList<Answers> list = null;
		
		//Get candidateid and questionid from answerquestionscand.jsp and change them to integers
		int cid = Integer.parseInt(request.getParameter("candidate"));
		int qid = Integer.parseInt(request.getParameter("quesid"));
		String cidd = request.getParameter("candidate");
		

		if (dao.getConnection()) {

			//loop through questions
			for (int i = 1; i < 11; i++) {

				//get every questions' answers value (i)
				int answer = Integer.parseInt(request.getParameter("ques" + (i)));

				//create object from Answers that get candidates id, question id and answer
				Answers a = new Answers(cid, qid, answer);

				//Send object as a parameter to dao's updateAnswers() and save results to the list
				
				list = dao.updateAnswers(a);

				// increases question id to get to the next question 
				qid++;
			}
			
		// get new answers from dao to send forward to showanswerstocandidate.jsp	
		list=dao.readAnsw(cidd);

		} else {

			System.out.println("dao ei toimi!");
		}

		request.setAttribute("answers", list);
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/showanswerstocandidate.jsp");
		rd.forward(request, response);

	}
	

}