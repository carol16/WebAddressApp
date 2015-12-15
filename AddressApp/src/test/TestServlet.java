package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public TestServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    process(request, response);
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    process(request, response);
  }

  protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // System.out.println("inside process() of CS");

    Model model = new Model();

    Street s1 = new Street("Margao");
    Street s2 = new Street("Panaji");

    Building b1 = new Building("Shiv towers", s1);
    Building b2 = new Building("leandra Complex", s1);
    Building b3 = new Building("Sandra residency", s2);

    Flat flat1 = new Flat(10, "A1", "1bhk", b1);
    Flat flat2 = new Flat(20, "A2", "2bhk", b1);
    Flat flat3 = new Flat(10, "A3", "1bhk", b1);
    Flat flat4 = new Flat(30, "B1", "1bhk", b2);
    Flat flat5 = new Flat(10, "B2", "1bhk", b2);
    Flat flat6 = new Flat(30, "A1", "3bhk", b1);

    Person person1 = new Person("carol", "owner", flat1);
    Person person2 = new Person("candy", "owner", flat2);
    Person person3 = new Person("tina", "tenant", flat3);
    Person person4 = new Person("mina", "tenant", flat1);
    Person person5 = new Person("dina", "tenant", flat2);
    Person person6 = new Person("carol", "owner", flat5);
    Person person7 = new Person("carol", "owner", flat6);

    ArrayList<Person> persons = new ArrayList<Person>();
    persons.add(person1);
    persons.add(person2);
    persons.add(person3);
    persons.add(person4);
    persons.add(person5);
    persons.add(person6);

    ArrayList<Flat> flat = new ArrayList<Flat>();
    flat.add(flat1);
    flat.add(flat2);
    flat.add(flat3);
    flat.add(flat4);
    flat.add(flat5);
    flat.add(flat6);


    String uri = request.getRequestURI();
    System.out.println("uri = " + uri);
    RequestDispatcher rd;

    if (uri.contains("/searchAddress.do")) {
      rd = request.getRequestDispatcher("Information.jsp");
      rd.forward(request, response);
    }
    if (uri.contains("/Search.do")) {
      String name = request.getParameter("searchText");

      String address = model.searchAddress(persons, name);

      request.setAttribute("address", address);
      rd = request.getRequestDispatcher("Information.jsp");
      rd.forward(request, response);
    }
    if (uri.contains("/noOfFlatsOwned.do")) {
      rd = request.getRequestDispatcher("NoOfFlats.jsp");
      rd.forward(request, response);
    }
    if (uri.contains("/NoOfFlats.do")) {
      String name = request.getParameter("searchText");

      int noOfFlats = model.findNoOfFlatsOwned(persons, name);

      request.setAttribute("noOfFlats", noOfFlats);
      rd = request.getRequestDispatcher("NoOfFlats.jsp");
      rd.forward(request, response);
    }
    if (uri.contains("/typeOfFlats.do")) {
      rd = request.getRequestDispatcher("TypeOfFlats.jsp");
      rd.forward(request, response);
    }
    if (uri.contains("/TypesOfFlats.do")) {
      String name = request.getParameter("searchText");

      String typeOfFlats = model.findTypeOfFlat(flat, name);

      request.setAttribute("TypeOfFlats", typeOfFlats);
      rd = request.getRequestDispatcher("TypeOfFlats.jsp");
      rd.forward(request, response);
    }
    if (uri.contains("/searchAverageArea.do")) {
      rd = request.getRequestDispatcher("AverageArea.jsp");
      rd.forward(request, response);
    }
    if (uri.contains("/AverageArea.do")) {
      float area = model.findArea(persons);
      request.setAttribute("AverageAreaOfFlats", area);
      rd = request.getRequestDispatcher("AverageArea.jsp");
      rd.forward(request, response);
    }

  }
}
