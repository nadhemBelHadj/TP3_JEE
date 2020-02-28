package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.ImetierCatalogue;
import metier.MetierImpl;
import metier.Produit;

@WebServlet (name="as",urlPatterns= {"/ajoutControleur"})
public class AjoutServlet extends HttpServlet{
	private ImetierCatalogue metier;
	
	 @Override
	public void init() throws ServletException {
		metier=new MetierImpl();
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, 
			              HttpServletResponse response) 
			           throws ServletException, IOException {
		//lire les paramètres envoyés par la page jsp par la méthode post
		String nomProduit =request.getParameter("nom");
		String prix =request.getParameter("prix");
		
		//créartion d'un objet Produit
		Produit prod = new Produit();
		prod.setNomProduit(nomProduit);
		prod.setPrix(Double.parseDouble(prix));
		
		//appel de la méthode métier d'ajout du produit
		metier.addProduit(prod);
				
		
        //aller sur la page liste des produits 		
		 request.getRequestDispatcher("ProduitsView.jsp").forward(request,response);
		
		 
		 /*PrintWriter out =  response.getWriter();
		out.println("<h1>"+nomProduit+"</h1>");
		out.println("<h1>"+prix+"</h1>");*/
	}

}
