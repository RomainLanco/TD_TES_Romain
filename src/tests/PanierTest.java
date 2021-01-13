package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ressources.Orange;
import ressources.Panier;

public class PanierTest {
	Panier p1,p2,p3,p4;
	Orange o1,o2,o3,o4,o5;
	
	
	@Before
	public void init() {
		p1= new Panier(2);
		p2= new Panier(6);
		p3=new Panier(7);
		p4=new Panier(7);
	
	try {
			o1= new Orange(2, "France");
			o2= new Orange(3,"Colombie");
			o3= new Orange(2, "France");
			o4= new Orange(4, "Finlande");
			
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
//	@Test {expected = Exception.class}
//	public void prixNegatif() {
//		
//		assertThrows(Exception, new Orange(-4, "Finlande"));
//	}
	
	
	@Test
	public void testOrange() {
		
		assertTrue(o1.equals(o3));
		
		
		
	}
	
	@Test
	public void testEqualsPanier() {
		p1.ajoute(o1);
		p1.ajoute(o2);
		
		
		
		p2.ajoute(o2);
		p2.ajoute(o3);
		
		p3.ajoute(o1);
		p3.ajoute(o4);
		
		
		p4.ajoute(o1);
		
		assertTrue(p1.equals(p2));
		assertTrue(!p1.equals(p3));
		assertTrue(!p1.equals(p4));
		
//		System.out.println(p1);
	}
	@Test
	public void testMaxPanier() {
		p1.ajoute(o1);
		p1.ajoute(o2);
		p1.ajoute(o4);
	
		
		
		
		
		assertTrue(p1.estPlein());
	}
	
	@Test
	public void testMinPanier() {
		p1.ajoute(o1);
		p1.ajoute(o2);
	
		p1.retire();
		p1.retire();
		p1.retire();
		
		
		assertTrue(p1.estVide());

	}
	
	@Test
	public void testBoycott() {
		p2.ajoute(o1);
		p2.ajoute(o1);
		p2.ajoute(o2);
		p2.ajoute(o4);
		
		p3.ajoute(o2);
		p3.ajoute(o4);
	

		
		p2.boycotteOrigine("France");
		

		assertTrue(p2.equals(p3));
	}
	
	@Test
	public void testGetPrix() {
	
		
		p3.ajoute(o2);
		p3.ajoute(o4);
	
		assertTrue(p3.getPrix()==7);
		
	}
	
	
	
}
