package tn.esprit.rh.achat.services;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.repositories.ProduitRepository;

import java.util.Date;
import java.util.Optional;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
public class ProduitServiceTestMock  {
	
	@Mock
	ProduitRepository pr;

    @InjectMocks
    IProduitService ps;

    Produit produit = new Produit("01","PC", 1000, new Date(), new Date());  
    
    @Test
    public void retrieveProduit() {
		Mockito.when(pr.findById(Mockito.anyLong())).thenReturn(Optional.of(produit));
		Produit p = ps.retrieveProduit((long) 1);
		Assertions.assertNotNull(p);
	}
    /*
    @Test
    @Order(1)
    public void testRetrieveAllProducts() {
        List<Produit> listProduits = ps.retrieveAllProduits();
        Assertions.assertEquals(0, listProduits.size());
    }
	*/

}
