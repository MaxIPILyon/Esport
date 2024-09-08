package com.ipi.esport.controller;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class EsportController {

    /*
    //1 Test de conection :
    @Test
    void testConnexionBaseDeDonnees() {

        // Création d'une instance
        Class_connection dao = new Class_connection();

        // Appel de la méthode de connexion (example)
        boolean estConnecte = dao.estConnecte();

        // Vérification du résultat
        assertTrue(estConnecte);
    }



    //2 test si l'utilisateur est existant :
    @Test
    void testUtilisateurExistant() {

        long idUtilisateurExistant = 1L;

        boolean existe = userService.existeUtilisateur(idUtilisateurExistant);

        assertTrue(existe);
    }
    @Test
    void testUtilisateurInexistant() {

        long idUtilisateurInexistant = 999L;

        boolean existe = userService.existeUtilisateur(idUtilisateurInexistant);

        assertFalse(existe);
    }



    //3 teste du mot de passe saisi :
    @Test
    void testPasswordMatch() {
        // Données de test
        String username = "john.doe";
        String passwordToTest = "password123";

        // Récupérer le mot de passe  depuis la base de données
        String hashedPasswordFromDB = joueurDao.getPasswordByUsername(username);

        // Comparer le mot de passe saisi avec celui haché
        boolean isMatch = PasswordUtils.verifyPassword(passwordToTest, hashedPasswordFromDB);

        assertTrue(isMatch);
    }



    //4 test d'arriver sur la page d'accueil après m'être connecte :
    // MockMVC: Cet outil de Spring Test permet de simuler des requêtes HTTP et de vérifier les réponses.
    @Test
    private MockMvc mockMvc;
    @Test
    void testRedirectionVersAccueilApresConnexion() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/login")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("username",  
                                "user")
                        .param("password",  
                                "password"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/accueil"));
    }



    //5 test les liens sont affichés et fonctionnelle :
    @Test
    public void testLien() {
        // Configuration du WebDriver (ici, Chrome)
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigation vers la page
        driver.get("http://votresite.com");

        // Trouver le lien par son id ou sa classe
        WebElement lien = driver.findElement(By.id("monLien"));

        // Vérifier que le lien est présent
        assertTrue(lien.isDisplayed());

        // Stocker l'URL actuelle avant de cliquer
        String urlActuelle = driver.getCurrentUrl();

        // Cliquer sur le lien
        lien.click();

        // Vérifier que l'URL a changé vers l'URL attendue
        String urlAttendue = "http://nouvellepage.com";
        assertEquals(urlAttendue, driver.getCurrentUrl());

        // Fermer le navigateur
        driver.quit();
    }



    //6 test le bouton d'Accueil :
    @Test
    @AutoConfigureMockMvc
    public class HomeControllerTest {

        @Autowired
        private MockMvc mockMvc;

        @Test
        public  

        void testAccueilButton() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/buttonAccueil"))
                    .andExpect(status().is3xxRedirection())
                    .andExpect(redirectedUrl("/home"));
        }

    }

    //7 Test du scores finaux du joueur sont bien calculés en fonction du score de la partie :
    @Test
    void testCalculScoreFinal() {
        // Création d'un joueur avec un score de partie
        Joueur joueur = new Joueur();
        joueur.setScorePartie(100);

        // Appel de la méthode de calcul du score final
        joueur.calculerScoreFinal();

        // Vérification du score final (en supposant une règle simple : score final = score partie * 2)
        assertEquals(200, joueur.getScoreFinal());
    }


    //8 test qu'un tableau est créé et non vide
    class MonTest {
        @Test
        void testTableauResultatsNonVide() {
            // ... (code pour créer le tableau)
            int[] resultats = maMethodePourObtenirLesResultats();
            assertNotNull(resultats);
            assertTrue(resultats.length > 0);
        }

    }



    //9 test qu'un tableau est trié :
    @Test
    void testTableauResultatsTrie() {
        // ... (code pour créer le tableau)
        int[] resultats = maMethodePourObtenirLesResultats();

        // Vérification que le tableau est trié en utilisant une méthode de tri personnalisée
        assertTrue(estTrie(resultats));
    }
    */
}
