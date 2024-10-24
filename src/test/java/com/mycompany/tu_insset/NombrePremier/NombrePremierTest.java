/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tu_insset.NombrePremier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author insset
 */
public class NombrePremierTest {
    
    public NombrePremierTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

  /**
     * Test de la methode isPremier aec un nombre premier
     */
    @Test
    public void testIsPremierOK() {
        //given
        int n = 11;
        NombrePremier instance = new NombrePremier();
        boolean expResult = true;

        //when
        boolean result = instance.isPremier(n);

        //then
        assertTrue(result, "OK");

    }

    /**
     * Test de la methode isPremier aec un nombre non premier
     */
    @Test
    public void testIsPremierNOK() {
        //given
        int n = 10;
        NombrePremier instance = new NombrePremier();

        //when
        boolean result = instance.isPremier(n);

        //then
        assertFalse(result, "NOK");

    }

    /**
     * Test de la methode isPremier aec un nombre non premier
     */
    @Test
    public void testIsPremierLimit() {
        //given
        int n = 0;
        NombrePremier instance = new NombrePremier();
        boolean expResult = false;

        //when
        boolean result = instance.isPremier(n);

        //then
        assertEquals(expResult, result);

    }

    /**
     * Test of isNombreValide method, of class NombrePremier.
     */
    @Test
    public void testIsNombreValideOK() {
        //given
        String str = "123456";
        NombrePremier instance = new NombrePremier();
        boolean expResult = true;

        //when
        boolean result = instance.isNombreValide(str);

        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of isNombreValide method, of class NombrePremier.
     */
    @Test
    public void testIsNombreValideKO() {
        //given
        String str = "123a456";
        NombrePremier instance = new NombrePremier();
        boolean expResult = false;

        //when
        boolean result = instance.isNombreValide(str);

        //then
        assertEquals(expResult, result);

    }

    /**
     * Test of isNombreValide method, of class NombrePremier.
     */
    @Test
    public void testIsNombreValideKONull() {
        //given
        String str = null;
        NombrePremier instance = new NombrePremier();
        boolean expResult = false;

        //when
        boolean result = instance.isNombreValide(str);

        //then
        assertEquals(expResult, result);

    }

    /**
     * Test of isNombreValide method, of class NombrePremier.
     */
    @Test
    public void testIsNombreValideKOLimit() {
        //given
        String str = "";
        NombrePremier instance = new NombrePremier();
        boolean expResult = false;

        //when
        boolean result = instance.isNombreValide(str);

        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of afficherResult method, of class NombrePremier.
     */
    @Test
    public void testFormaterResultOK() {
        //given
        boolean isPremier = false;
        int nb = 0;
        NombrePremier instance = new NombrePremier();
        String expResult = "le nombre 0 n'est pas premier";

        //when
        String result = instance.formaterResult(isPremier, nb);

        //then
        assertEquals(expResult, result);
        assertNotNull(result);
    }

    /**
     * Test of afficherResult method, of class NombrePremier.
     */
    @Test
    public void testFormaterResultNOK() {
        //given
        boolean isPremier = true;
        int nb = 11;
        NombrePremier instance = new NombrePremier();
        String expResult = "le nombre 11 est premier";

        //when
        String result = instance.formaterResult(isPremier, nb);

        //then
        assertEquals(expResult, result);
        assertNotNull(result);
    }
    
}
